/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.lwjgl.system.*;

import java.lang.classfile.*;
import java.lang.classfile.attribute.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.*;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;
import static java.lang.invoke.MethodType.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.ffm.BCCall.FeatureFlag.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;
import static org.lwjgl.system.ffm.BCUtil.*;

final class BCGroup {

    private static final Collector<CharSequence, ?, String> SEMI_COLON = Collectors.joining(";");

    private BCGroup() {
    }

    private static ClassDesc groupDesc(FFMConfig.BinderField binderField) {
        var binder = binderField.binder();
        return switch (binder) {
            case StructBinder<?> _ -> CD_StructBinder;
            case UnionBinder<?> _ -> CD_UnionBinder;
            default -> throw new UnsupportedOperationException("Unsupported binder type: " + binder.getClass());
        };
    }

    private static RuntimeException memberException(String message, Class<?> groupInterface, String member) {
        return new IllegalStateException(String.format("%s (%s::%s)", message, groupInterface.getSimpleName(), member));
    }

    private static RuntimeException methodException(String message, Method method) {
        return new IllegalStateException(String.format("%s (%s::%s)", message, method.getDeclaringClass(), method.getName()));
    }

    private static MethodHandles.Lookup bootstrapImplementation(
        FFMConfig config,
        Class<?> groupInterface,
        GroupLayout layout,
        FFM.GroupBinderBuilder<?, ?, ?, ?> builder
    ) {
        var thisClass = ClassDesc.of(
            groupInterface.getPackageName(),
            groupInterface.getSimpleName() + "Impl"
        );
        var bytecode = of().build(thisClass, classBuilder -> {
            var groupDesc = groupInterface.describeConstable().orElseThrow();

            // Group extends java.lang.Record. Currently this does not add much value,
            // other than making group.getClass().getRecordComponents() work
            classBuilder
                .withVersion(latestMajorVersion(), latestMinorVersion())
                .withFlags(AccessFlag.PUBLIC, AccessFlag.FINAL)
                .withSuperclass(CD_Record)
                .withInterfaceSymbols(groupDesc)
                .withField("address", CD_long, ACC_PRIVATE | ACC_FINAL)
                .withMethod(INIT_NAME, MTD_void_long, 0, mb -> mb.withCode(cb -> cb
                    .aload(cb.receiverSlot())
                    .lload(cb.parameterSlot(0))
                    .putfield(thisClass, "address", CD_long)
                    .aload(cb.receiverSlot())
                    .invokespecial(CD_Record, INIT_NAME, MTD_void, false)
                    .return_()
                ));

            // member name -> list of methods that access the member
            // sorted by layout member order
            var memberMap = compileMemberAccessors(groupInterface, layout);

            // Don't need canonical getters if all of equals, hashCode, toString are provided
            var hasPrivateGetters =
                builder.equals == null ||
                builder.hashCode == null ||
                builder.toString == null;

            // GENERATE GETTERS
            var getters = new LinkedHashMap<String, Method>(memberMap.size());
            for (var member : memberMap.entrySet()) {
                var memberName = member.getKey();
                var methods    = member.getValue();

                var getterCount       = 0;
                var nonCanonicalCount = 0;
                for (var method : methods) {
                    if (method.getParameterCount() != 0) {
                        continue; // setter
                    }
                    if (method.getReturnType() == void.class) {
                        throw methodException("Group getter returns void", method);
                    }

                    getterCount++;
                    nonCanonicalCount += registerCanonicalGetter(groupInterface, method, getters, memberName);

                    var descriptor = getMethodTypeDesc(method);
                    classBuilder.withMethod(method.getName(), descriptor, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                            var memberPath   = groupElement(memberName);
                            var memberLayout = Objects.requireNonNull(layout.select(memberPath));

                            var memberOffset = layout.byteOffset(memberPath);

                            // TODO: handle clong
                            var returnType = method.getReturnType();
                            if (returnType == boolean.class) {
                                buildMemberAddress(cb, thisClass, memberOffset);
                                switch (memberLayout) {
                                    case ValueLayout.OfByte _ -> cb.invokestatic(CD_MemoryUtil, "memGetByte", MTD_byte_long);
                                    case ValueLayout.OfShort _ -> cb.invokestatic(CD_MemoryUtil, "memGetShort", MTD_short_long);
                                    case ValueLayout.OfInt _ -> cb.invokestatic(CD_MemoryUtil, "memGetInt", MTD_int_long);
                                    default -> throw methodException("Unsupported boolean getter layout: " + memberLayout, method);
                                }
                                cb.ireturn();
                            } else if (returnType == byte.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .invokestatic(CD_MemoryUtil, "memGetByte", MTD_byte_long)
                                    .ireturn();
                            } else if (returnType == short.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .invokestatic(CD_MemoryUtil, "memGetShort", MTD_short_long)
                                    .ireturn();
                            } else if (returnType == int.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .invokestatic(CD_MemoryUtil, "memGetInt", MTD_int_long)
                                    .ireturn();
                            } else if (returnType == long.class) {
                                buildMemberAddress(cb, thisClass, memberOffset);
                                switch (memberLayout) {
                                    case AddressLayout _ -> cb.invokestatic(CD_MemoryUtil, "memGetAddress", MTD_long_long);
                                    case ValueLayout.OfInt _ -> {
                                        cb.invokestatic(CD_MemoryUtil, "memGetInt", MTD_int_long);
                                        if (method.isAnnotationPresent(FFMPointer.class)) {
                                            buildPointer32to64(cb);
                                        } else {
                                            cb.i2l();
                                        }
                                    }
                                    case ValueLayout.OfLong _ -> cb.invokestatic(CD_MemoryUtil, "memGetLong", MTD_long_long);
                                    default -> throw methodException("Unsupported long getter layout: " + memberLayout, method);
                                }
                                cb.lreturn();
                            } else if (returnType == float.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .invokestatic(CD_MemoryUtil, "memGetFloat", MTD_float_long)
                                    .freturn();
                            } else if (returnType == double.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .invokestatic(CD_MemoryUtil, "memGetDouble", MTD_double_long)
                                    .dreturn();
                            } else if (returnType == MemorySegment.class) {
                                buildMemberAddress(cb, thisClass, memberOffset);
                                switch (memberLayout) {
                                    case AddressLayout addressLayout -> {
                                        cb
                                            .invokestatic(CD_MemoryUtil, "memGetAddress", MTD_long_long)
                                            .dup2()
                                            .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                            .dup_x2()
                                            .pop()
                                            .lconst_0()
                                            .lcmp()
                                            .ifThen(Opcode.IFNE, bcb -> buildMemorySegmentReinterpret(bcb, groupDesc, memberMap, method, addressLayout));
                                        /*if (isNullable(config, method)) {
                                            cb
                                                .dup2()
                                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                                .dup_x2()
                                                .pop()
                                                .lconst_0()
                                                .lcmp()
                                                .ifThen(Opcode.IFNE, bcb -> buildMemorySegmentReinterpret(bcb, groupDesc, memberMap, method, addressLayout));
                                        } else {
                                            buildNullPointerCheck(cb);
                                            cb.invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true);
                                            buildMemorySegmentReinterpret(cb, groupDesc, memberMap, method, addressLayout);
                                        }*/
                                    }
                                    case SequenceLayout sequenceLayout -> {
                                        cb.invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true);
                                        var autoSize = method.getAnnotation(FFMSize.class);
                                        if (autoSize != null) {
                                            buildAutoSize(cb, groupDesc, memberMap, method, autoSize, sequenceLayout.elementLayout())
                                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
                                        } else {
                                            cb
                                                .loadConstant(sequenceLayout.byteSize())
                                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
                                        }
                                    }
                                    default -> throw methodException("Unsupported MemorySegment getter layout: " + memberLayout, method);
                                }
                            } else if (returnType == String.class) {
                                var charset = getCharset(method);

                                // TODO: try to reuse the implementation of returnType == MemorySegment.class
                                // TODO: migrate sized toArray to built-in sized getString when supported in future JDK
                                buildMemberAddress(cb, thisClass, memberOffset);
                                switch (memberLayout) {
                                    // pointer to string
                                    case AddressLayout _ -> {
                                        cb.invokestatic(CD_MemoryUtil, "memGetAddress", MTD_long_long);
                                        if (isNullable(config, method)) {
                                            cb
                                                .dup2()
                                                .lconst_0()
                                                .lcmp()
                                                .ifThenElse(Opcode.IFEQ,
                                                    bcb -> bcb
                                                        .pop2()
                                                        .aconst_null(),
                                                    bcb -> buildStringGetter(bcb, groupDesc, memberMap, method, charset)
                                                )
                                                .areturn();
                                        } else {
                                            buildNullPointerCheck(cb);
                                            buildStringGetter(cb, groupDesc, memberMap, method, charset);
                                        }
                                    }
                                    // character array
                                    case SequenceLayout sequenceLayout -> {
                                        cb.invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true);
                                        var autoSize = method.getAnnotation(FFMSize.class);
                                        if (autoSize != null) {
                                            var arraySlot = cb.allocateLocal(TypeKind.REFERENCE);
                                            buildAutoSize(cb, groupDesc, memberMap, method, autoSize, sequenceLayout.elementLayout())
                                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                                                .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                                                .invokeinterface(CD_MemorySegment, "toArray", MTD_byteArray_ValueLayout$OfByte)
                                                .astore(arraySlot)
                                                .new_(CD_String)
                                                .dup()
                                                .aload(arraySlot);
                                            buildCharsetInstance(cb, charset)
                                                .invokespecial(CD_String, INIT_NAME, MTD_void_byteArray_Charset);
                                        } else {
                                            cb
                                                .loadConstant(sequenceLayout.byteSize())
                                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                                                .lconst_0();
                                            buildCharsetInstance(cb, charset)
                                                .invokeinterface(CD_MemorySegment, "getString", MTD_String_long_Charset);
                                        }
                                    }
                                    default -> throw methodException("Unsupported String getter layout: " + memberLayout, method);
                                }
                            } else {
                                var binderField = FFM.lookupBinder(config, returnType);

                                var returnTypeDesc = returnType.describeConstable().orElseThrow();
                                switch (memberLayout) {
                                    case AddressLayout _ -> {
                                        // TODO: check actual target of memberLayout
                                        // pointer to group, dereference memory address
                                        cb.getstatic(returnTypeDesc, binderField.name(), groupDesc(binderField));
                                        buildMemberAddress(cb, thisClass, memberOffset)
                                            .invokestatic(CD_MemoryUtil, "memGetAddress", MTD_long_long)
                                            .invokeinterface(CD_GroupBinder, isNullable(config, method) ? "ofAddressSafe" : "ofAddress", MTD_Object_long)
                                        /*.checkcast(returnType.describeConstable().orElseThrow())*/
                                        ;
                                    }
                                    case GroupLayout _ -> {
                                        if (DEBUG && isNullable(config, method)) {
                                            throw methodException("Nested group members cannot be nullable", method);
                                        }
                                        // nested group, return view of member address
                                        cb.getstatic(returnTypeDesc, binderField.name(), groupDesc(binderField));
                                        buildMemberAddress(cb, thisClass, memberOffset)
                                            .invokeinterface(CD_GroupBinder, "ofAddress", MTD_Object_long)
                                        /*.checkcast(returnType.describeConstable().orElseThrow())*/
                                        ;
                                    }
                                    // TODO: callback binder not allowed here?
                                    default -> throw methodException("Unsupported getter layout: " + memberLayout, method);
                                }
                            }

                            cb.return_(TypeKind.from(descriptor.returnType()));
                        })
                    );
                }
                if (hasPrivateGetters && 1 < getterCount && getterCount == nonCanonicalCount) {
                    throw memberException("Failed to find canonical getter for layout member", groupInterface, memberName);
                }
            }

            classBuilder
                .with(RecordAttribute.of(
                    getters.sequencedValues().stream()
                        .map(getter -> RecordComponentInfo.of(
                            getter.getName(),
                            getter.getReturnType().describeConstable().orElseThrow()
                        ))
                        .toArray(RecordComponentInfo[]::new)
                ));

            // Generate private getters for pointer members
            if (hasPrivateGetters) {
                for (var member : getters.sequencedEntrySet()) {
                    var memberPath   = groupElement(member.getKey());
                    var memberLayout = layout.select(memberPath);
                    if (!(memberLayout instanceof AddressLayout)) {
                        continue;
                    }

                    var method = member.getValue();
                    if (method.getReturnType() == long.class) {
                        continue;
                    }

                    var memberOffset = layout.byteOffset(memberPath);

                    if (builder.equals == null || builder.hashCode == null) {
                        classBuilder.withMethod("__address__" + method.getName(), MTD_long, ACC_PRIVATE | ACC_FINAL, mb -> mb.withCode(cb -> {
                                cb
                                    .aload(cb.receiverSlot())
                                    .getfield(thisClass, "address", CD_long);
                                if (memberOffset != 0) {
                                    cb
                                        .loadConstant(memberOffset)
                                        .ladd();
                                }
                                cb
                                    .invokestatic(CD_MemoryUtil, "memGetAddress", MTD_long_long)
                                    .lreturn();
                            })
                        );
                    }

                    if (builder.toString == null) {
                        classBuilder.withMethod("__toString__" + method.getName(), MTD_String, ACC_PRIVATE | ACC_FINAL, mb -> mb.withCode(cb -> {
                                cb
                                    .aload(cb.receiverSlot())
                                    .getfield(thisClass, "address", CD_long);
                                if (memberOffset != 0) {
                                    cb
                                        .loadConstant(memberOffset)
                                        .ladd();
                                }
                                cb
                                    .invokestatic(CD_MemoryUtil, "memGetAddress", MTD_long_long)
                                    .invokestatic(CD_Long, "toHexString", MTD_String_long)
                                    .invokedynamic(DCSD_StringConcatFactory_makeConcatWithConstants_AddressToHexString)
                                    .areturn();
                            })
                        );
                    }
                }
            }

            // GENERATE SETTERS
            for (var member : memberMap.entrySet()) {
                for (var method : member.getValue()) {
                    if (method.getParameterCount() == 0) {
                        continue; // getter
                    }
                    if (method.getParameterCount() != 1) {
                        throw methodException("Setter must accept a single parameter", method);
                    }
                    if (method.getReturnType() != groupInterface) {
                        throw methodException("Setter return type must be the group interface", method);
                    }
                    var descriptor = getMethodTypeDesc(method);
                    classBuilder.withMethod(method.getName(), descriptor, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                            var memberPath   = groupElement(member.getKey());
                            var memberLayout = layout.select(memberPath);
                            var memberOffset = layout.byteOffset(memberPath);

                            var param0 = cb.parameterSlot(0);

                            // TODO: handle clong
                            var parameter     = method.getParameters()[0];
                            var parameterType = parameter.getType();
                            if (parameterType == boolean.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .iload(param0);
                                switch (memberLayout) {
                                    case ValueLayout.OfByte _ -> cb.invokestatic(CD_MemoryUtil, "memPutByte", MTD_void_long_byte);
                                    case ValueLayout.OfShort _ -> cb.invokestatic(CD_MemoryUtil, "memPutShort", MTD_void_long_short);
                                    case ValueLayout.OfInt _ -> cb.invokestatic(CD_MemoryUtil, "memPutInt", MTD_void_long_int);
                                    default -> throw methodException("Unsupported boolean setter layout: " + memberLayout, method);
                                }
                            } else if (parameterType == byte.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .iload(param0)
                                    .invokestatic(CD_MemoryUtil, "memPutByte", MTD_void_long_byte);
                            } else if (parameterType == short.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .iload(param0)
                                    .invokestatic(CD_MemoryUtil, "memPutShort", MTD_void_long_short);
                            } else if (parameterType == int.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .iload(param0)
                                    .invokestatic(CD_MemoryUtil, "memPutInt", MTD_void_long_int);
                            } else if (parameterType == long.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .lload(param0);
                                switch (memberLayout) {
                                    case AddressLayout _ -> cb.invokestatic(CD_MemoryUtil, "memPutAddress", MTD_void_long_long);
                                    case ValueLayout.OfInt _ -> cb
                                        .l2i()
                                        .invokestatic(CD_MemoryUtil, "memPutInt", MTD_void_long_int);
                                    case ValueLayout.OfLong _ -> cb.invokestatic(CD_MemoryUtil, "memPutLong", MTD_void_long_long);
                                    default -> throw methodException("Unsupported long setter layout: " + memberLayout, method);
                                }
                            } else if (parameterType == float.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .fload(param0)
                                    .invokestatic(CD_MemoryUtil, "memPutFloat", MTD_void_long_float);
                            } else if (parameterType == double.class) {
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .dload(param0)
                                    .invokestatic(CD_MemoryUtil, "memPutDouble", MTD_void_long_double);
                            } else if (parameterType == MemorySegment.class) {
                                // TODO: support nullable
                                // TODO: check actual target of memberLayout
                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .aload(param0)
                                    .invokeinterface(CD_MemorySegment, "address", MTD_long)
                                    .invokestatic(CD_MemoryUtil, "memPutAddress", MTD_void_long_long);
                            } else if (parameterType == String.class) {
                                if (!(memberLayout instanceof SequenceLayout sequenceLayout)) {
                                    throw methodException("Unsupported String setter layout: " + memberLayout, method);
                                }

                                var charset = getCharset(method);

                                buildMemberAddress(cb, thisClass, memberOffset)
                                    .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                    .loadConstant(sequenceLayout.byteSize())
                                    .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);

                                if (parameter.isAnnotationPresent(FFMSize.class)) {
                                    // TODO: migrate sized toArray to built-in sized setString when supported in future JDK
                                    var segment = cb.allocateLocal(TypeKind.REFERENCE);
                                    var array   = cb.allocateLocal(TypeKind.REFERENCE);
                                    cb
                                        .astore(segment)
                                        .aload(param0);
                                    buildCharsetInstance(cb, charset)
                                        .invokevirtual(CD_String, "getBytes", MTD_byteArray_Charset)
                                        .dup()
                                        .astore(array)
                                        .iconst_0()
                                        .aload(segment)
                                        .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                                        .lconst_0()
                                        .aload(array)
                                        .arraylength()
                                        .invokestatic(CD_MemorySegment, "copy", MTD_void_Object_int_MemorySegment_ValueLayout_long_int, true);
                                } else {
                                    cb
                                        .lconst_0()
                                        .aload(param0);
                                    buildCharsetInstance(cb, charset)
                                        .invokeinterface(CD_MemorySegment, "setString", MTD_void_long_String_Charset);
                                }
                            } else {
                                var binderField = FFM.lookupBinder(config, parameterType);

                                var parameterTypeDesc = parameterType.describeConstable().orElseThrow();
                                switch (memberLayout) {
                                    case AddressLayout _ ->
                                        // TODO: check actual target of memberLayout
                                        // pointer to group, put memory address
                                        buildMemberAddress(cb, thisClass, memberOffset)
                                            .getstatic(parameterTypeDesc, binderField.name(), groupDesc(binderField))
                                            .aload(param0)
                                            .invokeinterface(CD_GroupBinder, isNullable(config, parameter) ? "addressOfSafe" : "addressOf", MTD_long_Object)
                                            .invokestatic(CD_MemoryUtil, "memPutAddress", MTD_void_long_long);
                                    case GroupLayout _ -> {
                                        if (DEBUG && isNullable(config, parameter)) {
                                            throw methodException("Nested group members cannot be nullable", method);
                                        }
                                        // nested group, copy entire layout
                                        cb
                                            .getstatic(parameterTypeDesc, binderField.name(), groupDesc(binderField))
                                            .dup();
                                        buildMemberAddress(cb, thisClass, memberOffset)
                                            .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                            .invokeinterface(CD_GroupBinder, "reinterpret", MTD_MemorySegment_MemorySegment)
                                            .aload(param0)
                                            .invokeinterface(CD_GroupBinder, "set", MTD_GroupBinder_MemorySegment_Object)
                                            .pop();
                                    }
                                    // TODO: callback binder not allowed here?
                                    default -> throw methodException("Unsupported setter layout: " + memberLayout, method);
                                }
                            }

                            cb
                                .aload(cb.receiverSlot())
                                .areturn();
                        })
                    );
                }
            }

            // GENERATE equals, hashCode, toString
            var bootstrapArgs = hasPrivateGetters ? getBootstrapArgs(layout, getters) : null;
            classBuilder
                .withMethod("equals", MTD_boolean_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    var receiverSlot = cb.receiverSlot();
                    var param0Slot   = cb.parameterSlot(0);
                    if (builder.equals == null) {
                        Objects.requireNonNull(bootstrapArgs);
                        cb
                            .aload(receiverSlot)
                            .aload(param0Slot)
                            .invokedynamic(DynamicCallSiteDesc.of(
                                DMHD_GroupBinder_bootstrapRecord,
                                "equals",
                                MethodTypeDesc.of(CD_boolean, groupDesc, CD_Object),
                                bootstrapArgs)
                            );
                    } else {
                        cb
                            .ldc(condyCDataAt(CD_BiPredicate, 1))
                            .aload(receiverSlot)
                            .aload(param0Slot)
                            .invokeinterface(CD_BiPredicate, "test", MTD_boolean_Object_Object);
                    }
                    cb.ireturn();
                }))
                .withMethod("hashCode", MTD_int, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    var receiverSlot = cb.receiverSlot();
                    if (builder.hashCode == null) {
                        Objects.requireNonNull(bootstrapArgs);
                        cb
                            .aload(receiverSlot)
                            .invokedynamic(DynamicCallSiteDesc.of(
                                DMHD_GroupBinder_bootstrapRecord,
                                "hashCode",
                                MethodTypeDesc.of(CD_int, groupDesc),
                                bootstrapArgs)
                            );
                    } else {
                        cb
                            .ldc(condyCDataAt(CD_ToIntFunction, 2))
                            .aload(receiverSlot)
                            .invokeinterface(CD_ToIntFunction, "applyAsInt", MTD_int_Object);
                    }
                    cb.ireturn();
                }))
                .withMethod("toString", MTD_String, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    var receiverSlot = cb.receiverSlot();
                    if (builder.toString == null) {
                        Objects.requireNonNull(bootstrapArgs);
                        for (var i = 0; i < bootstrapArgs.length; i++) {
                            if (bootstrapArgs[i].startsWith("__address__")) {
                                bootstrapArgs[i] = "__toString__" + bootstrapArgs[i].substring(11);
                            }
                        }
                        cb
                            .aload(receiverSlot)
                            .invokedynamic(DynamicCallSiteDesc.of(
                                DMHD_GroupBinder_bootstrapRecord,
                                "toString",
                                MethodTypeDesc.of(CD_String, groupDesc),
                                bootstrapArgs)
                            );
                    } else {
                        cb
                            .ldc(condyCDataAt(CD_Function, 3))
                            .aload(receiverSlot)
                            .invokeinterface(CD_Function, "apply", MTD_Object_Object)
                            .checkcast(CD_String);
                    }
                    cb.areturn();
                }));

            // GENERATE optional capabilities

            if (Pointer.class.isAssignableFrom(groupInterface)) {
                classBuilder.withMethod("address", MTD_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .aload(cb.receiverSlot())
                    .getfield(thisClass, "address", CD_long)
                    .lreturn()));
            }

            if (NativeResource.class.isAssignableFrom(groupInterface)) {
                classBuilder.withMethod("free", MTD_void, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .aload(cb.receiverSlot())
                    .getfield(thisClass, "address", CD_long)
                    .invokestatic(CD_MemoryUtil, "nmemFree", MTD_void_long)
                    .return_()));
            }
        });

        if (config.debugGenerator) {
            printModel(of().parse(bytecode));
        }

        // Store the target handle as class data in the hidden class.
        try {
            return config.lookup.defineHiddenClassWithClassData(bytecode, List.of(
                layout,
                builder.equals != null ? builder.equals : EMPTY_SLOT,
                builder.hashCode != null ? builder.hashCode : EMPTY_SLOT,
                builder.toString != null ? builder.toString : EMPTY_SLOT
            ), true);
        } catch (Error | RuntimeException e) {
            printModel(of().parse(bytecode));
            throw e;
        } catch (Exception e) {
            printModel(of().parse(bytecode));
            throw new RuntimeException(e);
        }
    }

    private static SequencedMap<String, List<Method>> compileMemberAccessors(Class<?> groupInterface, GroupLayout layout) {
        var memberMap = new LinkedHashMap<String, List<Method>>(layout.memberLayouts().size());

        var methods = new HashMap<String, List<Method>>(layout.memberLayouts().size());
        for (var method : groupInterface.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || method.isDefault()) {
                continue; // skip static/default interface methods
            }

            checkAccessorAliasing(groupInterface, method);
            var name = getNativeName(method);

            methods
                .computeIfAbsent(name, _ -> new ArrayList<>(4))
                .add(method);
        }

        for (var member : layout.memberLayouts()) {
            var name = member.name().orElse(null);
            if (name == null) {
                continue;
            }

            var memberAccessors = methods.get(name);
            if (memberAccessors != null) {
                memberMap.put(name, memberAccessors);
            }
        }

        for (var method : methods.entrySet()) {
            if (!memberMap.containsKey(method.getKey())) {
                throw memberException("No layout member found with this name", groupInterface, method.getKey());
            }
        }

        return memberMap;
    }

    private static int registerCanonicalGetter(Class<?> groupInterface, Method method, LinkedHashMap<String, Method> getters, String memberName) {
        if (method.isAnnotationPresent(FFMCanonical.class)) {
            var canonical = getters.get(memberName);
            if (canonical != null && canonical.isAnnotationPresent(FFMCanonical.class)) {
                throw memberException("Multiple canonical getters found", groupInterface, memberName);
            }
            getters.put(memberName, method);
        } else if (memberName.equals(method.getName())) {
            var canonical = getters.get(memberName);
            if (canonical == null || !canonical.isAnnotationPresent(FFMCanonical.class)) {
                getters.put(memberName, method);
            }
        } else {
            getters.putIfAbsent(memberName, method);
            return 1;
        }
        return 0;
    }

    private static void checkAccessorAliasing(Class<?> groupInterface, Method method) {
        if (switch (method.getName()) {
            case "equals", "hashCode", "toString" -> true;
            case "address" -> Pointer.class.isAssignableFrom(groupInterface);
            // void methods, should be fine
            //case "close", "free" -> NativeResource.class.isAssignableFrom(groupInterface);
            default -> false;
        }) {
            throw methodException("Group accessor name aliases supertype method and must be changed with @FFMName", method);
        }
    }

    private static CodeBuilder buildMemberAddress(CodeBuilder cb, ClassDesc thisClass, long memberOffset) {
        cb
            .aload(cb.receiverSlot())
            .getfield(thisClass, "address", CD_long);

        if (memberOffset != 0) {
            cb
                .loadConstant(memberOffset)
                .ladd();
        }

        return cb;
    }

    private static void buildNullPointerCheck(CodeBuilder cb) {
        if (DEBUG) {
            cb
                .dup2()
                .lconst_0()
                .lcmp()
                .ifThen(Opcode.IFEQ, bcb -> bcb
                    .new_(CD_NullPointerException)
                    .dup()
                    .ldc("Pointer value is NULL")
                    .invokespecial(CD_NullPointerException, INIT_NAME, MTD_void_String)
                    .athrow());
        }
    }

    private static <T extends CodeBuilder> T buildAutoSize(
        T cb, ClassDesc groupDesc, SequencedMap<String, List<Method>> memberMap, Method method,
        FFMSize autoSize, MemoryLayout elementLayout
    ) {
        // TODO: simplify?
        var sizeGetter = memberMap.get(autoSize.value()).stream()
            .filter(it -> it.getReturnType().isPrimitive())
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("The FFMSize reference \"" + autoSize.value() + "\" not found for " + method));

        var mtd = getMethodTypeDesc(sizeGetter);
        cb
            .aload(cb.receiverSlot())
            .invokeinterface(groupDesc, sizeGetter.getName(), mtd);
        if (mtd.returnType() != CD_long) {
            if (mtd.returnType() == CD_int) {
                cb
                    .i2l()
                    .loadConstant(0xFFFF_FFFFL)
                    .land();
            } else if (mtd.returnType() == CD_short || mtd.returnType() == CD_char) {
                cb
                    .loadConstant(0xFFFF)
                    .iand()
                    .i2l();
            } else if (mtd.returnType() == CD_byte) {
                cb
                    .loadConstant(0xFF)
                    .iand()
                    .i2l();
            } else {
                throw methodException("Unsupported FFMSize getter type: " + sizeGetter, method);
            }
        }
        var byteSize = elementLayout.byteSize();
        if (byteSize != 1L) {
            cb
                .loadConstant(byteSize)
                .lmul();
        }
        return cb;
    }


    private static <T extends CodeBuilder> T buildMemorySegmentReinterpret(
        T cb, ClassDesc groupDesc, SequencedMap<String, List<Method>> memberMap, Method method,
        AddressLayout addressLayout
    ) {
        var targetLayout = addressLayout.targetLayout().orElseThrow();
        var autoSize     = method.getAnnotation(FFMSize.class);
        if (autoSize != null) {
            buildAutoSize(cb, groupDesc, memberMap, method, autoSize, targetLayout)
                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
        } else {
            cb
                .loadConstant(targetLayout.byteSize())
                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
        }
        return cb;
    }

    private static <T extends CodeBuilder> T buildStringGetter(
        T cb, ClassDesc groupDesc, SequencedMap<String, List<Method>> memberMap, Method method,
        FFMCharset.Type charset
    ) {
        cb.invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true);
        var autoSize = method.getAnnotation(FFMSize.class);
        if (autoSize != null) {
            var arraySlot = cb.allocateLocal(TypeKind.REFERENCE);
            buildAutoSize(cb, groupDesc, memberMap, method, autoSize, charset.layout)
                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                .invokeinterface(CD_MemorySegment, "toArray", MTD_byteArray_ValueLayout$OfByte)
                .astore(arraySlot)
                .new_(CD_String)
                .dup()
                .aload(arraySlot);
            buildCharsetInstance(cb, charset)
                .invokespecial(CD_String, INIT_NAME, MTD_void_byteArray_Charset);
        } else {
            cb
                .loadConstant(Long.MAX_VALUE)
                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                .lconst_0();
            buildCharsetInstance(cb, charset)
                .invokeinterface(CD_MemorySegment, "getString", MTD_String_long_Charset);
        }
        return cb;
    }


    private static String[] getBootstrapArgs(GroupLayout layout, LinkedHashMap<String, Method> getters) {
        var bootstrapNames = getters.sequencedKeySet().stream()
            .collect(SEMI_COLON);

        var bootstrapArgsBuilder = Stream.<String>builder()
            .add(bootstrapNames);

        // TODO: handle multiple getters for the same member (e.g. MemorySegment name() + String name())

        getters
            .sequencedEntrySet()
            .forEach(member -> {
                var method = member.getValue();

                var memberPath   = groupElement(member.getKey());
                var memberLayout = layout.select(memberPath);

                bootstrapArgsBuilder.add(memberLayout instanceof AddressLayout && method.getReturnType() != long.class
                    ? "__address__" + method.getName()
                    : method.getName());
            });

        return bootstrapArgsBuilder
            .build()
            .toArray(String[]::new);
    }

    @SuppressWarnings("unchecked")
    static <T, L extends GroupLayout, M extends GroupBinder<L, T>> M bootstrap(
        FFM.GroupBinderBuilder<T, L, M, ?> builder,
        long byteAlignment
    ) {
        var groupInterface = builder.groupInterface;

        var members = builder.members;

        var kind = builder.kind();

        GroupLayout layout;
        {
            var tmp = kind
                .layout(members.values().toArray(new MemoryLayout[0]))
                .withName(getNativeName(groupInterface));
            if (tmp.byteAlignment() < byteAlignment) {
                tmp = tmp.withByteAlignment(byteAlignment);
            }
            layout = tmp;
        }

        var config = FFM.getConfig(groupInterface);

        // TODO: test each member individually
        var hasTracing   = config.traceConsumer != null/* && (config.tracingFilter == null || config.tracingFilter.test(method))*/;
        var featureFlags = hasTracing ? FF_TRACING.mask : 0;

        if (config.debugGenerator) {
            apiLog("BOOTSTRAPPING " + kind.name() + " " + groupInterface);
            // TODO:
            //printDebug(method, parameters, descriptor);
        }

        var implementationLookup = bootstrapImplementation(config, groupInterface, layout, builder);

        MethodHandle implementationConstructor;
        MethodHandle implementationAddress;
        try {
            implementationConstructor = implementationLookup
                .findConstructor(implementationLookup.lookupClass(), methodType(void.class, long.class))
                .asType(methodType(groupInterface, long.class));

            if (DEBUG) {
                // verify that address passed to constructor is not NULL and correctly aligned
                implementationConstructor = MethodHandles
                    .filterArguments(implementationConstructor, 0, MethodHandles
                        .insertArguments(CHECK_ADDRESS, 1, layout.byteAlignment()));
            }

            implementationAddress = implementationLookup
                .findGetter(implementationLookup.lookupClass(), "address", long.class)
                .asType(methodType(long.class, groupInterface));
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        var binderClass = ClassDesc.of(
            groupInterface.getPackageName(),
            groupInterface.getSimpleName() + "Binder"
        );
        var bytecode = of().build(binderClass, classBuilder -> {
            startHiddenClass(classBuilder)
                .withInterfaceSymbols(kind.binderDesc());

            var groupDesc = groupInterface.describeConstable().orElseThrow();

            classBuilder
                .withMethod("layout", MTD_GroupLayout, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .ldc(condyCDataAt(kind.layoutDesc(), 0))
                    .areturn())
                )
                .withMethod("addressOf", MTD_long_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .ldc(condyCDataAt(CD_MethodHandle, 1))
                    .aload(cb.parameterSlot(0))
                    .invokevirtual(CD_MethodHandle, "invokeExact", MethodTypeDesc.of(CD_long, groupDesc))
                    .lreturn()))
                .withMethod("ofAddress", MTD_Object_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .ldc(condyCDataAt(CD_MethodHandle, 2))
                    .lload(cb.parameterSlot(0))
                    .invokevirtual(CD_MethodHandle, "invokeExact", MethodTypeDesc.of(groupDesc, CD_long))
                    .areturn()))
                .withMethod("copy", MTD_Object_Object_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    var byteSize = layout.byteSize();
                    // On JDK 26+ the custom loop gets unrolled+vectorized
                    if (512L < byteSize || JAVA_VERSION == 25) {
                        // fallback to memcpy
                        // the following is an inlined version of MemoryUtilTunables::memcpy for JDK 25+
                        if (byteSize < NATIVE_THRESHOLD_COPY || (byteSize & 1L) != 0L) {
                            // destination
                            cb
                                .aload(cb.receiverSlot())
                                .aload(cb.parameterSlot(1))
                                .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .loadConstant(byteSize)
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
                            // source
                            cb
                                .aload(cb.receiverSlot())
                                .aload(cb.parameterSlot(0))
                                .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .loadConstant(byteSize)
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
                            // copy
                            cb
                                .invokeinterface(CD_MemorySegment, "copyFrom", MTD_MemorySegment_MemorySegment)
                                .pop();
                        } else {
                            // destination
                            var dstSlot = cb.allocateLocal(TypeKind.LONG);
                            cb
                                .aload(cb.receiverSlot())
                                .aload(cb.parameterSlot(1))
                                .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                                .dup2()
                                .lstore(dstSlot)
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .loadConstant(byteSize - 1L)
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
                            // source
                            var srcSlot = cb.allocateLocal(TypeKind.LONG);
                            cb
                                .aload(cb.receiverSlot())
                                .aload(cb.parameterSlot(0))
                                .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                                .dup2()
                                .lstore(srcSlot)
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .loadConstant(byteSize - 1L)
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long);
                            // copy
                            cb
                                .invokeinterface(CD_MemorySegment, "copyFrom", MTD_MemorySegment_MemorySegment)
                                .pop();
                            // copy last byte
                            cb
                                .lload(dstSlot)
                                .loadConstant(byteSize - 1L)
                                .ladd()
                                .lload(srcSlot)
                                .loadConstant(byteSize - 1L)
                                .ladd()
                                .invokestatic(CD_MemoryUtil, "memGetByte", MTD_byte_long)
                                .invokestatic(CD_MemoryUtil, "memPutByte", MTD_void_long_byte);
                        }
                    } else {
                        // custom memset with guaranteed correct alignment
                        var dstSlot = cb.allocateLocal(TypeKind.REFERENCE);
                        cb
                            .aload(cb.receiverSlot())
                            .aload(cb.parameterSlot(1))
                            .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                            .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                            .loadConstant(byteSize)
                            .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                            .astore(dstSlot);

                        var srcSlot = cb.allocateLocal(TypeKind.REFERENCE);
                        cb
                            .aload(cb.receiverSlot())
                            .aload(cb.parameterSlot(0))
                            .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                            .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                            .loadConstant(byteSize)
                            .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                            .astore(srcSlot);


                        if (16L <= byteSize) {
                            var offsetSlot = cb.allocateLocal(TypeKind.LONG);

                            cb
                                .lconst_0()
                                .lstore(offsetSlot);

                            var loopStart = cb.newBoundLabel();
                            var loopEnd   = cb.newLabel();

                            cb
                                .lload(offsetSlot)
                                .loadConstant(byteSize & ~7L)
                                .lcmp()
                                .ifge(loopEnd)
                                .aload(dstSlot)
                                .getstatic(CD_ValueLayout, "JAVA_LONG_UNALIGNED", CD_ValueLayout$OfLong)
                                .lload(offsetSlot)
                                .aload(srcSlot)
                                .getstatic(CD_ValueLayout, "JAVA_LONG_UNALIGNED", CD_ValueLayout$OfLong)
                                .lload(offsetSlot)
                                .invokeinterface(CD_MemorySegment, "get", MTD_long_ValueLayout$OfLong_long)
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfLong_long_long)
                                .lload(offsetSlot)
                                .loadConstant(8L)
                                .ladd()
                                .lstore(offsetSlot)
                                .goto_(loopStart)
                                .labelBinding(loopEnd);
                        } else if (8L <= byteSize) {
                            cb
                                .aload(dstSlot)
                                .getstatic(CD_ValueLayout, "JAVA_LONG_UNALIGNED", CD_ValueLayout$OfLong)
                                .lconst_0()
                                .aload(srcSlot)
                                .getstatic(CD_ValueLayout, "JAVA_LONG_UNALIGNED", CD_ValueLayout$OfLong)
                                .lconst_0()
                                .invokeinterface(CD_MemorySegment, "get", MTD_long_ValueLayout$OfLong_long)
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfLong_long_long);
                        }

                        var offset = byteSize & ~7L;
                        if (offset < (byteSize & ~3L)) {
                            cb
                                .aload(dstSlot)
                                .getstatic(CD_ValueLayout, "JAVA_INT_UNALIGNED", CD_ValueLayout$OfInt)
                                .loadConstant(offset)
                                .aload(srcSlot)
                                .getstatic(CD_ValueLayout, "JAVA_INT_UNALIGNED", CD_ValueLayout$OfInt)
                                .loadConstant(offset)
                                .invokeinterface(CD_MemorySegment, "get", MTD_int_ValueLayout$OfInt_long)
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfInt_long_int);
                            offset += 4L;
                        }

                        if (offset < (byteSize & ~1L)) {
                            cb
                                .aload(dstSlot)
                                .getstatic(CD_ValueLayout, "JAVA_SHORT_UNALIGNED", CD_ValueLayout$OfShort)
                                .loadConstant(offset)
                                .aload(srcSlot)
                                .getstatic(CD_ValueLayout, "JAVA_SHORT_UNALIGNED", CD_ValueLayout$OfShort)
                                .loadConstant(offset)
                                .invokeinterface(CD_MemorySegment, "get", MTD_short_ValueLayout$OfShort_long)
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfShort_long_short);
                            offset += 2L;
                        }

                        if (offset < byteSize) {
                            cb
                                .aload(dstSlot)
                                .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                                .loadConstant(offset)
                                .aload(srcSlot)
                                .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                                .loadConstant(offset)
                                .invokeinterface(CD_MemorySegment, "get", MTD_byte_ValueLayout$OfByte_long)
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfByte_long_byte);
                        }
                    }
                    cb
                        .aload(cb.parameterSlot(0))
                        .areturn();
                }))
                .withMethod("clear", MTD_Object_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    var byteSize = layout.byteSize();
                    // On JDK 26+ the custom loop gets unrolled+vectorized
                    if (1024L < byteSize || (JAVA_VERSION == 25 && (byteSize <= NATIVE_THRESHOLD_FILL || 64L < byteSize))) {
                        // fallback to memset
                        // the following is an inlined version of MemoryUtilTunables::memset for JDK 25+
                        if (byteSize < NATIVE_THRESHOLD_FILL || (byteSize & 1L) != 0L) {
                            cb
                                .aload(cb.receiverSlot())
                                .aload(cb.parameterSlot(0))
                                .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .loadConstant(byteSize)
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                                .iconst_0()
                                .invokeinterface(CD_MemorySegment, "fill", MTD_MemorySegment_byte)
                                .pop();
                        } else {
                            var addressSlot = cb.allocateLocal(TypeKind.LONG);
                            cb
                                .aload(cb.receiverSlot())
                                .aload(cb.parameterSlot(0))
                                .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                                .lstore(addressSlot);

                            cb
                                .lload(addressSlot)
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .loadConstant(byteSize - 1L)
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                                .iconst_0()
                                .invokeinterface(CD_MemorySegment, "fill", MTD_MemorySegment_byte)
                                .pop();

                            cb
                                .lload(addressSlot)
                                .loadConstant(byteSize - 1L)
                                .ladd()
                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                .lconst_1()
                                .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                                .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                                .lconst_0()
                                .iconst_0()
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfByte_long_byte);
                        }
                    } else {
                        // custom memset with guaranteed correct alignment
                        var segmentSlot = cb.allocateLocal(TypeKind.REFERENCE);
                        cb
                            .aload(cb.receiverSlot())
                            .aload(cb.parameterSlot(0))
                            .invokevirtual(binderClass, "addressOf", MTD_long_Object)
                            .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                            .loadConstant(byteSize)
                            .invokeinterface(CD_MemorySegment, "reinterpret", MTD_MemorySegment_long)
                            .astore(segmentSlot);


                        if (16L <= byteSize) {
                            var offsetSlot = cb.allocateLocal(TypeKind.LONG);

                            cb
                                .lconst_0()
                                .lstore(offsetSlot);

                            var loopStart = cb.newBoundLabel();
                            var loopEnd   = cb.newLabel();

                            cb
                                .lload(offsetSlot)
                                .loadConstant(byteSize & ~7L)
                                .lcmp()
                                .ifge(loopEnd)
                                .aload(segmentSlot)
                                .getstatic(CD_ValueLayout, "JAVA_LONG_UNALIGNED", CD_ValueLayout$OfLong)
                                .lload(offsetSlot)
                                .lconst_0()
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfLong_long_long)
                                .lload(offsetSlot)
                                .loadConstant(8L)
                                .ladd()
                                .lstore(offsetSlot)
                                .goto_(loopStart)
                                .labelBinding(loopEnd);
                        } else if (8L <= byteSize) {
                            cb
                                .aload(segmentSlot)
                                .getstatic(CD_ValueLayout, "JAVA_LONG_UNALIGNED", CD_ValueLayout$OfLong)
                                .lconst_0()
                                .lconst_0()
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfLong_long_long);
                        }

                        var offset = byteSize & ~7L;
                        if (offset < (byteSize & ~3L)) {
                            cb
                                .aload(segmentSlot)
                                .getstatic(CD_ValueLayout, "JAVA_INT_UNALIGNED", CD_ValueLayout$OfInt)
                                .loadConstant(offset)
                                .iconst_0()
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfInt_long_int);
                            offset += 4L;
                        }

                        if (offset < (byteSize & ~1L)) {
                            cb
                                .aload(segmentSlot)
                                .getstatic(CD_ValueLayout, "JAVA_SHORT_UNALIGNED", CD_ValueLayout$OfShort)
                                .loadConstant(offset)
                                .iconst_0()
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfShort_long_short);
                            offset += 2L;
                        }

                        if (offset < byteSize) {
                            cb
                                .aload(segmentSlot)
                                .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                                .loadConstant(offset)
                                .iconst_0()
                                .invokeinterface(CD_MemorySegment, "set", MTD_void_ValueLayout$OfByte_long_byte);
                        }
                    }
                    cb
                        .aload(cb.parameterSlot(0))
                        .areturn();
                }))
                .withMethod("get", MTD_Object_MemorySegment, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    // T get(MemorySegment segment);
                    if (config.checks) { // TODO: switch to debug?
                        // bounds check via: segment.asSlice(0L, layout());
                        cb
                            .aload(cb.parameterSlot(0))
                            .lconst_0()
                            .aload(cb.receiverSlot())
                            .invokevirtual(binderClass, "layout", MTD_GroupLayout)
                            .invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_MemoryLayout)
                            .pop(); // discard, we only want the bounds check
                    }
                    cb
                        .aload(cb.receiverSlot())
                        .aload(cb.parameterSlot(0))
                        .invokeinterface(CD_MemorySegment, "address", MTD_long)
                        .invokevirtual(binderClass, "ofAddress", MTD_Object_long)
                        /*.checkcast(groupDesc)*/
                        .areturn();
                }))
                .withMethod("get", MTD_Object_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    // T get(MemorySegment segment, long offset);
                    if (config.checks) { // TODO: switch to debug?
                        // bounds check via: segment.asSlice(offset, layout());
                        cb
                            .aload(cb.parameterSlot(0))
                            .lload(cb.parameterSlot(1))
                            .aload(cb.receiverSlot())
                            .invokevirtual(binderClass, "layout", MTD_GroupLayout)
                            .invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_MemoryLayout)
                            .pop(); // discard, we only want the bounds check
                    }
                    cb
                        .aload(cb.receiverSlot())
                        .aload(cb.parameterSlot(0))
                        .invokeinterface(CD_MemorySegment, "address", MTD_long)
                        .lload(cb.parameterSlot(1))
                        .ladd()
                        .invokevirtual(binderClass, "ofAddress", MTD_Object_long)
                        /*.checkcast(groupDesc)*/
                        .areturn();
                }))
                .withMethod("getAtIndex", MTD_Object_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                    // T getAtIndex(MemorySegment segment, long index);
                    if (config.checks) { // TODO: switch to debug?
                        // bounds check via: segment.asSlice(index * layout().byteSize(), layout());
                        cb
                            .aload(cb.parameterSlot(0))
                            .lload(cb.parameterSlot(1))
                            .aload(cb.receiverSlot())
                            .invokevirtual(binderClass, "layout", MTD_GroupLayout)
                            .invokeinterface(CD_GroupLayout, "byteSize", MTD_long)
                            .lmul()
                            .aload(cb.receiverSlot())
                            .invokevirtual(binderClass, "layout", MTD_GroupLayout)
                            .invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_MemoryLayout)
                            .pop(); // discard, we only want the bounds check
                    }
                    cb
                        .aload(cb.receiverSlot())
                        .aload(cb.parameterSlot(0))
                        .invokeinterface(CD_MemorySegment, "address", MTD_long)
                        .lload(cb.parameterSlot(1))
                        .aload(cb.receiverSlot())
                        .invokevirtual(binderClass, "layout", MTD_GroupLayout)
                        .invokeinterface(CD_GroupLayout, "byteSize", MTD_long)
                        .lmul()
                        .ladd()
                        .invokevirtual(binderClass, "ofAddress", MTD_Object_long)
                        /*.checkcast(groupDesc)*/
                        .areturn();
                }));
        });

        if (config.debugGenerator) {
            printModel(of().parse(bytecode));
        }

        // Store the target handle as class data in the hidden class.
        try {
            var wrapperLookup = config.lookup.defineHiddenClassWithClassData(bytecode,
                List.of(
                    layout,
                    implementationAddress,
                    implementationConstructor
                ), true);

            return ((Class<M>)wrapperLookup.lookupClass())
                .getDeclaredConstructor()
                .newInstance();
        } catch (Error | RuntimeException e) {
            printModel(of().parse(bytecode));
            throw e;
        } catch (Exception e) {
            printModel(of().parse(bytecode));
            throw new RuntimeException(e);
        }
    }

    private static final MethodHandle CHECK_ADDRESS;
    static {
        try {
            CHECK_ADDRESS = MethodHandles.lookup()
                .findStatic(BCGroup.class, "checkAddress", methodType(long.class, long.class, long.class));
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    private static long checkAddress(long address, long alignment) {
        if (address == 0L) {
            throw new NullPointerException("Group instance cannot be instantiated with a NULL address");
        }
        if ((address & (alignment - 1L)) != 0L) {
            throw new IllegalArgumentException("Group instance address is not properly aligned to " + alignment + " bytes: 0x" + Long.toHexString(address));
        }
        return address;
    }

    enum Kind {

        STRUCT {
            @Override GroupLayout layout(MemoryLayout... members) { return MemoryLayout.structLayout(members); }
            @Override ClassDesc layoutDesc() { return CD_StructLayout; }
            @Override ClassDesc binderDesc() { return CD_StructBinder; }
        },

        UNION {
            @Override GroupLayout layout(MemoryLayout... members) { return MemoryLayout.unionLayout(members); }
            @Override ClassDesc layoutDesc() { return CD_UnionLayout; }
            @Override ClassDesc binderDesc() { return CD_UnionBinder; }
        };

        abstract GroupLayout layout(MemoryLayout... members);
        abstract ClassDesc layoutDesc();
        abstract ClassDesc binderDesc();

    }

}
