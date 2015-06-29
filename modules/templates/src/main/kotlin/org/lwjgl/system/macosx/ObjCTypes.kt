/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

// An opaque type that represents a method in a class definition.
val Class = PointerType("Class", includesPointer = true)
val Class_p = PointerType(Class)
// An opaque type that represents an instance variable.
val Ivar = PointerType("Ivar", includesPointer = true)
val Ivar_p = PointerType(Ivar)
// An opaque type that represents a method in a class definition.
val Method = PointerType("Method", includesPointer = true)
val Method_p = PointerType(Method)
// An opaque type that represents a method selector.
val SEL = PointerType("SEL", includesPointer = true)
// A pointer to the function of a method implementation.
val IMP = PointerType("IMP", includesPointer = true)

val Protocol_p = PointerType("Protocol")
val Protocol_pp = PointerType(Protocol_p)

// An opaque type that represents an Objective-C declared property.
val objc_property_t = PointerType("objc_property_t", includesPointer = true)
val objc_property_t_p = PointerType(objc_property_t)

// Defines a property attribute
val objc_property_attribute_t = StructType(struct(MACOSX_PACKAGE, "ObjCPropertyAttribute", structName = "objc_property_attribute_t") {
	documentation = "Defines a property attribute."
	nativeImport ("<objc/objc-runtime.h>")

	charUTF8_p.member("name")
	charUTF8_p.member("value")
})
val objc_property_attribute_t_p = StructType(objc_property_attribute_t)

// Defines a method
val objc_method_description = StructType(struct(MACOSX_PACKAGE, "ObjCMethodDescription", structName = "objc_method_description", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Defines a method."
	nativeImport ("<objc/objc-runtime.h>")

	SEL.member("name")
	charUTF8_p.member("types")
})
val objc_method_description_p = StructType(objc_method_description)

val EnumerationMutationHandler = CallbackType(callback(
	MACOSX_PACKAGE, void, "EnumerationMutationHandler",
	"Will be called when an object is mutated during a foreach iteration.",
	id.IN("id", "the object that was mutated"),
	samConstructor = "ObjCRuntime"
) {
	documentation = "A mutation handler."
}, "EnumerationMutationHandler")

val objc_AssociationPolicy = typedef(uintptr_t, "objc_AssociationPolicy")