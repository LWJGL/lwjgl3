/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import org.lwjgl.generator.*
import core.macos.*

val objc_runtime = "ObjCRuntime".nativeClass(
    Module.CORE_MACOS,
    nativeSubPath = "macos",
    binding = simpleBinding(Module.CORE_MACOS, "objc")
) {
    nativeImport("<objc/objc-runtime.h>")

    LongConstant(
        "nil"..0L
    )


    ByteConstant(
        "YES".."1",
        "NO".."0"
    )

    CharConstant(
        "_C_ID"..'@',
        "_C_CLASS"..'#',
        "_C_SEL"..':',
        "_C_CHR"..'c',
        "_C_UCHR"..'C',
        "_C_SHT"..'s',
        "_C_USHT"..'S',
        "_C_INT"..'i',
        "_C_UINT"..'I',
        "_C_LNG"..'l',
        "_C_ULNG"..'L',
        "_C_LNG_LNG"..'q',
        "_C_ULNG_LNG"..'Q',
        "_C_FLT"..'f',
        "_C_DBL"..'d',
        "_C_BFLD"..'b',
        "_C_BOOL"..'B',
        "_C_VOID"..'v',
        "_C_UNDEF"..'?',
        "_C_PTR"..'^',
        "_C_CHARPTR"..'*',
        "_C_ATOM"..'%',
        "_C_ARY_B"..'[',
        "_C_ARY_E"..']',
        "_C_UNION_B"..'(',
        "_C_UNION_E"..')',
        "_C_STRUCT_B"..'{',
        "_C_STRUCT_E"..'}',
        "_C_VECTOR"..'!',
        "_C_CONST"..'r'
    )

    // Working with Instances

    id(
        "object_copy",

        id("obj"),
        size_t("size")
    )

    id(
        "object_dispose",

        id("obj")
    )

    Class(
        "object_getClass",

        nullable..id("obj")
    )

    Class(
        "object_setClass",

        nullable..id("obj"),
        Class("cls")
    )

    charUTF8.const.p(
        "object_getClassName",

        nullable..id("obj")
    )

    opaque_p(
        "object_getIndexedIvars",

        id("obj")
    )

    id(
        "object_getIvar",

        nullable..id("obj"),
        Ivar("ivar")
    )

    void(
        "object_setIvar",

        id("obj"),
        Ivar("ivar"),
        id("value")
    )

    Ivar(
        "object_setInstanceVariable",

        id("obj"),
        charUTF8.const.p("name"),
        Unsafe..void.p("value")
    )

    Ivar(
        "object_getInstanceVariable",

        id("obj"),
        charUTF8.const.p("name"),
        Check(1)..void.p.p("outValue")
    )

    // Obtaining Class Definitions

    Class(
        "objc_getClass",

        charUTF8.const.p("name")
    )

    Class(
        "objc_getMetaClass",

        charUTF8.const.p("name")
    )

    Class(
        "objc_lookUpClass",

        charUTF8.const.p("name")
    )

    Class(
        "objc_getRequiredClass",

        charUTF8.const.p("name")
    )

    int(
        "objc_getClassList",

        nullable..Class.p("buffer"),
        AutoSize("buffer")..int("bufferCount")
    )

    Class.p(
        "objc_copyClassList",

        AutoSizeResult..unsigned_int.p("outCount")
    )

    // Working with Classes

    charUTF8.const.p(
        "class_getName",

        nullable..Class("cls")
    )

    BOOL(
        "class_isMetaClass",

        nullable..Class("cls")
    )

    Class(
        "class_getSuperclass",

        nullable..Class("cls")
    )

    // class_setSuperclass

    int(
        "class_getVersion",

        Class("cls")
    )

    void(
        "class_setVersion",

        Class("cls"),
        int("version")
    )

    size_t(
        "class_getInstanceSize",

        nullable..Class("cls")
    )

    Ivar(
        "class_getInstanceVariable",

        Class("cls"),
        charUTF8.const.p("name")
    )

    Ivar(
        "class_getClassVariable",

        Class("cls"),
        charUTF8.const.p("name")
    )

    Ivar.p(
        "class_copyIvarList",

        nullable..Class("cls"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    Method(
        "class_getInstanceMethod",

        Class("cls"),
        SEL("name")
    )

    Method(
        "class_getClassMethod",

        Class("cls"),
        SEL("name")
    )

    IMP(
        "class_getMethodImplementation",

        nullable..Class("cls"),
        SEL("name")
    )

    // class_getMethodImplementation_stret

    BOOL(
        "class_respondsToSelector",

        Class("cls"),
        SEL("name")
    )

    Method.p(
        "class_copyMethodList",

        nullable..Class("cls"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    BOOL(
        "class_conformsToProtocol",

        Class("cls"),
        Protocol.p("protocol")
    )

    Protocol.p.p(
        "class_copyProtocolList",

        nullable..Class("cls"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    objc_property_t(
        "class_getProperty",

        nullable..Class("cls"),
        charUTF8.const.p("name")
    )

    objc_property_t.p(
        "class_copyPropertyList",

        nullable..Class("cls"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    uint8_tASCII.const.p(
        "class_getIvarLayout",

        Class("cls")
    )

    uint8_tASCII.const.p(
        "class_getWeakIvarLayout",

        Class("cls")
    )

    BOOL(
        "class_addMethod",

        Class("cls"),
        SEL("name"),
        IMP("imp"),
        charUTF8.const.p("types")
    )

    IMP(
        "class_replaceMethod",

        Class("cls"),
        SEL("name"),
        IMP("imp"),
        charUTF8.const.p("types")
    )

    BOOL(
        "class_addIvar",

        Class("cls"),
        charUTF8.const.p("name"),
        size_t("size"),
        uint8_t("alignment"),
        charUTF8.const.p("types")
    )

    BOOL(
        "class_addProtocol",

        Class("cls"),
        Protocol.p("protocol")
    )

    BOOL(
        "class_addProperty",

        Class("cls"),
        charUTF8.const.p("name"),
        objc_property_attribute_t.const.p("attributes"),
        AutoSize("attributes")..unsigned_int("attributeCount")
    )

    void(
        "class_replaceProperty",

        Class("cls"),
        charUTF8.const.p("name"),
        objc_property_attribute_t.const.p("attributes"),
        AutoSize("attributes")..unsigned_int("attributeCount")
    )

    void(
        "class_setIvarLayout",

        Class("cls"),
        uint8_tASCII.const.p("layout")
    )

    void(
        "class_setWeakIvarLayout",

        Class("cls"),
        uint8_tASCII.const.p("layout")
    )

    // Instantiating Classes

    id(
        "class_createInstance",

        Class("cls"),
        size_t("extraBytes")
    )

    id(
        "objc_constructInstance",

        nullable..Class("cls"),
        Check("class_getInstanceSize(cls)", debug = true)..nullable..void.p("bytes")
    )

    opaque_p(
        "objc_destructInstance",

        id("obj")
    )

    // Adding Classes

    Class(
        "objc_allocateClassPair",

        nullable..Class("superclass"),
        charUTF8.const.p("name"),
        size_t("extraBytes")
    )

    void(
        "objc_registerClassPair",

        Class("cls")
    )

    void(
        "objc_disposeClassPair",

        Class("cls")
    )

    // Working with Methods

    SEL(
        "method_getName",

        Method("m")
    )

    IMP(
        "method_getImplementation",

        Method("m")
    )

    charUTF8.const.p(
        "method_getTypeEncoding",

        Method("m")
    )

    unsigned_int(
        "method_getNumberOfArguments",

        Method("m")
    )

    charUTF8.p(
        "method_copyReturnType",

        Method("m")
    )

    Code(
        javaFinally = statement("            if ($RESULT != NULL) org.lwjgl.system.libc.LibCStdlib.nfree($RESULT);")
    )..charUTF8.p(
        "method_copyArgumentType",

        Method("m"),
        unsigned_int("index")
    )

    void(
        "method_getReturnType",

        Method("m"),
        ReturnParam..charUTF8.p("dst"),
        AutoSize("dst")..size_t("dst_len")
    )

    void(
        "method_getArgumentType",

        Method("m"),
        unsigned_int("index"),
        ReturnParam..charUTF8.p("dst"),
        AutoSize("dst")..size_t("dst_len")
    )

    IMP(
        "method_setImplementation",

        Method("m"),
        IMP("imp")
    )

    void(
        "method_exchangeImplementations",

        Method("m1"),
        Method("m2")
    )

    // Working with Instance Variables

    charUTF8.const.p(
        "ivar_getName",

        Ivar("v")
    )

    charUTF8.const.p(
        "ivar_getTypeEncoding",

        Ivar("v")
    )

    ptrdiff_t(
        "ivar_getOffset",

        Ivar("v")
    )

    // Working with Properties

    charUTF8.const.p(
        "property_getName",

        objc_property_t("property")
    )

    charUTF8.const.p(
        "property_getAttributes",

        objc_property_t("property")
    )

    objc_property_attribute_t.p(
        "property_copyAttributeList",

        objc_property_t("property"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    Code(
        javaFinally = statement("            if ($RESULT != NULL) org.lwjgl.system.libc.LibCStdlib.nfree($RESULT);")
    )..charUTF8.p(
        "property_copyAttributeValue",

        objc_property_t("property"),
        charUTF8.const.p("attributeName")
    )

    // Working with Protocols

    Protocol.p(
        "objc_getProtocol",

        charUTF8.const.p("name")
    )

    Protocol.p.p(
        "objc_copyProtocolList",

        AutoSizeResult..unsigned_int.p("outCount")
    )

    BOOL(
        "protocol_conformsToProtocol",

        Protocol.p("proto"),
        Protocol.p("other")
    )

    BOOL(
        "protocol_isEqual",

        Protocol.p("proto"),
        Protocol.p("other")
    )

    charUTF8.const.p(
        "protocol_getName",

        Protocol.p("p")
    )

    objc_method_description(
        "protocol_getMethodDescription",

        Protocol.p("p"),
        SEL("aSel"),
        BOOL("isRequiredMethod"),
        BOOL("isInstanceMethod")
    )

    objc_method_description.p(
        "protocol_copyMethodDescriptionList",

        Protocol.p("p"),
        BOOL("isRequiredMethod"),
        BOOL("isInstanceMethod"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    objc_property_t(
        "protocol_getProperty",

        Protocol.p("proto"),
        charUTF8.const.p("name"),
        BOOL("isRequiredProperty"),
        BOOL("isInstanceProperty")
    )

    objc_property_t.p(
        "protocol_copyPropertyList",

        Protocol.p("proto"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    Protocol.p.p(
        "protocol_copyProtocolList",

        Protocol.p("proto"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    Protocol.p(
        "objc_allocateProtocol",

        charUTF8.const.p("name")
    )

    void(
        "objc_registerProtocol",

        Protocol.p("proto")
    )

    void(
        "protocol_addMethodDescription",

        Protocol.p("proto"),
        SEL("name"),
        charUTF8.const.p("types"),
        BOOL("isRequiredMethod"),
        BOOL("isInstanceMethod")
    )

    void(
        "protocol_addProtocol",

        Protocol.p("proto"),
        Protocol.p("addition")
    )

    void(
        "protocol_addProperty",

        Protocol.p("proto"),
        charUTF8.const.p("name"),
        objc_property_attribute_t.const.p("attributes"),
        AutoSize("attributes")..unsigned_int("attributeCount"),
        BOOL("isRequiredProperty"),
        BOOL("isInstanceProperty")
    )

    // Working with Libraries

    charUTF8.const.p.p(
        "objc_copyImageNames",

        AutoSizeResult..unsigned_int.p("outCount")
    )

    charUTF8.const.p(
        "class_getImageName",

        Class("cls")
    )

    charUTF8.const.p.p(
        "objc_copyClassNamesForImage",

        charUTF8.const.p("image"),
        AutoSizeResult..unsigned_int.p("outCount")
    )

    // Working with Selectors

    charUTF8.const.p(
        "sel_getName",

        SEL("sel")
    )

    SEL(
        "sel_getUid",

        charUTF8.const.p("str")
    )

    SEL(
        "sel_registerName",

        charUTF8.const.p("str")
    )

    BOOL(
        "sel_isEqual",

        SEL("lhs"),
        SEL("rhs")
    )

    // Objective-C Language Features

    void(
        "objc_enumerationMutation",

        id("obj")
    )

    void(
        "objc_setEnumerationMutationHandler",

        EnumerationMutationHandler("handler")
    )

    IMP(
        "imp_implementationWithBlock",

        id("block")
    )

    id(
        "imp_getBlock",

        IMP("anImp")
    )

    BOOL(
        "imp_removeBlock",

        IMP("anImp")
    )

    id(
        "objc_loadWeak",

        Check(1)..nullable..id.p("location")
    )

    id(
        "objc_storeWeak",

        Check(1)..id.p("location"),
        id("obj")
    )

    // Associative References

    IntConstant(
        "OBJC_ASSOCIATION_ASSIGN".."0",
        "OBJC_ASSOCIATION_RETAIN_NONATOMIC".."1",
        "OBJC_ASSOCIATION_COPY_NONATOMIC".."3",
        "OBJC_ASSOCIATION_RETAIN".."1401",
        "OBJC_ASSOCIATION_COPY".."1403"
    )

    void(
        "objc_setAssociatedObject",

        id("object"),
        opaque_const_p("key"),
        id("value"),
        objc_AssociationPolicy("policy")
    )

    id(
        "objc_getAssociatedObject",

        id("object"),
        opaque_const_p("key")
    )

    void(
        "objc_removeAssociatedObjects",

        id("object")
    )
}