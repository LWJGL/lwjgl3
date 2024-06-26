/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.classfile.*;
import java.lang.constant.*;
import java.lang.reflect.*;

import static java.lang.constant.ConstantDescs.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;
import static org.lwjgl.system.ffm.BCUtil.*;

record BCReturnTransform(
    int bufferIndex, int bufferSlot,
    int sizeIndex, SizeCarrier sizeCarrier,
    int sizeOutputIndex, int sizeOutputSlot
) {

    static BCReturnTransform create(
        CodeBuilder cb,
        MethodTypeDesc methodTypeDesc, Method method, Parameter[] parameters,
        FFMReturn returnAnnotation, int allocatorSlot
    ) {
        var bufferIndex = returnAnnotation.value();

        var sizeInputIndex = -1;
        for (var p = 0; p < methodTypeDesc.parameterCount(); p++) {
            if (parameters[p].isAnnotationPresent(FFMReturn.Size.class)) {
                sizeInputIndex = p;
                break;
            }
        }

        if (sizeInputIndex == -1) {
            if (CD_MemorySegment.equals(methodTypeDesc.returnType()) || CD_String.equals(methodTypeDesc.returnType())) {
                throw new IllegalStateException("Missing @FFMReturn.Size annotation");
            }
        }

        var sizeCarrier = sizeInputIndex == -1
            ? SizeCarrier.get(method.getReturnType())
            : SizeCarrier.get(parameters[sizeInputIndex].getType());

        var returnOutputAnnotation = method.getAnnotation(FFMReturn.SizeOut.class);

        var sizeOutputIndex = returnOutputAnnotation == null ? -1 : returnOutputAnnotation.value();
        var sizeOutputSlot  = -1;

        if (returnOutputAnnotation != null && sizeOutputIndex < bufferIndex) {
            sizeOutputSlot = allocateOutputSlot(cb, sizeCarrier, allocatorSlot);
        }

        var bufferSlot = cb.allocateLocal(TypeKind.REFERENCE);

        if (sizeInputIndex == -1) {
            cb.aload(allocatorSlot);
            SizeCarrier.get(method.getReturnType())
                .allocateSingle(cb)
                .astore(bufferSlot);
        } else {
            var slot = cb.parameterSlot(sizeInputIndex);
            var kind = TypeKind.from(methodTypeDesc.parameterType(sizeInputIndex));

            cb
                .aload(allocatorSlot)
                .loadLocal(kind, slot);
            if (method.getReturnType() == String.class) {
                buildCharsetShift(cb, getCharset(method), kind);
            }
            if (kind != TypeKind.LONG) {
                cb.i2l();
            }
            cb
                .invokeinterface(CD_SegmentAllocator, "allocate", BCDescriptors.MTD_MemorySegment_long)
                .astore(bufferSlot);
        }

        if (returnOutputAnnotation != null && bufferIndex < sizeOutputIndex) {
            sizeOutputSlot = allocateOutputSlot(cb, sizeCarrier, allocatorSlot);
        }

        return new BCReturnTransform(
            bufferIndex, bufferSlot,
            sizeInputIndex, sizeCarrier,
            sizeOutputIndex, sizeOutputSlot
        );
    }

    private static int allocateOutputSlot(CodeBuilder cb, SizeCarrier sizeCarrier, int allocatorSlot) {
        var slot = cb.allocateLocal(TypeKind.REFERENCE);
        cb.aload(allocatorSlot);
        sizeCarrier
            .allocateSingle(cb)
            .astore(slot);
        return slot;
    }

    void loadParameters(CodeBuilder bcb, int virtualParameterCount, int p) {
        if (p == virtualParameterCount + bufferIndex) {
            bcb.aload(bufferSlot);
        }
        if (sizeOutputIndex() != -1 && p == virtualParameterCount + sizeOutputIndex) {
            bcb.aload(sizeOutputSlot);
        }
    }

    void loadParametersTail(CodeBuilder bcb, int virtualParameterCount, int parameterCount) {
        if (sizeOutputSlot != -1 && parameterCount <= virtualParameterCount + sizeOutputIndex && sizeOutputSlot < bufferSlot) {
            bcb.aload(sizeOutputSlot);
        }
        if (parameterCount <= virtualParameterCount + bufferIndex) {
            bcb.aload(bufferSlot);
        }
        if (sizeOutputSlot != -1 && parameterCount <= virtualParameterCount + sizeOutputIndex && bufferSlot < sizeOutputSlot) {
            bcb.aload(sizeOutputSlot);
        }
    }

    void buildResult(CodeBuilder bcb, MethodTypeDesc methodTypeDesc, Method method) {
        if (method.getReturnType().isPrimitive()) {
            bcb
                .aload(bufferSlot)
                .getstatic(CD_ValueLayout, sizeCarrier.name, sizeCarrier.type)
                .lconst_0()
                .invokeinterface(CD_MemorySegment, "get", sizeCarrier.getter);
        } else {
            // var _length = HANDLE.invokeExact(...);
            // ..or..
            // var _length = sizeOutputBuffer.get(layout, 0L);

            // return _buffer.asSlice(0L, (long)_length);
            // ..or..
            // var _array = _buffer.asSlice(0L, (long)(_length << (charset_shift))).toArray(ValueLayout.JAVA_BYTE);
            // _result = new String(_array, StandardCharsets.<charset>);
            var sizeKind = TypeKind.from(methodTypeDesc.parameterType(sizeIndex));
            var sizeSlot = bcb.allocateLocal(sizeKind);

            if (sizeOutputSlot != -1) {
                bcb
                    .aload(sizeOutputSlot)
                    .getstatic(CD_ValueLayout, sizeCarrier.name, sizeCarrier.type)
                    .lconst_0()
                    .invokeinterface(CD_MemorySegment, "get", sizeCarrier.getter);
            }
            bcb
                .storeLocal(sizeKind, sizeSlot)
                .aload(bufferSlot)
                .lconst_0()
                .loadLocal(sizeKind, sizeSlot);

            var charsetType = method.getReturnType() == String.class ? getCharset(method) : null;
            if (charsetType != null) {
                buildCharsetShift(bcb, charsetType, sizeKind);
            }

            if (sizeKind != TypeKind.LONG) {
                bcb.i2l();
            }
            bcb.invokeinterface(CD_MemorySegment, "asSlice", MTD_MemorySegment_long_long);

            if (charsetType != null) {
                var arraySlot = bcb.allocateLocal(TypeKind.REFERENCE);
                bcb
                    .getstatic(CD_ValueLayout, "JAVA_BYTE", CD_ValueLayout$OfByte)
                    .invokeinterface(CD_MemorySegment, "toArray", MTD_byteArray_ValueLayout$OfByte)
                    .astore(arraySlot)
                    .new_(CD_String)
                    .dup()
                    .aload(arraySlot);
                buildCharsetInstance(bcb, charsetType)
                    .invokespecial(CD_String, INIT_NAME, MTD_void_byteArray_Charset);
            }
        }
    }
}