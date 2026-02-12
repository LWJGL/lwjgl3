/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.libffi.*;

import java.lang.classfile.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.reflect.*;
import java.util.*;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.foreign.MemoryLayout.*;
import static org.lwjgl.system.ffm.BCCall.FeatureFlag.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;
import static org.lwjgl.system.ffm.BCUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

final class BCCallUp extends BCCall {

    // TODO: remove in LWJGL 4, used for interop with LWJGL 3 upcalls only
    private static final int FF_ACCEPTS_STRUCT_BY_VALUE = 1 << 30;
    private static final int FF_RETURNS_STRUCT_BY_VALUE = 1 << 31;

    private final Class<?> upcallInterface;

    private final Method      method;
    private final Parameter[] parameters;

    private final int   featureFlags;
    private final int[] featureFlagOffsets;

    private final LinkedHashMap<Class<?>, Integer> binders;

    final FunctionDescriptor descriptor;

    BCCallUp(FFMConfig config, Class<?> upcallInterface, @Nullable FFICIF cif) {
        super(config);

        this.upcallInterface = upcallInterface;

        if (!upcallInterface.isInterface()) {
            throw new UnsupportedOperationException("The binder must be parameterized with an interface");
        }

        if (upcallInterface.getDeclaredAnnotation(FunctionalInterface.class) == null) {
            throw new UnsupportedOperationException("The upcall interface must be annotated with @FunctionalInterface");
        }

        // This is the callback method that the user implements.
        // It may contain high-level types that need to be mapped to FFM types. If true, 2 cases:
        //   - The FFM-compatible method does not exist in the interface.
        //       * Generate the FFM-compatible method and forward to this method
        //   - The FFM-compatible method exists in the interface, implemented as default.
        //       * Just use the existing method
        method = Arrays.stream(upcallInterface.getDeclaredMethods())
            .filter(m -> !m.isDefault())
            .findFirst()
            .orElseThrow(); // guaranteed to find exactly 1 with @FunctionalInterface

        parameters = method.getParameters();

        featureFlagOffsets = new int[FF_LAST.ordinal()];
        binders = new LinkedHashMap<>();

        var hasTracing   = config.traceConsumer != null && (config.tracingFilter == null || config.tracingFilter.test(method));
        var featureFlags = hasTracing ? FF_TRACING.mask : 0;

        var argLayouts = new ArrayList<MemoryLayout>(parameters.length);
        for (var i = 0; i < parameters.length; i++) {
            var parameter = parameters[i];
            var type      = parameter.getType();
            if (isPointerType(parameter, type)) {
                if (BITS32 && type == long.class) {
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                }
            } else if (type == String.class) {
                featureFlags |= FF_TYPE_CONVERSION.mask;
            } else if (type == boolean.class) {
                var booleanInt = parameter.getAnnotation(FFMBooleanInt.class);
                if (booleanInt != null) {
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                    argLayouts.add(booleanInt.value().layout);
                    continue;
                } else if (cif != null) {
                    // LWJGL 3 interop
                    var layout = memoryLayoutFrom(FFIType.create(cif.arg_types().get(i)));
                    if (layout != ValueLayout.JAVA_BYTE) { // TODO: test
                        featureFlags |= FF_TYPE_CONVERSION.mask;
                        argLayouts.add(layout);
                        continue;
                    }
                }
            } else if (needsBinder(type)) {
                featureFlags |= FF_BINDER.mask;
                argLayouts.add(ValueLayout.ADDRESS);
                continue;
            } else if (org.lwjgl.system.Struct.class.isAssignableFrom(type)) {
                // LWJGL 3 interop
                Objects.requireNonNull(cif);
                if (i == parameters.length - 1 && method.getReturnType() == void.class && cif.rtype().type() == FFI_TYPE_STRUCT) {
                    featureFlags |= FF_RETURNS_STRUCT_BY_VALUE;
                } else {
                    argLayouts.add(memoryLayoutFrom(FFIType.create(cif.arg_types().get(i))));
                    featureFlags |= FF_ACCEPTS_STRUCT_BY_VALUE;
                }
                continue;
            }

            argLayouts.add(valueLayout(parameter));
        }

        MemoryLayout resLayout = null;

        var type = method.getReturnType();
        if (type != void.class) {
            if (type == String.class) {
                throw new IllegalStateException("String return types are not supported in upcalls: " + method);
            } else if (type == boolean.class) {
                if (method.isAnnotationPresent(FFMBooleanInt.class)) {
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                } else if (cif != null) {
                    // LWJGL 3 interop
                    resLayout = memoryLayoutFrom(cif.rtype());
                    featureFlags |= FF_TYPE_CONVERSION.mask;
                }
            } else if (BITS32 && type == long.class && method.isAnnotationPresent(FFMPointer.class)) {
                featureFlags |= FF_TYPE_CONVERSION.mask;
                resLayout = ValueLayout.JAVA_INT;
            } else if (needsBinder(type)) {
                var binder = config.binders.get(type).binder();
                if (binder instanceof UpcallBinder) {
                    throw new IllegalStateException("Upcalls can only be returned as raw pointer values");
                }

                binders.putIfAbsent(type, binders.size());
                featureFlags |= FF_BINDER.mask;

                var groupLayout = ((GroupBinder<?, ?>)binder).layout();
                if (method.isAnnotationPresent(FFMByValue.class)) {
                    featureFlags |= FF_BY_VALUE.mask;
                    resLayout = groupLayout;
                } else {
                    resLayout = ValueLayout.ADDRESS.withTargetLayout(groupLayout);
                }
            } else {
                resLayout = valueLayout(method, method.getReturnType());
            }
        } else if ((featureFlags & FF_RETURNS_STRUCT_BY_VALUE) != 0) {
            // LWJGL 3 interop
            // The group layout must be accurate, because of ABI idiosyncrasies.
            resLayout = groupLayoutFrom(Objects.requireNonNull(cif).rtype());
        }

        this.featureFlags = featureFlags;

        var argLayoutsArray = argLayouts.toArray(MemoryLayout[]::new);
        this.descriptor = resLayout == null
            ? FunctionDescriptor.ofVoid(argLayoutsArray)
            : FunctionDescriptor.of(resLayout, argLayoutsArray);
    }

