/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.lang.classfile.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.nio.charset.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.Math.*;
import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.foreign.MemoryLayout.*;
import static java.lang.invoke.MethodHandles.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;
import static org.lwjgl.system.ffm.BCUtil.*;

/**
 * Generates LWJGL bindings from an interface, optionally annotated with {@code FFM*} annotations.
 *
 * <p>The objective is to allow users to create their own LWJGL-style bindings, dynamically at run-time, without sacrificing performance.</p>
 *
 * <p>Several modern Java technologies are being utilized to achieve this:</p>
 * <ul>
 *     <li>Dynamic Class-File Constants (JEP 309, JDK 11, a.k.a. Condy): Used to lazily initialize bindings, without precompiling a private nested class per function.</li>
 *     <li>Hidden Classes (JEP 371, JDK 15): Used to generate classes with minimal metadata and no interaction with ClassLoaders.</li>
 *     <li>Class data support for hidden classes (JDK-8256214, JDK 16): Used to boostrap Condy values.</li>
 *     <li>Foreign Function & Memory API (JEP 442, JDK 22): Used for native interoperation without JNI.</li>
 *     <li>Class-File API (JEP 457, JDK 24): Used to generate bytecode at runtime, without 3rd-party dependencies.</li>
 * </ul>
 *
 * <p>The {@link #generate} method is designed to be relatively cheap. The instance returned is lightweight and its methods are never materialized, unless
 * actually used by the application. More specifically:</p>
 * <ul>
 *    <li>A minimal class is generated that implements the input interface.</li>
 *    <li>There is no state in the generated class, only methods.</li>
 *    <li>All methods are simple, with minimal bytecode. A method handle is retrieved using Condy and arguments are passed directly to {@link MethodHandle#invokeExact}.</li>
 *    <li>There is no overhead from the Condy {@code ldc} instruction. It is executed only once, if and when the method is called.</li>
 *    <li>
 *        Execution of relatively expensive binding code is deferred to the Condy bootstrap. This includes:
 *        <ul>
 *            <li>lookup of {@code FFM*} annotations and associated logic</li>
 *            <li>function address lookup and creation of FFM method handles</li>
 *            <li>further bytecode generation and wrapping of FFM method handles if necessary</li>
 *        </ul>
 *    </li>
 *    <li>
 *        Hidden class data is used:
 *        <ul>
 *            <li>to pass reflected {@link Method} instances to the Condy bootstrap</li>
 *            <li>to pass FFM {@link MethodHandle}/{@link MemorySegment} instances to generated wrapper methods</li>
 *        </ul>
 *    </li>
 * </ul>
 *
 * <p>When stored in {@code static final} fields, performance of the generated bindings is equivalent to direct FFM calls. The JVM can inline through
 * everything, for the following reasons:</p>
 * <ul>
 *     <li>The binding instance is constant.</li>
 *     <li>There is a single implementation of the binding interface.</li>
 *     <li>The {@link MethodHandle} instances created via Condy are also treated as constants by the JVM.</li>
 * </ul>
 *
 * <p>The generator DSL supports the specification of 3 virtual parameters, which must be present in a strict order before other parameters:</p>
 * <ul>
 *     <li>
 *         A {@link MemorySegment} parameter in methods annotated with {@link FFMFunctionAddress}.
 *
 *         <p>It must be specified before any other virtual or normal parameter.</p>
 *     </li>
 *     <li>
 *         A {@link SegmentAllocator} or {@link StackAllocator} parameter. This parameter will be used to allocate storage for struct values passed or returned
 *         by-value and also for temporary storage needed internally by the method call (e.g. for {@link FFMReturn} buffers).
 *
 *         <p>If the parameter is of type {@link StackAllocator}, a stack frame will be pushed & popped inside the method call when temporary storage is
 *         needed.</p>
 *
 *         <p>It must be specified after the {@link FFMFunctionAddress} parameter, if one exists, and before any other virtual or normal parameter.</p>
 *     </li>
 *     <li>
 *         A {@link MemorySegment} parameter annotated with {@link FFMCaptureCallState}.
 *
 *         <p>It must be specified after other virtual parameters and before any normal parameters.</p>
 *     </li>
 * </ul>
 */
public final class FFM {

