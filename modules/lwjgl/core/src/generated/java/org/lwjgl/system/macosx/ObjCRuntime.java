/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the Objective-C Runtime.
 * 
 * <p>Due to the nature of the {@code objc_msgSend*} functions, they are not directly exposed in this binding. Advanced users with good understanding of the
 * complexity involved with using these functions, may access them via the {@link #getLibrary} method:</p>
 * 
 * <pre><code>
 * SharedLibrary objc = ObjCRuntime.getLibrary();
 * long objc_msgSend = objc.getFunctionAddress("objc_msgSend");
 * 
 * // example usage
 * long NSThread = objc_getClass("NSThread");
 * long currentThread = invokePPP(NSThread, sel_getUid("currentThread"), objc_msgSend);</code></pre>
 * 
 * <p>The safe way to use objc_msgSend in C code is to cast it to an appropriate function pointer. This is exactly what the {@link org.lwjgl.system.JNI JNI}
 * class does. If a particular function signature is not available, {@link org.lwjgl.system.libffi.LibFFI LibFFI} may be used to invoke it.</p>
 * 
 * <p>The functions not exposed are:</p>
 * 
 * <ul>
 * <li>objc_msgSend</li>
 * <li>objc_msgSend_stret</li>
 * <li>objc_msgSendSuper</li>
 * <li>objc_msgSendSuper_stret</li>
 * </ul>
 */
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

    /** Nil value. */
    public static final long nil = 0x0L;

    /** Boolean values. */
    public static final byte
        YES = 1,
        NO  = 0;

    /** Types. */
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

    /** Policies related to associative references. */
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

    /**
     * Returns a copy of a given object.
     *
     * @param obj  an Objective-C object
     * @param size the size of the object {@code obj}
     *
     * @return a copy of obj
     */
    @NativeType("id")
    public static long object_copy(@NativeType("id") long obj, @NativeType("size_t") long size) {
        long __functionAddress = Functions.object_copy;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, size, __functionAddress);
    }

    // --- [ object_dispose ] ---

    /**
     * Frees the memory occupied by a given object.
     *
     * @param obj an Objective-C object
     *
     * @return {@link #nil}
     */
    @NativeType("id")
    public static long object_dispose(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_dispose;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ object_getClass ] ---

    /**
     * Returns the class of an object.
     *
     * @param obj an Objective-C object
     *
     * @return the class object of which object is an instance, or Nil if {@code obj} is {@link #nil}
     */
    @NativeType("Class")
    public static long object_getClass(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_getClass;
        return invokePP(obj, __functionAddress);
    }

    // --- [ object_setClass ] ---

    /**
     * Sets the class of an object.
     *
     * @param obj the object to modify
     * @param cls a class object
     *
     * @return the previous value of object's class, or Nil if {@code obj} is {@link #nil}
     */
    @NativeType("Class")
    public static long object_setClass(@NativeType("id") long obj, @NativeType("Class") long cls) {
        long __functionAddress = Functions.object_setClass;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(obj, cls, __functionAddress);
    }

    // --- [ object_getClassName ] ---

    /** Unsafe version of: {@link #object_getClassName} */
    public static long nobject_getClassName(long obj) {
        long __functionAddress = Functions.object_getClassName;
        return invokePP(obj, __functionAddress);
    }

    /**
     * Returns the class name of a given object.
     *
     * @param obj an Objective-C object
     *
     * @return the name of the class of which {@code obj} is an instance
     */
    @Nullable
    @NativeType("char const *")
    public static String object_getClassName(@NativeType("id") long obj) {
        long __result = nobject_getClassName(obj);
        return memUTF8Safe(__result);
    }

    // --- [ object_getIndexedIvars ] ---

    /**
     * This function returns a pointer to any extra bytes allocated with the instance (as specified by {@link #class_createInstance} with extraBytes&gt;0). This
     * memory follows the object's ordinary ivars, but may not be adjacent to the last ivar.
     * 
     * <p>The returned pointer is guaranteed to be pointer-size aligned, even if the area following the object's last ivar is less aligned than that. Alignment
     * greater than pointer-size is never guaranteed, even if the area following the object's last ivar is more aligned than that.</p>
     * 
     * <p>In a garbage-collected environment, the memory is scanned conservatively.</p>
     *
     * @param obj an Objective-C object
     *
     * @return a pointer to any extra bytes allocated with {@code obj}. If {@code obj} was not allocated with any extra bytes, then dereferencing the returned pointer
     *         is undefined.
     */
    @NativeType("void *")
    public static long object_getIndexedIvars(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_getIndexedIvars;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ object_getIvar ] ---

    /**
     * Reads the value of an instance variable in an object.
     *
     * @param obj  the object containing the instance variable whose value you want to read
     * @param ivar the Ivar describing the instance variable whose value you want to read
     *
     * @return the value of the instance variable specified by {@code ivar}, or {@link #nil} if {@code obj} is {@link #nil}
     */
    @NativeType("id")
    public static long object_getIvar(@NativeType("id") long obj, @NativeType("Ivar") long ivar) {
        long __functionAddress = Functions.object_getIvar;
        if (CHECKS) {
            check(ivar);
        }
        return invokePPP(obj, ivar, __functionAddress);
    }

    // --- [ object_setIvar ] ---

    /**
     * Sets the value of an instance variable in an object.
     * 
     * <p>object_setIvar is faster than {@link #object_setInstanceVariable} if the Ivar for the instance variable is already known.</p>
     *
     * @param obj   the object containing the instance variable whose value you want to set
     * @param ivar  the Ivar describing the instance variable whose value you want to set
     * @param value the new value for the instance variable
     */
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

    /** Unsafe version of: {@link #object_setInstanceVariable} */
    public static long nobject_setInstanceVariable(long obj, long name, long value) {
        long __functionAddress = Functions.object_setInstanceVariable;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPP(obj, name, value, __functionAddress);
    }

    /**
     * Changes the value of an instance variable of a class instance.
     *
     * @param obj   a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to modify
     * @param name  a C string. Pass the name of the instance variable whose value you wish to modify
     * @param value the new value for the instance variable
     *
     * @return a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name
     */
    @NativeType("Ivar")
    public static long object_setInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") ByteBuffer name, @NativeType("void *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobject_setInstanceVariable(obj, memAddress(name), memAddress(value));
    }

    /**
     * Changes the value of an instance variable of a class instance.
     *
     * @param obj   a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to modify
     * @param name  a C string. Pass the name of the instance variable whose value you wish to modify
     * @param value the new value for the instance variable
     *
     * @return a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name
     */
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

    /** Unsafe version of: {@link #object_getInstanceVariable} */
    public static long nobject_getInstanceVariable(long obj, long name, long outValue) {
        long __functionAddress = Functions.object_getInstanceVariable;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPP(obj, name, outValue, __functionAddress);
    }

    /**
     * Obtains the value of an instance variable of a class instance.
     *
     * @param obj      a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to obtain
     * @param name     a C string. Pass the name of the instance variable whose value you wish to obtain
     * @param outValue on return, contains a pointer to the value of the instance variable
     *
     * @return a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name
     */
    @NativeType("Ivar")
    public static long object_getInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") ByteBuffer name, @NativeType("void **") PointerBuffer outValue) {
        if (CHECKS) {
            checkNT1(name);
            check(outValue, 1);
        }
        return nobject_getInstanceVariable(obj, memAddress(name), memAddress(outValue));
    }

    /**
     * Obtains the value of an instance variable of a class instance.
     *
     * @param obj      a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to obtain
     * @param name     a C string. Pass the name of the instance variable whose value you wish to obtain
     * @param outValue on return, contains a pointer to the value of the instance variable
     *
     * @return a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name
     */
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

    /** Unsafe version of: {@link #objc_getClass} */
    public static long nobjc_getClass(long name) {
        long __functionAddress = Functions.objc_getClass;
        return invokePP(name, __functionAddress);
    }

    /**
     * Returns the class definition of a specified class.
     * 
     * <p>objc_getClass is different from {@link #objc_lookUpClass} in that if the class is not registered, objc_getClass calls the class handler callback and then
     * checks a second time to see whether the class is registered. objc_lookUpClass does not call the class handler callback.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
     */
    @NativeType("Class")
    public static long objc_getClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getClass(memAddress(name));
    }

    /**
     * Returns the class definition of a specified class.
     * 
     * <p>objc_getClass is different from {@link #objc_lookUpClass} in that if the class is not registered, objc_getClass calls the class handler callback and then
     * checks a second time to see whether the class is registered. objc_lookUpClass does not call the class handler callback.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
     */
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

    /** Unsafe version of: {@link #objc_getMetaClass} */
    public static long nobjc_getMetaClass(long name) {
        long __functionAddress = Functions.objc_getMetaClass;
        return invokePP(name, __functionAddress);
    }

    /**
     * Returns the metaclass definition of a specified class.
     * 
     * <p>If the definition for the named class is not registered, this function calls the class handler callback and then checks a second time to see if the
     * class is registered. However, every class definition must have a valid metaclass definition, and so the metaclass definition is always returned,
     * whether it’s valid or not.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the metaclass of the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
     */
    @NativeType("Class")
    public static long objc_getMetaClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getMetaClass(memAddress(name));
    }

    /**
     * Returns the metaclass definition of a specified class.
     * 
     * <p>If the definition for the named class is not registered, this function calls the class handler callback and then checks a second time to see if the
     * class is registered. However, every class definition must have a valid metaclass definition, and so the metaclass definition is always returned,
     * whether it’s valid or not.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the metaclass of the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
     */
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

    /** Unsafe version of: {@link #objc_lookUpClass} */
    public static long nobjc_lookUpClass(long name) {
        long __functionAddress = Functions.objc_lookUpClass;
        return invokePP(name, __functionAddress);
    }

    /**
     * Returns the class definition of a specified class.
     * 
     * <p>{@link #objc_getClass} is different from this function in that if the class is not registered, objc_getClass calls the class handler callback and then checks
     * a second time to see whether the class is registered. This function does not call the class handler callback.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
     */
    @NativeType("Class")
    public static long objc_lookUpClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_lookUpClass(memAddress(name));
    }

    /**
     * Returns the class definition of a specified class.
     * 
     * <p>{@link #objc_getClass} is different from this function in that if the class is not registered, objc_getClass calls the class handler callback and then checks
     * a second time to see whether the class is registered. This function does not call the class handler callback.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the named class, or {@link #nil} if the class is not registered with the Objective-C runtime
     */
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

    /** Unsafe version of: {@link #objc_getRequiredClass} */
    public static long nobjc_getRequiredClass(long name) {
        long __functionAddress = Functions.objc_getRequiredClass;
        return invokePP(name, __functionAddress);
    }

    /**
     * Returns the class definition of a specified class.
     * 
     * <p>This function is the same as {@link #objc_getClass}, but kills the process if the class is not found.</p>
     * 
     * <p>This function is used by ZeroLink, where failing to find a class would be a compile-time link error without ZeroLink.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the named class
     */
    @NativeType("Class")
    public static long objc_getRequiredClass(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getRequiredClass(memAddress(name));
    }

    /**
     * Returns the class definition of a specified class.
     * 
     * <p>This function is the same as {@link #objc_getClass}, but kills the process if the class is not found.</p>
     * 
     * <p>This function is used by ZeroLink, where failing to find a class would be a compile-time link error without ZeroLink.</p>
     *
     * @param name the name of the class to look up
     *
     * @return the Class object for the named class
     */
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

    /**
     * Unsafe version of: {@link #objc_getClassList}
     *
     * @param bufferCount the number of pointers for which you have allocated space in buffer. On return, this function fills in only this number of elements. If this number
     *                    is less than the number of registered classes, this function returns an arbitrary subset of the registered classes.
     */
    public static int nobjc_getClassList(long buffer, int bufferCount) {
        long __functionAddress = Functions.objc_getClassList;
        return invokePI(buffer, bufferCount, __functionAddress);
    }

    /**
     * Obtains the list of registered class definitions.
     * 
     * <p>The Objective-C runtime library automatically registers all the classes defined in your source code. You can create class definitions at runtime and
     * register them with the {@link #objc_allocateClassPair} and {@link #objc_registerClassPair} functions.</p>
     * 
     * <h5>Special Considerations</h5>
     * 
     * <p>You cannot assume that class objects you get from this function are classes that inherit from NSObject, so you cannot safely call any methods on such
     * classes without detecting that the method is implemented first.</p>
     *
     * @param buffer an array of Class values. On output, each Class value points to one class definition, up to either {@code bufferCount} or the total number of
     *               registered classes, whichever is less. You can pass {@code NULL} to obtain the total number of registered class definitions without actually retrieving
     *               any class definitions.
     *
     * @return an integer value indicating the total number of registered classes
     */
    public static int objc_getClassList(@Nullable @NativeType("Class *") PointerBuffer buffer) {
        return nobjc_getClassList(memAddressSafe(buffer), remainingSafe(buffer));
    }

    // --- [ objc_copyClassList ] ---

    /**
     * Unsafe version of: {@link #objc_copyClassList}
     *
     * @param outCount an integer pointer used to store the number of classes returned by this function in the list. This parameter may be {@link #nil}
     */
    public static long nobjc_copyClassList(long outCount) {
        long __functionAddress = Functions.objc_copyClassList;
        return invokePP(outCount, __functionAddress);
    }

    /**
     * Creates and returns a list of pointers to all registered class definitions.
     *
     * @return a {@link #nil} terminated array of classes. You must free the array with free()
     */
    @Nullable
    @NativeType("Class *")
    public static PointerBuffer objc_copyClassList() {
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

    /** Unsafe version of: {@link #class_getName} */
    public static long nclass_getName(long cls) {
        long __functionAddress = Functions.class_getName;
        return invokePP(cls, __functionAddress);
    }

    /**
     * Returns the name of a class.
     *
     * @param cls a class object
     *
     * @return the name of the class, or the empty string if cls is Nil
     */
    @Nullable
    @NativeType("char const *")
    public static String class_getName(@NativeType("Class") long cls) {
        long __result = nclass_getName(cls);
        return memUTF8Safe(__result);
    }

    // --- [ class_isMetaClass ] ---

    /**
     * Returns a Boolean value that indicates whether a class object is a metaclass.
     *
     * @param cls a class object
     *
     * @return {@link #YES} if cls is a metaclass, {@link #NO} if cls is a non-meta class, {@link #NO} if cls is Nil
     */
    @NativeType("BOOL")
    public static boolean class_isMetaClass(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_isMetaClass;
        return invokePZ(cls, __functionAddress);
    }

    // --- [ class_getSuperclass ] ---

    /**
     * Returns the superclass of a class.
     *
     * @param cls a class object
     *
     * @return the superclass of the class, or Nil if cls is a root class, or Nil if cls is Nil
     */
    @NativeType("Class")
    public static long class_getSuperclass(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getSuperclass;
        return invokePP(cls, __functionAddress);
    }

    // --- [ class_getVersion ] ---

    /**
     * Returns the version number of a class definition.
     * 
     * <p>You can use the version number of the class definition to provide versioning of the interface that your class represents to other classes. This is
     * especially useful for object serialization (that is, archiving of the object in a flattened form), where it is important to recognize changes to the
     * layout of the instance variables in different class-definition versions.</p>
     * 
     * <p>Classes derived from the Foundation framework NSObject class can obtain the class-definition version number using the getVersion class method, which is
     * implemented using the class_getVersion function.</p>
     *
     * @param cls a pointer to an Class data structure. Pass the class definition for which you wish to obtain the version
     *
     * @return an integer indicating the version number of the class definition
     */
    public static int class_getVersion(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getVersion;
        if (CHECKS) {
            check(cls);
        }
        return invokePI(cls, __functionAddress);
    }

    // --- [ class_setVersion ] ---

    /**
     * Sets the version number of a class definition.
     * 
     * <p>You can use the version number of the class definition to provide versioning of the interface that your class represents to other classes. This is
     * especially useful for object serialization (that is, archiving of the object in a flattened form), where it is important to recognize changes to the
     * layout of the instance variables in different class-definition versions.</p>
     * 
     * <p>Classes derived from the Foundation framework NSObject class can set the class-definition version number using the setVersion: class method, which is
     * implemented using the class_setVersion function.</p>
     *
     * @param cls     a pointer to an Class data structure. Pass the class definition for which you wish to set the version
     * @param version the new version number of the class definition
     */
    public static void class_setVersion(@NativeType("Class") long cls, int version) {
        long __functionAddress = Functions.class_setVersion;
        if (CHECKS) {
            check(cls);
        }
        invokePV(cls, version, __functionAddress);
    }

    // --- [ class_getInstanceSize ] ---

    /**
     * Returns the size of instances of a class.
     *
     * @param cls a class object
     *
     * @return the size in bytes of instances of the class {@code cls}, or 0 if {@code cls} is Nil
     */
    @NativeType("size_t")
    public static long class_getInstanceSize(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getInstanceSize;
        return invokePP(cls, __functionAddress);
    }

    // --- [ class_getInstanceVariable ] ---

    /** Unsafe version of: {@link #class_getInstanceVariable} */
    public static long nclass_getInstanceVariable(long cls, long name) {
        long __functionAddress = Functions.class_getInstanceVariable;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    /**
     * Returns the Ivar for a specified instance variable of a given class.
     *
     * @param cls  the class whose instance variable you wish to obtain
     * @param name the name of the instance variable definition to obtain
     *
     * @return a pointer to an Ivar data structure containing information about the instance variable specified by name
     */
    @NativeType("Ivar")
    public static long class_getInstanceVariable(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_getInstanceVariable(cls, memAddress(name));
    }

    /**
     * Returns the Ivar for a specified instance variable of a given class.
     *
     * @param cls  the class whose instance variable you wish to obtain
     * @param name the name of the instance variable definition to obtain
     *
     * @return a pointer to an Ivar data structure containing information about the instance variable specified by name
     */
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

    /** Unsafe version of: {@link #class_getClassVariable} */
    public static long nclass_getClassVariable(long cls, long name) {
        long __functionAddress = Functions.class_getClassVariable;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    /**
     * Returns the Ivar for a specified class variable of a given class.
     *
     * @param cls  the class definition whose class variable you wish to obtain
     * @param name the name of the class variable definition to obtain
     *
     * @return a pointer to an Ivar data structure containing information about the class variable specified by name
     */
    @NativeType("Ivar")
    public static long class_getClassVariable(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_getClassVariable(cls, memAddress(name));
    }

    /**
     * Returns the Ivar for a specified class variable of a given class.
     *
     * @param cls  the class definition whose class variable you wish to obtain
     * @param name the name of the class variable definition to obtain
     *
     * @return a pointer to an Ivar data structure containing information about the class variable specified by name
     */
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

    /**
     * Unsafe version of: {@link #class_copyIvarList}
     *
     * @param outCount on return, contains the length of the returned array. If {@code outCount} is {@code NULL}, the length is not returned
     */
    public static long nclass_copyIvarList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyIvarList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /**
     * Describes the instance variables declared by a class.
     *
     * @param cls the class to inspect
     *
     * @return an array of pointers of type Ivar describing the instance variables declared by the class. Any instance variables declared by superclasses are not
     *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
     *         
     *         <p>If the class declares no instance variables, or {@code cls} is Nil, {@code NULL} is returned and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("Ivar *")
    public static PointerBuffer class_copyIvarList(@NativeType("Class") long cls) {
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

    /**
     * Returns a specified instance method for a given class.
     * 
     * <p>Note that this function searches superclasses for implementations, whereas {@link #class_copyMethodList} does not.</p>
     *
     * @param cls  the class you want to inspect
     * @param name the selector of the method you want to retrieve
     *
     * @return the method that corresponds to the implementation of the selector specified by aSelector for the class specified by {@code cls}, or {@code NULL} if the
     *         specified class or its superclasses do not contain an instance method with the specified selector.
     */
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

    /**
     * Returns a pointer to the data structure describing a given class method for a given class.
     * 
     * <p>Note that this function searches superclasses for implementations, whereas {@link #class_copyMethodList} does not.</p>
     *
     * @param cls  a pointer to a class definition. Pass the class that contains the method you want to retrieve
     * @param name a pointer of type SEL. Pass the selector of the method you want to retrieve
     *
     * @return a pointer to the Method data structure that corresponds to the implementation of the selector specified by {@code name} for the class specified by
     *         {@code cls}, or {@code NULL} if the specified class or its superclasses do not contain a class method with the specified selector.
     */
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

    /**
     * Returns the function pointer that would be called if a particular message were sent to an instance of a class.
     * 
     * <p>class_getMethodImplementation may be faster than {@code method_getImplementation(class_getInstanceMethod(cls, name))}.</p>
     * 
     * <p>The function pointer returned may be a function internal to the runtime instead of an actual method implementation. For example, if instances of the
     * class do not respond to the selector, the function pointer returned will be part of the runtime's message forwarding machinery.</p>
     *
     * @param cls  the class you want to inspect
     * @param name a selector
     *
     * @return the function pointer that would be called if {@code [object name]} were called with an instance of the class, or {@code NULL} if {@code cls} is Nil
     */
    @NativeType("IMP")
    public static long class_getMethodImplementation(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getMethodImplementation;
        if (CHECKS) {
            check(name);
        }
        return invokePPP(cls, name, __functionAddress);
    }

    // --- [ class_respondsToSelector ] ---

    /**
     * Returns a Boolean value that indicates whether instances of a class respond to a particular selector.
     * 
     * <p>You should usually use NSObject's respondsToSelector: or instancesRespondToSelector: methods instead of this function.</p>
     *
     * @param cls  the class you want to inspect
     * @param name a selector
     *
     * @return {@link #YES} if instances of the class respond to the selector, otherwise {@link #NO}
     */
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

    /**
     * Unsafe version of: {@link #class_copyMethodList}
     *
     * @param outCount on return, contains the length of the returned array. If {@code outCount} is {@code NULL}, the length is not returned
     */
    public static long nclass_copyMethodList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyMethodList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /**
     * Describes the instance methods implemented by a class.
     *
     * @param cls the class you want to inspect
     *
     * @return an array of pointers of type Method describing the instance methods implemented by the class—any instance methods implemented by superclasses are not
     *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
     *         
     *         <p>If {@code cls} implements no instance methods, or {@code cls} is Nil, returns {@code NULL} and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("Method *")
    public static PointerBuffer class_copyMethodList(@NativeType("Class") long cls) {
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

    /**
     * Returns a Boolean value that indicates whether a class conforms to a given protocol.
     * 
     * <p>You should usually use NSObject's conformsToProtocol: method instead of this function.</p>
     *
     * @param cls      the class you want to inspect
     * @param protocol a protocol
     *
     * @return {@link #YES} if {@code cls} conforms to {@code protocol}, otherwise {@link #NO}
     */
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

    /**
     * Unsafe version of: {@link #class_copyProtocolList}
     *
     * @param outCount on return, contains the length of the returned array. If {@code outCount} is {@code NULL}, the length is not returned
     */
    public static long nclass_copyProtocolList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyProtocolList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /**
     * Describes the protocols adopted by a class.
     *
     * @param cls the class you want to inspect
     *
     * @return an array of pointers of type Protocol* describing the protocols adopted by the class. Any protocols adopted by superclasses or other protocols are not
     *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
     *         
     *         <p>If {@code cls} adopts no protocols, or {@code cls} is Nil, returns {@code NULL} and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("Protocol **")
    public static PointerBuffer class_copyProtocolList(@NativeType("Class") long cls) {
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

    /** Unsafe version of: {@link #class_getProperty} */
    public static long nclass_getProperty(long cls, long name) {
        long __functionAddress = Functions.class_getProperty;
        return invokePPP(cls, name, __functionAddress);
    }

    /**
     * Returns a property with a given name of a given class.
     *
     * @param cls  the class you want to inspect
     * @param name a C string. Pass the name of the instance variable whose value you wish to modify.
     *
     * @return a pointer of type {@code objc_property_t} describing the property, or {@code NULL} if the class does not declare a property with that name, or {@code NULL} if
     *         {@code cls} is Nil.
     */
    @NativeType("objc_property_t")
    public static long class_getProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_getProperty(cls, memAddress(name));
    }

    /**
     * Returns a property with a given name of a given class.
     *
     * @param cls  the class you want to inspect
     * @param name a C string. Pass the name of the instance variable whose value you wish to modify.
     *
     * @return a pointer of type {@code objc_property_t} describing the property, or {@code NULL} if the class does not declare a property with that name, or {@code NULL} if
     *         {@code cls} is Nil.
     */
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

    /**
     * Unsafe version of: {@link #class_copyPropertyList}
     *
     * @param outCount on return, contains the length of the returned array. If {@code outCount} is {@code NULL}, the length is not returned
     */
    public static long nclass_copyPropertyList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyPropertyList;
        return invokePPP(cls, outCount, __functionAddress);
    }

    /**
     * Describes the properties declared by a class.
     *
     * @param cls the class you want to inspect
     *
     * @return an array of pointers of type {@code objc_property_t} describing the properties declared by the class. Any properties declared by superclasses are not
     *         included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
     *         
     *         <p>If {@code cls} declares no properties, or {@code cls} is Nil, returns {@code NULL} and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("objc_property_t *")
    public static PointerBuffer class_copyPropertyList(@NativeType("Class") long cls) {
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

    /** Unsafe version of: {@link #class_getIvarLayout} */
    public static long nclass_getIvarLayout(long cls) {
        long __functionAddress = Functions.class_getIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        return invokePP(cls, __functionAddress);
    }

    /**
     * Returns a description of the Ivar layout for a given class.
     *
     * @param cls the class to inspect
     *
     * @return a description of the Ivar layout for {@code cls}
     */
    @Nullable
    @NativeType("uint8_t const *")
    public static String class_getIvarLayout(@NativeType("Class") long cls) {
        long __result = nclass_getIvarLayout(cls);
        return memASCIISafe(__result);
    }

    // --- [ class_getWeakIvarLayout ] ---

    /** Unsafe version of: {@link #class_getWeakIvarLayout} */
    public static long nclass_getWeakIvarLayout(long cls) {
        long __functionAddress = Functions.class_getWeakIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        return invokePP(cls, __functionAddress);
    }

    /**
     * Returns a description of the layout of weak Ivars for a given class.
     *
     * @param cls the class to inspect
     *
     * @return a description of the layout of the weak Ivars for {@code cls}
     */
    @Nullable
    @NativeType("uint8_t const *")
    public static String class_getWeakIvarLayout(@NativeType("Class") long cls) {
        long __result = nclass_getWeakIvarLayout(cls);
        return memASCIISafe(__result);
    }

    // --- [ class_addMethod ] ---

    /** Unsafe version of: {@link #class_addMethod} */
    public static boolean nclass_addMethod(long cls, long name, long imp, long types) {
        long __functionAddress = Functions.class_addMethod;
        if (CHECKS) {
            check(cls);
            check(name);
            check(imp);
        }
        return invokePPPPZ(cls, name, imp, types, __functionAddress);
    }

    /**
     * Adds a new method to a class with a given name and implementation.
     * 
     * <h5>Discussion</h5>
     * 
     * <p>class_addMethod will add an override of a superclass's implementation, but will not replace an existing implementation in this class. To change an
     * existing implementation, use {@link #method_setImplementation}.</p>
     * 
     * <p>An Objective-C method is simply a C function that takes at least two arguments &ndash; {@code self} and {@code _cmd}. For example, given the following
     * function:</p>
     * 
     * <pre><code>
     * void myMethodIMP(id self, SEL _cmd)
     * {
     *     // implementation ....
     * }</code></pre>
     * 
     * <p>you can dynamically add it to a class as a method (called {@code resolveThisMethodDynamically}) like this:</p>
     * 
     * <pre><code>
     * class_addMethod([self class], @selector(resolveThisMethodDynamically), (IMP) myMethodIMP, "v@:");</code></pre>
     *
     * @param cls   the class to which to add a method
     * @param name  a selector that specifies the name of the method being added
     * @param imp   a function which is the implementation of the new method. The function must take at least two arguments &ndash; {@code self} and {@code _cmd}.
     * @param types an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming
     *              Guide</em> &gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self}
     *              and {@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
     *
     * @return {@link #YES} if the method was added successfully, otherwise {@link #NO} (for example, the class already contains a method implementation with that name)
     */
    @NativeType("BOOL")
    public static boolean class_addMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") ByteBuffer types) {
        if (CHECKS) {
            checkNT1(types);
        }
        return nclass_addMethod(cls, name, imp, memAddress(types));
    }

    /**
     * Adds a new method to a class with a given name and implementation.
     * 
     * <h5>Discussion</h5>
     * 
     * <p>class_addMethod will add an override of a superclass's implementation, but will not replace an existing implementation in this class. To change an
     * existing implementation, use {@link #method_setImplementation}.</p>
     * 
     * <p>An Objective-C method is simply a C function that takes at least two arguments &ndash; {@code self} and {@code _cmd}. For example, given the following
     * function:</p>
     * 
     * <pre><code>
     * void myMethodIMP(id self, SEL _cmd)
     * {
     *     // implementation ....
     * }</code></pre>
     * 
     * <p>you can dynamically add it to a class as a method (called {@code resolveThisMethodDynamically}) like this:</p>
     * 
     * <pre><code>
     * class_addMethod([self class], @selector(resolveThisMethodDynamically), (IMP) myMethodIMP, "v@:");</code></pre>
     *
     * @param cls   the class to which to add a method
     * @param name  a selector that specifies the name of the method being added
     * @param imp   a function which is the implementation of the new method. The function must take at least two arguments &ndash; {@code self} and {@code _cmd}.
     * @param types an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming
     *              Guide</em> &gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self}
     *              and {@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
     *
     * @return {@link #YES} if the method was added successfully, otherwise {@link #NO} (for example, the class already contains a method implementation with that name)
     */
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

    /** Unsafe version of: {@link #class_replaceMethod} */
    public static long nclass_replaceMethod(long cls, long name, long imp, long types) {
        long __functionAddress = Functions.class_replaceMethod;
        if (CHECKS) {
            check(cls);
            check(name);
            check(imp);
        }
        return invokePPPPP(cls, name, imp, types, __functionAddress);
    }

    /**
     * Replaces the implementation of a method for a given class.
     * 
     * <h5>Discussion</h5>
     * 
     * <p>This function behaves in two different ways:</p>
     * 
     * <ul>
     * <li>If the method identified by name does not yet exist, it is added as if class_addMethod were called. The type encoding specified by types is used as
     * given.</li>
     * <li>If the method identified by name does exist, its IMP is replaced as if method_setImplementation were called. The type encoding specified by types
     * is ignored.</li>
     * </ul>
     *
     * @param cls   the class you want to modify
     * @param name  a selector that identifies the method whose implementation you want to replace
     * @param imp   the new implementation for the method identified by {@code name} for the class identified by {@code cls}
     * @param types an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming
     *              Guide</em> &gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self}
     *              and {@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
     *
     * @return the previous implementation of the method identified by {@code name} for the class identified by {@code cls}
     */
    @NativeType("IMP")
    public static long class_replaceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") ByteBuffer types) {
        if (CHECKS) {
            checkNT1(types);
        }
        return nclass_replaceMethod(cls, name, imp, memAddress(types));
    }

    /**
     * Replaces the implementation of a method for a given class.
     * 
     * <h5>Discussion</h5>
     * 
     * <p>This function behaves in two different ways:</p>
     * 
     * <ul>
     * <li>If the method identified by name does not yet exist, it is added as if class_addMethod were called. The type encoding specified by types is used as
     * given.</li>
     * <li>If the method identified by name does exist, its IMP is replaced as if method_setImplementation were called. The type encoding specified by types
     * is ignored.</li>
     * </ul>
     *
     * @param cls   the class you want to modify
     * @param name  a selector that identifies the method whose implementation you want to replace
     * @param imp   the new implementation for the method identified by {@code name} for the class identified by {@code cls}
     * @param types an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming
     *              Guide</em> &gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self}
     *              and {@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
     *
     * @return the previous implementation of the method identified by {@code name} for the class identified by {@code cls}
     */
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

    /** Unsafe version of: {@link #class_addIvar} */
    public static boolean nclass_addIvar(long cls, long name, long size, byte alignment, long types) {
        long __functionAddress = Functions.class_addIvar;
        if (CHECKS) {
            check(cls);
        }
        return invokePPPUPZ(cls, name, size, alignment, types, __functionAddress);
    }

    /**
     * Adds a new instance variable to a class.
     * 
     * <p>This function may only be called after {@link #objc_allocateClassPair} and before {@link #objc_registerClassPair}. Adding an instance variable to an existing class
     * is not supported.</p>
     * 
     * <p>The class must not be a metaclass. Adding an instance variable to a metaclass is not supported.</p>
     * 
     * <p>The instance variable's minimum alignment in bytes is {@code 1<<align}. The minimum alignment of an instance variable depends on the ivar's type and
     * the machine architecture. For variables of any pointer type, pass {@code log2(sizeof(pointer_type))}.</p>
     *
     * @return {@link #YES} if the instance variable was added successfully, otherwise {@link #NO} (for example, the class already contains an instance variable with that name)
     */
    @NativeType("BOOL")
    public static boolean class_addIvar(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("size_t") long size, @NativeType("uint8_t") byte alignment, @NativeType("char const *") ByteBuffer types) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(types);
        }
        return nclass_addIvar(cls, memAddress(name), size, alignment, memAddress(types));
    }

    /**
     * Adds a new instance variable to a class.
     * 
     * <p>This function may only be called after {@link #objc_allocateClassPair} and before {@link #objc_registerClassPair}. Adding an instance variable to an existing class
     * is not supported.</p>
     * 
     * <p>The class must not be a metaclass. Adding an instance variable to a metaclass is not supported.</p>
     * 
     * <p>The instance variable's minimum alignment in bytes is {@code 1<<align}. The minimum alignment of an instance variable depends on the ivar's type and
     * the machine architecture. For variables of any pointer type, pass {@code log2(sizeof(pointer_type))}.</p>
     *
     * @return {@link #YES} if the instance variable was added successfully, otherwise {@link #NO} (for example, the class already contains an instance variable with that name)
     */
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

    /**
     * Adds a protocol to a class.
     *
     * @param cls      the class to modify
     * @param protocol the protocol to add to {@code cls}
     *
     * @return {@link #YES} if the protocol was added successfully, otherwise {@link #NO} (for example, the class already conforms to that protocol)
     */
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

    /**
     * Unsafe version of: {@link #class_addProperty}
     *
     * @param attributeCount the number of attributes in {@code attributes}
     */
    public static boolean nclass_addProperty(long cls, long name, long attributes, int attributeCount) {
        long __functionAddress = Functions.class_addProperty;
        if (CHECKS) {
            check(cls);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        return invokePPPZ(cls, name, attributes, attributeCount, __functionAddress);
    }

    /**
     * Adds a property to a class.
     *
     * @param cls        the class to modify
     * @param name       the name of the property
     * @param attributes an array of property attributes
     *
     * @return {@link #YES} if the property was added successfully; otherwise {@link #NO} (for example, this function returns {@link #NO} if the class already has that property)
     */
    @NativeType("BOOL")
    public static boolean class_addProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclass_addProperty(cls, memAddress(name), attributes.address(), attributes.remaining());
    }

    /**
     * Adds a property to a class.
     *
     * @param cls        the class to modify
     * @param name       the name of the property
     * @param attributes an array of property attributes
     *
     * @return {@link #YES} if the property was added successfully; otherwise {@link #NO} (for example, this function returns {@link #NO} if the class already has that property)
     */
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

    /**
     * Unsafe version of: {@link #class_replaceProperty}
     *
     * @param attributeCount the number of attributes in {@code attributes}
     */
    public static void nclass_replaceProperty(long cls, long name, long attributes, int attributeCount) {
        long __functionAddress = Functions.class_replaceProperty;
        if (CHECKS) {
            check(cls);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        invokePPPV(cls, name, attributes, attributeCount, __functionAddress);
    }

    /**
     * Replaces a property of a class.
     *
     * @param cls        the class to modify
     * @param name       the name of the property
     * @param attributes an array of property attributes
     */
    public static void class_replaceProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        if (CHECKS) {
            checkNT1(name);
        }
        nclass_replaceProperty(cls, memAddress(name), attributes.address(), attributes.remaining());
    }

    /**
     * Replaces a property of a class.
     *
     * @param cls        the class to modify
     * @param name       the name of the property
     * @param attributes an array of property attributes
     */
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

    /** Unsafe version of: {@link #class_setIvarLayout} */
    public static void nclass_setIvarLayout(long cls, long layout) {
        long __functionAddress = Functions.class_setIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        invokePPV(cls, layout, __functionAddress);
    }

    /**
     * Sets the Ivar layout for a given class.
     *
     * @param cls    the class to modify
     * @param layout the layout of the Ivars for {@code cls}
     */
    public static void class_setIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") ByteBuffer layout) {
        if (CHECKS) {
            checkNT1(layout);
        }
        nclass_setIvarLayout(cls, memAddress(layout));
    }

    /**
     * Sets the Ivar layout for a given class.
     *
     * @param cls    the class to modify
     * @param layout the layout of the Ivars for {@code cls}
     */
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

    /** Unsafe version of: {@link #class_setWeakIvarLayout} */
    public static void nclass_setWeakIvarLayout(long cls, long layout) {
        long __functionAddress = Functions.class_setWeakIvarLayout;
        if (CHECKS) {
            check(cls);
        }
        invokePPV(cls, layout, __functionAddress);
    }

    /**
     * Sets the layout for weak Ivars for a given class.
     *
     * @param cls    the class to modify
     * @param layout the layout of the weak Ivars for {@code cls}
     */
    public static void class_setWeakIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") ByteBuffer layout) {
        if (CHECKS) {
            checkNT1(layout);
        }
        nclass_setWeakIvarLayout(cls, memAddress(layout));
    }

    /**
     * Sets the layout for weak Ivars for a given class.
     *
     * @param cls    the class to modify
     * @param layout the layout of the weak Ivars for {@code cls}
     */
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

    /**
     * Creates an instance of a class, allocating memory for the class in the default malloc memory zone.
     *
     * @param cls        the class that you want to allocate an instance of
     * @param extraBytes an integer indicating the number of extra bytes to allocate. The additional bytes can be used to store additional instance variables beyond those
     *                   defined in the class definition.
     *
     * @return an instance of the class {@code cls}
     */
    @NativeType("id")
    public static long class_createInstance(@NativeType("Class") long cls, @NativeType("size_t") long extraBytes) {
        long __functionAddress = Functions.class_createInstance;
        if (CHECKS) {
            check(cls);
        }
        return invokePPP(cls, extraBytes, __functionAddress);
    }

    // --- [ objc_constructInstance ] ---

    /** Unsafe version of: {@link #objc_constructInstance} */
    public static long nobjc_constructInstance(long cls, long bytes) {
        long __functionAddress = Functions.objc_constructInstance;
        return invokePPP(cls, bytes, __functionAddress);
    }

    /**
     * Creates an instance of a class at the specified location.
     *
     * @param cls   the class that you want to allocate an instance of
     * @param bytes the location at which to allocate an instance of the {@code cls} class. {@code bytes} must point to at least {@code class_getInstanceSize(cls)}
     *              bytes of well-aligned, zero-filled memory.
     *
     * @return an instance of the class {@code cls} at {@code bytes}, if successful; otherwise {@link #nil} (for example, if {@code cls} or {@code bytes} are themselves {@link #nil})
     */
    @NativeType("id")
    public static long objc_constructInstance(@NativeType("Class") long cls, @Nullable @NativeType("void *") ByteBuffer bytes) {
        if (CHECKS) {
            if (DEBUG) {
                checkSafe(bytes, class_getInstanceSize(cls));
            }
        }
        return nobjc_constructInstance(cls, memAddressSafe(bytes));
    }

    // --- [ objc_destructInstance ] ---

    /**
     * Destroys an instance of a class without freeing memory and removes any of its associated references.
     * 
     * <p>This method does nothing if obj is {@link #nil}.</p>
     * 
     * <h5>Important</h5>
     * 
     * <p>The garbage collector does not call this function. As a result, if you edit this function, you should also edit finalize. That said, Core Foundation
     * and other clients do call this function under garbage collection.</p>
     *
     * @param obj the instance to destroy
     */
    @NativeType("void *")
    public static long objc_destructInstance(@NativeType("id") long obj) {
        long __functionAddress = Functions.objc_destructInstance;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ objc_allocateClassPair ] ---

    /** Unsafe version of: {@link #objc_allocateClassPair} */
    public static long nobjc_allocateClassPair(long superclass, long name, long extraBytes) {
        long __functionAddress = Functions.objc_allocateClassPair;
        return invokePPPP(superclass, name, extraBytes, __functionAddress);
    }

    /**
     * Creates a new class and metaclass.
     * 
     * <p>You can get a pointer to the new metaclass by calling {@code object_getClass(newClass)}.</p>
     * 
     * <p>To create a new class, start by calling objc_allocateClassPair. Then set the class's attributes with functions like {@link #class_addMethod} and
     * {@link #class_addIvar}. When you are done building the class, call {@link #objc_registerClassPair}. The new class is now ready for use.</p>
     * 
     * <p>Instance methods and instance variables should be added to the class itself. Class methods should be added to the metaclass.</p>
     *
     * @param superclass the class to use as the new class's superclass, or Nil to create a new root class
     * @param name       the string to use as the new class's name. The string will be copied.
     * @param extraBytes the number of bytes to allocate for indexed ivars at the end of the class and metaclass objects. This should usually be 0.
     *
     * @return the new class, or Nil if the class could not be created (for example, the desired name is already in use)
     */
    @NativeType("Class")
    public static long objc_allocateClassPair(@NativeType("Class") long superclass, @NativeType("char const *") ByteBuffer name, @NativeType("size_t") long extraBytes) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_allocateClassPair(superclass, memAddress(name), extraBytes);
    }

    /**
     * Creates a new class and metaclass.
     * 
     * <p>You can get a pointer to the new metaclass by calling {@code object_getClass(newClass)}.</p>
     * 
     * <p>To create a new class, start by calling objc_allocateClassPair. Then set the class's attributes with functions like {@link #class_addMethod} and
     * {@link #class_addIvar}. When you are done building the class, call {@link #objc_registerClassPair}. The new class is now ready for use.</p>
     * 
     * <p>Instance methods and instance variables should be added to the class itself. Class methods should be added to the metaclass.</p>
     *
     * @param superclass the class to use as the new class's superclass, or Nil to create a new root class
     * @param name       the string to use as the new class's name. The string will be copied.
     * @param extraBytes the number of bytes to allocate for indexed ivars at the end of the class and metaclass objects. This should usually be 0.
     *
     * @return the new class, or Nil if the class could not be created (for example, the desired name is already in use)
     */
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

    /**
     * Registers a class that was allocated using {@link #objc_allocateClassPair}.
     *
     * @param cls the class you want to register
     */
    public static void objc_registerClassPair(@NativeType("Class") long cls) {
        long __functionAddress = Functions.objc_registerClassPair;
        if (CHECKS) {
            check(cls);
        }
        invokePV(cls, __functionAddress);
    }

    // --- [ objc_disposeClassPair ] ---

    /**
     * Destroys a class and its associated metaclass.
     * 
     * <p>Do not call this function if instances of the {@code cls} class or any subclass exist.</p>
     *
     * @param cls the class to be destroyed. This class must have been allocated using {@link #objc_allocateClassPair}.
     */
    public static void objc_disposeClassPair(@NativeType("Class") long cls) {
        long __functionAddress = Functions.objc_disposeClassPair;
        if (CHECKS) {
            check(cls);
        }
        invokePV(cls, __functionAddress);
    }

    // --- [ method_getName ] ---

    /**
     * Returns the name of a method.
     * 
     * <p>To get the method name as a C string, call {@code sel_getName(method_getName(method))}.</p>
     *
     * @param m the method to inspect
     *
     * @return a pointer of type SEL
     */
    @NativeType("SEL")
    public static long method_getName(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getName;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    // --- [ method_getImplementation ] ---

    /**
     * Returns the implementation of a method.
     *
     * @param m the method to inspect
     *
     * @return a function pointer of type IMP
     */
    @NativeType("IMP")
    public static long method_getImplementation(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getImplementation;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    // --- [ method_getTypeEncoding ] ---

    /** Unsafe version of: {@link #method_getTypeEncoding} */
    public static long nmethod_getTypeEncoding(long m) {
        long __functionAddress = Functions.method_getTypeEncoding;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    /**
     * Returns a string describing a method's parameter and return types.
     *
     * @param m the method to inspect
     *
     * @return a C string. The string may be {@code NULL}
     */
    @Nullable
    @NativeType("char const *")
    public static String method_getTypeEncoding(@NativeType("Method") long m) {
        long __result = nmethod_getTypeEncoding(m);
        return memUTF8Safe(__result);
    }

    // --- [ method_getNumberOfArguments ] ---

    /**
     * Returns the number of arguments accepted by a method.
     *
     * @param m a pointer to a Method data structure. Pass the method in question.
     *
     * @return an integer containing the number of arguments accepted by the given method
     */
    @NativeType("unsigned int")
    public static int method_getNumberOfArguments(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getNumberOfArguments;
        if (CHECKS) {
            check(m);
        }
        return invokePI(m, __functionAddress);
    }

    // --- [ method_copyReturnType ] ---

    /** Unsafe version of: {@link #method_copyReturnType} */
    public static long nmethod_copyReturnType(long m) {
        long __functionAddress = Functions.method_copyReturnType;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, __functionAddress);
    }

    /**
     * Returns a string describing a method's return type.
     *
     * @param m the method to inspect
     *
     * @return a C string describing the return type. You must free the string with free().
     */
    @Nullable
    @NativeType("char *")
    public static String method_copyReturnType(@NativeType("Method") long m) {
        long __result = nmethod_copyReturnType(m);
        return memUTF8Safe(__result);
    }

    // --- [ method_copyArgumentType ] ---

    /** Unsafe version of: {@link #method_copyArgumentType} */
    public static long nmethod_copyArgumentType(long m, int index) {
        long __functionAddress = Functions.method_copyArgumentType;
        if (CHECKS) {
            check(m);
        }
        return invokePP(m, index, __functionAddress);
    }

    /**
     * Returns a string describing a single parameter type of a method.
     *
     * @param m     the method to inspect
     * @param index the index of the parameter to inspect
     *
     * @return a C string describing the type of the parameter at index {@code index}, or {@code NULL} if method has no parameter index {@code index}. You must free the
     *         string with free().
     */
    @Nullable
    @NativeType("char *")
    public static String method_copyArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index) {
        long __result = NULL;
        try {
            __result = nmethod_copyArgumentType(m, index);
            return memUTF8Safe(__result);
        } finally {
            if (__result != NULL) org.lwjgl.system.libc.LibCStdlib.nfree(__result);
        }
    }

    // --- [ method_getReturnType ] ---

    /**
     * Unsafe version of: {@link #method_getReturnType}
     *
     * @param dst_len the maximum number of characters that can be stored in {@code dst}
     */
    public static void nmethod_getReturnType(long m, long dst, long dst_len) {
        long __functionAddress = Functions.method_getReturnType;
        if (CHECKS) {
            check(m);
        }
        invokePPPV(m, dst, dst_len, __functionAddress);
    }

    /**
     * Returns by reference a string describing a method's return type.
     * 
     * <p>The method's return type string is copied to {@code dst}. {@code dst} is filled as if {@code strncpy(dst, parameter_type, dst_len)} were called.</p>
     *
     * @param m   the method to inspect
     * @param dst the reference string to store the description
     */
    public static void method_getReturnType(@NativeType("Method") long m, @NativeType("char *") ByteBuffer dst) {
        nmethod_getReturnType(m, memAddress(dst), dst.remaining());
    }

    /**
     * Returns by reference a string describing a method's return type.
     * 
     * <p>The method's return type string is copied to {@code dst}. {@code dst} is filled as if {@code strncpy(dst, parameter_type, dst_len)} were called.</p>
     *
     * @param m       the method to inspect
     * @param dst_len the maximum number of characters that can be stored in {@code dst}
     */
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

    /**
     * Unsafe version of: {@link #method_getArgumentType}
     *
     * @param dst_len the maximum number of characters that can be stored in {@code dst}
     */
    public static void nmethod_getArgumentType(long m, int index, long dst, long dst_len) {
        long __functionAddress = Functions.method_getArgumentType;
        if (CHECKS) {
            check(m);
        }
        invokePPPV(m, index, dst, dst_len, __functionAddress);
    }

    /**
     * Returns by reference a string describing a single parameter type of a method.
     * 
     * <p>The parameter type string is copied to {@code dst}. {@code dst} is filled as if {@code strncpy(dst, parameter_type, dst_len)} were called. If the
     * method contains no parameter with that index, {@code dst} is filled as if {@code strncpy(dst, "", dst_len)} were called.</p>
     *
     * @param m     the method you want to inquire about
     * @param index the index of the parameter you want to inquire about
     * @param dst   the reference string to store the description
     */
    public static void method_getArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index, @NativeType("char *") ByteBuffer dst) {
        nmethod_getArgumentType(m, index, memAddress(dst), dst.remaining());
    }

    /**
     * Returns by reference a string describing a single parameter type of a method.
     * 
     * <p>The parameter type string is copied to {@code dst}. {@code dst} is filled as if {@code strncpy(dst, parameter_type, dst_len)} were called. If the
     * method contains no parameter with that index, {@code dst} is filled as if {@code strncpy(dst, "", dst_len)} were called.</p>
     *
     * @param m       the method you want to inquire about
     * @param index   the index of the parameter you want to inquire about
     * @param dst_len the maximum number of characters that can be stored in {@code dst}
     */
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

    /**
     * Sets the implementation of a method.
     *
     * @param m   the method for which to set an implementation
     * @param imp the implemention to set to this method
     *
     * @return the previous implementation of the method
     */
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

    /**
     * Exchanges the implementations of two methods.
     *
     * @param m1 the method to exchange with second method
     * @param m2 the method to exchange with first method
     */
    public static void method_exchangeImplementations(@NativeType("Method") long m1, @NativeType("Method") long m2) {
        long __functionAddress = Functions.method_exchangeImplementations;
        if (CHECKS) {
            check(m1);
            check(m2);
        }
        invokePPV(m1, m2, __functionAddress);
    }

    // --- [ ivar_getName ] ---

    /** Unsafe version of: {@link #ivar_getName} */
    public static long nivar_getName(long v) {
        long __functionAddress = Functions.ivar_getName;
        if (CHECKS) {
            check(v);
        }
        return invokePP(v, __functionAddress);
    }

    /**
     * Returns the name of an instance variable.
     *
     * @param v the instance variable
     *
     * @return a C string containing the instance variable's name
     */
    @Nullable
    @NativeType("char const *")
    public static String ivar_getName(@NativeType("Ivar") long v) {
        long __result = nivar_getName(v);
        return memUTF8Safe(__result);
    }

    // --- [ ivar_getTypeEncoding ] ---

    /** Unsafe version of: {@link #ivar_getTypeEncoding} */
    public static long nivar_getTypeEncoding(long v) {
        long __functionAddress = Functions.ivar_getTypeEncoding;
        if (CHECKS) {
            check(v);
        }
        return invokePP(v, __functionAddress);
    }

    /**
     * Returns the type string of an instance variable.
     *
     * @param v the instance variable
     *
     * @return a C string containing the instance variable's type encoding
     */
    @Nullable
    @NativeType("char const *")
    public static String ivar_getTypeEncoding(@NativeType("Ivar") long v) {
        long __result = nivar_getTypeEncoding(v);
        return memUTF8Safe(__result);
    }

    // --- [ ivar_getOffset ] ---

    /**
     * Returns the offset of an instance variable.
     * 
     * <p>For instance variables of type {@code id} or other object types, call {@link #object_getIvar} and {@link #object_setIvar} instead of using this offset to access
     * the instance variable data directly.</p>
     *
     * @param v the instance variable
     *
     * @return the offset of {@code v}
     */
    @NativeType("ptrdiff_t")
    public static long ivar_getOffset(@NativeType("Ivar") long v) {
        long __functionAddress = Functions.ivar_getOffset;
        if (CHECKS) {
            check(v);
        }
        return invokePP(v, __functionAddress);
    }

    // --- [ property_getName ] ---

    /** Unsafe version of: {@link #property_getName} */
    public static long nproperty_getName(long property) {
        long __functionAddress = Functions.property_getName;
        if (CHECKS) {
            check(property);
        }
        return invokePP(property, __functionAddress);
    }

    /**
     * Returns the name of a property.
     *
     * @param property the property you want to inquire about
     *
     * @return a C string containing the property's name
     */
    @Nullable
    @NativeType("char const *")
    public static String property_getName(@NativeType("objc_property_t") long property) {
        long __result = nproperty_getName(property);
        return memUTF8Safe(__result);
    }

    // --- [ property_getAttributes ] ---

    /** Unsafe version of: {@link #property_getAttributes} */
    public static long nproperty_getAttributes(long property) {
        long __functionAddress = Functions.property_getAttributes;
        if (CHECKS) {
            check(property);
        }
        return invokePP(property, __functionAddress);
    }

    /**
     * Returns the attribute string of a property.
     *
     * @param property a property
     *
     * @return a C string containing the property's attributes
     */
    @Nullable
    @NativeType("char const *")
    public static String property_getAttributes(@NativeType("objc_property_t") long property) {
        long __result = nproperty_getAttributes(property);
        return memUTF8Safe(__result);
    }

    // --- [ property_copyAttributeList ] ---

    /**
     * Unsafe version of: {@link #property_copyAttributeList}
     *
     * @param outCount the number of attributes returned in the array
     */
    public static long nproperty_copyAttributeList(long property, long outCount) {
        long __functionAddress = Functions.property_copyAttributeList;
        if (CHECKS) {
            check(property);
        }
        return invokePPP(property, outCount, __functionAddress);
    }

    /**
     * Returns an array of property attributes for a given property.
     *
     * @param property the property whose attributes you want to copy
     *
     * @return an array of property attributes. You must free the array with free().
     */
    @Nullable
    @NativeType("objc_property_attribute_t *")
    public static ObjCPropertyAttribute.Buffer property_copyAttributeList(@NativeType("objc_property_t") long property) {
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

    /** Unsafe version of: {@link #property_copyAttributeValue} */
    public static long nproperty_copyAttributeValue(long property, long attributeName) {
        long __functionAddress = Functions.property_copyAttributeValue;
        if (CHECKS) {
            check(property);
        }
        return invokePPP(property, attributeName, __functionAddress);
    }

    /**
     * Returns the value of a property attribute given the attribute name.
     *
     * @param property      the property whose value you are interested in
     * @param attributeName a C string representing the name of the attribute
     *
     * @return The value string of the {@code attributeName} attribute, if one exists in {@code property}; otherwise, {@link #nil}. You must free the returned value string
     *         with free().
     */
    @Nullable
    @NativeType("char *")
    public static String property_copyAttributeValue(@NativeType("objc_property_t") long property, @NativeType("char const *") ByteBuffer attributeName) {
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

    /**
     * Returns the value of a property attribute given the attribute name.
     *
     * @param property      the property whose value you are interested in
     * @param attributeName a C string representing the name of the attribute
     *
     * @return The value string of the {@code attributeName} attribute, if one exists in {@code property}; otherwise, {@link #nil}. You must free the returned value string
     *         with free().
     */
    @Nullable
    @NativeType("char *")
    public static String property_copyAttributeValue(@NativeType("objc_property_t") long property, @NativeType("char const *") CharSequence attributeName) {
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

    /** Unsafe version of: {@link #objc_getProtocol} */
    public static long nobjc_getProtocol(long name) {
        long __functionAddress = Functions.objc_getProtocol;
        return invokePP(name, __functionAddress);
    }

    /**
     * Returns a specified protocol.
     * 
     * <p>This function acquires the runtime lock.</p>
     *
     * @param name the name of a protocol
     *
     * @return the protocol named {@code name}{, or {@code NULL} if no protocol named name could be found
     */
    @NativeType("Protocol *")
    public static long objc_getProtocol(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_getProtocol(memAddress(name));
    }

    /**
     * Returns a specified protocol.
     * 
     * <p>This function acquires the runtime lock.</p>
     *
     * @param name the name of a protocol
     *
     * @return the protocol named {@code name}{, or {@code NULL} if no protocol named name could be found
     */
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

    /**
     * Unsafe version of: {@link #objc_copyProtocolList}
     *
     * @param outCount upon return, contains the number of protocols in the returned array
     */
    public static long nobjc_copyProtocolList(long outCount) {
        long __functionAddress = Functions.objc_copyProtocolList;
        return invokePP(outCount, __functionAddress);
    }

    /**
     * Returns an array of all the protocols known to the runtime.
     *
     * @return a C array of all the protocols known to the runtime. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the
     *         list with free().
     */
    @Nullable
    @NativeType("Protocol **")
    public static PointerBuffer objc_copyProtocolList() {
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

    /**
     * Returns a Boolean value that indicates whether one protocol conforms to another protocol.
     * 
     * <h5>Discussion</h5>
     * 
     * <p>One protocol can incorporate other protocols using the same syntax that classes use to adopt a protocol:</p>
     * 
     * <p>{@code @protocol ProtocolName < protocol list >}</p>
     * 
     * <p>All the protocols listed between angle brackets are considered part of the {@code ProtocolName} protocol.</p>
     *
     * @param proto a protocol
     * @param other a protocol
     *
     * @return {@link #YES} if {@code proto} conforms to {@code other}, otherwise {@link #NO}
     */
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

    /**
     * Returns a Boolean value that indicates whether two protocols are equal.
     *
     * @param proto a protocol
     * @param other a protocol
     *
     * @return {@link #YES} if proto is the same as other, otherwise {@link #NO}
     */
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

    /** Unsafe version of: {@link #protocol_getName} */
    public static long nprotocol_getName(long p) {
        long __functionAddress = Functions.protocol_getName;
        if (CHECKS) {
            check(p);
        }
        return invokePP(p, __functionAddress);
    }

    /**
     * Returns a the name of a protocol.
     *
     * @param p a protocol
     *
     * @return the name of the protocol {@code p} as a C string
     */
    @Nullable
    @NativeType("char const *")
    public static String protocol_getName(@NativeType("Protocol *") long p) {
        long __result = nprotocol_getName(p);
        return memUTF8Safe(__result);
    }

    // --- [ protocol_getMethodDescription ] ---

    /** Unsafe version of: {@link #protocol_getMethodDescription} */
    public static native void nprotocol_getMethodDescription(long p, long aSel, boolean isRequiredMethod, boolean isInstanceMethod, long __functionAddress, long __result);

    /** Unsafe version of: {@link #protocol_getMethodDescription} */
    public static void nprotocol_getMethodDescription(long p, long aSel, boolean isRequiredMethod, boolean isInstanceMethod, long __result) {
        long __functionAddress = Functions.protocol_getMethodDescription;
        if (CHECKS) {
            check(p);
            check(aSel);
        }
        nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __functionAddress, __result);
    }

    /**
     * Returns a method description structure for a specified method of a given protocol.
     *
     * @param p                a protocol
     * @param aSel             a selector
     * @param isRequiredMethod a Boolean value that indicates whether {@code aSel} is a required method
     * @param isInstanceMethod a Boolean value that indicates whether {@code aSel} is a instance method
     * @param __result         an objc_method_description structure that describes the method specified by {@code aSel}, {@code isRequiredMethod}, and {@code isInstanceMethod} for
     *                         the protocol {@code p}.
     *                         
     *                         <p>If the protocol does not contain the specified method, returns an objc_method_description structure with the value {@code {NULL, NULL}}.</p>
     */
    @NativeType("struct objc_method_description")
    public static ObjCMethodDescription protocol_getMethodDescription(@NativeType("Protocol *") long p, @NativeType("SEL") long aSel, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod, @NativeType("struct objc_method_description") ObjCMethodDescription __result) {
        nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __result.address());
        return __result;
    }

    // --- [ protocol_copyMethodDescriptionList ] ---

    /**
     * Unsafe version of: {@link #protocol_copyMethodDescriptionList}
     *
     * @param outCount upon return, contains the number of method description structures in the returned array
     */
    public static long nprotocol_copyMethodDescriptionList(long p, boolean isRequiredMethod, boolean isInstanceMethod, long outCount) {
        long __functionAddress = Functions.protocol_copyMethodDescriptionList;
        if (CHECKS) {
            check(p);
        }
        return invokePPP(p, isRequiredMethod, isInstanceMethod, outCount, __functionAddress);
    }

    /**
     * Returns an array of method descriptions of methods meeting a given specification for a given protocol.
     * 
     * <p>Methods in other protocols adopted by this protocol are not included.</p>
     *
     * @param p                a protocol
     * @param isRequiredMethod a Boolean value that indicates whether returned methods should be required methods (pass {@link #YES} to specify required methods)
     * @param isInstanceMethod a Boolean value that indicates whether returned methods should be instance methods (pass {@link #YES} to specify instance methods)
     *
     * @return a C array of objc_method_description structures containing the names and types of {@code p}'s methods specified by {@code isRequiredMethod} and
     *         {@code isInstanceMethod}. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the list with free().
     *         
     *         <p>If the protocol declares no methods that meet the specification, {@code NULL} is returned and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("struct objc_method_description *")
    public static ObjCMethodDescription.Buffer protocol_copyMethodDescriptionList(@NativeType("Protocol *") long p, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
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

    /** Unsafe version of: {@link #protocol_getProperty} */
    public static long nprotocol_getProperty(long proto, long name, boolean isRequiredProperty, boolean isInstanceProperty) {
        long __functionAddress = Functions.protocol_getProperty;
        if (CHECKS) {
            check(proto);
        }
        return invokePPP(proto, name, isRequiredProperty, isInstanceProperty, __functionAddress);
    }

    /**
     * Returns the specified property of a given protocol.
     *
     * @param proto              a protocol
     * @param name               the name of a property
     * @param isRequiredProperty a Boolean value that indicates whether {@code name} is a required property
     * @param isInstanceProperty a Boolean value that indicates whether {@code name} is a instance property
     *
     * @return the property specified by {@code name}, {@code isRequiredProperty}, and {@code isInstanceProperty} for {@code proto}, or {@code NULL} if none of
     *         {@code proto}'s properties meets the specification
     */
    @NativeType("objc_property_t")
    public static long protocol_getProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") ByteBuffer name, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nprotocol_getProperty(proto, memAddress(name), isRequiredProperty, isInstanceProperty);
    }

    /**
     * Returns the specified property of a given protocol.
     *
     * @param proto              a protocol
     * @param name               the name of a property
     * @param isRequiredProperty a Boolean value that indicates whether {@code name} is a required property
     * @param isInstanceProperty a Boolean value that indicates whether {@code name} is a instance property
     *
     * @return the property specified by {@code name}, {@code isRequiredProperty}, and {@code isInstanceProperty} for {@code proto}, or {@code NULL} if none of
     *         {@code proto}'s properties meets the specification
     */
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

    /**
     * Unsafe version of: {@link #protocol_copyPropertyList}
     *
     * @param outCount upon return, contains the number of elements in the returned array
     */
    public static long nprotocol_copyPropertyList(long proto, long outCount) {
        long __functionAddress = Functions.protocol_copyPropertyList;
        if (CHECKS) {
            check(proto);
        }
        return invokePPP(proto, outCount, __functionAddress);
    }

    /**
     * Returns an array of the properties declared by a protocol.
     *
     * @param proto a protocol
     *
     * @return a C array of pointers of type objc_property_t describing the properties declared by {@code proto}. Any properties declared by other protocols adopted
     *         by this protocol are not included. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array with free().
     *         
     *         <p>If the protocol declares no properties, {@code NULL} is returned and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("objc_property_t *")
    public static PointerBuffer protocol_copyPropertyList(@NativeType("Protocol *") long proto) {
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

    /**
     * Unsafe version of: {@link #protocol_copyProtocolList}
     *
     * @param outCount upon return, contains the number of elements in the returned array
     */
    public static long nprotocol_copyProtocolList(long proto, long outCount) {
        long __functionAddress = Functions.protocol_copyProtocolList;
        if (CHECKS) {
            check(proto);
        }
        return invokePPP(proto, outCount, __functionAddress);
    }

    /**
     * eturns an array of the protocols adopted by a protocol.
     *
     * @param proto a protocol
     *
     * @return a C array of protocols adopted by {@code proto}. The array contains {@code *outCount} pointers followed by a {@code NULL} terminator. You must free the array
     *         with free().
     *         
     *         <p>If the protocol declares no properties, {@code NULL} is returned and {@code *outCount} is 0.</p>
     */
    @Nullable
    @NativeType("Protocol **")
    public static PointerBuffer protocol_copyProtocolList(@NativeType("Protocol *") long proto) {
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

    /** Unsafe version of: {@link #objc_allocateProtocol} */
    public static long nobjc_allocateProtocol(long name) {
        long __functionAddress = Functions.objc_allocateProtocol;
        return invokePP(name, __functionAddress);
    }

    /**
     * Creates a new protocol instance.
     * 
     * <p>You must register the returned protocol instance with the {@link #objc_registerProtocol} function before you can use it.</p>
     * 
     * <p>There is no dispose method associated with this function.</p>
     *
     * @param name the name of the protocol you want to create
     *
     * @return a new protocol instance or {@link #nil} if a protocol with the same name as {@code name} already exists
     */
    @NativeType("Protocol *")
    public static long objc_allocateProtocol(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nobjc_allocateProtocol(memAddress(name));
    }

    /**
     * Creates a new protocol instance.
     * 
     * <p>You must register the returned protocol instance with the {@link #objc_registerProtocol} function before you can use it.</p>
     * 
     * <p>There is no dispose method associated with this function.</p>
     *
     * @param name the name of the protocol you want to create
     *
     * @return a new protocol instance or {@link #nil} if a protocol with the same name as {@code name} already exists
     */
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

    /**
     * Registers a newly created protocol with the Objective-C runtime.
     * 
     * <p>When you create a new protocol using the {@link #objc_allocateProtocol}, you then register it with the Objective-C runtime by calling this function. After a
     * protocol is successfully registered, it is immutable and ready to use.</p>
     *
     * @param proto the protocol you want to register with the Objective-C runtime
     */
    public static void objc_registerProtocol(@NativeType("Protocol *") long proto) {
        long __functionAddress = Functions.objc_registerProtocol;
        if (CHECKS) {
            check(proto);
        }
        invokePV(proto, __functionAddress);
    }

    // --- [ protocol_addMethodDescription ] ---

    /** Unsafe version of: {@link #protocol_addMethodDescription} */
    public static void nprotocol_addMethodDescription(long proto, long name, long types, boolean isRequiredMethod, boolean isInstanceMethod) {
        long __functionAddress = Functions.protocol_addMethodDescription;
        if (CHECKS) {
            check(proto);
            check(name);
        }
        invokePPPV(proto, name, types, isRequiredMethod, isInstanceMethod, __functionAddress);
    }

    /**
     * Adds a method to a protocol.
     * 
     * <p>To add a method to a protocol using this function, the protocol must be under construction. That is, you must add any methods to proto before you
     * register it with the Objective-C runtime (via the {@link #objc_registerProtocol} function).</p>
     *
     * @param proto            the protocol you want to add a method to
     * @param name             the name of the method you want to add
     * @param types            a C string representing the signature of the method you want to add
     * @param isRequiredMethod a Boolean indicating whether the method is a required method of the {@code proto} protocol. If {@link #YES}, the method is a required method; if {@link #NO}, the
     *                         method is an optional method.
     * @param isInstanceMethod a Boolean indicating whether the method is an instance method. If {@link #YES}, the method is an instance method; if {@link #NO}, the method is a class method.
     */
    public static void protocol_addMethodDescription(@NativeType("Protocol *") long proto, @NativeType("SEL") long name, @NativeType("char const *") ByteBuffer types, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        if (CHECKS) {
            checkNT1(types);
        }
        nprotocol_addMethodDescription(proto, name, memAddress(types), isRequiredMethod, isInstanceMethod);
    }

    /**
     * Adds a method to a protocol.
     * 
     * <p>To add a method to a protocol using this function, the protocol must be under construction. That is, you must add any methods to proto before you
     * register it with the Objective-C runtime (via the {@link #objc_registerProtocol} function).</p>
     *
     * @param proto            the protocol you want to add a method to
     * @param name             the name of the method you want to add
     * @param types            a C string representing the signature of the method you want to add
     * @param isRequiredMethod a Boolean indicating whether the method is a required method of the {@code proto} protocol. If {@link #YES}, the method is a required method; if {@link #NO}, the
     *                         method is an optional method.
     * @param isInstanceMethod a Boolean indicating whether the method is an instance method. If {@link #YES}, the method is an instance method; if {@link #NO}, the method is a class method.
     */
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

    /**
     * Adds a registered protocol to another protocol that is under construction.
     * 
     * <p>The protocol you want to add to ({@code proto}) must be under construction &ndash; allocated but not yet registered with the Objective-C runtime. The
     * protocol you want to add ({@code addition}) must be registered already.</p>
     *
     * @param proto    the protocol you want to add the registered protocol to
     * @param addition the registered protocol you want to add to {@code proto}
     */
    public static void protocol_addProtocol(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long addition) {
        long __functionAddress = Functions.protocol_addProtocol;
        if (CHECKS) {
            check(proto);
            check(addition);
        }
        invokePPV(proto, addition, __functionAddress);
    }

    // --- [ protocol_addProperty ] ---

    /**
     * Unsafe version of: {@link #protocol_addProperty}
     *
     * @param attributeCount the number of properties in {@code attributes}
     */
    public static void nprotocol_addProperty(long proto, long name, long attributes, int attributeCount, boolean isRequiredProperty, boolean isInstanceProperty) {
        long __functionAddress = Functions.protocol_addProperty;
        if (CHECKS) {
            check(proto);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        invokePPPV(proto, name, attributes, attributeCount, isRequiredProperty, isInstanceProperty, __functionAddress);
    }

    /**
     * Adds a property to a protocol that is under construction.
     * 
     * <p>The protocol you want to add the property to must be under construction &ndash; allocated but not yet registered with the Objective-C runtime (via the
     * {@link #objc_registerProtocol} function).</p>
     *
     * @param proto              the protocol you want to add a property to
     * @param name               the name of the property you want to add.
     * @param attributes         an array of property attributes
     * @param isRequiredProperty a Boolean indicating whether the property's accessor methods are required methods of the {@code proto} protocol. If {@link #YES}, the property's accessor
     *                           methods are required methods; if {@link #NO}, the property's accessor methods are optional methods.
     * @param isInstanceProperty a Boolean indicating whether the property's accessor methods are instance methods. If {@link #YES}, the property's accessor methods are instance methods.
     *                           {@link #YES} is the only value allowed for a property. As a result, if you set this value to {@link #NO}, the property will not be added to the protocol.
     */
    public static void protocol_addProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        if (CHECKS) {
            checkNT1(name);
        }
        nprotocol_addProperty(proto, memAddress(name), attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
    }

    /**
     * Adds a property to a protocol that is under construction.
     * 
     * <p>The protocol you want to add the property to must be under construction &ndash; allocated but not yet registered with the Objective-C runtime (via the
     * {@link #objc_registerProtocol} function).</p>
     *
     * @param proto              the protocol you want to add a property to
     * @param name               the name of the property you want to add.
     * @param attributes         an array of property attributes
     * @param isRequiredProperty a Boolean indicating whether the property's accessor methods are required methods of the {@code proto} protocol. If {@link #YES}, the property's accessor
     *                           methods are required methods; if {@link #NO}, the property's accessor methods are optional methods.
     * @param isInstanceProperty a Boolean indicating whether the property's accessor methods are instance methods. If {@link #YES}, the property's accessor methods are instance methods.
     *                           {@link #YES} is the only value allowed for a property. As a result, if you set this value to {@link #NO}, the property will not be added to the protocol.
     */
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

    /**
     * Unsafe version of: {@link #objc_copyImageNames}
     *
     * @param outCount the number of names in the returned array
     */
    public static long nobjc_copyImageNames(long outCount) {
        long __functionAddress = Functions.objc_copyImageNames;
        return invokePP(outCount, __functionAddress);
    }

    /**
     * Returns the names of all the loaded Objective-C frameworks and dynamic libraries.
     *
     * @return an array of C strings representing the names of all the loaded Objective-C frameworks and dynamic libraries
     */
    @Nullable
    @NativeType("char const **")
    public static PointerBuffer objc_copyImageNames() {
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

    /** Unsafe version of: {@link #class_getImageName} */
    public static long nclass_getImageName(long cls) {
        long __functionAddress = Functions.class_getImageName;
        if (CHECKS) {
            check(cls);
        }
        return invokePP(cls, __functionAddress);
    }

    /**
     * Returns the name of the dynamic library a class originated from.
     *
     * @param cls the class you are inquiring about
     *
     * @return a C string representing the name of the library containing the {@code cls} class.
     */
    @Nullable
    @NativeType("char const *")
    public static String class_getImageName(@NativeType("Class") long cls) {
        long __result = nclass_getImageName(cls);
        return memUTF8Safe(__result);
    }

    // --- [ objc_copyClassNamesForImage ] ---

    /**
     * Unsafe version of: {@link #objc_copyClassNamesForImage}
     *
     * @param outCount the number of names in the returned array
     */
    public static long nobjc_copyClassNamesForImage(long image, long outCount) {
        long __functionAddress = Functions.objc_copyClassNamesForImage;
        return invokePPP(image, outCount, __functionAddress);
    }

    /**
     * Returns the names of all the classes within a specified library or framework.
     *
     * @param image the library or framework you are inquiring about
     *
     * @return an array of C strings representing all of the class names within the specified library or framework
     */
    @Nullable
    @NativeType("char const **")
    public static PointerBuffer objc_copyClassNamesForImage(@NativeType("char const *") ByteBuffer image) {
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

    /**
     * Returns the names of all the classes within a specified library or framework.
     *
     * @param image the library or framework you are inquiring about
     *
     * @return an array of C strings representing all of the class names within the specified library or framework
     */
    @Nullable
    @NativeType("char const **")
    public static PointerBuffer objc_copyClassNamesForImage(@NativeType("char const *") CharSequence image) {
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

    /** Unsafe version of: {@link #sel_getName} */
    public static long nsel_getName(long sel) {
        long __functionAddress = Functions.sel_getName;
        if (CHECKS) {
            check(sel);
        }
        return invokePP(sel, __functionAddress);
    }

    /**
     * Returns the name of the method specified by a given selector.
     *
     * @param sel a pointer of type SEL. Pass the selector whose name you wish to determine.
     *
     * @return a C string indicating the name of the selector
     */
    @Nullable
    @NativeType("char const *")
    public static String sel_getName(@NativeType("SEL") long sel) {
        long __result = nsel_getName(sel);
        return memUTF8Safe(__result);
    }

    // --- [ sel_getUid ] ---

    /** Unsafe version of: {@link #sel_getUid} */
    public static long nsel_getUid(long str) {
        long __functionAddress = Functions.sel_getUid;
        return invokePP(str, __functionAddress);
    }

    /**
     * Registers a method name with the Objective-C runtime system.
     * 
     * <p>The implementation of this method is identical to the implementation of {@link #sel_registerName}.</p>
     *
     * @param str a pointer to a C string. Pass the name of the method you wish to register
     *
     * @return a pointer of type SEL specifying the selector for the named method
     */
    @NativeType("SEL")
    public static long sel_getUid(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nsel_getUid(memAddress(str));
    }

    /**
     * Registers a method name with the Objective-C runtime system.
     * 
     * <p>The implementation of this method is identical to the implementation of {@link #sel_registerName}.</p>
     *
     * @param str a pointer to a C string. Pass the name of the method you wish to register
     *
     * @return a pointer of type SEL specifying the selector for the named method
     */
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

    /** Unsafe version of: {@link #sel_registerName} */
    public static long nsel_registerName(long str) {
        long __functionAddress = Functions.sel_registerName;
        return invokePP(str, __functionAddress);
    }

    /**
     * Registers a method with the Objective-C runtime system, maps the method name to a selector, and returns the selector value.
     * 
     * <p>You must register a method name with the Objective-C runtime system to obtain the method’s selector before you can add the method to a class
     * definition. If the method name has already been registered, this function simply returns the selector.</p>
     *
     * @param str a pointer to a C string. Pass the name of the method you wish to register
     *
     * @return a pointer of type SEL specifying the selector for the named method
     */
    @NativeType("SEL")
    public static long sel_registerName(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nsel_registerName(memAddress(str));
    }

    /**
     * Registers a method with the Objective-C runtime system, maps the method name to a selector, and returns the selector value.
     * 
     * <p>You must register a method name with the Objective-C runtime system to obtain the method’s selector before you can add the method to a class
     * definition. If the method name has already been registered, this function simply returns the selector.</p>
     *
     * @param str a pointer to a C string. Pass the name of the method you wish to register
     *
     * @return a pointer of type SEL specifying the selector for the named method
     */
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

    /**
     * Returns a Boolean value that indicates whether two selectors are equal.
     * 
     * <p>sel_isEqual is equivalent to {@code ==}.</p>
     *
     * @param lhs the selector to compare with {@code rhs}
     * @param rhs the selector to compare with {@code lhs}
     *
     * @return {@link #YES} if rhs and rhs are equal, otherwise {@link #NO}
     */
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

    /**
     * Inserted by the compiler when a mutation is detected during a foreach iteration.
     * 
     * <p>The compiler inserts this function when it detects that an object is mutated during a foreach iteration. The function is called when a mutation occurs,
     * and the enumeration mutation handler is enacted if it is set up (via the {@link #objc_setEnumerationMutationHandler} function). If the handler is not set up,
     * a fatal error occurs.</p>
     *
     * @param obj the object being mutated
     */
    public static void objc_enumerationMutation(@NativeType("id") long obj) {
        long __functionAddress = Functions.objc_enumerationMutation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ objc_setEnumerationMutationHandler ] ---

    /** Unsafe version of: {@link #objc_setEnumerationMutationHandler} */
    public static void nobjc_setEnumerationMutationHandler(long handler) {
        long __functionAddress = Functions.objc_setEnumerationMutationHandler;
        invokePV(handler, __functionAddress);
    }

    /**
     * Sets the current mutation handler.
     *
     * @param handler a function pointer to the new mutation handler
     */
    public static void objc_setEnumerationMutationHandler(@NativeType("EnumerationMutationHandler") EnumerationMutationHandlerI handler) {
        nobjc_setEnumerationMutationHandler(handler.address());
    }

    // --- [ imp_implementationWithBlock ] ---

    /**
     * Creates a pointer to a function that calls the specified block when the method is called.
     *
     * @param block the block that implements this method. The signature of {@code block} should be {@code method_return_type ^(id self, self, method_args …)}. The
     *              selector of the method is not available to {@code block}. {@code block} is copied with {@code Block_copy()}.
     *
     * @return the IMP that calls {@code block}. You must dispose of the returned IMP using the function.
     */
    @NativeType("IMP")
    public static long imp_implementationWithBlock(@NativeType("id") long block) {
        long __functionAddress = Functions.imp_implementationWithBlock;
        if (CHECKS) {
            check(block);
        }
        return invokePP(block, __functionAddress);
    }

    // --- [ imp_getBlock ] ---

    /**
     * Returns the block associated with an IMP that was created using {@link #imp_implementationWithBlock}.
     *
     * @param anImp the IMP that calls this block
     *
     * @return the block called by {@code anImp}
     */
    @NativeType("id")
    public static long imp_getBlock(@NativeType("IMP") long anImp) {
        long __functionAddress = Functions.imp_getBlock;
        if (CHECKS) {
            check(anImp);
        }
        return invokePP(anImp, __functionAddress);
    }

    // --- [ imp_removeBlock ] ---

    /**
     * Disassociates a block from an IMP that was created using {@link #imp_implementationWithBlock}, and releases the copy of the block that was created.
     *
     * @param anImp an IMP that was created using the {@link #imp_implementationWithBlock} function.
     *
     * @return {@link #YES} if the block was released successfully; otherwise, {@link #NO} (for example, the function returns {@link #NO} if the block was not used to create {@code anImp}
     *         previously).
     */
    @NativeType("BOOL")
    public static boolean imp_removeBlock(@NativeType("IMP") long anImp) {
        long __functionAddress = Functions.imp_removeBlock;
        if (CHECKS) {
            check(anImp);
        }
        return invokePZ(anImp, __functionAddress);
    }

    // --- [ objc_loadWeak ] ---

    /** Unsafe version of: {@link #objc_loadWeak} */
    public static long nobjc_loadWeak(long location) {
        long __functionAddress = Functions.objc_loadWeak;
        return invokePP(location, __functionAddress);
    }

    /**
     * Loads the object referenced by a weak pointer and returns it.
     * 
     * <p>This function loads the object referenced by a weak pointer and returns it after retaining and autoreleasing the object. As a result, the object stays
     * alive long enough for the caller to use it. This function is typically used anywhere a {@code __weak} variable is used in an expression.</p>
     *
     * @param location the address of the weak pointer
     *
     * @return the object pointed to by location, or {@link #nil} if location is {@link #nil}
     */
    @NativeType("id")
    public static long objc_loadWeak(@Nullable @NativeType("id *") PointerBuffer location) {
        if (CHECKS) {
            checkSafe(location, 1);
        }
        return nobjc_loadWeak(memAddressSafe(location));
    }

    // --- [ objc_storeWeak ] ---

    /** Unsafe version of: {@link #objc_storeWeak} */
    public static long nobjc_storeWeak(long location, long obj) {
        long __functionAddress = Functions.objc_storeWeak;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(location, obj, __functionAddress);
    }

    /**
     * Stores a new value in a {@code __weak} variable.
     * 
     * <p>This function is typically used anywhere a {@code __weak} variable is the target of an assignment.</p>
     *
     * @param location the address of the weak pointer
     * @param obj      the new object you want the weak pointer to now point to
     *
     * @return the value stored in location (that is, {@code obj})
     */
    @NativeType("id")
    public static long objc_storeWeak(@NativeType("id *") PointerBuffer location, @NativeType("id") long obj) {
        if (CHECKS) {
            check(location, 1);
        }
        return nobjc_storeWeak(memAddress(location), obj);
    }

    // --- [ objc_setAssociatedObject ] ---

    /**
     * Sets an associated value for a given object using a given key and association policy.
     *
     * @param object the source object for the association
     * @param key    the key for the association
     * @param value  the value to associate with the key {@code key} for {@code object}. Pass {@link #nil} to clear an existing association.
     * @param policy the policy for the association. One of:<br><table><tr><td>{@link #OBJC_ASSOCIATION_ASSIGN}</td><td>{@link #OBJC_ASSOCIATION_RETAIN_NONATOMIC}</td><td>{@link #OBJC_ASSOCIATION_COPY_NONATOMIC}</td></tr><tr><td>{@link #OBJC_ASSOCIATION_RETAIN}</td><td>{@link #OBJC_ASSOCIATION_COPY}</td></tr></table>
     */
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

    /**
     * Returns the value associated with a given object for a given key.
     *
     * @param object the source object for the association
     * @param key    the key for the association
     *
     * @return the value associated with the key {@code key} for {@code object}.
     */
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

    /**
     * Removes all associations for a given object.
     * 
     * <p>The main purpose of this function is to make it easy to return an object to a "pristine state". You should not use this function for general removal of
     * associations from objects, since it also removes associations that other clients may have added to the object. Typically you should use
     * {@link #objc_setAssociatedObject} with a {@link #nil} value to clear an association.</p>
     *
     * @param object an object that maintains associated objects
     */
    public static void objc_removeAssociatedObjects(@NativeType("id") long object) {
        long __functionAddress = Functions.objc_removeAssociatedObjects;
        if (CHECKS) {
            check(object);
        }
        invokePV(object, __functionAddress);
    }

}