    @SuppressWarnings("unchecked")
    <T> UpcallBinder<T> bootstrap() {
        if (config.debugGenerator) {
            printDebug(method, parameters, descriptor);
        }

        var bridgeDescriptor = switch (featureFlags) {
            case 0 -> null;
            default -> {
                var type = descriptor
                    .toMethodType()
                    .insertParameterTypes(0, upcallInterface);

                if ((featureFlags & FF_RETURNS_STRUCT_BY_VALUE) != 0) {
                    // LWJGL 3 interop
                    type = type.insertParameterTypes(1, MemorySegment.class);
                }

                yield type;
            }
        };

        /*
        new UpcallBinder<T>() {
            private static final FunctionDescriptor DESCRIPTOR = <DESCRIPTOR LDC>;
            private static final MethodHandle HANDLE = <either HANDLE LDC or MethodHandle to bridge method>;

            @Override
            public FunctionDescriptor descriptor() {
                return DESCRIPTOR;
            }

            @Override
            public MethodHandle handle() {
                return HANDLE;
            }

            // optional (created when featureFlags != 0)
            public static void bridge(T upcall, ...FFM-compatible params...) {
                upcall.invoke(...upcall params...);
            }
        };
        */

        var classData = getClassData(switch (featureFlags) {
            case 0 -> {
                try {
                    yield config.lookup.unreflect(method);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            default -> bridgeDescriptor;
        });

        var thisClass = getClassDescWrapper(method);
        var bytecode = ClassFile.of().build(thisClass, classBuilder -> {
            startHiddenClass(classBuilder)
                .withInterfaceSymbols(CD_UpcallBinder);

            classBuilder
                .withField("DESCRIPTOR", CD_FunctionDescriptor, ACC_PRIVATE | ACC_STATIC | ACC_FINAL)
                .withField("HANDLE", CD_MethodHandle, ACC_PRIVATE | ACC_STATIC | ACC_FINAL)
                .withMethod(CLASS_INIT_NAME, MTD_void, ACC_STATIC, mb -> mb.withCode(cb -> {
                        cb
                            .ldc(condyCDataAt(CD_FunctionDescriptor, 0))
                            .putstatic(thisClass, "DESCRIPTOR", CD_FunctionDescriptor);
                        if (featureFlags == 0) {
                            cb
                                .ldc(condyCDataAt(CD_MethodHandle, 1));
                        } else {
                            cb
                                .invokestatic(CD_MethodHandles, "lookup", MTD_MethodHandles$Lookup)
                                .ldc(cb.constantPool().classEntry(thisClass))
                                .ldc("bridge")
                                .ldc(condyCDataAt(CD_MethodType, 1))
                                .invokevirtual(CD_MethodHandles_Lookup, "findStatic", MTD_MethodHandle_Class_String_MethodType);
                        }
                        cb
                            .putstatic(thisClass, "HANDLE", CD_MethodHandle)
                            .return_();
                    })
                )
                .withMethod("descriptor", MTD_FunctionDescriptor, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .getstatic(thisClass, "DESCRIPTOR", CD_FunctionDescriptor)
                    .areturn())
                )
                .withMethod("handle", MTD_MethodHandle, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .getstatic(thisClass, "HANDLE", CD_MethodHandle)
                    .areturn())
                );

            // LWJGL 3 interop
            classBuilder.withMethod("stack", MTD_MemoryLayout, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                if ((featureFlags & FF_RETURNS_STRUCT_BY_VALUE) == 0) {
                    cb
                        .aconst_null()
                        .areturn();
                } else {
                    cb
                        .ldc(condyCDataAt(CD_MemoryLayout, 2))
                        .areturn();
                }
            }));

            if (featureFlags != 0) {
                var methodTypeDesc = getMethodTypeDesc(method);
                classBuilder.withMethod("bridge", bridgeDescriptor.describeConstable().orElseThrow(), ACC_PUBLIC | ACC_STATIC, mb -> mb.withCode(cb -> {
                    cb.aload(cb.parameterSlot(0));

                    var paramOffset = (featureFlags & FF_RETURNS_STRUCT_BY_VALUE) == 0 ? 1 : 2;
                    for (var p = 0; p < methodTypeDesc.parameterCount(); p++) {
                        var parameter = parameters[p];

                        var type = parameter.getType();

                        if (p == methodTypeDesc.parameterCount() - 1 && (featureFlags & FF_RETURNS_STRUCT_BY_VALUE) != 0) {
                            // LWJGL 3 interop (this is the last __result parameter)
                            continue;
                        }

                        var slot = cb.parameterSlot(p + paramOffset);
                        if (type == String.class) {
                            cb.aload(slot);
                            if (isNullable(config, parameter)) {
                                cb
                                    .invokeinterface(CD_MemorySegment, "address", MTD_long)
                                    .lconst_0()
                                    .lcmp()
                                    .ifThenElse(Opcode.IFEQ,
                                        CodeBuilder::aconst_null,
                                        bcb -> buildGetString(bcb.aload(slot), method));
                            } else {
                                buildGetString(cb, method);
                            }
                        } else if (type == boolean.class) {
                            cb.iload(slot);
                            var booleanInt = parameter.getAnnotation(FFMBooleanInt.class);
                            if (booleanInt != null && !booleanInt.binary()) {
                                cb.ifThenElse(Opcode.IFEQ, CodeBuilder::iconst_0, CodeBuilder::iconst_1);
                            }
                        } else if (BITS32 && type == long.class && parameter.isAnnotationPresent(FFMPointer.class)) {
                            // TODO: test
                            cb.iload(slot);
                            buildPointer32to64(cb);
                        } else if (needsBinder(type)) {
                            cb
                                .ldc(condyCDataAt(CD_GroupBinder, featureFlagOffsets[FF_BINDER.ordinal()] + binders.get(type)))
                                .swap() // MemorySegment, GroupBinder -> GroupBinder, MemorySegment
                                .invokeinterface(CD_GroupBinder, "get", MTD_Object_MemorySegment)
                            /*.checkcast(type.describeConstable().orElseThrow())*/
                            ;
                        } else if (org.lwjgl.system.Struct.class.isAssignableFrom(type)) {
                            // LWJGL 3 interop (convert bridge's MemorySegment parameter to LWJGL 3 struct instance)
                            var groupDesc = methodTypeDesc.parameterType(p);
                            cb
                                .aload(slot)
                                .invokeinterface(CD_MemorySegment, "address", MTD_long)
                                .invokestatic(groupDesc, "create", MethodTypeDesc.of(groupDesc, CD_long));
                        } else {
                            // FFMBooleanInt is handled implicitly, boolean parameters use iload anyway
                            cb.loadLocal(TypeKind.from(methodTypeDesc.parameterType(p)), slot);
                        }
                    }

                    if ((featureFlags & FF_RETURNS_STRUCT_BY_VALUE) != 0) {
                        // LWJGL 3 interop
                        var groupDesc = methodTypeDesc.parameterType(parameters.length - 1);
                        cb
                            .aload(cb.parameterSlot(1)) // __result
                            .invokeinterface(CD_MemorySegment, "address", MTD_long)
                            .invokestatic(groupDesc, "create", MethodTypeDesc.of(groupDesc, CD_long));
                    }

                    cb.invokeinterface(upcallInterface.describeConstable().orElseThrow(), method.getName(), methodTypeDesc);

                    if ((featureFlags & FF_RETURNS_STRUCT_BY_VALUE) != 0) {
                        // LWJGL 3 interop
                        cb.aload(cb.parameterSlot(1));
                    } else {
                        var type = method.getReturnType();
                        if (type != void.class) {
                            // Return result if non-void, transform if necessary
                            if (BITS32 && type == long.class && method.isAnnotationPresent(FFMPointer.class)) {
                                // TODO: test
                                buildPointer64to32(cb);
                            } else if (needsBinder(type)) {
                                cb
                                    .ldc(condyCDataAt(CD_GroupBinder, featureFlagOffsets[FF_BINDER.ordinal()] + binders.get(type)))
                                    .swap() // Group, GroupBinder -> GroupBinder, Group
                                    .invokeinterface(CD_GroupBinder, "asSegment", MTD_MemorySegment_Object);
                            }
                        }
                    }
                    // FFMBooleanInt is handled implicitly, boolean returns use ireturn anyway
                    cb.return_(TypeKind.from(bridgeDescriptor.returnType()));
                }));
            }
        });

        if (config.debugGenerator) {
            printModel(ClassFile.of().parse(bytecode));
        }

        // Store the target handle as class data in the hidden class.
        try {
            var wrapperLookup = config.lookup.defineHiddenClassWithClassData(bytecode, classData, true);
            return ((Class<UpcallBinder<T>>)wrapperLookup.lookupClass())
                .getDeclaredConstructor()
                .newInstance();
        } catch (Error | RuntimeException e) {
            printModel(ClassFile.of().parse(bytecode));
            throw e;
        } catch (Exception e) {
            printModel(ClassFile.of().parse(bytecode));
            throw new RuntimeException(e);
        }
    }

    private List<Object> getClassData(Object method) {
        var list = new ArrayList<>(4);

        list.add(descriptor);
        list.add(method);

        if ((featureFlags & FF_RETURNS_STRUCT_BY_VALUE) != 0) {
            list.add(descriptor.returnLayout().orElseThrow());
        }

        if (FF_BINDER.isSet(featureFlags)) {
            featureFlagOffsets[FF_BINDER.ordinal()] = list.size();
            for (var type : binders.sequencedKeySet()) {
                list.add(config.binders.get(type).binder());
            }
        }

        return list;
    }

    // LWJGL 3 interop
    private static GroupLayout groupLayoutFrom(FFIType groupType) {
        // deref: FFIType **elements
        var elements = MemorySegment
            .ofAddress(groupType.address() + FFIType.ELEMENTS)
            .reinterpret(ValueLayout.ADDRESS.byteSize())
            .get(ValueLayout.ADDRESS, 0L)
            .reinterpret(Long.MAX_VALUE);

        var members = new ArrayList<MemoryLayout>();

        var index = 0;
        while (true) {
            var element = elements.getAtIndex(ValueLayout.ADDRESS, index++);
            if (MemorySegment.NULL.equals(element)) {
                break;
            }

            var elementType = FFIType.create(element.address());
            members.add(memoryLayoutFrom(elementType));
        }

        return structLayout(members.toArray(MemoryLayout[]::new));
    }

    // LWJGL 3 interop
    private static MemoryLayout memoryLayoutFrom(FFIType type) {
        return switch (type.type()) {
            case FFI_TYPE_UINT8, FFI_TYPE_SINT8 -> ValueLayout.JAVA_BYTE;
            case FFI_TYPE_UINT16, FFI_TYPE_SINT16 -> ValueLayout.JAVA_SHORT;
            case FFI_TYPE_INT, FFI_TYPE_UINT32, FFI_TYPE_SINT32 -> ValueLayout.JAVA_INT;
            case FFI_TYPE_UINT64, FFI_TYPE_SINT64 -> ValueLayout.JAVA_LONG;
            case FFI_TYPE_FLOAT -> ValueLayout.JAVA_FLOAT;
            case FFI_TYPE_DOUBLE -> ValueLayout.JAVA_DOUBLE;
            case FFI_TYPE_STRUCT -> groupLayoutFrom(type);
            case FFI_TYPE_POINTER -> ValueLayout.ADDRESS;
            default -> throw new IllegalStateException("Unsupported libffi type: " + type.type());
        };
    }

}