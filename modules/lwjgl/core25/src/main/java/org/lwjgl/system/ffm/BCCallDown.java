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
import java.util.*;
import java.util.function.*;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.invoke.MethodType.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.ffm.BCCall.FeatureFlag.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;
import static org.lwjgl.system.ffm.BCUtil.*;
import static org.lwjgl.system.ffm.FFM.*;

final class BCCallDown extends BCCall {

    private final Method      method;
    private final Parameter[] parameters;

    private final boolean hasFunctionAddress;

    private final @Nullable String nativeName;

    private final int   featureFlags;
    private final int[] featureFlagOffsets;

    private final LinkedHashMap<Class<?>, Integer> binders;

    private final @Nullable Class<?> allocatorClass;

    private final Linker.@Nullable Option captureCallState;
    private final Linker.@Nullable Option firstVariadicArg;

    private final FunctionDescriptor descriptor;

    private final MethodHandle ffm;

    BCCallDown(FFMConfig config, Method method) {
        super(config);

        this.method = method;

        parameters = method.getParameters();

        hasFunctionAddress = hasFunctionAddress();
        nativeName = hasFunctionAddress ? null : getNativeName(method);

        featureFlagOffsets = new int[FF_LAST.ordinal()];
        binders = new LinkedHashMap<>();

        Class<?> allocatorClass = null;

        Linker.Option captureCallState = null;
        var firstVariadicArg = method.isAnnotationPresent(FFMFirstVariadicArg.class)
            ? Linker.Option.firstVariadicArg(method.getAnnotation(FFMFirstVariadicArg.class).value())
            : null;

        var hasTracing   = config.traceConsumer != null && (config.tracingFilter == null || config.tracingFilter.test(method));
        var featureFlags = hasTracing ? FF_TRACING.mask : 0;

        var argLayouts = new ArrayList<MemoryLayout>(parameters.length);

        if (hasJNI()) {
            argLayouts.add(ValueLayout.ADDRESS);
            argLayouts.add(ValueLayout.ADDRESS);
            featureFlags |= FF_JNI.mask;
        }

        for (var i = 0; i < parameters.length; i++) {
            var parameter = parameters[i];

            if (parameter.getType() == MemorySegment.class) {
                if (i == 0 && hasFunctionAddress) {
                    if (DEBUG && Arrays.stream(parameter.getAnnotations()).anyMatch(it -> "org.lwjgl.system.ffm".equals(it.annotationType().getPackage().getName()))) {
                        throw new IllegalStateException("FFMFunctionAddress parameters cannot have FFM annotations.");
                    }
                    continue;
                }

                var ccs = parameter.getAnnotation(FFMCaptureCallState.class);
                if (ccs != null) {
                    if (i != (hasFunctionAddress ? 1 : 0) + (allocatorClass != null ? 1 : 0)) {
                        throw new IllegalStateException("Invalid position of FFMCaptureCallState parameter.");
                    }

                    captureCallState = Linker.Option.captureCallState(ccs.value());
                    continue;
                }
            } else if (i == 0 && hasFunctionAddress) {
                throw new IllegalStateException("Missing FFMFunctionAddress parameter.");
            }

            if (parameter.isAnnotationPresent(FFMFirstVariadicArg.class)) {
                if (firstVariadicArg != null) {
                    throw new IllegalStateException("Multiple FFMFirstVariadicArg annotations found.");
                }
                firstVariadicArg = Linker.Option.firstVariadicArg(i);
            }

            if (SegmentAllocator.class.isAssignableFrom(parameter.getType())) {
                if (i != (hasFunctionAddress ? 1 : 0)) {
                    throw new IllegalStateException("Invalid position of SegmentAllocator/Arena parameter.");
                }
                allocatorClass = parameter.getType();
                // TODO: if a struct is returned or passed by-value?
                continue;
            }

            var type = parameter.getType();
            if (isPointerType(parameter, type)) {
                if (config.checks && !isNullable(config, parameter)) {
                    featureFlags |= FF_CHECK.mask; // requires null check
                }
                if (BITS32 && type == long.class) {
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                }
            } else if (type == String.class) {
                featureFlags |= FF_STACK.mask;
            } else if (type == boolean.class) {
                if (parameter.isAnnotationPresent(FFMBooleanInt.class)) {
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                }
            } else if (needsBinder(type)) {
                var binder = config.binders.get(type).binder();
                if (allocatorClass == null && binder instanceof UpcallBinder<?>) {
                    throw new IllegalStateException("An Arena parameter is required for parameter #" + i + ": " + type);
                }

                binders.putIfAbsent(type, binders.size());
                featureFlags |= FF_BINDER.mask;

                if (binder instanceof GroupBinder<?, ?> groupBinder) {
                    var groupLayout = groupBinder.layout();
                    argLayouts.add(parameter.isAnnotationPresent(FFMByValue.class)
                        ? groupLayout
                        : ValueLayout.ADDRESS.withTargetLayout(groupLayout));
                } else {
                    argLayouts.add(ValueLayout.ADDRESS);
                }

                continue;
            }

            argLayouts.add(valueLayout(parameter));
        }

        this.allocatorClass = allocatorClass;
        this.captureCallState = captureCallState;
        this.firstVariadicArg = firstVariadicArg;

        MemoryLayout resLayout = null;

        var type = method.getReturnType();
        if (type != void.class) {
            var returnAnnotation = method.getAnnotation(FFMReturn.class);

            if (type == String.class || returnAnnotation != null) {
                featureFlags |= FF_STACK.mask;
            } else if (type == boolean.class) {
                if (method.isAnnotationPresent(FFMBooleanInt.class)) {
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                }
            } else if (BITS32 && type == long.class && method.isAnnotationPresent(FFMPointer.class)) {
                featureFlags |= FF_TYPE_CONVERSION.mask;
            }

            if (returnAnnotation != null) {
                var returnOutputAnnotation = method.getAnnotation(FFMReturn.SizeOut.class);

                // TODO: protect against multiple Size annotations
                // TODO: validate Size parameter type
                if (returnOutputAnnotation == null) {
                    for (var parameter : parameters) {
                        if (parameter.isAnnotationPresent(FFMReturn.Size.class)) {
                            resLayout = valueLayout(parameter);
                        }
                    }
                }
                injectReturnParameters(argLayouts, returnAnnotation, returnOutputAnnotation);
            } else if (needsBinder(type)) {
                var binder = config.binders.get(type).binder();
                if (binder instanceof UpcallBinder) {
                    throw new IllegalStateException("Upcalls can only be returned as raw pointer values");
                }

                binders.putIfAbsent(type, binders.size());
                featureFlags |= FF_BINDER.mask;

                var groupLayout = ((GroupBinder<?, ?>)binder).layout();
                if (method.isAnnotationPresent(FFMByValue.class)) {
                    if (allocatorClass == null) {
                        throw new IllegalStateException("A SegmentAllocator/Arena parameter is required for return value");
                    }
                    resLayout = groupLayout;
                    featureFlags |= FF_BY_VALUE.mask;
                } else {
                    resLayout = ValueLayout.ADDRESS.withTargetLayout(groupLayout);
                }
            } else {
                resLayout = valueLayout(method, type);
            }
        }

        this.featureFlags = featureFlags;

        var argLayoutsArray = argLayouts.toArray(MemoryLayout[]::new);
        this.descriptor = resLayout == null
            ? FunctionDescriptor.ofVoid(argLayoutsArray)
            : FunctionDescriptor.of(resLayout, argLayoutsArray);

        this.ffm = Linker.nativeLinker()
            .downcallHandle(descriptor, createOptions());
    }

