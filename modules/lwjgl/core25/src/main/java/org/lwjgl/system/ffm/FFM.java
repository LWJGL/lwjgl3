/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.classfile.*;
import java.lang.classfile.attribute.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.nio.charset.*;
import java.nio.file.*;
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
 * This class is the entry point for the Runtime Bindings Generator API.
 *
 * <p>Global configuration options:</p>
 * <ul>
 *     <li>{@link Configuration#FFM_DEFAULT_NULLABLE_ANNOTATION}</li>
 *     <li>{@link Configuration#FFM_UPCALL_ARENA}</li>
 *     <li>{@link Configuration#FFM_UPCALL_EXCEPTION_CATCH}</li>
 *     <li>{@link Configuration#FFM_UPCALL_EXCEPTION_HANDLER}</li>
 * </ul>
 *
 * <p>Configuration methods:</p>
 * <ul>
 *     <li>{@link #ffmConfigBuilder}</li>
 *     <li>{@link #ffmConfig}</li>
 * </ul>
 *
 * <p>Bootstrapping methods:</p>
 * <ul>
 *     <li>{@link #ffmGenerate}</li>
 *     <li>{@link #ffmUpcall}</li>
 *     <li>{@link #ffmStruct}</li>
 *     <li>{@link #ffmUnion}</li>
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

    // LWJGL 3 interop
    static final ScopedValue<Arena> ARENA = ScopedValue.newInstance();

    private FFM() {
    }

    static void main() {
        // Generate module-info.class for Java 25+
        var path = Path.of("bin", "classes", "lwjgl", "core", "META-INF", "versions", "25", "module-info.class");

        // Drop the jdk.unsupported module and export the org.lwjgl.system.ffm package
        var moduleAttr = ModuleAttribute.of(ModuleDesc.of("org.lwjgl"), mab -> {
            mab
                .moduleVersion(System.getProperty("module.version"))
                .requires(ModuleRequireInfo.of(ModuleDesc.of("java.base"), AccessFlag.MODULE.mask(), "25"))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.ffm"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.freebsd"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.jni"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.libc"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.libffi"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.linux"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.macosx"), 0))
                .exports(ModuleExportInfo.of(PackageDesc.of("org.lwjgl.system.windows"), 0));

            if (Boolean.getBoolean("unsafe")) {
                mab.requires(ModuleRequireInfo.of(ModuleDesc.of("jdk.unsupported"), AccessFlag.TRANSITIVE.mask(), "25"));
            }
        });

        try {
            ClassFile.of()
                .buildModuleTo(path, moduleAttr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

    /** The Condy boostrap method for downcalls, called the first time the LDC bytecode is executed. [INTERNAL API] */
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

    /** A layout that can be used to map the C {@code int8_t} type. */
    public static final ValueLayout.OfByte int8_t = typedef("int8_t", ValueLayout.JAVA_BYTE);

    /** A layout that can be used to map the C {@code int16_t} type. */
    public static final ValueLayout.OfShort int16_t = typedef("int16_t", ValueLayout.JAVA_SHORT);

    /** A layout that can be used to map the C {@code int32_t} type. */
    public static final ValueLayout.OfInt int32_t = typedef("int32_t", ValueLayout.JAVA_INT);

    /** A layout that can be used to map the C {@code int64_t} type. */
    public static final ValueLayout.OfLong int64_t = typedef("int64_t", ValueLayout.JAVA_LONG);

    /** A layout that can be used to map the C {@code uint8_t} type. */
    public static final ValueLayout.OfByte uint8_t = typedef("uint8_t", ValueLayout.JAVA_BYTE);

    /** A layout that can be used to map the C {@code uint16_t} type. */
    public static final ValueLayout.OfShort uint16_t = typedef("uint16_t", ValueLayout.JAVA_SHORT);

    /** A layout that can be used to map the C {@code uint32_t} type. */
    public static final ValueLayout.OfInt uint32_t = typedef("uint32_t", ValueLayout.JAVA_INT);

    /** A layout that can be used to map the C {@code uint64_t} type. */
    public static final ValueLayout.OfLong uint64_t = typedef("uint64_t", ValueLayout.JAVA_LONG);

    /** A layout that can be used to map the C {@code size_t} type. */
    public static final AddressLayout size_t = typedef("size_t", ValueLayout.ADDRESS);

    /** A layout that can be used to map the C {@code ssize_t} type. */
    public static final AddressLayout ptrdiff_t = typedef("ptrdiff_t", ValueLayout.ADDRESS);

    /** A layout that can be used to map the C {@code intptr_t} type. */
    public static final AddressLayout intptr_t = typedef("intptr_t", ValueLayout.ADDRESS);

    /** A layout that can be used to map the C {@code uintptr_t} type. */
    public static final AddressLayout uintptr_t = typedef("uintptr_t", ValueLayout.ADDRESS);

    /** A layout that can be used to map the C {@code char} type. */
    public static final ValueLayout.OfByte cchar = typedef("char", int8_t);

    /** A layout that can be used to map the C {@code short} type. */
    public static final ValueLayout.OfShort cshort = typedef("short", int16_t);

    /** A layout that can be used to map the C {@code int} type. */
    public static final ValueLayout.OfInt cint = typedef("int", int32_t);

    /** A layout that can be used to map the C {@code long} type. */
    public static final ValueLayout clong = typedef("long", ValueLayout.ADDRESS.byteSize() == 4 || Platform.get() == Platform.WINDOWS ? int32_t : int64_t);

    /** A layout that can be used to map the C {@code long long} type. */
    public static final ValueLayout.OfLong long_long = typedef("long long", ValueLayout.JAVA_LONG);

    /** A layout that can be used to map the C {@code unsigned char} type. */
    public static final ValueLayout.OfByte unsigned_char = typedef("unsigned char", uint8_t);

    /** A layout that can be used to map the C {@code unsigned short} type. */
    public static final ValueLayout.OfShort unsigned_short = typedef("unsigned short", uint16_t);

    /** A layout that can be used to map the C {@code unsigned int} type. */
    public static final ValueLayout.OfInt unsigned_int = typedef("unsigned int", uint32_t);

    /** A layout that can be used to map the C {@code unsigned long} type. */
    public static final ValueLayout unsigned_clong = typedef("unsigned long", clong.byteSize() == 4 ? uint32_t : uint64_t);

    /** A layout that can be used to map the C {@code unsigned long long} type. */
    public static final ValueLayout.OfLong unsigned_long_long = typedef("unsigned long long", long_long);

    /** A layout that can be used to map the C {@code float} type. */
    public static final ValueLayout.OfFloat float32 = typedef("float32", ValueLayout.JAVA_FLOAT);

    /** A layout that can be used to map the C {@code double} type. */
    public static final ValueLayout.OfDouble float64 = typedef("float64", ValueLayout.JAVA_DOUBLE);

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout.OfByte typedef(String name, ValueLayout.OfByte layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout.OfShort typedef(String name, ValueLayout.OfShort layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout.OfInt typedef(String name, ValueLayout.OfInt layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout.OfLong typedef(String name, ValueLayout.OfLong layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout.OfFloat typedef(String name, ValueLayout.OfFloat layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout.OfDouble typedef(String name, ValueLayout.OfDouble layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static ValueLayout typedef(String name, ValueLayout layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static AddressLayout typedef(String name, AddressLayout layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static SequenceLayout typedef(String name, SequenceLayout layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static StructLayout typedef(String name, StructLayout layout) { return layout.withName(name); }

    /**
     * Creates an alias of the specified layout with a new name.
     *
     * @param name   the new name
     * @param layout the layout to alias
     *
     * @return the new layout
     */
    public static UnionLayout typedef(String name, UnionLayout layout) { return layout.withName(name); }

    /**
     * Creates a {@link SequenceLayout} with the specified named layout and element count.
     *
     * @param layout       the element layout, which must be named
     * @param elementCount the number of elements
     *
     * @return the sequence layout
     */
    public static SequenceLayout array(MemoryLayout layout, long elementCount) {
        return MemoryLayout
            .sequenceLayout(elementCount, layout)
            .withName(layout.name().orElseThrow() + "[" + elementCount + "]");
    }

    /**
     * Creates an opaque pointer layout with the specified name.
     *
     * @param name the opaque pointer name
     *
     * @return the opaque pointer layout
     */
    public static AddressLayout opaque(String name) {
        return ValueLayout.ADDRESS.withName(name);
    }

    // TODO: refactor, this would cause conflicts with a member named "p"

    /**
     * Creates a pointer layout that targets the specified binder's layout.
     *
     * @param binder the binder that provides the target layout
     *
     * @return the pointer layout
     */
    public static AddressLayout p(GroupBinder<?, ?> binder) {
        var layout = binder.layout();
        return p(layout);
    }

    /**
     * Creates a pointer layout that targets the specified layout.
     *
     * @param layout the target layout
     *
     * @return the pointer layout
     */
    public static AddressLayout p(MemoryLayout layout) {
        var name = layout.name().orElseThrow();
        return ValueLayout.ADDRESS
            .withTargetLayout(layout)
            .withName(name + (name.endsWith("*") ? "*" : " *"));
    }

    /**
     * Creates a {@link StructBinder} builder for the specified struct interface, with the default state.
     *
     * @param structInterface the struct interface
     *
     * @return the struct binder builder
     */
    public static <T> StructBinderBuilder<T> ffmStruct(Class<T> structInterface) {
        return new StructBinderBuilder<>(structInterface);
    }

    /**
     * Creates a {@link UnionBinder} builder for the specified union interface, with the default state.
     *
     * @param unionInterface the union interface
     *
     * @return the union binder builder
     */
    public static <T> UnionBinderBuilder<T> ffmUnion(Class<T> unionInterface) {
        return new UnionBinderBuilder<>(unionInterface);
    }

    /**
     * Base class for struct/union binder builders.
     *
     * @see StructBinderBuilder
     * @see UnionBinderBuilder
     */
    public abstract static sealed class GroupBinderBuilder<
        T,
        L extends GroupLayout,
        M extends GroupBinder<L, T>,
        SELF extends GroupBinderBuilder<T, L, M, SELF>
        >
        permits StructBinderBuilder, UnionBinderBuilder {

        final Class<T> groupInterface;
        final Field    binderField;

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

            this.groupInterface = groupInterface;
            this.binderField = FFM.findBinderField(groupInterface); // test binder field to report any errors early
        }

        abstract SELF self();
        abstract BCGroup.Kind kind();

        protected static long align(long offset, long alignment) {
            return ((offset - 1L) | (alignment - 1L)) + 1L;
        }

        /**
         * Generates a class that implements the {@link GroupBinder} interface for the group type using the current builder state, then returns a new instance
         * of that class.
         *
         * @return the {@code GroupBinder} implementation
         */
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
                    throw new IllegalStateException("Group size is not a multiple of its alignment");
                }
            }

            return m;
        }
        private static boolean isAligned(long offset, long alignment) {
            return (offset & (alignment - 1L)) == 0L;
        }

        /**
         * Enables automatic padding calculation, based on the natural alignment of the group members.
         *
         * <p>This option is enabled by default in new builder instances. It may be disabled for advanced use cases that require fine control of the group
         * alignment.</p>
         *
         * @param enabled whether to enable automatic padding
         *
         * @return this builder instance
         */
        public SELF automaticPadding(boolean enabled) {
            this.automaticPadding = enabled;
            return self();
        }

        /**
         * Enables validation of the group size with respect to its alignment.
         *
         * <p>This option is enabled by default in new builder instances. It may be disabled for advanced use cases that require fine control of the group
         * size and alignment.</p>
         *
         * @param enabled whether to enable size validation
         *
         * @return this builder instance
         */
        public SELF checkPadding(boolean enabled) {
            this.checkPadding = enabled;
            return self();
        }

        /**
         * Configures the group pack alignment.
         *
         * <p>By default there's no packing alignment. This option may be used to configure a pack alignment lesser than than the natural member alignment.</p>
         *
         * @param alignment the new pack alignment
         *
         * @return this builder instance
         */
        public SELF pack(long alignment) {
            this.packAlignment = alignment;
            return self();
        }

        /**
         * Configures the group alignment.
         *
         * <p>By default the group alignment is the maximum natural alignment of its members. This option may be used to configure an alignment greater than
         * the natural alignment.</p>
         *
         * @param alignment the new group alignment. Ignored is less than the natural alignment.
         *
         * @return this builder instance
         */
        public SELF alignas(long alignment) {
            this.alignas = alignment;
            return self();
        }

        /**
         * Adds a nested group member to this group.
         *
         * @param name   the member name
         * @param binder the member's binder
         *
         * @return this builder instance
         */
        public SELF m(String name, GroupBinder<?, ?> binder) {
            return m(name, binder.layout());
        }

        /**
         * Adds a new member to this group.
         *
         * @param name   the member name
         * @param layout the member's memory layout
         *
         * @return this builder instance
         */
        public SELF m(String name, MemoryLayout layout) {
            var previous = members.put(name, layout.withName(name));
            if (previous != null) {
                throw new IllegalStateException("struct member '" + name + "' is already defined");
            }
            return self();
        }

        /**
         * Adds padding before the next member of this group.
         *
         * @param padding the padding size in bytes
         *
         * @return this builder instance
         */
        public SELF padding(long padding) {
            members.put("__padding__" + paddingIndex++, paddingLayout(padding));
            sizeof += padding;
            return self();
        }

        /**
         * Sets a custom {@link Object#equals} implementation for the group.
         *
         * <p>By default, an {@code equals} method will be generated with the same semantics as {@link Record#equals}, where the canonical getters act as
         * components. This means that the default implementation will not consider padding members or members with no corresponding getters.</p>
         *
         * @param equals the {@code equals} implementation
         *
         * @return this builder instance
         *
         * @see FFMCanonical
         */
        public SELF withEquals(BiPredicate<T, Object> equals) {
            this.equals = equals;
            return self();
        }

        /**
         * Sets a custom {@link Object#hashCode} implementation for the group.
         *
         * <p>By default, a {@code hashCode} method will be generated with the same semantics as {@link Record#hashCode}, where the canonical getters act as
         * components. This means that the default implementation will not consider padding members or members with no corresponding getters.</p>
         *
         * @param hashCode the {@code hashCode} implementation
         *
         * @return this builder instance
         *
         * @see FFMCanonical
         */
        public SELF withHashCode(ToIntFunction<T> hashCode) {
            this.hashCode = hashCode;
            return self();
        }

        /**
         * Sets a custom {@link Object#toString} implementation for the group.
         *
         * <p>By default, a {@code toString} method will be generated with the same semantics as {@link Record#toString}, where the canonical getters act as
         * components. This means that the default implementation will not consider padding members or members with no corresponding getters.</p>
         *
         * @param toString the {@code toString} implementation
         *
         * @return this builder instance
         *
         * @see FFMCanonical
         */
        public SELF withToString(Function<T, String> toString) {
            this.toString = toString;
            return self();
        }
    }

    /** A builder for {@link StructBinder} instances. */
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

        /**
         * Generates a class that implements the {@link StructBinder} interface for the struct type using the current builder state, then returns a new instance
         * of that class.
         *
         * @return the {@code StructBinder} implementation
         */
        @Override
        public StructBinder<T> build() {
            return super.build(); // just to override the javadoc
        }
    }

    /** A builder for {@link UnionBinder} instances. */
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

        /**
         * Generates a class that implements the {@link UnionBinder} interface for the union type using the current builder state, then returns a new instance
         * of that class.
         *
         * @return the {@code UnionBinder} implementation
         */
        @Override
        public UnionBinder<T> build() {
            return super.build(); // just to override the javadoc
        }
    }

    /**
     * Generates a class that implements the {@link UpcallBinder} interface for the specified upcall interface, then returns a new instance of that class.
     *
     * @param upcallInterface the upcall interface
     *
     * @return the {@code UpcallBinder} implementation
     */
    public static <T> UpcallBinder<T> ffmUpcall(Class<T> upcallInterface) {
        return ffmUpcall(upcallInterface, null);
    }

    /**
     * Generates a class that implements the {@link UpcallBinder} interface for the specified upcall interface and associated libffi call interface, then
     * returns a new instance of that class.
     *
     * <p>This method is used for integration with LWJGL 3 callbacks. It should not be used for custom bindings.</p>
     *
     * @param upcallInterface the upcall interface
     * @param cif             the libffi call interface
     *
     * @return the {@code UpcallBinder} implementation
     */
    public static <T> UpcallBinder<T> ffmUpcall(Class<T> upcallInterface, @Nullable FFICIF cif) {
        var config = getConfig(upcallInterface);
        if (config.debugGenerator) {
            apiLog("BOOTSTRAPPING UPCALL " + upcallInterface);
        }

        // LWJGL 3 interop
        return new BCCallUp(config, upcallInterface, cif)
            .bootstrap();
    }

    /**
     * Returns the scoped arena.
     *
     * <p>This method is used for integration with LWJGL 3 callbacks. It should not be used for custom bindings.</p>
     */
    public static ScopedValue<Arena> ffmScopedArena() {
        // LWJGL 3 interop
        return ARENA;
    }

    /**
     * Runs the specified runnable within the scope of the specified arena. If the bindings generator needs to allocate memory before this method returns, it
     * will use this arena.
     *
     * <p>This method is used for integration with LWJGL 3 callbacks. It should not be used for custom bindings.</p>
     *
     * @param arena    the arena
     * @param runnable the runnable
     */
    public static void ffmScopedRun(Arena arena, Runnable runnable) {
        // LWJGL 3 interop
        ScopedValue
            .where(ARENA, arena)
            .run(runnable);
    }

    /**
     * Runs the specified operation within the scope of the specified arena. If the bindings generator needs to allocate memory before this method returns, it
     * will use this arena.
     *
     * <p>This method is used for integration with LWJGL 3 callbacks. It should not be used for custom bindings.</p>
     *
     * @param arena the arena
     * @param op    the operation
     *
     * @return the result of the operation
     */
    public static <R, X extends Throwable> R ffmScopedCall(Arena arena, ScopedValue.CallableOp<? extends R, X> op) throws X {
        // LWJGL 3 interop
        return ScopedValue
            .where(ARENA, arena)
            .call(op);
    }

    /**
     * Generates a class that implements the specified binding interface, using the {@link FFMConfig} registered for this interface.
     *
     * @param bindingInterface the binding interface
     *
     * @return the generated binding implementation
     *
     * @throws IllegalStateException if no {@code FFMConfig} is registered for the specified interface
     */
    public static <T> T ffmGenerate(Class<T> bindingInterface) {
        try {
            return generate(bindingInterface, getConfig(bindingInterface));
        } catch (RuntimeException | Error e) {
            throw e;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /**
     * Generates a class that implements the specified binding interface, using the specified {@link FFMConfig}.
     *
     * @param bindingInterface the binding interface
     * @param config           the binding configuration
     *
     * @return the generated binding implementation
     */
    public static <T> T ffmGenerate(Class<T> bindingInterface, FFMConfig config) {
        // automatically register binding config
        var previous = BINDING_CONFIGS.put(bindingInterface, config);
        try {
            return generate(bindingInterface, config);
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

        private static final @Nullable Class<? extends Annotation> defaultNullableAnnotation;
        static {
            Class<? extends Annotation> nullableAnnotation = null;

            var config = Configuration.FFM_DEFAULT_NULLABLE_ANNOTATION.get("auto");
            if (!"none".equals(config)) {
                if (config instanceof String annotationClassName) {
                    var custom = !"auto".equals(annotationClassName);
                    var popularNullableAnnotationClasses = custom
                        ? List.of(annotationClassName)
                        : List.of(
                        "org.jspecify.annotations.Nullable",
                        "javax.annotation.Nullable",
                        "org.jetbrains.annotations.Nullable",
                        "org.eclipse.jdt.annotation.Nullable",
                        "edu.umd.cs.findbugs.annotations.Nullable",
                        "org.checkerframework.checker.nullness.qual.Nullable"
                    );

                    for (var className : popularNullableAnnotationClasses) {
                        try {
                            var c = Class.forName(className);
                            if (Annotation.class.isAssignableFrom(c)) {
                                @SuppressWarnings("unchecked")
                                var annotationClass = (Class<? extends Annotation>)c;

                                FFMConfig.validateNullableAnnotationClass(annotationClass);
                                nullableAnnotation = annotationClass;
                                apiLog("Default nullable annotation: " + annotationClass);
                                break;
                            }
                        } catch (Exception e) {
                            if (custom) {
                                throw new IllegalStateException(e); // fail here if custom
                            }
                            // ignore
                        }
                    }
                } else if (config instanceof Class<?> annotationClass) {
                    @SuppressWarnings("unchecked")
                    var nullableAnnotationClass = (Class<? extends Annotation>)annotationClass;
                    FFMConfig.validateNullableAnnotationClass(nullableAnnotationClass); // fail here if invalid
                    nullableAnnotation = nullableAnnotationClass;
                }
            }

            defaultNullableAnnotation = nullableAnnotation;
        }

        private final MethodHandles.Lookup lookup;

        private @Nullable Class<? extends Annotation>
                                                    nullableAnnotation = defaultNullableAnnotation;
        private @Nullable SymbolLookup              symbolLookup;
        private @Nullable TraceConsumer             traceConsumer;
        private @Nullable Predicate<Method>         tracingFilter;
        private @Nullable Function<Method, Boolean> criticalOverride;

        private boolean checks         = Checks.CHECKS;
        private boolean debugGenerator = Configuration.DEBUG_GENERATOR.get(false);

        FFMConfigBuilder(MethodHandles.Lookup lookup) {
            this.lookup = lookup;
        }

        public FFMConfigBuilder withNullableAnnotation(Class<? extends Annotation> annotation) {
            this.nullableAnnotation = annotation;
            return this;
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
                nullableAnnotation,
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

    /** Creates a builder for {@link FFMConfig} instances, with the default state. */
    public static FFMConfigBuilder ffmConfigBuilder(MethodHandles.Lookup lookup) {
        return new FFMConfigBuilder(lookup);
    }

    /**
     * Registers a binding configuration for the specified package.
     *
     * <p>The specified configuration will be used when generating any interface that belongs to this package, for which a more specific configuration does not
     * exist.</p>
     *
     * @param _package the package
     * @param config   the binding configuration, or null to unregister the specified package
     *
     * @see #ffmConfig(Class, FFMConfig)
     */
    public static void ffmConfig(Package _package, @Nullable FFMConfig config) {
        if (config == null) {
            BINDING_CONFIGS.remove(_package);
        } else {
            BINDING_CONFIGS.put(_package, config);
        }
    }

    /**
     * Registers a binding configuration for the specified class.
     *
     * <p>The specified configuration will be used when generating any interface that is this class or is enclosed by it, for which a more specific
     * configuration does not exist.</p>
     *
     * @param _class the class
     * @param config the binding configuration, or null to unregister the specified class
     *
     * @see #ffmConfig(Package, FFMConfig)
     */
    public static void ffmConfig(Class<?> _class, @Nullable FFMConfig config) {
        if (config == null) {
            BINDING_CONFIGS.remove(_class);
        } else {
            BINDING_CONFIGS.put(_class, config);
        }
    }

}