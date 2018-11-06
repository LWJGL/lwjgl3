/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos

import org.lwjgl.generator.*

// An opaque type that represents a method in a class definition.
val Class = "Class".handle
// An opaque type that represents an instance variable.
val Ivar = "Ivar".handle
// An opaque type that represents a method in a class definition.
val Method = "Method".handle
// An opaque type that represents a method selector.
val SEL = "SEL".handle
// A pointer to the function of a method implementation.
val IMP = "IMP".handle

val Protocol = "Protocol".opaque

// An opaque type that represents an Objective-C declared property.
val objc_property_t = "objc_property_t".handle

// Defines a property attribute
val objc_property_attribute_t = struct(Module.CORE_MACOS, "ObjCPropertyAttribute", nativeName = "objc_property_attribute_t") {
    documentation = "Defines a property attribute."

    charUTF8.p("name", "the name of the attribute")
    charUTF8.p("value", "the value of the attribute (usually empty)")
}

// Defines a method
val objc_method_description = struct(Module.CORE_MACOS, "ObjCMethodDescription", nativeName = "struct objc_method_description", mutable = false) {
    documentation = "Defines a method."

    SEL("name", "the name of the method at runtime")
    charUTF8.p("types", "the types of the method arguments")
}

val EnumerationMutationHandler = Module.CORE_MACOS.callback {
    void(
        "EnumerationMutationHandler",
        "Will be called when an object is mutated during a foreach iteration.",

        id("id", "the object that was mutated"),

        nativeType = "EnumerationMutationHandler"
    ) {
        documentation = "A mutation handler."
    }
}

val objc_AssociationPolicy = typedef(uintptr_t, "objc_AssociationPolicy")