    private boolean hasFunctionAddress() {
        return
            method.getAnnotation(FFMFunctionAddress.class) != null ||
            method.getDeclaringClass().getAnnotation(FFMFunctionAddress.class) != null;
    }

    private boolean hasJNI() {
        return
            method.getAnnotation(FFMJNI.class) != null ||
            method.getDeclaringClass().getAnnotation(FFMJNI.class) != null;
    }

    private static void injectReturnParameters(ArrayList<MemoryLayout> argLayouts, FFMReturn returnAnnotation, FFMReturn.@Nullable SizeOut returnSizeOutAnnotation) {
        if (returnSizeOutAnnotation != null && returnSizeOutAnnotation.value() < returnAnnotation.value()) {
            injectReturnParameter(argLayouts, returnSizeOutAnnotation.value(), "Invalid @FFMReturn.SizeOut parameter index: ");
        }
        injectReturnParameter(argLayouts, returnAnnotation.value(), "Invalid return parameter index: ");
        if (returnSizeOutAnnotation != null && returnAnnotation.value() < returnSizeOutAnnotation.value()) {
            injectReturnParameter(argLayouts, returnSizeOutAnnotation.value(), "Invalid @FFMReturn.SizeOut parameter index: ");
        }
    }
    private static void injectReturnParameter(ArrayList<MemoryLayout> argLayouts, int injectIndex, String errorMessage) {
        if (injectIndex < 0 || argLayouts.size() < injectIndex) {
            throw new IllegalArgumentException(errorMessage + injectIndex);
        }
        argLayouts.add(injectIndex, C_POINTER);
    }

