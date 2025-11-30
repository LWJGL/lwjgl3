/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.lwjgl.system.*;

import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.lang.reflect.*;
import java.nio.charset.*;
import java.util.function.*;

import static java.lang.constant.ConstantDescs.*;
import static java.lang.constant.MethodHandleDesc.*;

final class BCDescriptors {

    static final ClassDesc
        CD_AddressLayout            = AddressLayout.class.describeConstable().orElseThrow(),
        CD_Arena                    = Arena.class.describeConstable().orElseThrow(),
        CD_BiPredicate              = BiPredicate.class.describeConstable().orElseThrow(),
        CDA_byte                    = byte[].class.describeConstable().orElseThrow(),
        CD_Charset                  = Charset.class.describeConstable().orElseThrow(),
        CD_FFM                      = FFM.class.describeConstable().orElseThrow(),
        CD_Function                 = Function.class.describeConstable().orElseThrow(),
        CD_FunctionDescriptor       = FunctionDescriptor.class.describeConstable().orElseThrow(),
        CD_IllegalArgumentException = IllegalArgumentException.class.describeConstable().orElseThrow(),
        CD_GroupBinder              = GroupBinder.class.describeConstable().orElseThrow(),
        CD_GroupLayout              = GroupLayout.class.describeConstable().orElseThrow(),
        CD_Linker                   = Linker.class.describeConstable().orElseThrow(),
        CD_MemoryLayout             = MemoryLayout.class.describeConstable().orElseThrow(),
        CD_MemorySegment            = MemorySegment.class.describeConstable().orElseThrow(),
        CD_MemoryUtil               = MemoryUtil.class.describeConstable().orElseThrow(),
        CD_Method                   = Method.class.describeConstable().orElseThrow(),
        CD_Record                   = Record.class.describeConstable().orElseThrow(),
        CD_SegmentAllocator         = SegmentAllocator.class.describeConstable().orElseThrow(),
        CD_StackAllocator           = StackAllocator.class.describeConstable().orElseThrow(),
        CD_SegmentStack             = SegmentStack.class.describeConstable().orElseThrow(),
        CD_StandardCharsets         = StandardCharsets.class.describeConstable().orElseThrow(),
        CD_StructBinder             = StructBinder.class.describeConstable().orElseThrow(),
        CD_StructLayout             = StructLayout.class.describeConstable().orElseThrow(),
        CD_ToIntFunction            = ToIntFunction.class.describeConstable().orElseThrow(),
        CD_TraceConsumer            = TraceConsumer.class.describeConstable().orElseThrow(),
        CD_UnionBinder              = UnionBinder.class.describeConstable().orElseThrow(),
        CD_UnionLayout              = UnionLayout.class.describeConstable().orElseThrow(),
        CD_UpcallBinder             = UpcallBinder.class.describeConstable().orElseThrow(),
        CD_ValueLayout              = ValueLayout.class.describeConstable().orElseThrow(),
        CD_ValueLayout$OfByte       = ValueLayout.OfByte.class.describeConstable().orElseThrow(),
        CD_ValueLayout$OfShort      = ValueLayout.OfShort.class.describeConstable().orElseThrow(),
        CD_ValueLayout$OfInt        = ValueLayout.OfInt.class.describeConstable().orElseThrow(),
        CD_ValueLayout$OfLong       = ValueLayout.OfLong.class.describeConstable().orElseThrow();

    static final ClassDesc
        CDA_Linker$Option = Linker.Option.class.describeConstable().orElseThrow().arrayType(),
        CDA_MethodHandle  = CD_MethodHandle.arrayType(),
        CDA_Object        = CD_Object.arrayType(),
        CDA_String        = CD_String.arrayType();

