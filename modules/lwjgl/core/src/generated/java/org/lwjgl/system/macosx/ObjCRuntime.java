/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ObjCRuntime {

    private static final SharedLibrary OBJC = Library.loadNative(ObjCRuntime.class, "org.lwjgl", "objc");

    /** Contains the function pointers loaded from the objc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            object_copy                        = apiGetFunctionAddress(OBJC, "object_copy"),
            object_dispose                     = apiGetFunctionAddress(OBJC, "object_dispose"),
            object_getClass                    = apiGetFunctionAddress(OBJC, "object_getClass"),
            object_setClass                    = apiGetFunctionAddress(OBJC, "object_setClass"),
            object_getClassName                = apiGetFunctionAddress(OBJC, "object_getClassName"),
            object_getIndexedIvars             = apiGetFunctionAddress(OBJC, "object_getIndexedIvars"),
            object_getIvar                     = apiGetFunctionAddress(OBJC, "object_getIvar"),
            object_setIvar                     = apiGetFunctionAddress(OBJC, "object_setIvar"),
            object_setInstanceVariable         = apiGetFunctionAddress(OBJC, "object_setInstanceVariable"),
            object_getInstanceVariable         = apiGetFunctionAddress(OBJC, "object_getInstanceVariable"),
            objc_getClass                      = apiGetFunctionAddress(OBJC, "objc_getClass"),
            objc_getMetaClass                  = apiGetFunctionAddress(OBJC, "objc_getMetaClass"),
            objc_lookUpClass                   = apiGetFunctionAddress(OBJC, "objc_lookUpClass"),
            objc_getRequiredClass              = apiGetFunctionAddress(OBJC, "objc_getRequiredClass"),
            objc_getClassList                  = apiGetFunctionAddress(OBJC, "objc_getClassList"),
            objc_copyClassList                 = apiGetFunctionAddress(OBJC, "objc_copyClassList"),
            class_getName                      = apiGetFunctionAddress(OBJC, "class_getName"),
            class_isMetaClass                  = apiGetFunctionAddress(OBJC, "class_isMetaClass"),
            class_getSuperclass                = apiGetFunctionAddress(OBJC, "class_getSuperclass"),
            class_getVersion                   = apiGetFunctionAddress(OBJC, "class_getVersion"),
            class_setVersion                   = apiGetFunctionAddress(OBJC, "class_setVersion"),
            class_getInstanceSize              = apiGetFunctionAddress(OBJC, "class_getInstanceSize"),
            class_getInstanceVariable          = apiGetFunctionAddress(OBJC, "class_getInstanceVariable"),
            class_getClassVariable             = apiGetFunctionAddress(OBJC, "class_getClassVariable"),
            class_copyIvarList                 = apiGetFunctionAddress(OBJC, "class_copyIvarList"),
            class_getInstanceMethod            = apiGetFunctionAddress(OBJC, "class_getInstanceMethod"),
            class_getClassMethod               = apiGetFunctionAddress(OBJC, "class_getClassMethod"),
            class_getMethodImplementation      = apiGetFunctionAddress(OBJC, "class_getMethodImplementation"),
            class_respondsToSelector           = apiGetFunctionAddress(OBJC, "class_respondsToSelector"),
            class_copyMethodList               = apiGetFunctionAddress(OBJC, "class_copyMethodList"),
            class_conformsToProtocol           = apiGetFunctionAddress(OBJC, "class_conformsToProtocol"),
            class_copyProtocolList             = apiGetFunctionAddress(OBJC, "class_copyProtocolList"),
            class_getProperty                  = apiGetFunctionAddress(OBJC, "class_getProperty"),
            class_copyPropertyList             = apiGetFunctionAddress(OBJC, "class_copyPropertyList"),
            class_getIvarLayout                = apiGetFunctionAddress(OBJC, "class_getIvarLayout"),
            class_getWeakIvarLayout            = apiGetFunctionAddress(OBJC, "class_getWeakIvarLayout"),
            class_addMethod                    = apiGetFunctionAddress(OBJC, "class_addMethod"),
            class_replaceMethod                = apiGetFunctionAddress(OBJC, "class_replaceMethod"),
            class_addIvar                      = apiGetFunctionAddress(OBJC, "class_addIvar"),
            class_addProtocol                  = apiGetFunctionAddress(OBJC, "class_addProtocol"),
            class_addProperty                  = apiGetFunctionAddress(OBJC, "class_addProperty"),
            class_replaceProperty              = apiGetFunctionAddress(OBJC, "class_replaceProperty"),
            class_setIvarLayout                = apiGetFunctionAddress(OBJC, "class_setIvarLayout"),
            class_setWeakIvarLayout            = apiGetFunctionAddress(OBJC, "class_setWeakIvarLayout"),
            class_createInstance               = apiGetFunctionAddress(OBJC, "class_createInstance"),
            objc_constructInstance             = apiGetFunctionAddress(OBJC, "objc_constructInstance"),
            objc_destructInstance              = apiGetFunctionAddress(OBJC, "objc_destructInstance"),
            objc_allocateClassPair             = apiGetFunctionAddress(OBJC, "objc_allocateClassPair"),
            objc_registerClassPair             = apiGetFunctionAddress(OBJC, "objc_registerClassPair"),
            objc_disposeClassPair              = apiGetFunctionAddress(OBJC, "objc_disposeClassPair"),
            method_getName                     = apiGetFunctionAddress(OBJC, "method_getName"),
            method_getImplementation           = apiGetFunctionAddress(OBJC, "method_getImplementation"),
            method_getTypeEncoding             = apiGetFunctionAddress(OBJC, "method_getTypeEncoding"),
            method_getNumberOfArguments        = apiGetFunctionAddress(OBJC, "method_getNumberOfArguments"),
            method_copyReturnType              = apiGetFunctionAddress(OBJC, "method_copyReturnType"),
            method_copyArgumentType            = apiGetFunctionAddress(OBJC, "method_copyArgumentType"),
            method_getReturnType               = apiGetFunctionAddress(OBJC, "method_getReturnType"),
            method_getArgumentType             = apiGetFunctionAddress(OBJC, "method_getArgumentType"),
            method_setImplementation           = apiGetFunctionAddress(OBJC, "method_setImplementation"),
            method_exchangeImplementations     = apiGetFunctionAddress(OBJC, "method_exchangeImplementations"),
            ivar_getName                       = apiGetFunctionAddress(OBJC, "ivar_getName"),
            ivar_getTypeEncoding               = apiGetFunctionAddress(OBJC, "ivar_getTypeEncoding"),
            ivar_getOffset                     = apiGetFunctionAddress(OBJC, "ivar_getOffset"),
            property_getName                   = apiGetFunctionAddress(OBJC, "property_getName"),
            property_getAttributes             = apiGetFunctionAddress(OBJC, "property_getAttributes"),
            property_copyAttributeList         = apiGetFunctionAddress(OBJC, "property_copyAttributeList"),
            property_copyAttributeValue        = apiGetFunctionAddress(OBJC, "property_copyAttributeValue"),
            objc_getProtocol                   = apiGetFunctionAddress(OBJC, "objc_getProtocol"),
            objc_copyProtocolList              = apiGetFunctionAddress(OBJC, "objc_copyProtocolList"),
            protocol_conformsToProtocol        = apiGetFunctionAddress(OBJC, "protocol_conformsToProtocol"),
            protocol_isEqual                   = apiGetFunctionAddress(OBJC, "protocol_isEqual"),
            protocol_getName                   = apiGetFunctionAddress(OBJC, "protocol_getName"),
            protocol_getMethodDescription      = apiGetFunctionAddress(OBJC, "protocol_getMethodDescription"),
            protocol_copyMethodDescriptionList = apiGetFunctionAddress(OBJC, "protocol_copyMethodDescriptionList"),
            protocol_getProperty               = apiGetFunctionAddress(OBJC, "protocol_getProperty"),
            protocol_copyPropertyList          = apiGetFunctionAddress(OBJC, "protocol_copyPropertyList"),
            protocol_copyProtocolList          = apiGetFunctionAddress(OBJC, "protocol_copyProtocolList"),
            objc_allocateProtocol              = apiGetFunctionAddress(OBJC, "objc_allocateProtocol"),
            objc_registerProtocol              = apiGetFunctionAddress(OBJC, "objc_registerProtocol"),
            protocol_addMethodDescription      = apiGetFunctionAddress(OBJC, "protocol_addMethodDescription"),
            protocol_addProtocol               = apiGetFunctionAddress(OBJC, "protocol_addProtocol"),
            protocol_addProperty               = apiGetFunctionAddress(OBJC, "protocol_addProperty"),
            objc_copyImageNames                = apiGetFunctionAddress(OBJC, "objc_copyImageNames"),
            class_getImageName                 = apiGetFunctionAddress(OBJC, "class_getImageName"),
            objc_copyClassNamesForImage        = apiGetFunctionAddress(OBJC, "objc_copyClassNamesForImage"),
            sel_getName                        = apiGetFunctionAddress(OBJC, "sel_getName"),
            sel_getUid                         = apiGetFunctionAddress(OBJC, "sel_getUid"),
            sel_registerName                   = apiGetFunctionAddress(OBJC, "sel_registerName"),
            sel_isEqual                        = apiGetFunctionAddress(OBJC, "sel_isEqual"),
            objc_enumerationMutation           = apiGetFunctionAddress(OBJC, "objc_enumerationMutation"),
            objc_setEnumerationMutationHandler = apiGetFunctionAddress(OBJC, "objc_setEnumerationMutationHandler"),
            imp_implementationWithBlock        = apiGetFunctionAddress(OBJC, "imp_implementationWithBlock"),
            imp_getBlock                       = apiGetFunctionAddress(OBJC, "imp_getBlock"),
            imp_removeBlock                    = apiGetFunctionAddress(OBJC, "imp_removeBlock"),
            objc_loadWeak                      = apiGetFunctionAddress(OBJC, "objc_loadWeak"),
            objc_storeWeak                     = apiGetFunctionAddress(OBJC, "objc_storeWeak"),
            objc_setAssociatedObject           = apiGetFunctionAddress(OBJC, "objc_setAssociatedObject"),
            objc_getAssociatedObject           = apiGetFunctionAddress(OBJC, "objc_getAssociatedObject"),
            objc_removeAssociatedObjects       = apiGetFunctionAddress(OBJC, "objc_removeAssociatedObjects");

    }

    /** Returns the objc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return OBJC;
    }

    public static final long nil = 0x0L;

    public static final byte
        YES = 1,
        NO  = 0;

    public static final char
        _C_ID       = '@',
        _C_CLASS    = '#',
        _C_SEL      = ':',
        _C_CHR      = 'c',
        _C_UCHR     = 'C',
        _C_SHT      = 's',
        _C_USHT     = 'S',
        _C_INT      = 'i',
        _C_UINT     = 'I',
        _C_LNG      = 'l',
        _C_ULNG     = 'L',
        _C_LNG_LNG  = 'q',
        _C_ULNG_LNG = 'Q',
        _C_FLT      = 'f',
        _C_DBL      = 'd',
        _C_BFLD     = 'b',
        _C_BOOL     = 'B',
        _C_VOID     = 'v',
        _C_UNDEF    = '?',
        _C_PTR      = '^',
        _C_CHARPTR  = '*',
        _C_ATOM     = '%',
        _C_ARY_B    = '[',
        _C_ARY_E    = ']',
        _C_UNION_B  = '(',
        _C_UNION_E  = ')',
        _C_STRUCT_B = '{',
        _C_STRUCT_E = '}',
        _C_VECTOR   = '!',
        _C_CONST    = 'r';

    public static final int
        OBJC_ASSOCIATION_ASSIGN           = 0,
        OBJC_ASSOCIATION_RETAIN_NONATOMIC = 1,
        OBJC_ASSOCIATION_COPY_NONATOMIC   = 3,
        OBJC_ASSOCIATION_RETAIN           = 1401,
        OBJC_ASSOCIATION_COPY             = 1403;

    protected ObjCRuntime() {
        throw new UnsupportedOperationException();
    }

    // --- [ object_copy ] ---

    /** {@code id object_copy(id obj, size_t size)} */
    @NativeType("id")
    public static long object_copy(@NativeType("id") long obj, @NativeType("size_t") long size) {
        long __functionAddress = Functions.object_copy;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, size, __functionAddress);
    }

    // --- [ object_dispose ] ---

    /** {@code id object_dispose(id obj)} */
    @NativeType("id")
    public static long object_dispose(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_dispose;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ object_getClass ] ---

    /** {@code Class object_getClass(id obj)} */
    @NativeType("Class")
    public static long object_getClass(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_getClass;
        return invokePP(obj, __functionAddress);
    }

    // --- [ object_setClass ] ---

    /** {@code Class object_setClass(id obj, Class cls)} */
    @NativeType("Class")
    public static long object_setClass(@NativeType("id") long obj, @NativeType("Class") long cls) {
        long __functionAddress = Functions.object_setClass;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(obj, cls, __functionAddress);
    }

    // --- [ object_getClassName ] ---

    /** {@code char const * object_getClassName(id obj)} */
    public static long nobject_getClassName(long obj) {
        long __functionAddress = Functions.object_getClassName;
        return invokePP(obj, __functionAddress);
    }

    /** {@code char const * object_getClassName(id obj)} */
    @NativeType("char const *")
    public static @Nullable String object_getClassName(@NativeType("id") long obj) {
        long __result = nobject_getClassName(obj);
        return memUTF8Safe(__result);
    }

    // --- [ object_getIndexedIvars ] ---

    /** {@code void * object_getIndexedIvars(id obj)} */
    @NativeType("void *")
    public static long object_getIndexedIvars(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_getIndexedIvars;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ object_getIvar ] ---

    /** {@code id object_getIvar(id obj, Ivar ivar)} */
    @NativeType("id")
    public static long object_getIvar(@NativeType("id") long obj, @NativeType("Ivar") long ivar) {
        long __functionAddress = Functions.object_getIvar;
        if (CHECKS) {
            check(ivar);
        }
        return invokePPP(obj, ivar, __functionAddress);
    }

    // --- [ object_setIvar ] ---

    /** {@code void object_setIvar(id obj, Ivar ivar, id value)} */
    public static void object_setIvar(@NativeType("id") long obj, @NativeType("Ivar") long ivar, @NativeType("id") long value) {
        long __functionAddress = Functions.object_setIvar;
        if (CHECKS) {
            check(obj);
            check(ivar);
            check(value);
        }
        invokePPPV(obj, ivar, value, __functionAddress);
    }

    // --- [ object_setInstanceVariable ] ---

    /** {@code Ivar object_setInstanceVariable(id obj, char const * name, void * value)} */
    public static long nobject_setInstanceVariable(long obj, long name, long value) {
        long __functionAddress = Functions.object_setInstanceVariable;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPP(obj, name, value, __functionAddress);
    }

    /** {@code Ivar object_setInstanceVariable(id obj, char const * name, void * value)} */
    @NativeType("Ivar")
    public static long object_setInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") ByteBuffer name, @NativeType("void *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobject_setInstanceVariable(obj, memAddress(name), memAddress(value));
    }

    /** {@code Ivar object_setInstanceVariable(id obj, char const * name, void * value)} */
    @NativeType("Ivar")
    public static long object_setInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") CharSequence name, @NativeType("void *") ByteBuffer value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobject_setInstanceVariable(obj, nameEncoded, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ object_getInstanceVariable ] ---

    /** {@code Ivar object_getInstanceVariable(id obj, char const * name, void ** outValue)} */
    public static long nobject_getInstanceVariable(long obj, long name, long outValue) {
        long __functionAddress = Functions.object_getInstanceVariable;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPP(obj, name, outValue, __functionAddress);
    }

    /** {@code Ivar object_getInstanceVariable(id obj, char const * name, void ** outValue)} */
    @NativeType("Ivar")
    public static long object_getInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") ByteBuffer name, @NativeType("void **") PointerBuffer outValue) {
        if (CHECKS) {
            checkNT1(name);
            check(outValue, 1);
        }
        return nobject_getInstanceVariable(obj, memAddress(name), memAddress(outValue));
    }

    /** {@code Ivar object_getInstanceVariable(id obj, char const * name, void ** outValue)} */
    @NativeType("Ivar")
    public static long object_getInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") CharSequence name, @NativeType("void **") PointerBuffer outValue) {
        if (CHECKS) {
            check(outValue, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobject_getInstanceVariable(obj, nameEncoded, memAddress(outValue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_getClass ] ---

    /** {@code Class objc_getClass(char const * name)} */
    public static long nobjc_getClass(long name) {
        long __functionAddress = Functions.objc_getClass;
        return invokePP(name, __functionAddress);
    }

    /** {@code Class objc_getClass(char const * name)} */
    @NativeType("Class")
    public static long objc_getClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getClass(memAddress(name));
    }

    /** {@code Class objc_getClass(char const * name)} */
    @NativeType("Class")
    public static long objc_getClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_getClass(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_getMetaClass ] ---

    /** {@code Class objc_getMetaClass(char const * name)} */
    public static long nobjc_getMetaClass(long name) {
        long __functionAddress = Functions.objc_getMetaClass;
        return invokePP(name, __functionAddress);
    }

    /** {@code Class objc_getMetaClass(char const * name)} */
    @NativeType("Class")
    public static long objc_getMetaClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getMetaClass(memAddress(name));
    }

    /** {@code Class objc_getMetaClass(char const * name)} */
    @NativeType("Class")
    public static long objc_getMetaClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_getMetaClass(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_lookUpClass ] ---

    /** {@code Class objc_lookUpClass(char const * name)} */
    public static long nobjc_lookUpClass(long name) {
        long __functionAddress = Functions.objc_lookUpClass;
        return invokePP(name, __functionAddress);
    }

    /** {@code Class objc_lookUpClass(char const * name)} */
    @NativeType("Class")
    public static long objc_lookUpClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_lookUpClass(memAddress(name));
    }

    /** {@code Class objc_lookUpClass(char const * name)} */
    @NativeType("Class")
    public static long objc_lookUpClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_lookUpClass(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_getRequiredClass ] ---

    /** {@code Class objc_getRequiredClass(char const * name)} */
    public static long nobjc_getRequiredClass(long name) {
        long __functionAddress = Functions.objc_getRequiredClass;
        return invokePP(name, __functionAddress);
    }

    /** {@code Class objc_getRequiredClass(char const * name)} */
    @NativeType("Class")
    public static long objc_getRequiredClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getRequiredClass(memAddress(name));
    }

    /** {@code Class objc_getRequiredClass(char const * name)} */
    @NativeType("Class")
    public static long objc_getRequiredClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_getRequiredClass(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_getClassList ] ---

    /** {@code int objc_getClassList(Class * buffer, int bufferCount)} */
    public static int nobjc_getClassList(long buffer, int bufferCount) {
        long __functionAddress = Functions.objc_getClassList;
        return invokePI(buffer, bufferCount, __functionAddress);
    }

    /** {@code int objc_getClassList(Class * buffer, int bufferCount)} */
    public static int objc_getClassList(@NativeType("Class *") @Nullable PointerBuffer buffer) {
        return nobjc_getClassList(memAddressSafe(buffer), remainingSafe(buffer));
    }

    // --- [ objc_copyClassList ] ---

    /** {@code Class * objc_copyClassList(unsigned int * outCount)} */
    public static long nobjc_copyClassList(long outCount) {
        long __functionAddress = Functions.objc_copyClassList;
        return invokePP(outCount, __functionAddress);
    }

    /** {@code Class * objc_copyClassList(unsigned int * outCount)} */
    @NativeType("Class *")
    public static @Nullable PointerBuffer objc_copyClassList() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyClassList(memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_getName ] ---

    /** {@code char const * class_getName(Class cls)} */
    public static long nclass_getName(long cls) {
        long __functionAddress = Functions.class_getName;
        return invokePP(cls, __functionAddress);
    }

    /** {@code char const * class_getName(Class cls)} */
    @NativeType("char const *")
    public static @Nullable String class_getName(@NativeType("Class") long cls) {
        long __result = nclass_getName(cls);
        return memUTF8Safe(__result);
    }

    // --- [ class_isMetaClass ] ---

    /** {@code BOOL class_isMetaClass(Class cls)} */
    @NativeType("BOOL")
    public static boolean class_isMetaClass(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_isMetaClass;
        return invokePZ(cls, __functionAddress);
    }

    // --- [ class_getSuperclass ] ---

    /** {@code Class class_getSuperclass(Class cls)} */
    @NativeType("Class")
    public static long class_getSuperclass(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getSuperclass;
        return invokePP(cls, __functionAddress);
    }

    // --- [ class_getVersion ] ---

    /** {@code int class_getVersion(Class cls)} */
    public static int class_getVersion(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getVersion;
        if (CHECKS) {
            check(cls);
        }
        return invokePI(cls, __functionAddress);
    }

    // --- [ class_setVersion ] ---

    /** {@code void class_setVersion(Class cls, int version)} */
    public static void class_setVersion(@NativeType("Class") long cls, int version) {
        long __functionAddress = Functions.class_setVersion;
        if (CHECKS) {
            check(cls);
        }
        invokePV(cls, version, __functionAddress);
    }

    // --- [ class_getInstanceSize ] ---

    /** {@code size_t class_getInstanceSize(Class cls)} */
    @NativeType("size_t")
    public static long class_getInstanceSize(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getInstanceSize;
        return invokePP(cls, __functionAddress);
    }

    // --- [ class_getInstanceVariable ] ---

    /** {@code Ivar class_getInstanceVariable(Class cls, char const * name)} */
    public static long nclass_getInstanceVariable(long cls, long name) {
        long __functionAddress = Functions.class_getInstanceVariable;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    /** {@code Ivar class_getInstanceVariable(Class cls, char const * name)} */
    @NativeType("Ivar")
    public static long class_getInstanceVariable(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_getInstanceVariable(cls, memAddress(name));
    }

    /** {@code Ivar class_getInstanceVariable(Class cls, char const * name)} */
    @NativeType("Ivar")
    public static long class_getInstanceVariable(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nclass_getInstanceVariable(cls, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_getClassVariable ] ---

    /** {@code Ivar class_getClassVariable(Class cls, char const * name)} */
    public static long nclass_getClassVariable(long cls, long name) {
        long __functionAddress = Functions.class_getClassVariable;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    /** {@code Ivar class_getClassVariable(Class cls, char const * name)} */
    @NativeType("Ivar")
    public static long class_getClassVariable(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_getClassVariable(cls, memAddress(name));
    }

    /** {@code Ivar class_getClassVariable(Class cls, char const * name)} */
    @NativeType("Ivar")
    public static long class_getClassVariable(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nclass_getClassVariable(cls, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_copyIvarList ] ---

    /** {@code Ivar * class_copyIvarList(Class cls, unsigned int * outCount)} */
    public static long nclass_copyIvarList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyIvarList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /** {@code Ivar * class_copyIvarList(Class cls, unsigned int * outCount)} */
    @NativeType("Ivar *")
    public static @Nullable PointerBuffer class_copyIvarList(@NativeType("Class") long cls) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyIvarList(cls, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_getInstanceMethod ] ---

    /** {@code Method class_getInstanceMethod(Class cls, SEL name)} */
    @NativeType("Method")
    public static long class_getInstanceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getInstanceMethod;
        if (CHECKS) {
            check(cls);
            check(name);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    // --- [ class_getClassMethod ] ---

    /** {@code Method class_getClassMethod(Class cls, SEL name)} */
    @NativeType("Method")
    public static long class_getClassMethod(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getClassMethod;
        if (CHECKS) {
            check(cls);
            check(name);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    // --- [ class_getMethodImplementation ] ---

    /** {@code IMP class_getMethodImplementation(Class cls, SEL name)} */
    @NativeType("IMP")
    public static long class_getMethodImplementation(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getMethodImplementation;
        if (CHECKS) {
            check(name);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    // --- [ class_respondsToSelector ] ---

    /** {@code BOOL class_respondsToSelector(Class cls, SEL name)} */
    @NativeType("BOOL")
    public static boolean class_respondsToSelector(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_respondsToSelector;
        if (CHECKS) {
            check(cls);
            check(name);
        }
        return invokePPZ(cls, name, __functionAddress);
    }

    // --- [ class_copyMethodList ] ---

    /** {@code Method * class_copyMethodList(Class cls, unsigned int * outCount)} */
    public static long nclass_copyMethodList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyMethodList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /** {@code Method * class_copyMethodList(Class cls, unsigned int * outCount)} */
    @NativeType("Method *")
    public static @Nullable PointerBuffer class_copyMethodList(@NativeType("Class") long cls) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyMethodList(cls, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_conformsToProtocol ] ---

    /** {@code BOOL class_conformsToProtocol(Class cls, Protocol * protocol)} */
    @NativeType("BOOL")
    public static boolean class_conformsToProtocol(@NativeType("Class") long cls, @NativeType("Protocol *") long protocol) {
        long __functionAddress = Functions.class_conformsToProtocol;
        if (CHECKS) {
            check(cls);
            check(protocol);
        }
        return invokePPZ(cls, protocol, __functionAddress);
    }

    // --- [ class_copyProtocolList ] ---

    /** {@code Protocol ** class_copyProtocolList(Class cls, unsigned int * outCount)} */
    public static long nclass_copyProtocolList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyProtocolList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /** {@code Protocol ** class_copyProtocolList(Class cls, unsigned int * outCount)} */
    @NativeType("Protocol **")
    public static @Nullable PointerBuffer class_copyProtocolList(@NativeType("Class") long cls) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyProtocolList(cls, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_getProperty ] ---

    /** {@code objc_property_t class_getProperty(Class cls, char const * name)} */
    public static long nclass_getProperty(long cls, long name) {
        long __functionAddress = Functions.class_getProperty;
        return invokePPP(cls, name, __functionAddress);
    }

    /** {@code objc_property_t class_getProperty(Class cls, char const * name)} */
    @NativeType("objc_property_t")
    public static long class_getProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_getProperty(cls, memAddress(name));
    }

    /** {@code objc_property_t class_getProperty(Class cls, char const * name)} */
    @NativeType("objc_property_t")
    public static long class_getProperty(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nclass_getProperty(cls, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_copyPropertyList ] ---

    /** {@code objc_property_t * class_copyPropertyList(Class cls, unsigned int * outCount)} */
    public static long nclass_copyPropertyList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyPropertyList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /** {@code objc_property_t * class_copyPropertyList(Class cls, unsigned int * outCount)} */
    @NativeType("objc_property_t *")
    public static @Nullable PointerBuffer class_copyPropertyList(@NativeType("Class") long cls) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyPropertyList(cls, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_getIvarLayout ] ---

    /** {@code uint8_t const * class_getIvarLayout(Class cls)} */
    public static long nclass_getIvarLayout(long cls) {
        long __functionAddress = Functions.class_getIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        return invokePP(cls, __functionAddress);
    }

    /** {@code uint8_t const * class_getIvarLayout(Class cls)} */
    @NativeType("uint8_t const *")
    public static @Nullable String class_getIvarLayout(@NativeType("Class") long cls) {
        long __result = nclass_getIvarLayout(cls);
        return memASCIISafe(__result);
    }

    // --- [ class_getWeakIvarLayout ] ---

    /** {@code uint8_t const * class_getWeakIvarLayout(Class cls)} */
    public static long nclass_getWeakIvarLayout(long cls) {
        long __functionAddress = Functions.class_getWeakIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        return invokePP(cls, __functionAddress);
    }

    /** {@code uint8_t const * class_getWeakIvarLayout(Class cls)} */
    @NativeType("uint8_t const *")
    public static @Nullable String class_getWeakIvarLayout(@NativeType("Class") long cls) {
        long __result = nclass_getWeakIvarLayout(cls);
        return memASCIISafe(__result);
    }

    // --- [ class_addMethod ] ---

    /** {@code BOOL class_addMethod(Class cls, SEL name, IMP imp, char const * types)} */
    public static boolean nclass_addMethod(long cls, long name, long imp, long types) {
        long __functionAddress = Functions.class_addMethod;
        if (CHECKS) {
            check(cls);
            check(name);
            check(imp);
        }
        return invokePPPPZ(cls, name, imp, types, __functionAddress);
    }

    /** {@code BOOL class_addMethod(Class cls, SEL name, IMP imp, char const * types)} */
    @NativeType("BOOL")
    public static boolean class_addMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") ByteBuffer types) {
        if (CHECKS) {
            checkNT1(types);
        }
        return nclass_addMethod(cls, name, imp, memAddress(types));
    }

    /** {@code BOOL class_addMethod(Class cls, SEL name, IMP imp, char const * types)} */
    @NativeType("BOOL")
    public static boolean class_addMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") CharSequence types) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            return nclass_addMethod(cls, name, imp, typesEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_replaceMethod ] ---

    /** {@code IMP class_replaceMethod(Class cls, SEL name, IMP imp, char const * types)} */
    public static long nclass_replaceMethod(long cls, long name, long imp, long types) {
        long __functionAddress = Functions.class_replaceMethod;
        if (CHECKS) {
            check(cls);
            check(name);
            check(imp);
        }
        return invokePPPPP(cls, name, imp, types, __functionAddress);
    }

    /** {@code IMP class_replaceMethod(Class cls, SEL name, IMP imp, char const * types)} */
    @NativeType("IMP")
    public static long class_replaceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") ByteBuffer types) {
        if (CHECKS) {
            checkNT1(types);
        }
        return nclass_replaceMethod(cls, name, imp, memAddress(types));
    }

    /** {@code IMP class_replaceMethod(Class cls, SEL name, IMP imp, char const * types)} */
    @NativeType("IMP")
    public static long class_replaceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") CharSequence types) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            return nclass_replaceMethod(cls, name, imp, typesEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_addIvar ] ---

    /** {@code BOOL class_addIvar(Class cls, char const * name, size_t size, uint8_t alignment, char const * types)} */
    public static boolean nclass_addIvar(long cls, long name, long size, byte alignment, long types) {
        long __functionAddress = Functions.class_addIvar;
        if (CHECKS) {
            check(cls);
        }
        return invokePPPUPZ(cls, name, size, alignment, types, __functionAddress);
    }

    /** {@code BOOL class_addIvar(Class cls, char const * name, size_t size, uint8_t alignment, char const * types)} */
    @NativeType("BOOL")
    public static boolean class_addIvar(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("size_t") long size, @NativeType("uint8_t") byte alignment, @NativeType("char const *") ByteBuffer types) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(types);
        }
        return nclass_addIvar(cls, memAddress(name), size, alignment, memAddress(types));
    }

    /** {@code BOOL class_addIvar(Class cls, char const * name, size_t size, uint8_t alignment, char const * types)} */
    @NativeType("BOOL")
    public static boolean class_addIvar(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name, @NativeType("size_t") long size, @NativeType("uint8_t") byte alignment, @NativeType("char const *") CharSequence types) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            return nclass_addIvar(cls, nameEncoded, size, alignment, typesEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_addProtocol ] ---

    /** {@code BOOL class_addProtocol(Class cls, Protocol * protocol)} */
    @NativeType("BOOL")
    public static boolean class_addProtocol(@NativeType("Class") long cls, @NativeType("Protocol *") long protocol) {
        long __functionAddress = Functions.class_addProtocol;
        if (CHECKS) {
            check(cls);
            check(protocol);
        }
        return invokePPZ(cls, protocol, __functionAddress);
    }

    // --- [ class_addProperty ] ---

    /** {@code BOOL class_addProperty(Class cls, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount)} */
    public static boolean nclass_addProperty(long cls, long name, long attributes, int attributeCount) {
        long __functionAddress = Functions.class_addProperty;
        if (CHECKS) {
            check(cls);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        return invokePPPZ(cls, name, attributes, attributeCount, __functionAddress);
    }

    /** {@code BOOL class_addProperty(Class cls, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount)} */
    @NativeType("BOOL")
    public static boolean class_addProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_addProperty(cls, memAddress(name), attributes.address(), attributes.remaining());
    }

    /** {@code BOOL class_addProperty(Class cls, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount)} */
    @NativeType("BOOL")
    public static boolean class_addProperty(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nclass_addProperty(cls, nameEncoded, attributes.address(), attributes.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_replaceProperty ] ---

    /** {@code void class_replaceProperty(Class cls, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount)} */
    public static void nclass_replaceProperty(long cls, long name, long attributes, int attributeCount) {
        long __functionAddress = Functions.class_replaceProperty;
        if (CHECKS) {
            check(cls);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        invokePPPV(cls, name, attributes, attributeCount, __functionAddress);
    }

    /** {@code void class_replaceProperty(Class cls, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount)} */
    public static void class_replaceProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        if (CHECKS) {
            checkNT1(name);
        }
        nclass_replaceProperty(cls, memAddress(name), attributes.address(), attributes.remaining());
    }

    /** {@code void class_replaceProperty(Class cls, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount)} */
    public static void class_replaceProperty(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nclass_replaceProperty(cls, nameEncoded, attributes.address(), attributes.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_setIvarLayout ] ---

    /** {@code void class_setIvarLayout(Class cls, uint8_t const * layout)} */
    public static void nclass_setIvarLayout(long cls, long layout) {
        long __functionAddress = Functions.class_setIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        invokePPV(cls, layout, __functionAddress);
    }

    /** {@code void class_setIvarLayout(Class cls, uint8_t const * layout)} */
    public static void class_setIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") ByteBuffer layout) {
        if (CHECKS) {
            checkNT1(layout);
        }
        nclass_setIvarLayout(cls, memAddress(layout));
    }

    /** {@code void class_setIvarLayout(Class cls, uint8_t const * layout)} */
    public static void class_setIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") CharSequence layout) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(layout, true);
            long layoutEncoded = stack.getPointerAddress();
            nclass_setIvarLayout(cls, layoutEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_setWeakIvarLayout ] ---

    /** {@code void class_setWeakIvarLayout(Class cls, uint8_t const * layout)} */
    public static void nclass_setWeakIvarLayout(long cls, long layout) {
        long __functionAddress = Functions.class_setWeakIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        invokePPV(cls, layout, __functionAddress);
    }

    /** {@code void class_setWeakIvarLayout(Class cls, uint8_t const * layout)} */
    public static void class_setWeakIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") ByteBuffer layout) {
        if (CHECKS) {
            checkNT1(layout);
        }
        nclass_setWeakIvarLayout(cls, memAddress(layout));
    }

    /** {@code void class_setWeakIvarLayout(Class cls, uint8_t const * layout)} */
    public static void class_setWeakIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") CharSequence layout) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(layout, true);
            long layoutEncoded = stack.getPointerAddress();
            nclass_setWeakIvarLayout(cls, layoutEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_createInstance ] ---

    /** {@code id class_createInstance(Class cls, size_t extraBytes)} */
    @NativeType("id")
    public static long class_createInstance(@NativeType("Class") long cls, @NativeType("size_t") long extraBytes) {
        long __functionAddress = Functions.class_createInstance;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(cls, extraBytes, __functionAddress);
    }

    // --- [ objc_constructInstance ] ---

    /** {@code id objc_constructInstance(Class cls, void * bytes)} */
    public static long nobjc_constructInstance(long cls, long bytes) {
        long __functionAddress = Functions.objc_constructInstance;
        return invokePPP(cls, bytes, __functionAddress);
    }

    /** {@code id objc_constructInstance(Class cls, void * bytes)} */
    @NativeType("id")
    public static long objc_constructInstance(@NativeType("Class") long cls, @NativeType("void *") @Nullable ByteBuffer bytes) {
        if (CHECKS) {
            if (DEBUG) {
                checkSafe(bytes, class_getInstanceSize(cls));
            }
        }
        return nobjc_constructInstance(cls, memAddressSafe(bytes));
    }

    // --- [ objc_destructInstance ] ---

    /** {@code void * objc_destructInstance(id obj)} */
    @NativeType("void *")
    public static long objc_destructInstance(@NativeType("id") long obj) {
        long __functionAddress = Functions.objc_destructInstance;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ objc_allocateClassPair ] ---

    /** {@code Class objc_allocateClassPair(Class superclass, char const * name, size_t extraBytes)} */
    public static long nobjc_allocateClassPair(long superclass, long name, long extraBytes) {
        long __functionAddress = Functions.objc_allocateClassPair;
        return invokePPPP(superclass, name, extraBytes, __functionAddress);
    }

    /** {@code Class objc_allocateClassPair(Class superclass, char const * name, size_t extraBytes)} */
    @NativeType("Class")
    public static long objc_allocateClassPair(@NativeType("Class") long superclass, @NativeType("char const *") ByteBuffer name, @NativeType("size_t") long extraBytes) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_allocateClassPair(superclass, memAddress(name), extraBytes);
    }

    /** {@code Class objc_allocateClassPair(Class superclass, char const * name, size_t extraBytes)} */
    @NativeType("Class")
    public static long objc_allocateClassPair(@NativeType("Class") long superclass, @NativeType("char const *") CharSequence name, @NativeType("size_t") long extraBytes) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_allocateClassPair(superclass, nameEncoded, extraBytes);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_registerClassPair ] ---

    /** {@code void objc_registerClassPair(Class cls)} */
    public static void objc_registerClassPair(@NativeType("Class") long cls) {
        long __functionAddress = Functions.objc_registerClassPair;
        if (CHECKS) {
            check(cls);
        }
        invokePV(cls, __functionAddress);
    }

    // --- [ objc_disposeClassPair ] ---

    /** {@code void objc_disposeClassPair(Class cls)} */
    public static void objc_disposeClassPair(@NativeType("Class") long cls) {
        long __functionAddress = Functions.objc_disposeClassPair;
        if (CHECKS) {
            check(cls);
        }
        invokePV(cls, __functionAddress);
    }

    // --- [ method_getName ] ---

    /** {@code SEL method_getName(Method m)} */
    @NativeType("SEL")
    public static long method_getName(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getName;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    // --- [ method_getImplementation ] ---

    /** {@code IMP method_getImplementation(Method m)} */
    @NativeType("IMP")
    public static long method_getImplementation(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getImplementation;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    // --- [ method_getTypeEncoding ] ---

    /** {@code char const * method_getTypeEncoding(Method m)} */
    public static long nmethod_getTypeEncoding(long m) {
        long __functionAddress = Functions.method_getTypeEncoding;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    /** {@code char const * method_getTypeEncoding(Method m)} */
    @NativeType("char const *")
    public static @Nullable String method_getTypeEncoding(@NativeType("Method") long m) {
        long __result = nmethod_getTypeEncoding(m);
        return memUTF8Safe(__result);
    }

    // --- [ method_getNumberOfArguments ] ---

    /** {@code unsigned int method_getNumberOfArguments(Method m)} */
    @NativeType("unsigned int")
    public static int method_getNumberOfArguments(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getNumberOfArguments;
        if (CHECKS) {
            check(m);
        }
        return invokePI(m, __functionAddress);
    }

    // --- [ method_copyReturnType ] ---

    /** {@code char * method_copyReturnType(Method m)} */
    public static long nmethod_copyReturnType(long m) {
        long __functionAddress = Functions.method_copyReturnType;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    /** {@code char * method_copyReturnType(Method m)} */
    @NativeType("char *")
    public static @Nullable String method_copyReturnType(@NativeType("Method") long m) {
        long __result = nmethod_copyReturnType(m);
        return memUTF8Safe(__result);
    }

    // --- [ method_copyArgumentType ] ---

    /** {@code char * method_copyArgumentType(Method m, unsigned int index)} */
    public static long nmethod_copyArgumentType(long m, int index) {
        long __functionAddress = Functions.method_copyArgumentType;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, index, __functionAddress);
    }

    /** {@code char * method_copyArgumentType(Method m, unsigned int index)} */
    @NativeType("char *")
    public static @Nullable String method_copyArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index) {
        long __result = NULL;
        try {
            __result = nmethod_copyArgumentType(m, index);
            return memUTF8Safe(__result);
        } finally {
            if (__result != NULL) org.lwjgl.system.libc.LibCStdlib.nfree(__result);
        }
    }

    // --- [ method_getReturnType ] ---

    /** {@code void method_getReturnType(Method m, char * dst, size_t dst_len)} */
    public static void nmethod_getReturnType(long m, long dst, long dst_len) {
        long __functionAddress = Functions.method_getReturnType;
        if (CHECKS) {
            check(m);
        }
        invokePPPV(m, dst, dst_len, __functionAddress);
    }

    /** {@code void method_getReturnType(Method m, char * dst, size_t dst_len)} */
    public static void method_getReturnType(@NativeType("Method") long m, @NativeType("char *") ByteBuffer dst) {
        nmethod_getReturnType(m, memAddress(dst), dst.remaining());
    }

    /** {@code void method_getReturnType(Method m, char * dst, size_t dst_len)} */
    @NativeType("void")
    public static String method_getReturnType(@NativeType("Method") long m, @NativeType("size_t") long dst_len) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer dst = stack.malloc((int)dst_len);
            nmethod_getReturnType(m, memAddress(dst), dst_len);
            return memUTF8(memByteBufferNT1(memAddress(dst), (int)dst_len));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ method_getArgumentType ] ---

    /** {@code void method_getArgumentType(Method m, unsigned int index, char * dst, size_t dst_len)} */
    public static void nmethod_getArgumentType(long m, int index, long dst, long dst_len) {
        long __functionAddress = Functions.method_getArgumentType;
        if (CHECKS) {
            check(m);
        }
        invokePPPV(m, index, dst, dst_len, __functionAddress);
    }

    /** {@code void method_getArgumentType(Method m, unsigned int index, char * dst, size_t dst_len)} */
    public static void method_getArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index, @NativeType("char *") ByteBuffer dst) {
        nmethod_getArgumentType(m, index, memAddress(dst), dst.remaining());
    }

    /** {@code void method_getArgumentType(Method m, unsigned int index, char * dst, size_t dst_len)} */
    @NativeType("void")
    public static String method_getArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index, @NativeType("size_t") long dst_len) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer dst = stack.malloc((int)dst_len);
            nmethod_getArgumentType(m, index, memAddress(dst), dst_len);
            return memUTF8(memByteBufferNT1(memAddress(dst), (int)dst_len));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ method_setImplementation ] ---

    /** {@code IMP method_setImplementation(Method m, IMP imp)} */
    @NativeType("IMP")
    public static long method_setImplementation(@NativeType("Method") long m, @NativeType("IMP") long imp) {
        long __functionAddress = Functions.method_setImplementation;
        if (CHECKS) {
            check(m);
            check(imp);
        }
        return invokePPP(m, imp, __functionAddress);
    }

    // --- [ method_exchangeImplementations ] ---

    /** {@code void method_exchangeImplementations(Method m1, Method m2)} */
    public static void method_exchangeImplementations(@NativeType("Method") long m1, @NativeType("Method") long m2) {
        long __functionAddress = Functions.method_exchangeImplementations;
        if (CHECKS) {
            check(m1);
            check(m2);
        }
        invokePPV(m1, m2, __functionAddress);
    }

    // --- [ ivar_getName ] ---

    /** {@code char const * ivar_getName(Ivar v)} */
    public static long nivar_getName(long v) {
        long __functionAddress = Functions.ivar_getName;
        if (CHECKS) {
            check(v);
        }
        return invokePP(v, __functionAddress);
    }

    /** {@code char const * ivar_getName(Ivar v)} */
    @NativeType("char const *")
    public static @Nullable String ivar_getName(@NativeType("Ivar") long v) {
        long __result = nivar_getName(v);
        return memUTF8Safe(__result);
    }

    // --- [ ivar_getTypeEncoding ] ---

    /** {@code char const * ivar_getTypeEncoding(Ivar v)} */
    public static long nivar_getTypeEncoding(long v) {
        long __functionAddress = Functions.ivar_getTypeEncoding;
        if (CHECKS) {
            check(v);
        }
        return invokePP(v, __functionAddress);
    }

    /** {@code char const * ivar_getTypeEncoding(Ivar v)} */
    @NativeType("char const *")
    public static @Nullable String ivar_getTypeEncoding(@NativeType("Ivar") long v) {
        long __result = nivar_getTypeEncoding(v);
        return memUTF8Safe(__result);
    }

    // --- [ ivar_getOffset ] ---

    /** {@code ptrdiff_t ivar_getOffset(Ivar v)} */
    @NativeType("ptrdiff_t")
    public static long ivar_getOffset(@NativeType("Ivar") long v) {
        long __functionAddress = Functions.ivar_getOffset;
        if (CHECKS) {
            check(v);
        }
        return invokePP(v, __functionAddress);
    }

    // --- [ property_getName ] ---

    /** {@code char const * property_getName(objc_property_t property)} */
    public static long nproperty_getName(long property) {
        long __functionAddress = Functions.property_getName;
        if (CHECKS) {
            check(property);
        }
        return invokePP(property, __functionAddress);
    }

    /** {@code char const * property_getName(objc_property_t property)} */
    @NativeType("char const *")
    public static @Nullable String property_getName(@NativeType("objc_property_t") long property) {
        long __result = nproperty_getName(property);
        return memUTF8Safe(__result);
    }

    // --- [ property_getAttributes ] ---

    /** {@code char const * property_getAttributes(objc_property_t property)} */
    public static long nproperty_getAttributes(long property) {
        long __functionAddress = Functions.property_getAttributes;
        if (CHECKS) {
            check(property);
        }
        return invokePP(property, __functionAddress);
    }

    /** {@code char const * property_getAttributes(objc_property_t property)} */
    @NativeType("char const *")
    public static @Nullable String property_getAttributes(@NativeType("objc_property_t") long property) {
        long __result = nproperty_getAttributes(property);
        return memUTF8Safe(__result);
    }

    // --- [ property_copyAttributeList ] ---

    /** {@code objc_property_attribute_t * property_copyAttributeList(objc_property_t property, unsigned int * outCount)} */
    public static long nproperty_copyAttributeList(long property, long outCount) {
        long __functionAddress = Functions.property_copyAttributeList;
        if (CHECKS) {
            check(property);
        }
        return invokePPP(property, outCount, __functionAddress);
    }

    /** {@code objc_property_attribute_t * property_copyAttributeList(objc_property_t property, unsigned int * outCount)} */
    @NativeType("objc_property_attribute_t *")
    public static ObjCPropertyAttribute.@Nullable Buffer property_copyAttributeList(@NativeType("objc_property_t") long property) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nproperty_copyAttributeList(property, memAddress(outCount));
            return ObjCPropertyAttribute.createSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ property_copyAttributeValue ] ---

    /** {@code char * property_copyAttributeValue(objc_property_t property, char const * attributeName)} */
    public static long nproperty_copyAttributeValue(long property, long attributeName) {
        long __functionAddress = Functions.property_copyAttributeValue;
        if (CHECKS) {
            check(property);
        }
        return invokePPP(property, attributeName, __functionAddress);
    }

    /** {@code char * property_copyAttributeValue(objc_property_t property, char const * attributeName)} */
    @NativeType("char *")
    public static @Nullable String property_copyAttributeValue(@NativeType("objc_property_t") long property, @NativeType("char const *") ByteBuffer attributeName) {
        if (CHECKS) {
            checkNT1(attributeName);
        }
        long __result = NULL;
        try {
            __result = nproperty_copyAttributeValue(property, memAddress(attributeName));
            return memUTF8Safe(__result);
        } finally {
            if (__result != NULL) org.lwjgl.system.libc.LibCStdlib.nfree(__result);
        }
    }

    /** {@code char * property_copyAttributeValue(objc_property_t property, char const * attributeName)} */
    @NativeType("char *")
    public static @Nullable String property_copyAttributeValue(@NativeType("objc_property_t") long property, @NativeType("char const *") CharSequence attributeName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        long __result = NULL;
        try {
            stack.nUTF8(attributeName, true);
            long attributeNameEncoded = stack.getPointerAddress();
            __result = nproperty_copyAttributeValue(property, attributeNameEncoded);
            return memUTF8Safe(__result);
        } finally {
            if (__result != NULL) org.lwjgl.system.libc.LibCStdlib.nfree(__result);
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_getProtocol ] ---

    /** {@code Protocol * objc_getProtocol(char const * name)} */
    public static long nobjc_getProtocol(long name) {
        long __functionAddress = Functions.objc_getProtocol;
        return invokePP(name, __functionAddress);
    }

    /** {@code Protocol * objc_getProtocol(char const * name)} */
    @NativeType("Protocol *")
    public static long objc_getProtocol(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getProtocol(memAddress(name));
    }

    /** {@code Protocol * objc_getProtocol(char const * name)} */
    @NativeType("Protocol *")
    public static long objc_getProtocol(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_getProtocol(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_copyProtocolList ] ---

    /** {@code Protocol ** objc_copyProtocolList(unsigned int * outCount)} */
    public static long nobjc_copyProtocolList(long outCount) {
        long __functionAddress = Functions.objc_copyProtocolList;
        return invokePP(outCount, __functionAddress);
    }

    /** {@code Protocol ** objc_copyProtocolList(unsigned int * outCount)} */
    @NativeType("Protocol **")
    public static @Nullable PointerBuffer objc_copyProtocolList() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyProtocolList(memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ protocol_conformsToProtocol ] ---

    /** {@code BOOL protocol_conformsToProtocol(Protocol * proto, Protocol * other)} */
    @NativeType("BOOL")
    public static boolean protocol_conformsToProtocol(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long other) {
        long __functionAddress = Functions.protocol_conformsToProtocol;
        if (CHECKS) {
            check(proto);
            check(other);
        }
        return invokePPZ(proto, other, __functionAddress);
    }

    // --- [ protocol_isEqual ] ---

    /** {@code BOOL protocol_isEqual(Protocol * proto, Protocol * other)} */
    @NativeType("BOOL")
    public static boolean protocol_isEqual(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long other) {
        long __functionAddress = Functions.protocol_isEqual;
        if (CHECKS) {
            check(proto);
            check(other);
        }
        return invokePPZ(proto, other, __functionAddress);
    }

    // --- [ protocol_getName ] ---

    /** {@code char const * protocol_getName(Protocol * p)} */
    public static long nprotocol_getName(long p) {
        long __functionAddress = Functions.protocol_getName;
        if (CHECKS) {
            check(p);
        }
        return invokePP(p, __functionAddress);
    }

    /** {@code char const * protocol_getName(Protocol * p)} */
    @NativeType("char const *")
    public static @Nullable String protocol_getName(@NativeType("Protocol *") long p) {
        long __result = nprotocol_getName(p);
        return memUTF8Safe(__result);
    }

    // --- [ protocol_getMethodDescription ] ---

    /** {@code struct objc_method_description protocol_getMethodDescription(Protocol * p, SEL aSel, BOOL isRequiredMethod, BOOL isInstanceMethod)} */
    public static native void nprotocol_getMethodDescription(long p, long aSel, boolean isRequiredMethod, boolean isInstanceMethod, long __functionAddress, long __result);

    /** {@code struct objc_method_description protocol_getMethodDescription(Protocol * p, SEL aSel, BOOL isRequiredMethod, BOOL isInstanceMethod)} */
    public static void nprotocol_getMethodDescription(long p, long aSel, boolean isRequiredMethod, boolean isInstanceMethod, long __result) {
        long __functionAddress = Functions.protocol_getMethodDescription;
        if (CHECKS) {
            check(p);
            check(aSel);
        }
        nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __functionAddress, __result);
    }

    /** {@code struct objc_method_description protocol_getMethodDescription(Protocol * p, SEL aSel, BOOL isRequiredMethod, BOOL isInstanceMethod)} */
    @NativeType("struct objc_method_description")
    public static ObjCMethodDescription protocol_getMethodDescription(@NativeType("Protocol *") long p, @NativeType("SEL") long aSel, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod, @NativeType("struct objc_method_description") ObjCMethodDescription __result) {
        nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __result.address());
        return __result;
    }

    // --- [ protocol_copyMethodDescriptionList ] ---

    /** {@code struct objc_method_description * protocol_copyMethodDescriptionList(Protocol * p, BOOL isRequiredMethod, BOOL isInstanceMethod, unsigned int * outCount)} */
    public static long nprotocol_copyMethodDescriptionList(long p, boolean isRequiredMethod, boolean isInstanceMethod, long outCount) {
        long __functionAddress = Functions.protocol_copyMethodDescriptionList;
        if (CHECKS) {
            check(p);
        }
        return invokePPP(p, isRequiredMethod, isInstanceMethod, outCount, __functionAddress);
    }

    /** {@code struct objc_method_description * protocol_copyMethodDescriptionList(Protocol * p, BOOL isRequiredMethod, BOOL isInstanceMethod, unsigned int * outCount)} */
    @NativeType("struct objc_method_description *")
    public static ObjCMethodDescription.@Nullable Buffer protocol_copyMethodDescriptionList(@NativeType("Protocol *") long p, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nprotocol_copyMethodDescriptionList(p, isRequiredMethod, isInstanceMethod, memAddress(outCount));
            return ObjCMethodDescription.createSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ protocol_getProperty ] ---

    /** {@code objc_property_t protocol_getProperty(Protocol * proto, char const * name, BOOL isRequiredProperty, BOOL isInstanceProperty)} */
    public static long nprotocol_getProperty(long proto, long name, boolean isRequiredProperty, boolean isInstanceProperty) {
        long __functionAddress = Functions.protocol_getProperty;
        if (CHECKS) {
            check(proto);
        }
        return invokePPP(proto, name, isRequiredProperty, isInstanceProperty, __functionAddress);
    }

    /** {@code objc_property_t protocol_getProperty(Protocol * proto, char const * name, BOOL isRequiredProperty, BOOL isInstanceProperty)} */
    @NativeType("objc_property_t")
    public static long protocol_getProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") ByteBuffer name, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nprotocol_getProperty(proto, memAddress(name), isRequiredProperty, isInstanceProperty);
    }

    /** {@code objc_property_t protocol_getProperty(Protocol * proto, char const * name, BOOL isRequiredProperty, BOOL isInstanceProperty)} */
    @NativeType("objc_property_t")
    public static long protocol_getProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") CharSequence name, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nprotocol_getProperty(proto, nameEncoded, isRequiredProperty, isInstanceProperty);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ protocol_copyPropertyList ] ---

    /** {@code objc_property_t * protocol_copyPropertyList(Protocol * proto, unsigned int * outCount)} */
    public static long nprotocol_copyPropertyList(long proto, long outCount) {
        long __functionAddress = Functions.protocol_copyPropertyList;
        if (CHECKS) {
            check(proto);
        }
        return invokePPP(proto, outCount, __functionAddress);
    }

    /** {@code objc_property_t * protocol_copyPropertyList(Protocol * proto, unsigned int * outCount)} */
    @NativeType("objc_property_t *")
    public static @Nullable PointerBuffer protocol_copyPropertyList(@NativeType("Protocol *") long proto) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nprotocol_copyPropertyList(proto, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ protocol_copyProtocolList ] ---

    /** {@code Protocol ** protocol_copyProtocolList(Protocol * proto, unsigned int * outCount)} */
    public static long nprotocol_copyProtocolList(long proto, long outCount) {
        long __functionAddress = Functions.protocol_copyProtocolList;
        if (CHECKS) {
            check(proto);
        }
        return invokePPP(proto, outCount, __functionAddress);
    }

    /** {@code Protocol ** protocol_copyProtocolList(Protocol * proto, unsigned int * outCount)} */
    @NativeType("Protocol **")
    public static @Nullable PointerBuffer protocol_copyProtocolList(@NativeType("Protocol *") long proto) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nprotocol_copyProtocolList(proto, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_allocateProtocol ] ---

    /** {@code Protocol * objc_allocateProtocol(char const * name)} */
    public static long nobjc_allocateProtocol(long name) {
        long __functionAddress = Functions.objc_allocateProtocol;
        return invokePP(name, __functionAddress);
    }

    /** {@code Protocol * objc_allocateProtocol(char const * name)} */
    @NativeType("Protocol *")
    public static long objc_allocateProtocol(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_allocateProtocol(memAddress(name));
    }

    /** {@code Protocol * objc_allocateProtocol(char const * name)} */
    @NativeType("Protocol *")
    public static long objc_allocateProtocol(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nobjc_allocateProtocol(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_registerProtocol ] ---

    /** {@code void objc_registerProtocol(Protocol * proto)} */
    public static void objc_registerProtocol(@NativeType("Protocol *") long proto) {
        long __functionAddress = Functions.objc_registerProtocol;
        if (CHECKS) {
            check(proto);
        }
        invokePV(proto, __functionAddress);
    }

    // --- [ protocol_addMethodDescription ] ---

    /** {@code void protocol_addMethodDescription(Protocol * proto, SEL name, char const * types, BOOL isRequiredMethod, BOOL isInstanceMethod)} */
    public static void nprotocol_addMethodDescription(long proto, long name, long types, boolean isRequiredMethod, boolean isInstanceMethod) {
        long __functionAddress = Functions.protocol_addMethodDescription;
        if (CHECKS) {
            check(proto);
            check(name);
        }
        invokePPPV(proto, name, types, isRequiredMethod, isInstanceMethod, __functionAddress);
    }

    /** {@code void protocol_addMethodDescription(Protocol * proto, SEL name, char const * types, BOOL isRequiredMethod, BOOL isInstanceMethod)} */
    public static void protocol_addMethodDescription(@NativeType("Protocol *") long proto, @NativeType("SEL") long name, @NativeType("char const *") ByteBuffer types, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        if (CHECKS) {
            checkNT1(types);
        }
        nprotocol_addMethodDescription(proto, name, memAddress(types), isRequiredMethod, isInstanceMethod);
    }

    /** {@code void protocol_addMethodDescription(Protocol * proto, SEL name, char const * types, BOOL isRequiredMethod, BOOL isInstanceMethod)} */
    public static void protocol_addMethodDescription(@NativeType("Protocol *") long proto, @NativeType("SEL") long name, @NativeType("char const *") CharSequence types, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            nprotocol_addMethodDescription(proto, name, typesEncoded, isRequiredMethod, isInstanceMethod);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ protocol_addProtocol ] ---

    /** {@code void protocol_addProtocol(Protocol * proto, Protocol * addition)} */
    public static void protocol_addProtocol(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long addition) {
        long __functionAddress = Functions.protocol_addProtocol;
        if (CHECKS) {
            check(proto);
            check(addition);
        }
        invokePPV(proto, addition, __functionAddress);
    }

    // --- [ protocol_addProperty ] ---

    /** {@code void protocol_addProperty(Protocol * proto, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount, BOOL isRequiredProperty, BOOL isInstanceProperty)} */
    public static void nprotocol_addProperty(long proto, long name, long attributes, int attributeCount, boolean isRequiredProperty, boolean isInstanceProperty) {
        long __functionAddress = Functions.protocol_addProperty;
        if (CHECKS) {
            check(proto);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        invokePPPV(proto, name, attributes, attributeCount, isRequiredProperty, isInstanceProperty, __functionAddress);
    }

    /** {@code void protocol_addProperty(Protocol * proto, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount, BOOL isRequiredProperty, BOOL isInstanceProperty)} */
    public static void protocol_addProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        if (CHECKS) {
            checkNT1(name);
        }
        nprotocol_addProperty(proto, memAddress(name), attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
    }

    /** {@code void protocol_addProperty(Protocol * proto, char const * name, objc_property_attribute_t const * attributes, unsigned int attributeCount, BOOL isRequiredProperty, BOOL isInstanceProperty)} */
    public static void protocol_addProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") CharSequence name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nprotocol_addProperty(proto, nameEncoded, attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ objc_copyImageNames ] ---

    /** {@code char const ** objc_copyImageNames(unsigned int * outCount)} */
    public static long nobjc_copyImageNames(long outCount) {
        long __functionAddress = Functions.objc_copyImageNames;
        return invokePP(outCount, __functionAddress);
    }

    /** {@code char const ** objc_copyImageNames(unsigned int * outCount)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer objc_copyImageNames() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyImageNames(memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ class_getImageName ] ---

    /** {@code char const * class_getImageName(Class cls)} */
    public static long nclass_getImageName(long cls) {
        long __functionAddress = Functions.class_getImageName;
        if (CHECKS) {
            check(cls);
        }
        return invokePP(cls, __functionAddress);
    }

    /** {@code char const * class_getImageName(Class cls)} */
    @NativeType("char const *")
    public static @Nullable String class_getImageName(@NativeType("Class") long cls) {
        long __result = nclass_getImageName(cls);
        return memUTF8Safe(__result);
    }

    // --- [ objc_copyClassNamesForImage ] ---

    /** {@code char const ** objc_copyClassNamesForImage(char const * image, unsigned int * outCount)} */
    public static long nobjc_copyClassNamesForImage(long image, long outCount) {
        long __functionAddress = Functions.objc_copyClassNamesForImage;
        return invokePPP(image, outCount, __functionAddress);
    }

    /** {@code char const ** objc_copyClassNamesForImage(char const * image, unsigned int * outCount)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer objc_copyClassNamesForImage(@NativeType("char const *") ByteBuffer image) {
        if (CHECKS) {
            checkNT1(image);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyClassNamesForImage(memAddress(image), memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char const ** objc_copyClassNamesForImage(char const * image, unsigned int * outCount)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer objc_copyClassNamesForImage(@NativeType("char const *") CharSequence image) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer outCount = stack.callocInt(1);
            stack.nUTF8(image, true);
            long imageEncoded = stack.getPointerAddress();
            long __result = nobjc_copyClassNamesForImage(imageEncoded, memAddress(outCount));
            return memPointerBufferSafe(__result, outCount.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ sel_getName ] ---

    /** {@code char const * sel_getName(SEL sel)} */
    public static long nsel_getName(long sel) {
        long __functionAddress = Functions.sel_getName;
        if (CHECKS) {
            check(sel);
        }
        return invokePP(sel, __functionAddress);
    }

    /** {@code char const * sel_getName(SEL sel)} */
    @NativeType("char const *")
    public static @Nullable String sel_getName(@NativeType("SEL") long sel) {
        long __result = nsel_getName(sel);
        return memUTF8Safe(__result);
    }

    // --- [ sel_getUid ] ---

    /** {@code SEL sel_getUid(char const * str)} */
    public static long nsel_getUid(long str) {
        long __functionAddress = Functions.sel_getUid;
        return invokePP(str, __functionAddress);
    }

    /** {@code SEL sel_getUid(char const * str)} */
    @NativeType("SEL")
    public static long sel_getUid(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nsel_getUid(memAddress(str));
    }

    /** {@code SEL sel_getUid(char const * str)} */
    @NativeType("SEL")
    public static long sel_getUid(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nsel_getUid(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ sel_registerName ] ---

    /** {@code SEL sel_registerName(char const * str)} */
    public static long nsel_registerName(long str) {
        long __functionAddress = Functions.sel_registerName;
        return invokePP(str, __functionAddress);
    }

    /** {@code SEL sel_registerName(char const * str)} */
    @NativeType("SEL")
    public static long sel_registerName(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nsel_registerName(memAddress(str));
    }

    /** {@code SEL sel_registerName(char const * str)} */
    @NativeType("SEL")
    public static long sel_registerName(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nsel_registerName(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ sel_isEqual ] ---

    /** {@code BOOL sel_isEqual(SEL lhs, SEL rhs)} */
    @NativeType("BOOL")
    public static boolean sel_isEqual(@NativeType("SEL") long lhs, @NativeType("SEL") long rhs) {
        long __functionAddress = Functions.sel_isEqual;
        if (CHECKS) {
            check(lhs);
            check(rhs);
        }
        return invokePPZ(lhs, rhs, __functionAddress);
    }

    // --- [ objc_enumerationMutation ] ---

    /** {@code void objc_enumerationMutation(id obj)} */
    public static void objc_enumerationMutation(@NativeType("id") long obj) {
        long __functionAddress = Functions.objc_enumerationMutation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ objc_setEnumerationMutationHandler ] ---

    /** {@code void objc_setEnumerationMutationHandler(EnumerationMutationHandler handler)} */
    public static void nobjc_setEnumerationMutationHandler(long handler) {
        long __functionAddress = Functions.objc_setEnumerationMutationHandler;
        invokePV(handler, __functionAddress);
    }

    /** {@code void objc_setEnumerationMutationHandler(EnumerationMutationHandler handler)} */
    public static void objc_setEnumerationMutationHandler(@NativeType("EnumerationMutationHandler") EnumerationMutationHandlerI handler) {
        nobjc_setEnumerationMutationHandler(handler.address());
    }

    // --- [ imp_implementationWithBlock ] ---

    /** {@code IMP imp_implementationWithBlock(id block)} */
    @NativeType("IMP")
    public static long imp_implementationWithBlock(@NativeType("id") long block) {
        long __functionAddress = Functions.imp_implementationWithBlock;
        if (CHECKS) {
            check(block);
        }
        return invokePP(block, __functionAddress);
    }

    // --- [ imp_getBlock ] ---

    /** {@code id imp_getBlock(IMP anImp)} */
    @NativeType("id")
    public static long imp_getBlock(@NativeType("IMP") long anImp) {
        long __functionAddress = Functions.imp_getBlock;
        if (CHECKS) {
            check(anImp);
        }
        return invokePP(anImp, __functionAddress);
    }

    // --- [ imp_removeBlock ] ---

    /** {@code BOOL imp_removeBlock(IMP anImp)} */
    @NativeType("BOOL")
    public static boolean imp_removeBlock(@NativeType("IMP") long anImp) {
        long __functionAddress = Functions.imp_removeBlock;
        if (CHECKS) {
            check(anImp);
        }
        return invokePZ(anImp, __functionAddress);
    }

    // --- [ objc_loadWeak ] ---

    /** {@code id objc_loadWeak(id * location)} */
    public static long nobjc_loadWeak(long location) {
        long __functionAddress = Functions.objc_loadWeak;
        return invokePP(location, __functionAddress);
    }

    /** {@code id objc_loadWeak(id * location)} */
    @NativeType("id")
    public static long objc_loadWeak(@NativeType("id *") @Nullable PointerBuffer location) {
        if (CHECKS) {
            checkSafe(location, 1);
        }
        return nobjc_loadWeak(memAddressSafe(location));
    }

    // --- [ objc_storeWeak ] ---

    /** {@code id objc_storeWeak(id * location, id obj)} */
    public static long nobjc_storeWeak(long location, long obj) {
        long __functionAddress = Functions.objc_storeWeak;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(location, obj, __functionAddress);
    }

    /** {@code id objc_storeWeak(id * location, id obj)} */
    @NativeType("id")
    public static long objc_storeWeak(@NativeType("id *") PointerBuffer location, @NativeType("id") long obj) {
        if (CHECKS) {
            check(location, 1);
        }
        return nobjc_storeWeak(memAddress(location), obj);
    }

    // --- [ objc_setAssociatedObject ] ---

    /** {@code void objc_setAssociatedObject(id object, void const * key, id value, objc_AssociationPolicy policy)} */
    public static void objc_setAssociatedObject(@NativeType("id") long object, @NativeType("void const *") long key, @NativeType("id") long value, @NativeType("objc_AssociationPolicy") long policy) {
        long __functionAddress = Functions.objc_setAssociatedObject;
        if (CHECKS) {
            check(object);
            check(key);
            check(value);
        }
        invokePPPPV(object, key, value, policy, __functionAddress);
    }

    // --- [ objc_getAssociatedObject ] ---

    /** {@code id objc_getAssociatedObject(id object, void const * key)} */
    @NativeType("id")
    public static long objc_getAssociatedObject(@NativeType("id") long object, @NativeType("void const *") long key) {
        long __functionAddress = Functions.objc_getAssociatedObject;
        if (CHECKS) {
            check(object);
            check(key);
        }
        return invokePPP(object, key, __functionAddress);
    }

    // --- [ objc_removeAssociatedObjects ] ---

    /** {@code void objc_removeAssociatedObjects(id object)} */
    public static void objc_removeAssociatedObjects(@NativeType("id") long object) {
        long __functionAddress = Functions.objc_removeAssociatedObjects;
        if (CHECKS) {
            check(object);
        }
        invokePV(object, __functionAddress);
    }

}