    private Linker.Option[] createOptions() {
        var options = new ArrayList<Linker.Option>(2);

        addCritical(options);

        if (captureCallState != null) {
            options.add(captureCallState);
        }

        if (firstVariadicArg != null) {
            options.add(firstVariadicArg);
        }

        if (options.isEmpty()) {
            return EMPTY_OPTIONS;
        }

        return options.toArray(Linker.Option[]::new);
    }

    private void addCritical(ArrayList<Linker.Option> options) {
        var override = config.criticalOverride == null
            ? null
            : config.criticalOverride.apply(method);

        // check if forcibly disabled
        if (override != null && !override) {
            return;
        }

        // get annotation
        var annotation = method.getAnnotation(FFMCritical.class);
        if (annotation == null) {
            annotation = method.getDeclaringClass().getAnnotation(FFMCritical.class);
        }

        // check if forcibly enabled or annotation present
        if (override != null || annotation != null) {
            // even when forcibly enabled, get allowHeapAccess from annotation
            options.add(Linker.Option.critical(annotation != null && annotation.value()));
        }
    }

    MethodHandle bootstrap() {
        if (config.debugGenerator) {
            printDebug(method, parameters, descriptor);
        }

        if (featureFlags != 0) {
            return bootstrapWrapper();
        }

        // No wrapper needed
        return hasFunctionAddress
            ? ffm
            : ffm.bindTo(Objects.requireNonNull(config.symbolLookup).find(nativeName).orElseThrow());
    }