    static final MethodTypeDesc
        MTD_boolean_Object                                     = MethodTypeDesc.of(CD_boolean, CD_Object),
        MTD_boolean_Object_Object                              = MethodTypeDesc.of(CD_boolean, CD_Object, CD_Object),
        MTD_byte_long                                          = MethodTypeDesc.of(CD_byte, CD_long),
        MTD_byte_ValueLayout$OfByte_long                       = MethodTypeDesc.of(CD_byte, CD_ValueLayout$OfByte, CD_long),
        MTD_byteArray_Charset                                  = MethodTypeDesc.of(CDA_byte, CD_Charset),
        MTD_byteArray_ValueLayout$OfByte                       = MethodTypeDesc.of(CDA_byte, CD_ValueLayout$OfByte),
        MTD_Charset_String                                     = MethodTypeDesc.of(CD_Charset, CD_String),
        MTD_double_long                                        = MethodTypeDesc.of(CD_double, CD_long),
        MTD_float_long                                         = MethodTypeDesc.of(CD_float, CD_long),
        MTD_FunctionDescriptor                                 = MethodTypeDesc.of(CD_FunctionDescriptor),
        MTD_GroupBinder_MemorySegment_Object                   = MethodTypeDesc.of(CD_GroupBinder, CD_MemorySegment, CD_Object),
        MTD_GroupLayout                                        = MethodTypeDesc.of(CD_GroupLayout),
        MTD_int                                                = MethodTypeDesc.of(CD_int),
        MTD_int_long                                           = MethodTypeDesc.of(CD_int, CD_long),
        MTD_int_Object                                         = MethodTypeDesc.of(CD_int, CD_Object),
        MTD_int_ValueLayout$OfInt_long                         = MethodTypeDesc.of(CD_int, CD_ValueLayout$OfInt, CD_long),
        MTD_Linker                                             = MethodTypeDesc.of(CD_Linker),
        MTD_Linker_upcallStub                                  = MethodTypeDesc.of(CD_MemorySegment, CD_MethodHandle, CD_FunctionDescriptor, CD_Arena, CDA_Linker$Option),
        MTD_long                                               = MethodTypeDesc.of(CD_long),
        MTD_long_long                                          = MethodTypeDesc.of(CD_long, CD_long),
        MTD_long_Object                                        = MethodTypeDesc.of(CD_long, CD_Object),
        MTD_long_ValueLayout$OfLong_long                       = MethodTypeDesc.of(CD_long, CD_ValueLayout$OfLong, CD_long),
        MTD_MemoryLayout                                       = MethodTypeDesc.of(CD_MemoryLayout),
        MTD_MemorySegment_AddressLayout_long                   = MethodTypeDesc.of(CD_MemorySegment, CD_AddressLayout, CD_long),
        MTD_MemorySegment_Arena_Object                         = MethodTypeDesc.of(CD_MemorySegment, CD_Arena, CD_Object),
        MTD_MemorySegment_byte                                 = MethodTypeDesc.of(CD_MemorySegment, CD_byte),
        MTD_MemorySegment_long                                 = MethodTypeDesc.of(CD_MemorySegment, CD_long),
        MTD_MemorySegment_long_long                            = MethodTypeDesc.of(CD_MemorySegment, CD_long, CD_long),
        MTD_MemorySegment_long_MemoryLayout                    = MethodTypeDesc.of(CD_MemorySegment, CD_long, CD_MemoryLayout),
        MTD_MemorySegment_MemoryLayout_long                    = MethodTypeDesc.of(CD_MemorySegment, CD_MemoryLayout, CD_long),
        MTD_MemorySegment_MemorySegment                        = MethodTypeDesc.of(CD_MemorySegment, CD_MemorySegment),
        MTD_MemorySegment_MemorySegment_Object                 = MethodTypeDesc.of(CD_MemorySegment, CD_MemorySegment, CD_Object),
        MTD_MemorySegment_Object                               = MethodTypeDesc.of(CD_MemorySegment, CD_Object),
        MTD_MemorySegment_String_Charset                       = MethodTypeDesc.of(CD_MemorySegment, CD_String, CD_Charset),
        MTD_MethodHandle                                       = MethodTypeDesc.of(CD_MethodHandle),
        MTD_MethodHandles$Lookup                               = MethodTypeDesc.of(CD_MethodHandles_Lookup),
        MTD_MethodHandle_Class_String_MethodType               = MethodTypeDesc.of(CD_MethodHandle, CD_Class, CD_String, CD_MethodType),
        MTD_Object_long                                        = MethodTypeDesc.of(CD_Object, CD_long),
        MTD_Object_MemorySegment                               = MethodTypeDesc.of(CD_Object, CD_MemorySegment),
        MTD_Object_MemorySegment_long                          = MethodTypeDesc.of(CD_Object, CD_MemorySegment, CD_long),
        MTD_Object_Object                                      = MethodTypeDesc.of(CD_Object, CD_Object),
        MTD_Object_Object_Object                               = MethodTypeDesc.of(CD_Object, CD_Object, CD_Object),
        MTD_short_long                                         = MethodTypeDesc.of(CD_short, CD_long),
        MTD_short_ValueLayout$OfShort_long                     = MethodTypeDesc.of(CD_short, CD_ValueLayout$OfShort, CD_long),
        MTD_StackAllocator                                     = MethodTypeDesc.of(CD_StackAllocator),
        MTD_SegmentStack                                       = MethodTypeDesc.of(CD_SegmentStack),
        MTD_String                                             = MethodTypeDesc.of(CD_String),
        MTD_String_long                                        = MethodTypeDesc.of(CD_String, CD_long),
        MTD_String_long_Charset                                = MethodTypeDesc.of(CD_String, CD_long, CD_Charset),
        MTD_String_String                                      = MethodTypeDesc.of(CD_String, CD_String),
        MTD_void_byteArray_Charset                             = MethodTypeDesc.of(CD_void, CDA_byte, CD_Charset),
        MTD_void_long                                          = MethodTypeDesc.of(CD_void, CD_long),
        MTD_void_long_byte                                     = MethodTypeDesc.of(CD_void, CD_long, CD_byte),
        MTD_void_long_short                                    = MethodTypeDesc.of(CD_void, CD_long, CD_short),
        MTD_void_long_int                                      = MethodTypeDesc.of(CD_void, CD_long, CD_int),
        MTD_void_long_long                                     = MethodTypeDesc.of(CD_void, CD_long, CD_long),
        MTD_void_long_float                                    = MethodTypeDesc.of(CD_void, CD_long, CD_float),
        MTD_void_long_double                                   = MethodTypeDesc.of(CD_void, CD_long, CD_double),
        MTD_void_long_String_Charset                           = MethodTypeDesc.of(CD_void, CD_long, CD_String, CD_Charset),
        MTD_void_MemorySegment_long                            = MethodTypeDesc.of(CD_void, CD_MemorySegment, CD_long),
        MTD_void_Method_Object_ObjectArray                     = MethodTypeDesc.of(CD_void, CD_Method, CD_Object, CDA_Object),
        MTD_void_String                                        = MethodTypeDesc.of(CD_void, CD_String),
        MTD_void_Object_int_MemorySegment_ValueLayout_long_int = MethodTypeDesc.of(CD_void, CD_Object, CD_int, CD_MemorySegment, CD_ValueLayout, CD_long, CD_int),
        MTD_void_Throwable                                     = MethodTypeDesc.of(CD_void, CD_Throwable),
        MTD_void_ValueLayout$OfByte_long_byte                  = MethodTypeDesc.of(CD_void, CD_ValueLayout$OfByte, CD_long, CD_byte),
        MTD_void_ValueLayout$OfInt_long_int                    = MethodTypeDesc.of(CD_void, CD_ValueLayout$OfInt, CD_long, CD_int),
        MTD_void_ValueLayout$OfShort_long_short                = MethodTypeDesc.of(CD_void, CD_ValueLayout$OfShort, CD_long, CD_short),
        MTD_void_ValueLayout$OfLong_long_long                  = MethodTypeDesc.of(CD_void, CD_ValueLayout$OfLong, CD_long, CD_long);

