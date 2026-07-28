/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;

import java.lang.classfile.*;
import java.lang.classfile.attribute.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static java.lang.invoke.MethodType.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.ffm.BCCall.FeatureFlag.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;
import static org.lwjgl.system.ffm.BCUtil.*;

final class BCGroup {

    private static final Collector<@Nullable CharSequence, ?, String> SEMI_COLON = Collectors.joining(";");

    private static final int CDATA_LAYOUT  = 0;
    private static final int CDATA_BACKEND = 1;

    private static final int CDATA_ADDRESS     = 2;
    private static final int CDATA_CONSTRUCTOR = 3;

    private static final int CDATA_IMPL_EQUALS   = 2;
    private static final int CDATA_IMPL_HASHCODE = 3;
    private static final int CDATA_IMPL_TOSTRING = 4;

    private BCGroup() {
    }

    private record Member(
        String name,
        MemoryLayout layout,
        long offset
    ) {
        CodeBuilder buildAddress(CodeBuilder cb, ClassDesc thisClass) {
            cb
                .aload(cb.receiverSlot())
                .getfield(thisClass, "address", CD_long);

            if (offset != 0L) {
                cb
                    .loadConstant(offset)
                    .ladd();
            }

            return cb;
        }

        private String accessorName(ValueLayout naturalLayout, String accessor) {
            return naturalLayout.byteAlignment() <= layout.byteAlignment()
                ? accessor
                : accessor + "Unaligned";
        }

        CodeBuilder buildGetter(CodeBuilder cb, ClassDesc thisClass, ValueLayout naturalLayout, String accessor, MethodTypeDesc type) {
            cb.ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND));
            buildAddress(cb, thisClass);
            return cb.invokeinterface(CD_MemoryBackend, accessorName(naturalLayout, accessor), type);
        }

        CodeBuilder buildSetter(CodeBuilder cb, ClassDesc thisClass, ValueLayout naturalLayout, String accessor, MethodTypeDesc type, Function<CodeBuilder, CodeBuilder> codeValue) {
            cb.ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND));
            buildAddress(cb, thisClass);
            codeValue.apply(cb);
            return cb.invokeinterface(CD_MemoryBackend, accessorName(naturalLayout, accessor), type);
        }

        CodeBuilder buildSetter(CodeBuilder cb, ClassDesc thisClass, ValueLayout naturalLayout, String accessor, MethodTypeDesc type, ObjIntConsumer<CodeBuilder> codeValue) {
            cb.ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND));
            buildAddress(cb, thisClass);
            codeValue.accept(cb, cb.parameterSlot(0));
            return cb.invokeinterface(CD_MemoryBackend, accessorName(naturalLayout, accessor), type);
        }
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

            // member -> list of methods that access the member
            // sorted by layout member order
            var memberMap = compileMemberAccessors(groupInterface, layout);

            // Don't need canonical getters if all of equals, hashCode, toString are provided
            var hasPrivateGetters =
                builder.equals == null ||
                builder.hashCode == null ||
                builder.toString == null;

            // GENERATE GETTERS
            var getters = new LinkedHashMap<Member, Method>(memberMap.size());
            for (var entry : memberMap.entrySet()) {
                var member  = entry.getKey();
                var methods = entry.getValue();

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
                    nonCanonicalCount += registerCanonicalGetter(groupInterface, method, getters, member);

                    var descriptor = getMethodTypeDesc(method);
                    classBuilder.withMethod(method.getName(), descriptor, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                            var memberLayout = member.layout();

                            // TODO: handle clong
                            var returnType = method.getReturnType();
                            if (returnType == boolean.class) {
                                switch (memberLayout) {
                                    case ValueLayout.OfBoolean _,
                                         ValueLayout.OfByte _ -> member.buildGetter(cb, thisClass, ValueLayout.JAVA_BYTE, "getByte", MTD_byte_long);
                                    case ValueLayout.OfShort _ -> member.buildGetter(cb, thisClass, ValueLayout.JAVA_SHORT, "getShort", MTD_short_long);
                                    case ValueLayout.OfInt _ -> member.buildGetter(cb, thisClass, ValueLayout.JAVA_INT, "getInt", MTD_int_long);
                                    default -> throw methodException("Unsupported boolean getter layout: " + memberLayout, method);
                                }
                                cb.ireturn();
                            } else if (returnType == byte.class) {
                                member.buildGetter(cb, thisClass, ValueLayout.JAVA_BYTE, "getByte", MTD_byte_long)
                                    .ireturn();
                            } else if (returnType == short.class) {
                                member.buildGetter(cb, thisClass, ValueLayout.JAVA_SHORT, "getShort", MTD_short_long)
                                    .ireturn();
                            } else if (returnType == int.class) {
                                member.buildGetter(cb, thisClass, ValueLayout.JAVA_INT, "getInt", MTD_int_long)
                                    .ireturn();
                            } else if (returnType == long.class) {
                                switch (memberLayout) {
                                    case AddressLayout _ -> member.buildGetter(cb, thisClass, ValueLayout.ADDRESS, "getAddress", MTD_long_long);
                                    case ValueLayout.OfInt _ -> {
                                        member.buildGetter(cb, thisClass, ValueLayout.JAVA_INT, "getInt", MTD_int_long);
                                        if (method.isAnnotationPresent(FFMPointer.class)) {
                                            buildPointer32to64(cb);
                                        } else {
                                            cb.i2l();
                                        }
                                    }
                                    case ValueLayout.OfLong _ -> member.buildGetter(cb, thisClass, ValueLayout.JAVA_LONG, "getLong", MTD_long_long);
                                    default -> throw methodException("Unsupported long getter layout: " + memberLayout, method);
                                }
                                cb.lreturn();
                            } else if (returnType == float.class) {
                                member.buildGetter(cb, thisClass, ValueLayout.JAVA_FLOAT, "getFloat", MTD_float_long)
                                    .freturn();
                            } else if (returnType == double.class) {
                                member.buildGetter(cb, thisClass, ValueLayout.JAVA_DOUBLE, "getDouble", MTD_double_long)
                                    .dreturn();
                            } else if (returnType == MemorySegment.class) {
                                switch (memberLayout) {
                                    case AddressLayout addressLayout -> {
                                        member.buildGetter(cb, thisClass, ValueLayout.ADDRESS, "getAddress", MTD_long_long)
                                            .dup2();
                                        if (isNullable(config, method)) {
                                            cb
                                                .lconst_0()
                                                .lcmp()
                                                .ifThenElse(Opcode.IFEQ,
                                                    bcb -> bcb
                                                        .pop2()
                                                        .aconst_null(),
                                                    bcb -> {
                                                        bcb.invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true);
                                                        buildMemorySegmentReinterpret(bcb, groupDesc, memberMap, method, addressLayout);
                                                    }
                                                );
                                        } else {
                                            cb
                                                .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true)
                                                .dup_x2()
                                                .pop()
                                                .lconst_0()
                                                .lcmp()
                                                .ifThen(Opcode.IFNE, bcb -> buildMemorySegmentReinterpret(bcb, groupDesc, memberMap, method, addressLayout));
                                        }
                                    }
                                    case SequenceLayout sequenceLayout -> {
                                        member.buildAddress(cb, thisClass)
                                            .invokestatic(CD_MemorySegment, "ofAddress", MTD_MemorySegment_long, true);
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
                                var charset = getCharsetType(method);

                                switch (memberLayout) {
                                    // pointer to string
                                    case AddressLayout _ -> {
                                        member.buildGetter(cb, thisClass, ValueLayout.ADDRESS, "getAddress", MTD_long_long);
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
                                    case SequenceLayout _ -> {
                                        member.buildAddress(cb, thisClass);
                                        buildStringGetter(cb, groupDesc, memberMap, method, charset);
                                    }
                                    default -> throw methodException("Unsupported String getter layout: " + memberLayout, method);
                                }
                            } else {
                                String    name;
                                ClassDesc type;

                                if (returnType == groupInterface) {
                                    // recursive member
                                    name = builder.binderField.getName();
                                    type = builder.kind().binderDesc();
                                } else {
                                    var binderField = FFM.lookupBinder(config, returnType);
                                    name = binderField.name();
                                    type = groupDesc(binderField);
                                }

                                var returnTypeDesc = returnType.describeConstable().orElseThrow();
                                switch (memberLayout) {
                                    case AddressLayout _ -> {
                                        // TODO: check actual target of memberLayout
                                        // pointer to group, dereference memory address
                                        cb.getstatic(returnTypeDesc, name, type);
                                        member.buildGetter(cb, thisClass, ValueLayout.ADDRESS, "getAddress", MTD_long_long)
                                            .invokeinterface(CD_GroupBinder, isNullable(config, method) ? "ofAddressSafe" : "ofAddress", MTD_Object_long)
                                        /*.checkcast(returnType.describeConstable().orElseThrow())*/
                                        ;
                                    }
                                    case GroupLayout _ -> {
                                        if (DEBUG && isNullable(config, method)) {
                                            throw methodException("Nested group members cannot be nullable", method);
                                        }
                                        // nested group, return view of member address
                                        cb.getstatic(returnTypeDesc, name, type);
                                        member.buildAddress(cb, thisClass)
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
                    throw memberException("Failed to find canonical getter for layout member", groupInterface, member.name);
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
                for (var entry : getters.sequencedEntrySet()) {
                    var member = entry.getKey();

                    var memberLayout = member.layout();
                    if (!(memberLayout instanceof AddressLayout)) {
                        continue;
                    }

                    var method = entry.getValue();
                    if (method.getReturnType() == long.class) {
                        continue;
                    }

                    if (builder.equals == null || builder.hashCode == null) {
                        classBuilder.withMethod("__address__" + method.getName(), MTD_long, ACC_PRIVATE | ACC_FINAL, mb -> mb.withCode(cb -> {
                                member.buildGetter(cb, thisClass, ValueLayout.ADDRESS, "getAddress", MTD_long_long)
                                    .lreturn();
                            })
                        );
                    }

                    if (builder.toString == null) {
                        classBuilder.withMethod("__toString__" + method.getName(), MTD_String, ACC_PRIVATE | ACC_FINAL, mb -> mb.withCode(cb -> {
                                member.buildGetter(cb, thisClass, ValueLayout.ADDRESS, "getAddress", MTD_long_long)
                                    .invokestatic(CD_Long, "toHexString", MTD_String_long)
                                    .invokedynamic(DCSD_StringConcatFactory_makeConcatWithConstants_AddressToHexString)
                                    .areturn();
                            })
                        );
                    }
                }
            }

            // GENERATE SETTERS
            for (var entry : memberMap.entrySet()) {
                for (var method : entry.getValue()) {
                    if (method.getParameterCount() == 0) {
                        continue; // getter
                    }
                    if (method.getParameterCount() != 1) {
                        throw methodException("Setter must accept a single parameter", method);
                    }
                    if (method.getReturnType() != method.getDeclaringClass()) {
                        throw methodException("Setter return type must be its declaring interface", method);
                    }
                    var descriptor = getMethodTypeDesc(method);
                    classBuilder.withMethod(method.getName(), descriptor, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> {
                            var member       = entry.getKey();
                            var memberLayout = member.layout();

                            var param0 = cb.parameterSlot(0);

                            // TODO: handle clong
                            var parameter     = method.getParameters()[0];
                            var parameterType = parameter.getType();
                            if (parameterType == boolean.class) {
                                switch (memberLayout) {
                                    case ValueLayout.OfBoolean _,
                                         ValueLayout.OfByte _ ->
                                        member.buildSetter(cb, thisClass, ValueLayout.JAVA_BYTE, "putByte", MTD_void_long_byte, CodeBuilder::iload);
                                    case ValueLayout.OfShort _ ->
                                        member.buildSetter(cb, thisClass, ValueLayout.JAVA_SHORT, "putShort", MTD_void_long_short, CodeBuilder::iload);
                                    case ValueLayout.OfInt _ ->
                                        member.buildSetter(cb, thisClass, ValueLayout.JAVA_INT, "putInt", MTD_void_long_int, CodeBuilder::iload);
                                    default -> throw methodException("Unsupported boolean setter layout: " + memberLayout, method);
                                }
                            } else if (parameterType == byte.class) {
                                member.buildSetter(cb, thisClass, ValueLayout.JAVA_BYTE, "putByte", MTD_void_long_byte, CodeBuilder::iload);
                            } else if (parameterType == short.class) {
                                member.buildSetter(cb, thisClass, ValueLayout.JAVA_SHORT, "putShort", MTD_void_long_short, CodeBuilder::iload);
                            } else if (parameterType == int.class) {
                                member.buildSetter(cb, thisClass, ValueLayout.JAVA_INT, "putInt", MTD_void_long_int, CodeBuilder::iload);
                            } else if (parameterType == long.class) {
                                switch (memberLayout) {
                                    case AddressLayout _ ->
                                        member.buildSetter(cb, thisClass, ValueLayout.ADDRESS, "putAddress", MTD_void_long_long, CodeBuilder::lload);
                                    case ValueLayout.OfInt _ -> member.buildSetter(cb, thisClass, ValueLayout.JAVA_INT, "putInt", MTD_void_long_int, bcb -> bcb
                                        .lload(param0)
                                        .l2i());
                                    case ValueLayout.OfLong _ ->
                                        member.buildSetter(cb, thisClass, ValueLayout.JAVA_LONG, "putLong", MTD_void_long_long, CodeBuilder::lload);
                                    default -> throw methodException("Unsupported long setter layout: " + memberLayout, method);
                                }
                            } else if (parameterType == float.class) {
                                member.buildSetter(cb, thisClass, ValueLayout.JAVA_FLOAT, "putFloat", MTD_void_long_float, CodeBuilder::fload);
                            } else if (parameterType == double.class) {
                                member.buildSetter(cb, thisClass, ValueLayout.JAVA_DOUBLE, "putDouble", MTD_void_long_double, CodeBuilder::dload);
                            } else if (parameterType == MemorySegment.class) {
                                // TODO: support nullable
                                // TODO: check actual target of memberLayout
                                member.buildSetter(cb, thisClass, ValueLayout.ADDRESS, "putAddress", MTD_void_long_long, bcb -> {
                                    bcb.aload(param0);
                                    if (isNullable(config, parameter)) {
                                        if (!parameter.isAnnotationPresent(FFMNullable.class)) {
                                            bcb.ifThenElse(Opcode.IFNULL,
                                                CodeBuilder::lconst_0,
                                                b1 -> b1
                                                    .aload(param0)
                                                    .invokeinterface(CD_MemorySegment, "address", MTD_long)
                                            );
                                        } else {
                                            bcb.invokeinterface(CD_MemorySegment, "address", MTD_long);
                                        }
                                    } else {
                                        bcb.invokeinterface(CD_MemorySegment, "address", MTD_long);
                                        buildNullPointerCheck(bcb);
                                    }
                                    return bcb;
                                });
                            } else if (parameterType == String.class) {
                                if (!(memberLayout instanceof SequenceLayout sequenceLayout)) {
                                    throw methodException("Unsupported String setter layout: " + memberLayout, method);
                                }
                                if (Integer.MAX_VALUE < sequenceLayout.byteSize()) {
                                    throw methodException("String setter target is too large: " + memberLayout, method);
                                }

                                var charset = getCharsetType(method);

                                cb
                                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                                    .aload(param0);
                                if (parameter.isAnnotationPresent(FFMSize.class)) {
                                    cb.iconst_0();
                                } else {
                                    cb.iconst_1();
                                }
                                member.buildAddress(cb, thisClass)
                                    .loadConstant((int)sequenceLayout.byteSize())
                                    .invokeinterface(CD_MemoryBackend, switch (charset) {
                                        case US_ASCII, ISO_8859_1 -> "putStringASCII";
                                        case UTF8 -> "putStringUTF8";
                                        case UTF16 -> "putStringUTF16";
                                    }, MTD_int_String_boolean_long_int)
                                    .pop();
                            } else {
                                String    name;
                                ClassDesc type;

                                if (parameterType == groupInterface) {
                                    // recursive member
                                    name = builder.binderField.getName();
                                    type = builder.kind().binderDesc();
                                } else {
                                    var binderField = FFM.lookupBinder(config, parameterType);
                                    name = binderField.name();
                                    type = groupDesc(binderField);
                                }

                                var parameterTypeDesc = parameterType.describeConstable().orElseThrow();
                                switch (memberLayout) {
                                    case AddressLayout _ -> {
                                        // TODO: check actual target of memberLayout
                                        // pointer to group, put memory address
                                        member.buildSetter(cb, thisClass, ValueLayout.ADDRESS, "putAddress", MTD_void_long_long, bcb -> bcb
                                            .getstatic(parameterTypeDesc, name, type)
                                            .aload(param0)
                                            .invokeinterface(CD_GroupBinder, isNullable(config, parameter) ? "addressOfSafe" : "addressOf", MTD_long_Object));
                                    }
                                    case GroupLayout _ -> {
                                        if (DEBUG && isNullable(config, parameter)) {
                                            throw methodException("Nested group members cannot be nullable", method);
                                        }
                                        // nested group, copy entire layout
                                        cb
                                            .getstatic(parameterTypeDesc, name, type)
                                            .dup();
                                        member.buildAddress(cb, thisClass)
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
            // TODO: consider using MemorySegment::mismatch for equals (i.e. all bytes, instead of going through getters, which may be incomplete too)
            // TODO: consider a custom hashCode loop for hashCode (i.e. all bytes, instead of going through getters, which may be incomplete too)
            var bootstrapArgs = hasPrivateGetters ? getBootstrapArgs(getters) : null;
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
                            .ldc(condyCDataAt(CD_BiPredicate, CDATA_IMPL_EQUALS))
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
                            .ldc(condyCDataAt(CD_ToIntFunction, CDATA_IMPL_HASHCODE))
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
                            .ldc(condyCDataAt(CD_Function, CDATA_IMPL_TOSTRING))
                            .aload(receiverSlot)
                            .invokeinterface(CD_Function, "apply", MTD_Object_Object)
                            .checkcast(CD_String);
                    }
                    cb.areturn();
                }));

            // GENERATE optional capabilities

            if (Group.class.isAssignableFrom(groupInterface)) {
                var layoutDesc = layout instanceof StructLayout ? CD_StructLayout : CD_UnionLayout;

                classBuilder
                    .withMethod("layout", MTD_GroupLayout, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                        .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                        .areturn()))
                    .withMethod("copyFrom", MTD_Group_Group, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildCopy(
                        cb, layout,
                        rcb -> rcb
                            .aload(rcb.parameterSlot(0))
                            //.getfield(thisClass, "address", CD_long)
                            .invokeinterface(CD_Group, "address", MTD_long),
                        rcb -> rcb
                            .aload(rcb.receiverSlot())
                            .getfield(thisClass, "address", CD_long),
                        rcb -> rcb.aload(rcb.receiverSlot())
                    )))
                    .withMethod("clear", MTD_Group, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildClear(
                        cb, layout,
                        rcb -> rcb
                            .aload(rcb.receiverSlot())
                            .getfield(thisClass, "address", CD_long),
                        rcb -> rcb.aload(rcb.receiverSlot())
                    )))
                    .withMethod("get", MTD_Group_MemorySegment, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegment(
                        cb, config, layoutDesc,
                        ccb -> buildGetFromMemorySegment(ccb, thisClass, acb -> acb
                            .aload(ccb.parameterSlot(0))
                            .invokeinterface(CD_MemorySegment, "address", MTD_long))
                    )))
                    .withMethod("get", MTD_Group_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegmentAtOffset(
                        cb, config, layoutDesc,
                        ccb -> buildGetFromMemorySegment(ccb, thisClass, acb -> acb
                            .aload(ccb.parameterSlot(0))
                            .invokeinterface(CD_MemorySegment, "address", MTD_long)
                            .lload(ccb.parameterSlot(1))
                            .ladd())
                    )))
                    .withMethod("getAtIndex", MTD_Group_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegmentAtIndex(
                        cb, config, layoutDesc,
                        ccb -> buildGetFromMemorySegment(ccb, thisClass, acb -> acb
                            .aload(ccb.parameterSlot(0))
                            .invokeinterface(CD_MemorySegment, "address", MTD_long)
                            .lload(cb.parameterSlot(1))
                            .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                            .invokeinterface(CD_GroupLayout, "byteSize", MTD_long)
                            .lmul()
                            .ladd())
                    )))
                    .withMethod("set", MTD_Group_MemorySegment, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegment(
                        cb, config, layoutDesc,
                        ccb -> buildSetFromMemorySegment(ccb, thisClass, acb -> acb
                            .aload(ccb.parameterSlot(0))
                            .invokeinterface(CD_MemorySegment, "address", MTD_long))
                    )))
                    .withMethod("set", MTD_Group_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegmentAtOffset(
                        cb, config, layoutDesc,
                        ccb -> buildSetFromMemorySegment(ccb, thisClass, acb -> acb
                            .aload(ccb.parameterSlot(0))
                            .invokeinterface(CD_MemorySegment, "address", MTD_long)
                            .lload(ccb.parameterSlot(1))
                            .ladd())
                    )))
                    .withMethod("setAtIndex", MTD_Group_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegmentAtIndex(
                        cb, config, layoutDesc,
                        ccb -> buildSetFromMemorySegment(ccb, thisClass, acb -> acb
                            .aload(ccb.parameterSlot(0))
                            .invokeinterface(CD_MemorySegment, "address", MTD_long)
                            .lload(cb.parameterSlot(1))
                            .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                            .invokeinterface(CD_GroupLayout, "byteSize", MTD_long)
                            .lmul()
                            .ladd())
                    )));
            }

            if (Group.class.isAssignableFrom(groupInterface) || Pointer.class.isAssignableFrom(groupInterface)) {
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

        // Store constants as class data in the hidden class.
        try {
            return config.lookup.defineHiddenClassWithClassData(bytecode, List.of(
                layout,
                memBackend(),
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

    private static SequencedMap<Member, List<Method>> compileMemberAccessors(Class<?> groupInterface, GroupLayout layout) {
        var layoutMembers = new LinkedHashMap<String, Member>(layout.memberLayouts().size());

        collectLayoutMembers(groupInterface, layout, "", 0L, layoutMembers);

        // extra map because getMethods() order is not guaranteed and we need to respect layout order
        var methods = new HashMap<String, List<Method>>(layout.memberLayouts().size());
        for (var method : groupInterface.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) || method.isDefault()) {
                continue; // skip static/default interface methods
            }

            var declaringClass = method.getDeclaringClass();
            if (
                declaringClass == Object.class ||
                declaringClass == Group.class ||
                declaringClass == Pointer.class ||
                declaringClass == NativeResource.class
            ) {
                continue; // skip capability methods
            }

            checkAccessorAliasing(groupInterface, method);
            var name = getNativeName(method);

            methods
                .computeIfAbsent(name, _ -> new ArrayList<>(4))
                .add(method);
        }

        var members = new LinkedHashMap<Member, List<Method>>(layout.memberLayouts().size());

        for (var path : layoutMembers.sequencedValues()) {
            var memberMethods = methods.get(path.name());
            if (memberMethods != null) {
                members.put(path, memberMethods);
            }
        }

        for (var entry : methods.entrySet()) {
            if (!layoutMembers.containsKey(entry.getKey())) {
                throw memberException("No layout member found with this name", groupInterface, entry.getKey());
            }
        }

        return members;
    }
    private static void collectLayoutMembers(Class<?> groupInterface, GroupLayout groupLayout, String prefix, long baseOffset, LinkedHashMap<String, Member> map) {
        for (var member : groupLayout.memberLayouts()) {
            var name = member.name().orElse(null);
            if (name == null) {
                if (!(member instanceof PaddingLayout)) {
                    throw memberException("Unnamed member is not padding", groupInterface, member.toString());
                }
                continue;
            }

            var path = MemoryLayout.PathElement.groupElement(name);

            var memberLayout = Objects.requireNonNull(groupLayout.select(path));
            var memberOffset = baseOffset + groupLayout.byteOffset(path);

            if (name.startsWith(FFM.ANONYMOUS_MEMBER_PREFIX)) {
                if (!(memberLayout instanceof GroupLayout nestedGroupLayout)) {
                    throw memberException("Anonymous member is not a nested group layout", groupInterface, name);
                }
                collectLayoutMembers(groupInterface, nestedGroupLayout, prefix, memberOffset, map); // promote with same prefix
                continue;
            }

            var memberName = prefix + name;
            var previous   = map.put(memberName, new Member(memberName, memberLayout, memberOffset));
            if (previous != null) {
                throw memberException("Ambiguous promoted layout member", groupInterface, memberName);
            }

            if (memberLayout instanceof GroupLayout nestedGroupLayout) {
                collectLayoutMembers(groupInterface, nestedGroupLayout, memberName + ".", memberOffset, map);
            }
        }
    }
    private static void checkAccessorAliasing(Class<?> groupInterface, Method method) {
        if (switch (method.getName()) {
            case "equals", "hashCode", "toString" -> true;
            case "address" -> Group.class.isAssignableFrom(groupInterface) || Pointer.class.isAssignableFrom(groupInterface);
            // TODO: more?
            case "layout", "clear", "sizeof", "alignof", "asSegment" -> Group.class.isAssignableFrom(groupInterface);
            // void methods, should be fine
            //case "close", "free" -> NativeResource.class.isAssignableFrom(groupInterface);
            default -> false;
        }) {
            throw methodException("Group accessor name aliases supertype method and must be changed with @FFMName", method);
        }
    }

    private static int registerCanonicalGetter(Class<?> groupInterface, Method method, LinkedHashMap<Member, Method> getters, Member member) {
        var memberName = member.name();
        if (method.isAnnotationPresent(FFMCanonical.class)) {
            var canonical = getters.get(member);
            if (canonical != null && canonical.isAnnotationPresent(FFMCanonical.class)) {
                throw memberException("Multiple canonical getters found", groupInterface, memberName);
            }
            getters.put(member, method);
        } else if (memberName.equals(method.getName())) {
            var canonical = getters.get(member);
            if (canonical == null || !canonical.isAnnotationPresent(FFMCanonical.class)) {
                getters.put(member, method);
            }
        } else {
            getters.putIfAbsent(member, method);
            return 1;
        }
        return 0;
    }

    private static ClassDesc groupDesc(FFMConfig.BinderField binderField) {
        var binder = binderField.binder();
        return switch (binder) {
            case StructBinder<?> _ -> CD_StructBinder;
            case UnionBinder<?> _ -> CD_UnionBinder;
            default -> throw new UnsupportedOperationException("Unsupported binder type: " + binder.getClass());
        };
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
        T cb, ClassDesc groupDesc, SequencedMap<Member, List<Method>> memberMap, Method method,
        FFMSize autoSize, MemoryLayout elementLayout
    ) {
        // TODO: simplify?
        var sizeGetter = memberMap
            .sequencedEntrySet()
            .stream()
            .filter(it -> it.getKey().name().equals(autoSize.value()))
            .findFirst()
            .orElseThrow(() -> methodException("The FFMSize reference \"" + autoSize.value() + "\" was not found", method))
            .getValue()
            .stream()
            .filter(it -> it.getReturnType().isPrimitive())
            .findFirst()
            .orElseThrow(() -> methodException("No primitive type getter for FFMSize reference \"" + autoSize.value() + "\"", method));

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
        T cb, ClassDesc groupDesc, SequencedMap<Member, List<Method>> memberMap, Method method,
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
        T cb, ClassDesc groupDesc, SequencedMap<Member, List<Method>> memberMap, Method method,
        FFMCharset.Type charset
    ) {
        var accessor = switch (charset) {
            case US_ASCII, ISO_8859_1 -> "getStringASCII";
            case UTF8 -> "getStringUTF8";
            case UTF16 -> "getStringUTF16";
        };

        cb
            .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
            .dup_x2()
            .pop();

        var autoSize = method.getAnnotation(FFMSize.class);
        if (autoSize != null) {
            buildAutoSize(cb, groupDesc, memberMap, method, autoSize, ValueLayout.JAVA_BYTE)
                .l2i()
                .invokeinterface(CD_MemoryBackend, accessor, MTD_String_long_int);
        } else {
            cb.invokeinterface(CD_MemoryBackend, accessor, MTD_String_long);
        }
        return cb;
    }

    private static <T extends CodeBuilder> T buildGetFromMemorySegment(T cb, ClassDesc thisClass, Function<T, T> codeAddress) {
        cb
            .aload(cb.receiverSlot())
            .dup()
            .new_(thisClass)
            .dup();
        codeAddress.apply(cb)
            .invokespecial(thisClass, INIT_NAME, MTD_void_long)
            .invokevirtual(thisClass, "copyFrom", MTD_Group_Group)
            .areturn();
        return cb;
    }

    private static <T extends CodeBuilder> T buildSetFromMemorySegment(T cb, ClassDesc thisClass, Function<T, T> codeAddress) {
        cb
            .new_(thisClass)
            .dup();
        codeAddress.apply(cb)
            .invokespecial(thisClass, INIT_NAME, MTD_void_long)
            .aload(cb.receiverSlot())
            .invokevirtual(thisClass, "copyFrom", MTD_Group_Group)
            .areturn();
        return cb;
    }

    @SuppressWarnings("unchecked")
    static <T, L extends GroupLayout, M extends GroupBinder<L, T>> M bootstrap(FFM.GroupBinderBuilder<T, L, M, ?> builder, L layout) {
        var groupInterface = builder.groupInterface;

        var kind = builder.kind();

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

            var groupDesc       = groupInterface.describeConstable().orElseThrow();
            var constructorDesc = MethodTypeDesc.of(groupDesc, CD_long);

            classBuilder
                .withMethod("layout", MTD_GroupLayout, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .ldc(condyCDataAt(kind.layoutDesc(), CDATA_LAYOUT))
                    .areturn())
                )
                .withMethod("addressOf", MTD_long_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> cb
                    .ldc(condyCDataAt(CD_MethodHandle, CDATA_ADDRESS))
                    .aload(cb.parameterSlot(0))
                    .invokevirtual(CD_MethodHandle, "invokeExact", MethodTypeDesc.of(CD_long, groupDesc))
                    .lreturn()))
                .withMethod("ofAddress", MTD_Object_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildConstructor(
                    cb, constructorDesc,
                    acb -> acb.lload(cb.parameterSlot(0)
                    ))))
                .withMethod("copy", MTD_Object_Object_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildCopy(
                    cb, layout,
                    rcb -> rcb
                        .aload(rcb.receiverSlot())
                        .aload(rcb.parameterSlot(0))
                        .invokevirtual(binderClass, "addressOf", MTD_long_Object),
                    rcb -> rcb
                        .aload(rcb.receiverSlot())
                        .aload(rcb.parameterSlot(1))
                        .invokevirtual(binderClass, "addressOf", MTD_long_Object),
                    rcb -> rcb.aload(rcb.parameterSlot(1))
                )))
                .withMethod("clear", MTD_Object_Object, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildClear(
                    cb, layout,
                    rcb -> rcb
                        .aload(rcb.receiverSlot())
                        .aload(rcb.parameterSlot(0))
                        .invokevirtual(binderClass, "addressOf", MTD_long_Object),
                    rcb -> rcb.aload(rcb.parameterSlot(0)
                    ))))
                .withMethod("get", MTD_Object_MemorySegment, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegment(
                    cb, config, kind.layoutDesc(),
                    ccb -> buildConstructor(ccb, constructorDesc, acb -> acb
                        .aload(cb.parameterSlot(0))
                        .invokeinterface(CD_MemorySegment, "address", MTD_long))
                )))
                .withMethod("get", MTD_Object_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegmentAtOffset(
                    cb, config, kind.layoutDesc(),
                    ccb -> buildConstructor(ccb, constructorDesc, acb -> acb
                        .aload(ccb.parameterSlot(0))
                        .invokeinterface(CD_MemorySegment, "address", MTD_long)
                        .lload(ccb.parameterSlot(1))
                        .ladd())
                )))
                .withMethod("getAtIndex", MTD_Object_MemorySegment_long, ACC_PUBLIC | ACC_FINAL, mb -> mb.withCode(cb -> buildGetMemorySegmentAtIndex(
                    cb, config, kind.layoutDesc(),
                    ccb -> buildConstructor(ccb, constructorDesc, acb -> acb
                        .aload(cb.parameterSlot(0))
                        .invokeinterface(CD_MemorySegment, "address", MTD_long)
                        .lload(cb.parameterSlot(1))
                        .ldc(condyCDataAt(kind.layoutDesc(), CDATA_LAYOUT))
                        .invokeinterface(CD_GroupLayout, "byteSize", MTD_long)
                        .lmul()
                        .ladd())
                )));
        });

        if (config.debugGenerator) {
            printModel(of().parse(bytecode));
        }

        // Store constants as class data in the hidden class.
        try {
            var wrapperLookup = config.lookup.defineHiddenClassWithClassData(bytecode,
                List.of(
                    layout,
                    memBackend(),
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

    private static String[] getBootstrapArgs(LinkedHashMap<Member, Method> getters) {
        var bootstrapNames = getters.sequencedKeySet().stream()
            .map(Member::name)
            .collect(SEMI_COLON);

        var bootstrapArgsBuilder = Stream.<String>builder()
            .add(bootstrapNames);

        getters
            .sequencedEntrySet()
            .forEach(entry -> {
                var member = entry.getKey();
                var method = entry.getValue();

                bootstrapArgsBuilder.add(member.layout instanceof AddressLayout && method.getReturnType() != long.class
                    ? "__address__" + method.getName()
                    : method.getName());
            });

        return bootstrapArgsBuilder
            .build()
            .toArray(String[]::new);
    }

    private static <T extends CodeBuilder> T buildConstructor(T cb, MethodTypeDesc constructorDesc, Function<T, T> codeAddress) {
        cb.ldc(condyCDataAt(CD_MethodHandle, CDATA_CONSTRUCTOR));
        codeAddress.apply(cb)
            .invokevirtual(CD_MethodHandle, "invokeExact", constructorDesc)
            .areturn();
        return cb;
    }

    private static <T extends CodeBuilder> void buildCopy(
        T cb,
        GroupLayout layout,
        Function<T, T> codeSrc,
        Function<T, T> codeDst,
        Function<T, T> codeRet
    ) {
        codeDst.apply(cb);

        var byteSize = layout.byteSize();
        // On JDK 26+ the custom loop gets unrolled+vectorized
        if (512L < byteSize || Platform.getJavaVersion() == 25) {
            var dstSlot = cb.allocateLocal(TypeKind.LONG);
            cb
                .lstore(dstSlot)
                .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND));
            codeSrc.apply(cb)
                .lload(dstSlot)
                .loadConstant(byteSize)
                .invokeinterface(CD_MemoryBackend, "memcpy", MTD_void_long_long_long);
        } else {
            // custom memcpy with guaranteed correct alignment
            var dstSlot = cb.allocateLocal(TypeKind.LONG);
            cb.lstore(dstSlot);

            var srcSlot = cb.allocateLocal(TypeKind.LONG);
            codeSrc
                .apply(cb)
                .lstore(srcSlot);

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
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(dstSlot)
                    .lload(offsetSlot)
                    .ladd()
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(srcSlot)
                    .lload(offsetSlot)
                    .ladd()
                    .invokeinterface(CD_MemoryBackend, "getLongUnaligned", MTD_long_long)
                    .invokeinterface(CD_MemoryBackend, "putLongUnaligned", MTD_void_long_long)
                    .lload(offsetSlot)
                    .loadConstant(8L)
                    .ladd()
                    .lstore(offsetSlot)
                    .goto_(loopStart)
                    .labelBinding(loopEnd);
            } else if (8L <= byteSize) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(dstSlot)
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(srcSlot)
                    .invokeinterface(CD_MemoryBackend, "getLongUnaligned", MTD_long_long)
                    .invokeinterface(CD_MemoryBackend, "putLongUnaligned", MTD_void_long_long);
            }

            var offset = byteSize & ~7L;
            if (offset < (byteSize & ~3L)) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(dstSlot)
                    .loadConstant(offset)
                    .ladd()
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(srcSlot)
                    .loadConstant(offset)
                    .ladd()
                    .invokeinterface(CD_MemoryBackend, "getIntUnaligned", MTD_int_long)
                    .invokeinterface(CD_MemoryBackend, "putIntUnaligned", MTD_void_long_int);
                offset += 4L;
            }

            if (offset < (byteSize & ~1L)) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(dstSlot)
                    .loadConstant(offset)
                    .ladd()
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(srcSlot)
                    .loadConstant(offset)
                    .ladd()
                    .invokeinterface(CD_MemoryBackend, "getShortUnaligned", MTD_short_long)
                    .invokeinterface(CD_MemoryBackend, "putShortUnaligned", MTD_void_long_short);
                offset += 2L;
            }

            if (offset < byteSize) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(dstSlot)
                    .loadConstant(offset)
                    .ladd()
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(srcSlot)
                    .loadConstant(offset)
                    .ladd()
                    .invokeinterface(CD_MemoryBackend, "getByte", MTD_byte_long)
                    .invokeinterface(CD_MemoryBackend, "putByte", MTD_void_long_byte);
            }
        }
        codeRet.apply(cb)
            .areturn();
    }

    private static <T extends CodeBuilder> void buildClear(
        T cb,
        GroupLayout layout,
        Function<T, T> codeReceiver,
        Function<T, T> codeReturn
    ) {
        codeReceiver.apply(cb);

        var addressSlot = cb.allocateLocal(TypeKind.LONG);
        cb.lstore(addressSlot);

        var byteSize = layout.byteSize();
        // On JDK 26+ the custom loop gets unrolled+vectorized
        if (1024L < byteSize || (Platform.getJavaVersion() == 25 && (byteSize <= NATIVE_THRESHOLD_FILL || 64L < byteSize))) {
            cb
                .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                .lload(addressSlot)
                .iconst_0()
                .loadConstant(byteSize)
                .invokeinterface(CD_MemoryBackend, "memset", MTD_void_long_int_long);
        } else {
            // custom memset with guaranteed correct alignment
            if (16L <= byteSize) {
                var offsetSlot = cb.allocateLocal(TypeKind.LONG);

                cb
                    .lconst_0()
                    .lstore(offsetSlot);

                var loopEnd   = cb.newLabel();
                var loopStart = cb.newBoundLabel();

                cb
                    .lload(offsetSlot)
                    .loadConstant(byteSize & ~7L)
                    .lcmp()
                    .ifge(loopEnd)
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(addressSlot)
                    .lload(offsetSlot)
                    .ladd()
                    .lconst_0()
                    .invokeinterface(CD_MemoryBackend, "putLongUnaligned", MTD_void_long_long)
                    .lload(offsetSlot)
                    .loadConstant(8L)
                    .ladd()
                    .lstore(offsetSlot)
                    .goto_(loopStart)
                    .labelBinding(loopEnd);
            } else if (8L <= byteSize) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(addressSlot)
                    .lconst_0()
                    .invokeinterface(CD_MemoryBackend, "putLongUnaligned", MTD_void_long_long);
            }

            var offset = byteSize & ~7L;
            if (offset < (byteSize & ~3L)) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(addressSlot)
                    .loadConstant(offset)
                    .ladd()
                    .iconst_0()
                    .invokeinterface(CD_MemoryBackend, "putIntUnaligned", MTD_void_long_int);
                offset += 4L;
            }

            if (offset < (byteSize & ~1L)) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(addressSlot)
                    .loadConstant(offset)
                    .ladd()
                    .iconst_0()
                    .invokeinterface(CD_MemoryBackend, "putShortUnaligned", MTD_void_long_short);
                offset += 2L;
            }

            if (offset < byteSize) {
                cb
                    .ldc(condyCDataAt(CD_MemoryBackend, CDATA_BACKEND))
                    .lload(addressSlot)
                    .loadConstant(offset)
                    .ladd()
                    .iconst_0()
                    .invokeinterface(CD_MemoryBackend, "putByte", MTD_void_long_byte);
            }
        }

        codeReturn
            .apply(cb)
            .areturn();
    }

    public static <T extends CodeBuilder> void buildGetMemorySegment(
        T cb,
        FFMConfig config,
        ClassDesc layoutDesc,
        Function<T, T> constructorCode
    ) {
        // T get(MemorySegment segment);
        if (config.checks) { // TODO: switch to debug?
            // bounds check via: segment.asSlice(0L, layout());
            cb
                .aload(cb.parameterSlot(0))
                .lconst_0()
                .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                .invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_MemoryLayout)
                .pop(); // discard, we only want the bounds check
        }
        constructorCode.apply(cb);
    }

    public static <T extends CodeBuilder> void buildGetMemorySegmentAtOffset(
        T cb,
        FFMConfig config,
        ClassDesc layoutDesc,
        Function<T, T> constructorCode
    ) {
        // T get(MemorySegment segment, long offset);
        if (config.checks) { // TODO: switch to debug?
            // bounds check via: segment.asSlice(offset, layout());
            cb
                .aload(cb.parameterSlot(0))
                .lload(cb.parameterSlot(1))
                .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                .invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_MemoryLayout)
                .pop(); // discard, we only want the bounds check
        }
        constructorCode.apply(cb);
    }

    public static <T extends CodeBuilder> void buildGetMemorySegmentAtIndex(
        T cb,
        FFMConfig config,
        ClassDesc layoutDesc,
        Function<T, T> constructorCode
    ) {
        // T getAtIndex(MemorySegment segment, long index);
        if (config.checks) { // TODO: switch to debug?
            // bounds check via: segment.asSlice(index * layout().byteSize(), layout());
            cb
                .aload(cb.parameterSlot(0))
                .lload(cb.parameterSlot(1))
                .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                .invokeinterface(CD_GroupLayout, "byteSize", MTD_long)
                .lmul()
                .ldc(condyCDataAt(layoutDesc, CDATA_LAYOUT))
                .invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_MemoryLayout)
                .pop(); // discard, we only want the bounds check
        }
        constructorCode.apply(cb);
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