    private MethodHandle bootstrapWrapper() {
        // Wrap the FFM method handle call in a generated method with the same signature as the bootstrapped method.
        // This is required when the native function is not compatible with the bootstrapped method and transformations must be applied.
        if (config.debugGenerator) {
            apiLog("\t-> generating wrapper method");
        }

        var classData = getClassData();

        var thisClass = getClassDescWrapper(method);
        var bytecode = ClassFile.of().build(thisClass, classBuilder -> {
            startHiddenClass(classBuilder);

            var nativeMethodTypeDesc = ffm.type().describeConstable().orElseThrow();
            if (hasFeature(FF_TRACING)) {
                trace(classBuilder, nativeMethodTypeDesc);
            }

            var methodTypeDesc = getMethodTypeDesc(method);

            classBuilder
                .withMethod(method.getName(), methodTypeDesc, ACC_PUBLIC | ACC_STATIC, mb -> mb.withCode(cb -> {
                    var virtualParameterCount = getVirtualParameterCount();

                    if (config.checks) {
                        // Generate checks
                        for (var p = virtualParameterCount; p < methodTypeDesc.parameterCount(); p++) {
                            var parameter = parameters[p];
                            var type      = parameter.getType();
                            if ((isPointerType(parameter, type) || needsBinder(type)) && !isNullable(config, parameter)) {
                                var slot = cb.parameterSlot(p);

                                Opcode ifThenOpcode;
                                if (type == MemorySegment.class) {
                                    cb
                                        .getstatic(CD_MemorySegment, "NULL", CD_MemorySegment)
                                        .aload(slot)
                                        .invokeinterface(CD_MemorySegment, "equals", MTD_boolean_Object);
                                    ifThenOpcode = Opcode.IFNE;
                                } else if (type == long.class) {
                                    cb
                                        .lconst_0()
                                        .lload(slot)
                                        .lcmp();
                                    ifThenOpcode = Opcode.IFEQ;
                                } else if (needsBinder(type)) {
                                    cb.aload(slot);
                                    ifThenOpcode = Opcode.IFNULL;
                                } else {
                                    // String will throw in allocateFrom
                                    // TODO: add more types
                                    throw new UnsupportedOperationException();
                                }

                                var exceptionText = getExceptionTextNULL(parameter, p - virtualParameterCount);
                                cb.ifThen(ifThenOpcode, thenHandler -> thenHandler
                                    .new_(CD_IllegalArgumentException)
                                    .dup()
                                    .ldc(exceptionText)
                                    .invokespecial(CD_IllegalArgumentException, INIT_NAME, MTD_void_String)
                                    .athrow());
                            }
                        }
                    }

                    var allocatorSlot = hasFeature(FF_STACK) ? getStackSlot(cb) : -1;
                    buildMethodBody(cb, methodTypeDesc, allocatorSlot, bcb -> {
                        BCReturnTransform returnTransform = null;

                        var returnAnnotation = method.getAnnotation(FFMReturn.class);
                        if (returnAnnotation != null) {
                            returnTransform = BCReturnTransform.create(
                                bcb,
                                methodTypeDesc, method, parameters,
                                returnAnnotation,
                                allocatorSlot
                            );
                        }

                        // ldc the target handle
                        if (!hasFeature(FF_TRACING)) {
                            // Load target handle via Condy, using MethodHandles::classData as the bootstrap method.
                            cb.ldc(condyCDataAt(CD_MethodHandle, 0));
                        }
                        if (!hasFunctionAddress) {
                            // Pass the function address manually, to avoid bindTo's additional lambda form.
                            cb.ldc(condyCDataAt(CD_MemorySegment, 1));
                        }

                        if (hasJNI()) {
                            cb
                                .getstatic(CD_MemorySegment, "NULL", CD_MemorySegment)
                                .getstatic(CD_MemorySegment, "NULL", CD_MemorySegment);
                        }

                        // Pass arguments, transform if necessary
                        //var firstNativeParameterIndex = getFirstNativeParameterIndex();
                        for (var p = 0; p < methodTypeDesc.parameterCount(); p++) {
                            var parameter = parameters[p];
                            var type      = parameter.getType();


                            var slot = bcb.parameterSlot(p);

                            if (SegmentAllocator.class.isAssignableFrom(type)) {
                                if (hasFeature(FF_BY_VALUE)) {
                                    bcb.aload(slot);
                                }
                                continue;
                            }

                            if (returnTransform != null) {
                                returnTransform.loadParameters(bcb, virtualParameterCount, p);
                            }

                            if (type == String.class) {
                                if (isNullable(config, parameter)) {
                                    bcb
                                        .aload(slot)
                                        .ifThenElse(
                                            Opcode.IFNULL,
                                            thenHandler -> thenHandler.getstatic(CD_MemorySegment, "NULL", CD_MemorySegment),
                                            elseHandler -> buildAllocateFrom(elseHandler, allocatorSlot, slot, parameter)
                                        );
                                } else {
                                    buildAllocateFrom(bcb, allocatorSlot, slot, parameter);
                                }
                            } else if (BITS32 && type == long.class && parameter.isAnnotationPresent(FFMPointer.class)) {
                                // TODO: test
                                bcb.lload(slot);
                                buildPointer64to32(bcb);
                            } else if (needsBinder(type)) {
                                var binder = config.binders.get(type).binder();
                                switch (binder) {
                                    case GroupBinder<?, ?> _ -> {
                                        if (isNullable(config, parameter)) {
                                            bcb
                                                .aload(slot)
                                                .ifThenElse(Opcode.IFNULL,
                                                    b0 -> b0.getstatic(CD_MemorySegment, "NULL", CD_MemorySegment),
                                                    b1 -> buildGroupAsSegment(b1, type, slot)
                                                );
                                        } else {
                                            buildGroupAsSegment(bcb, type, slot);
                                        }
                                    }
                                    case UpcallBinder<?> _ -> {
                                        if (isNullable(config, parameter)) {
                                            bcb
                                                .aload(slot)
                                                .ifThenElse(Opcode.IFNULL,
                                                    b0 -> b0.getstatic(CD_MemorySegment, "NULL", CD_MemorySegment),
                                                    b1 -> buildUpcallBinderAllocation(b1, type, slot)
                                                );
                                        } else {
                                            buildUpcallBinderAllocation(bcb, type, slot);
                                        }
                                    }
                                    default -> throw new IllegalStateException("Unsupported binder type: " + binder.getClass());
                                }
                            } else {
                                // FFMBooleanInt is handled implicitly, boolean parameters use iload anyway
                                bcb.loadLocal(TypeKind.from(methodTypeDesc.parameterType(p)), slot);
                            }
                        }
                        if (returnTransform != null) {
                            returnTransform.loadParametersTail(bcb, virtualParameterCount, methodTypeDesc.parameterCount());
                        }

                        // Invoke the FFM method handle
                        if (hasFeature(FF_TRACING)) {
                            bcb.invokestatic(thisClass, "trace", nativeMethodTypeDesc);
                        } else {
                            bcb.invokevirtual(CD_MethodHandle, "invokeExact", nativeMethodTypeDesc);
                        }
                        var type = method.getReturnType();
                        if (type != void.class) {
                            // Return result if non-void, transform if necessary
                            if (returnTransform != null) {
                                returnTransform.buildResult(bcb, methodTypeDesc, method);
                            } else if (type == String.class) {
                                // Native function returns null-terminated string
                                buildGetString(bcb, method);
                            } else if (type == boolean.class) {
                                var booleanInt = method.getAnnotation(FFMBooleanInt.class);
                                if (booleanInt != null && !booleanInt.binary()) {
                                    bcb.ifThenElse(Opcode.IFEQ, CodeBuilder::iconst_0, CodeBuilder::iconst_1);
                                }
                            } else if (BITS32 && type == long.class && method.isAnnotationPresent(FFMPointer.class)) {
                                // TODO: test
                                buildPointer32to64(bcb);
                            } else if (needsBinder(type)) {
                                bcb
                                    .ldc(condyCDataAt(CD_GroupBinder, featureFlagOffsets[FF_BINDER.ordinal()] + binders.get(type)))
                                    .swap() // MemorySegment, GroupBinder -> GroupBinder, MemorySegment
                                    .invokeinterface(CD_GroupBinder, "get", MTD_Object_MemorySegment)
                                /*.checkcast(type.describeConstable().orElseThrow())*/
                                ;
                            }
                        }
                    });
                }));
        });

        if (config.debugGenerator) {
            printModel(ClassFile.of().parse(bytecode));
        }

        // Store the target handle as class data in the hidden class.
        try {
            var wrapperLookup = config.lookup.defineHiddenClassWithClassData(bytecode, classData, true);
            return wrapperLookup.findStatic(
                wrapperLookup.lookupClass(),
                method.getName(),
                methodType(method.getReturnType(), method.getParameterTypes())
            );
        } catch (Error | RuntimeException e) {
            printModel(ClassFile.of().parse(bytecode));
            throw e;
        } catch (Exception e) {
            printModel(ClassFile.of().parse(bytecode));
            throw new RuntimeException(e);
        }
    }