    static final MethodTypeDesc
        MTD_Boolean_valueOf = MethodTypeDesc.of(CD_Boolean, CD_boolean),
        MTD_Byte_valueOf    = MethodTypeDesc.of(CD_Byte, CD_byte),
        MTD_Short_valueOf   = MethodTypeDesc.of(CD_Short, CD_short),
        MTD_Integer_valueOf = MethodTypeDesc.of(CD_Integer, CD_int),
        MTD_Long_valueOf    = MethodTypeDesc.of(CD_Long, CD_long),
        MTD_Float_valueOf   = MethodTypeDesc.of(CD_Float, CD_float),
        MTD_Double_valueOf  = MethodTypeDesc.of(CD_Double, CD_double);

    static final DirectMethodHandleDesc
        DMHD_FFM_bootstrapDowncall                       = ofConstantBootstrap(CD_FFM, "bootstrapDowncall", CD_MethodHandle, CD_int),
        DMHD_StringConcatFactory_makeConcatWithConstants = ofMethod(
            DirectMethodHandleDesc.Kind.STATIC,
            StringConcatFactory.class.describeConstable().orElseThrow(),
            "makeConcatWithConstants",
            MethodTypeDesc.of(
                CD_CallSite,
                CD_MethodHandles_Lookup,
                CD_String,
                CD_MethodType,
                CD_String,
                CDA_Object
            )
        ),
        DMHD_GroupBinder_bootstrapRecord                 = ofMethod(
            DirectMethodHandleDesc.Kind.INTERFACE_STATIC,
            CD_GroupBinder,
            "bootstrapRecord",
            MethodTypeDesc.of(
                CD_Object,
                CD_MethodHandles_Lookup,
                CD_String,
                TypeDescriptor.class.describeConstable().orElseThrow(),
                CD_String,
                CDA_String
            )
        );

    static final DynamicCallSiteDesc DCSD_StringConcatFactory_makeConcatWithConstants_AddressToHexString = DynamicCallSiteDesc.of(
        DMHD_StringConcatFactory_makeConcatWithConstants,
        "makeConcatWithConstants",
        MTD_String_String,
        new String[] {"0x\u0001"}
    );

    private BCDescriptors() {
    }

}