    static final AddressLayout C_POINTER = ValueLayout.ADDRESS
        .withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, ValueLayout.JAVA_BYTE));

    static final Set<String> STANDARD_CHARSETS = Arrays.stream(StandardCharsets.class.getDeclaredFields())
        .map(Field::getName)
        .collect(Collectors.toUnmodifiableSet());

    // TODO: consider concurrency issues
    // TODO: consider GC issues (the FFMConfig holds expensive resources), make weak maybe?
    // TODO: make external? i.e. the user provides the AnnotatedElement to FFMConfig mapping and is responsible for its lifecycle.
    static final HashMap<AnnotatedElement, FFMConfig> BINDING_CONFIGS = new HashMap<>();

    private FFM() {
    }

    static FFMConfig getConfig(Class<?> bindingInterface) {
        var c = bindingInterface;
        while (c != null) {
            var config = BINDING_CONFIGS.get(c);
            if (config != null) {
                return config;
            }
            c = c.getEnclosingClass();
        }

        var p      = Objects.requireNonNull(bindingInterface.getPackage());
        var config = BINDING_CONFIGS.get(p);

        if (config == null) {
            throw new IllegalStateException("No FFMConfig registered for " + bindingInterface);
        }

        return config;
    }

    @SuppressWarnings("unchecked")
    private static <T> T generate(Class<T> bindingInterface, FFMConfig config) throws Exception {
        var methods = bindingInterface.getMethods();

        var thisClass = ClassDesc.of(bindingInterface.getPackageName(), bindingInterface.getSimpleName() + "Impl");
        var bytecode = ClassFile.of().build(thisClass, classBuilder -> {
            startHiddenClass(classBuilder)
                .withInterfaceSymbols(bindingInterface.describeConstable().orElseThrow());

            for (var m = 0; m < methods.length; m++) {
                var method = methods[m];

                var methodTypeDesc = getMethodTypeDesc(method);

                var condy = DynamicConstantDesc.<MethodHandle>ofNamed(DMHD_FFM_bootstrapDowncall, method.getName(), CD_MethodHandle, (Integer)m);
                classBuilder.withMethod(method.getName(), methodTypeDesc, ACC_PUBLIC, mb -> mb.withCode(cb -> {
                    // Do the Condy lookup
                    cb.ldc(condy);
                    // Pass arguments unmodified
                    for (var p = 0; p < methodTypeDesc.parameterCount(); p++) {
                        cb.loadLocal(TypeKind.from(methodTypeDesc.parameterType(p)), cb.parameterSlot(p));
                    }
                    cb
                        // Invoke the generated method handle
                        .invokevirtual(CD_MethodHandle, "invokeExact", methodTypeDesc)
                        // Return result if non-void, also unmodified
                        .return_(TypeKind.from(methodTypeDesc.returnType()));
                }));
            }
        });

        return (
            (Class<T>)(config.lookup
                .defineHiddenClassWithClassData(bytecode, List.of(config, methods), false)
                .lookupClass())
        )
            .getDeclaredConstructor()
            .newInstance();
    }

    // The Condy boostrap method for downcalls, called the first time the LDC bytecode is executed.
    @SuppressWarnings("unused")
    public static MethodHandle bootstrapDowncall(MethodHandles.Lookup lookup, String name, Class<?> bootstrapClass, int methodIndex) throws IllegalAccessException {
        var config = classDataAt(lookup, DEFAULT_NAME, FFMConfig.class, 0);
        var method = classDataAt(lookup, DEFAULT_NAME, Method[].class, 1)[methodIndex];

        if (config.debugGenerator) {
            apiLog("BOOTSTRAPPING DOWNCALL#" + methodIndex + ": " + name);
        }
        return new BCCallDown(config, method)
            .bootstrap();
    }

    static Field findBinderField(Class<?> targetType) {
        Field field = null;

        for (var targetField : targetType.getDeclaredFields()) {
            var modifiers = targetField.getModifiers();

            if (!(Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers))) {
                throw new IllegalStateException(targetType + " is not an interface");
            }

            var binderType = targetField.getGenericType();
            if (binderType instanceof ParameterizedType binderTypeGeneric) {
                var binderTypeArguments = binderTypeGeneric.getActualTypeArguments();
                if (binderTypeArguments.length == 1 && binderTypeArguments[0].equals(targetType)) {
                    var binderClass = (Class<?>)binderTypeGeneric.getRawType();
                    if (GroupBinder.class.isAssignableFrom(binderClass) || UpcallBinder.class.isAssignableFrom(binderClass)) {
                        if (field != null) {
                            throw new IllegalStateException("Multiple binder fields found for " + targetType);
                        }
                        field = targetField;
                    }
                }
            }
        }

        if (field == null) {
            throw new IllegalStateException("No binder field found for " + targetType);
        }

        return field;
    }

    static FFMConfig.BinderField lookupBinder(FFMConfig config, Class<?> targetType) {
        var binderField = config.binders.get(targetType);
        if (binderField == null) {
            binderField = lookupBinderCacheMiss(config, targetType);
        }
        return binderField;
    }

    private static FFMConfig.BinderField lookupBinderCacheMiss(FFMConfig config, Class<?> targetType) {
        var field = findBinderField(targetType);

        Binder<?> binder;

        try {
            binder = (Binder<?>)field.get(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        if (binder == null) {
            throw new IllegalStateException("Missing binder field value for " + targetType);
        }

        var binderField = new FFMConfig.BinderField(field.getName(), binder);
        config.binders.put(targetType, binderField);
        return binderField;
    }

    // PUBLIC API (DSL)

    public static final ValueLayout.OfByte  int8_t  = typedef("int8_t", ValueLayout.JAVA_BYTE);
    public static final ValueLayout.OfShort int16_t = typedef("int16_t", ValueLayout.JAVA_SHORT);
    public static final ValueLayout.OfInt   int32_t = typedef("int32_t", ValueLayout.JAVA_INT);
    public static final ValueLayout.OfLong  int64_t = typedef("int64_t", ValueLayout.JAVA_LONG);

    public static final ValueLayout.OfByte  uint8_t  = typedef("uint8_t", ValueLayout.JAVA_BYTE);
    public static final ValueLayout.OfShort uint16_t = typedef("uint16_t", ValueLayout.JAVA_SHORT);
    public static final ValueLayout.OfInt   uint32_t = typedef("uint32_t", ValueLayout.JAVA_INT);
    public static final ValueLayout.OfLong  uint64_t = typedef("uint64_t", ValueLayout.JAVA_LONG);

    public static final AddressLayout size_t    = typedef("size_t", ValueLayout.ADDRESS);
    public static final AddressLayout ptrdiff_t = typedef("ptrdiff_t", ValueLayout.ADDRESS);
    public static final AddressLayout intptr_t  = typedef("iintptr_t", ValueLayout.ADDRESS);
    public static final AddressLayout uintptr_t = typedef("uintptr_t", ValueLayout.ADDRESS);

    public static final ValueLayout.OfByte  cchar     = typedef("char", int8_t);
    public static final ValueLayout.OfShort cshort    = typedef("short", int16_t);
    public static final ValueLayout.OfInt   cint      = typedef("int", int32_t);
    public static final ValueLayout         clong     = typedef("long", ValueLayout.ADDRESS.byteSize() == 4 || Platform.get() == Platform.WINDOWS ? int32_t : int64_t);
    public static final ValueLayout.OfLong  long_long = typedef("long long", ValueLayout.JAVA_LONG);

    public static final ValueLayout.OfByte  unsigned_char      = typedef("unsigned char", uint8_t);
    public static final ValueLayout.OfShort unsigned_short     = typedef("unsigned short", uint16_t);
    public static final ValueLayout.OfInt   unsigned_int       = typedef("unsigned int", uint32_t);
    public static final ValueLayout         unsigned_clong     = typedef("unsigned long", clong.byteSize() == 4 ? uint32_t : uint64_t);
    public static final ValueLayout.OfLong  unsigned_long_long = typedef("unsigned long long", long_long);

    public static final ValueLayout.OfFloat  float32 = typedef("float32", ValueLayout.JAVA_FLOAT);
    public static final ValueLayout.OfDouble float64 = typedef("float64", ValueLayout.JAVA_DOUBLE);

    // TODO: document
    public static ValueLayout.OfByte typedef(String name, ValueLayout.OfByte layout) { return layout.withName(name); }
    public static ValueLayout.OfShort typedef(String name, ValueLayout.OfShort layout)   { return layout.withName(name); }
    public static ValueLayout.OfInt typedef(String name, ValueLayout.OfInt layout)       { return layout.withName(name); }
    public static ValueLayout.OfLong typedef(String name, ValueLayout.OfLong layout)     { return layout.withName(name); }
    public static ValueLayout.OfFloat typedef(String name, ValueLayout.OfFloat layout)   { return layout.withName(name); }
    public static ValueLayout.OfDouble typedef(String name, ValueLayout.OfDouble layout) { return layout.withName(name); }
    public static ValueLayout typedef(String name, ValueLayout layout)                   { return layout.withName(name); }

    // TODO: document
    public static AddressLayout typedef(String name, AddressLayout layout) { return layout.withName(name); }
    public static SequenceLayout typedef(String name, SequenceLayout layout) { return layout.withName(name); }
    public static StructLayout typedef(String name, StructLayout layout)     { return layout.withName(name); }
    public static UnionLayout typedef(String name, UnionLayout layout)       { return layout.withName(name); }

    // TODO: document
    public static SequenceLayout array(MemoryLayout layout, long elementCount) {
        return MemoryLayout
            .sequenceLayout(elementCount, layout)
            .withName(layout.name().orElseThrow() + "[" + elementCount + "]");
    }

    // TODO: document
    public static AddressLayout opaque(String name) {
        return ValueLayout.ADDRESS.withName(name);
    }

    // TODO: refactor, this would cause conflicts with a member named "p"
    // TODO: document
    public static AddressLayout p(GroupBinder<?, ?> binder) {
        var layout = binder.layout();
        return p(layout);
    }

    // TODO: document
    public static AddressLayout p(MemoryLayout layout) {
        var name = layout.name().orElseThrow();
        return ValueLayout.ADDRESS
            .withTargetLayout(layout)
            .withName(name + (name.endsWith("*") ? "*" : " *"));
    }

    // TODO: document
    public static <T> StructBinderBuilder<T> struct(Class<T> structInterface) {
        return new StructBinderBuilder<>(structInterface);
    }

    // TODO: document
    public static <T> UnionBinderBuilder<T> union(Class<T> unionInterface) {
        return new UnionBinderBuilder<>(unionInterface);
    }

    // TODO: document
    public abstract static class GroupBinderBuilder<
        T,
        L extends GroupLayout,
        M extends GroupBinder<L, T>,
        SELF extends GroupBinderBuilder<T, L, M, SELF>
        > {

        final Class<T> groupInterface;

        final SequencedMap<String, MemoryLayout> members = new LinkedHashMap<>();

        @Nullable BiPredicate<T, Object> equals;
        @Nullable ToIntFunction<T>       hashCode;
        @Nullable Function<T, String>    toString;

        protected boolean automaticPadding = true;
        protected boolean checkPadding     = true;

        private int paddingIndex;

        protected long sizeof;
        protected long alignof;

        protected long packAlignment = Long.MAX_VALUE;
        private   long alignas;

        protected GroupBinderBuilder(Class<T> groupInterface) {
            if (!groupInterface.isInterface()) {
                throw new UnsupportedOperationException("The binder must be parameterized with an interface");
            }

            if (groupInterface.isHidden()) {
                throw new UnsupportedOperationException("The binder must not be parameterized with a hidden interface");
            }

            if (groupInterface.isSealed()) {
                throw new UnsupportedOperationException("The binder must not be parameterized with a sealed interface");
            }

            if (groupInterface.getTypeParameters().length != 0) {
                throw new UnsupportedOperationException("The binder must not be parameterized with a generic interface");
            }

            FFM.findBinderField(groupInterface); // test binder field to report any errors early

            this.groupInterface = groupInterface;
        }

        abstract SELF self();
        abstract BCGroup.Kind kind();

        // TODO: document
        public M build() {
            var byteAlignment = max(this.alignof, this.alignas);

            if (automaticPadding) {
                var sizeofAligned = align(sizeof, byteAlignment);
                if (sizeofAligned != sizeof) {
                    padding(sizeofAligned - sizeof);
                }
            }

            var m = BCGroup.bootstrap(this, byteAlignment);

            if (checkPadding) {
                if (!isAligned(m.layout().byteSize(), m.layout().byteAlignment())) {
                    throw new IllegalStateException("Struct size is not a multiple of its alignment");
                }
            }

            return m;
        }
        private static boolean isAligned(long offset, long alignment) {
            return (offset & (alignment - 1L)) == 0L;
        }

        // TODO: document
        public SELF automaticPadding(boolean enabled) {
            this.automaticPadding = enabled;
            return self();
        }

        // TODO: document
        public SELF checkPadding(boolean enabled) {
            this.checkPadding = enabled;
            return self();
        }

        // TODO: document (overrides natural member alignment)
        public SELF pack(long alignment) {
            this.packAlignment = alignment;
            return self();
        }

        // TODO: document (overrides natural group alignment)
        public SELF alignas(long alignment) {
            this.alignas = alignment;
            return self();
        }

        // TODO: document
        public SELF m(String name, GroupBinder<?, ?> binder) {
            return m(name, binder.layout());
        }

        protected static long align(long offset, long alignment) {
            return ((offset - 1L) | (alignment - 1L)) + 1L;
        }

        // TODO: document
        public SELF m(String name, MemoryLayout layout) {
            var previous = members.put(name, layout.withName(name));
            if (previous != null) {
                throw new IllegalStateException("struct member '" + name + "' is already defined");
            }
            return self();
        }

        // TODO: document
        public SELF padding(long padding) {
            members.put("__padding__" + paddingIndex++, paddingLayout(padding));
            sizeof += padding;
            return self();
        }

        // TODO: document
        public SELF withEquals(BiPredicate<T, Object> equals) {
            this.equals = equals;
            return self();
        }

        // TODO: document
        public SELF withHashCode(ToIntFunction<T> hashCode) {
            this.hashCode = hashCode;
            return self();
        }

        // TODO: document
        public SELF withToString(Function<T, String> toString) {
            this.toString = toString;
            return self();
        }
    }
    // TODO: document
    public static final class StructBinderBuilder<T> extends GroupBinderBuilder<T, StructLayout, StructBinder<T>, StructBinderBuilder<T>> {
        StructBinderBuilder(Class<T> structInterface) { super(structInterface); }
        @Override StructBinderBuilder<T> self()       { return this; }
        @Override BCGroup.Kind kind()                 { return BCGroup.Kind.STRUCT; }

        @Override
        public StructBinderBuilder<T> m(String name, MemoryLayout layout) {
            var layoutAlignment = layout.byteAlignment();
            if (packAlignment < layoutAlignment) {
                layoutAlignment = packAlignment;
                layout = sequenceLayout(layout.byteSize(), ValueLayout.JAVA_BYTE)
                    .withByteAlignment(packAlignment);
            }

            if (automaticPadding && sizeof % layoutAlignment != 0) {
                padding(align(sizeof, layoutAlignment) - sizeof);
            }

            alignof = max(alignof, layoutAlignment);
            sizeof += layout.byteSize();

            return super.m(name, layout);
        }
    }
    // TODO: document
    public static final class UnionBinderBuilder<T> extends GroupBinderBuilder<T, UnionLayout, UnionBinder<T>, UnionBinderBuilder<T>> {
        UnionBinderBuilder(Class<T> UnionInterface) { super(UnionInterface); }
        @Override UnionBinderBuilder<T> self()      { return this; }
        @Override BCGroup.Kind kind()               { return BCGroup.Kind.UNION; }

        @Override
        public UnionBinderBuilder<T> m(String name, MemoryLayout layout) {
            var layoutAlignment = min(layout.byteAlignment(), packAlignment);

            alignof = max(alignof, layoutAlignment);
            sizeof = max(sizeof, layout.byteSize());

            return super.m(name, layout);
        }
    }

    // TODO: document
    public static <T> UpcallBinder<T> upcall(Class<T> upcallInterface) {
        var config = getConfig(upcallInterface);
        if (config.debugGenerator) {
            apiLog("BOOTSTRAPPING UPCALL " + upcallInterface);
        }

        return new BCCallUp(config, upcallInterface)
            .bootstrap();
    }

    // TODO: document
    public static <T> T ffmGenerate(Class<T> bindingInterface) {
        try {
            return generate(bindingInterface, getConfig(bindingInterface));
        } catch (RuntimeException | Error e) {
            throw e;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    // TODO: document
    public static <T> T ffmGenerate(Class<T> bindingInterface, FFMConfig context) {
        // automatically register binding config
        var previous = BINDING_CONFIGS.put(bindingInterface, context);
        try {
            return generate(bindingInterface, context);
        } catch (RuntimeException | Error e) {
            throw e;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        } finally {
            // reset previous binding config
            ffmConfig(bindingInterface, previous);
        }
    }

    /** A builder class for {@link FFMConfig}. */
    public static final class FFMConfigBuilder {
        private final MethodHandles.Lookup lookup;

        private @Nullable SymbolLookup              symbolLookup;
        private @Nullable TraceConsumer             traceConsumer;
        private @Nullable Predicate<Method>         tracingFilter;
        private @Nullable Function<Method, Boolean> criticalOverride;

        private boolean checks         = Checks.CHECKS;
        private boolean debugGenerator = Configuration.DEBUG_GENERATOR.get(false);

        FFMConfigBuilder(MethodHandles.Lookup lookup) {
            this.lookup = lookup;
        }

        /** Enables function pointer retrieval using a {@link SymbolLookup}. */
        public FFMConfigBuilder withSymbolLookup(SymbolLookup lookup) {
            this.symbolLookup = lookup;
            return this;
        }

        /** Enables function pointer retrieval using a {@link FunctionProvider}. */
        public FFMConfigBuilder withFunctionProvider(FunctionProvider provider) {
            return this.withSymbolLookup(name -> Optional.of(MemorySegment.ofAddress(provider.getFunctionAddress(name))));
        }

        /**
         * Enables function call tracing.
         *
         * @param consumer the trace consumer
         */
        public FFMConfigBuilder withTracing(TraceConsumer consumer) {
            this.traceConsumer = consumer;
            return this;
        }

        /**
         * Enables function call tracing with filtering.
         *
         * @param consumer the trace consumer
         * @param filter   the filter that selects which methods will be instrumented for tracing. Optional.
         */
        public FFMConfigBuilder withTracing(TraceConsumer consumer, Predicate<Method> filter) {
            this.traceConsumer = consumer;
            this.tracingFilter = filter;
            return this;
        }

        /**
         * Enables {@link FFMCritical} annotation overriding.
         *
         * <p>Interfaces and methods may be statically configured with the {@link FFMCritical} annotation. This configuration is respected when no critical
         * override is specified in the {@code FFMConfig}. When an override is specified:</p>
         * <ul>
         *     <li>If the override returns null for a method, the static configuration is respected.</li>
         *     <li>If the override returns {@link Boolean#TRUE} for a method, {@link Linker.Option#critical} is forcibly enabled.</li>
         *     <li>If the override returns {@link Boolean#FALSE} for a method, {@link Linker.Option#critical} is forcibly disabled.</li>
         * </ul>
         *
         * <p>This override is useful when the static configuration is not appropriate in certain execution contexts. For example, when running an application
         * with debug facilities enabled, functions that would normally never call back into Java may start doing so. This violates the critical function
         * requirements. Conversely, functions that were not annotated as critical may be forcibly made critical in release builds of the application.</p>
         */
        public FFMConfigBuilder withCriticalOverride(Function<Method, @Nullable Boolean> criticalOverride) {
            this.criticalOverride = criticalOverride;
            return this;
        }

        /**
         * Enables or disables runtime checks.
         *
         * <p>Defaults to {@link Checks#CHECKS}.</p>
         *
         * @param enabled whether to enable runtime checks
         */
        public FFMConfigBuilder withChecks(boolean enabled) {
            this.checks = enabled;
            return this;
        }

        /**
         * Enables or disables debug output.
         *
         * <p>Defaults to {@link Configuration#DEBUG_GENERATOR}.</p>
         *
         * @param enabled whether to enable debug output
         */
        public FFMConfigBuilder withDebugGenerator(boolean enabled) {
            this.debugGenerator = enabled;
            return this;
        }

        /** Builds the binding configuration instance. */
        public FFMConfig build() {
            return new FFMConfig(
                lookup,
                symbolLookup,
                traceConsumer,
                tracingFilter,
                criticalOverride,
                checks,
                debugGenerator
            );
        }
    }

    /** Creates an empty binding configuration builder. */
    public static FFMConfigBuilder ffmConfigBuilder(MethodHandles.Lookup lookup) {
        return new FFMConfigBuilder(lookup);
    }

    // TODO: document
    public static void ffmConfig(Package _package, @Nullable FFMConfig config) {
        if (config == null) {
            BINDING_CONFIGS.remove(_package);
        } else {
            BINDING_CONFIGS.put(_package, config);
        }
    }

    // TODO: document
    public static void ffmConfig(Class<?> _class, @Nullable FFMConfig config) {
        if (config == null) {
            BINDING_CONFIGS.remove(_class);
        } else {
            BINDING_CONFIGS.put(_class, config);
        }
    }

}