    private void buildMethodBody(CodeBuilder cb, MethodTypeDesc methodTypeDesc, int allocatorSlot, Consumer<CodeBuilder> bodyHandler) {
        var returnTK = TypeKind.from(methodTypeDesc.returnType());
        if (allocatorSlot != -1 && (allocatorClass == null || StackAllocator.class.isAssignableFrom(allocatorClass))) {
            buildStackBody(cb, returnTK, allocatorSlot, bodyHandler);
        } else {
            bodyHandler.accept(cb);
        }
        cb.return_(returnTK);
    }

    private void buildStackBody(CodeBuilder cb, TypeKind returnTK, int stackSlot, Consumer<CodeBuilder> arenaTryHandler) {
        var returnSlot = returnTK == TypeKind.VOID ? -1 : cb.allocateLocal(returnTK);

        if (allocatorClass == null || !StackAllocator.class.isAssignableFrom(allocatorClass)) {
            // try (var stack = stackPush()) {
            cb
                .invokestatic(CD_SegmentStack, "stackPush", MTD_SegmentStack)
                .astore(stackSlot);
        } else {
            // stack.push();
            cb
                .aload(cb.parameterSlot(hasFunctionAddress ? 1 : 0))
                .invokeinterface(CD_StackAllocator, "push", MTD_StackAllocator)
                .pop();
        }
        cb.trying(
                tryingHandler -> {
                    arenaTryHandler.accept(tryingHandler);
                    if (returnTK != TypeKind.VOID) {
                        tryingHandler.storeLocal(returnTK, returnSlot);
                    }
                },
                catchesHandler -> catchesHandler.catchingAll(bcb0 -> bcb0
                    .astore(stackSlot + 1)
                    .trying(
                        finallyTryHandler -> finallyTryHandler
                            // finally, pop the stack
                            .aload(stackSlot)
                            .invokeinterface(CD_StackAllocator, "pop", BCDescriptors.MTD_StackAllocator)
                            .pop(),
                        suppressedCatchesHandler -> suppressedCatchesHandler.catchingAll(bcb1 -> bcb1
                            // exception in pop, add to suppressed list
                            .astore(stackSlot + 2)
                            .aload(stackSlot + 1)
                            .aload(stackSlot + 2)
                            .invokevirtual(CD_Throwable, "addSuppressed", MTD_void_Throwable))
                    )
                    // rethrow original exception
                    .aload(stackSlot + 1)
                    .athrow()
                )
            )
            // finally, pop the stack
            .aload(stackSlot)
            .invokeinterface(CD_StackAllocator, "pop", BCDescriptors.MTD_StackAllocator)
            .pop();
        if (returnTK != TypeKind.VOID) {
            cb.loadLocal(returnTK, returnSlot);
        }
    }

    private void trace(ClassBuilder classBuilder, MethodTypeDesc nativeMethodTypeDesc) {
        classBuilder.withMethod("trace", nativeMethodTypeDesc, ACC_PRIVATE | ACC_STATIC, mb -> mb.withCode(cb -> {
            // Load target handle via Condy, using MethodHandles::classDataAt as the bootstrap method.
            cb.ldc(condyCDataAt(CD_MethodHandle, 0));
            for (var p = 0; p < nativeMethodTypeDesc.parameterCount(); p++) {
                cb.loadLocal(
                    TypeKind.from(nativeMethodTypeDesc.parameterType(p)),
                    cb.parameterSlot(p)
                );
            }
            cb.invokevirtual(CD_MethodHandle, "invokeExact", nativeMethodTypeDesc);

            int returnSlot;
            var returnTK = TypeKind.from(nativeMethodTypeDesc.returnType());
            if (returnTK != TypeKind.VOID) {
                returnSlot = cb.allocateLocal(returnTK);
                cb.storeLocal(returnTK, returnSlot);
            } else {
                returnSlot = -1;
            }

            var consumerIndex = featureFlagOffsets[FF_TRACING.ordinal()];
            cb
                // Load TraceConsumer via Condy
                .ldc(condyCDataAt(CD_TraceConsumer, consumerIndex))
                // Load Method via Condy
                .ldc(condyCDataAt(CD_Method, consumerIndex + 1));
            if (returnTK == TypeKind.VOID) {
                cb.aconst_null();
            } else {
                cb.loadLocal(returnTK, returnSlot);
                if (returnTK != TypeKind.REFERENCE) {
                    boxPrimitiveValue(cb, returnTK);
                }
            }

            cb
                .loadConstant(nativeMethodTypeDesc.parameterCount())
                .anewarray(CD_Object);
            for (var p = 0; p < nativeMethodTypeDesc.parameterCount(); p++) {
                var tk = TypeKind.from(nativeMethodTypeDesc.parameterType(p));

                cb
                    .dup()
                    .loadConstant(p)
                    .loadLocal(tk, cb.parameterSlot(p));
                if (tk != TypeKind.REFERENCE) {
                    boxPrimitiveValue(cb, tk);
                }
                cb.aastore();
            }
            cb.invokeinterface(CD_TraceConsumer, "accept", MTD_void_Method_Object_ObjectArray);

            // Return
            if (returnTK != TypeKind.VOID) {
                cb.loadLocal(returnTK, returnSlot);
            }
            cb.return_(returnTK);
        }));
    }

    private boolean hasFeature(FeatureFlag flag) {
        return flag.isSet(featureFlags);
    }

    private int getVirtualParameterCount() {
        var index = 0;
        if (hasFunctionAddress) {
            index++;
        }
        if (allocatorClass != null) {
            index++;
        }
        if (captureCallState != null) {
            index++;
        }
        return index;
    }

    private int getFirstNativeParameterIndex() {
        var index = 0;
        if (hasFunctionAddress) {
            index++;
        }
        if (allocatorClass != null) {
            // TODO: only if there is a struct value returned or passed by-value
        }
        if (captureCallState != null) {
            index++;
        }
        return index;
    }

    private int getStackSlot(CodeBuilder cb) {
        return allocatorClass != null
            ? cb.parameterSlot(hasFunctionAddress ? 1 : 0)
            : cb.allocateLocal(TypeKind.REFERENCE);
    }

    private int getUpcallArenaSlot(CodeBuilder cb) {
        if (allocatorClass == null || !Arena.class.isAssignableFrom(allocatorClass)) {
            throw new IllegalStateException("Allocating upcalls requires an Arena parameter");
        }
        return cb.parameterSlot(hasFunctionAddress ? 1 : 0);
    }

    private List<Object> getClassData() {
        var list = new ArrayList<>(5);

        list.add(ffm);

        if (!hasFunctionAddress) {
            var lookup = config.symbolLookup;
            if (lookup == null) {
                throw new IllegalStateException("The registered FFMConfig does not define a SymbolLookup.");
            }
            list.add(lookup
                .find(nativeName)
                .orElseThrow(() -> new IllegalStateException("Failed to resolve native function: " + nativeName)));
        }

        if (hasFeature(FF_TRACING)) {
            featureFlagOffsets[FF_TRACING.ordinal()] = list.size();
            list.add(config.traceConsumer);
            list.add(method);
        }

        if (hasFeature(FF_BINDER)) {
            featureFlagOffsets[FF_BINDER.ordinal()] = list.size();
            for (var type : binders.sequencedKeySet()) {
                list.add(config.binders.get(type).binder());
            }
        }

        return list;
    }

    private static <T extends CodeBuilder> T buildAllocateFrom(T cb, int allocatorSlot, int slot, Parameter parameter) {
        cb
            .aload(allocatorSlot)
            .aload(slot);
        buildCharsetInstance(cb, getCharset(parameter))
            .invokeinterface(CD_SegmentAllocator, "allocateFrom", MTD_MemorySegment_String_Charset);
        return cb;
    }

    private <T extends CodeBuilder> T buildGroupAsSegment(T cb, Class<?> type, int parameterSlot) {
        cb
            .ldc(condyCDataAt(CD_GroupBinder, featureFlagOffsets[FF_BINDER.ordinal()] + binders.get(type)))
            .aload(parameterSlot)
            .invokeinterface(CD_GroupBinder, "asSegment", MTD_MemorySegment_Object);
        return cb;
    }

    private <T extends CodeBuilder> T buildUpcallBinderAllocation(T cb, Class<?> type, int parameterSlot) {
        cb
            .ldc(condyCDataAt(CD_UpcallBinder, featureFlagOffsets[FF_BINDER.ordinal()] + binders.get(type)))
            .aload(getUpcallArenaSlot(cb))
            .aload(parameterSlot)
            .invokeinterface(CD_UpcallBinder, "allocate", MTD_MemorySegment_Arena_Object);
        return cb;
    }

}