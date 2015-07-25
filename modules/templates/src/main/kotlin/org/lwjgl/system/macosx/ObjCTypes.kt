/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx

import org.lwjgl.generator.*

// An opaque type that represents a method in a class definition.
val Class = "Class".opaque_p
val Class_p = Class.p
// An opaque type that represents an instance variable.
val Ivar = "Ivar".opaque_p
val Ivar_p = Ivar.p
// An opaque type that represents a method in a class definition.
val Method = "Method".opaque_p
val Method_p = Method.p
// An opaque type that represents a method selector.
val SEL = "SEL".opaque_p
// A pointer to the function of a method implementation.
val IMP = "IMP".opaque_p

val Protocol_p = "Protocol".p
val Protocol_pp = Protocol_p.p

// An opaque type that represents an Objective-C declared property.
val objc_property_t = "objc_property_t".opaque_p
val objc_property_t_p = objc_property_t.p

// Defines a property attribute
val objc_property_attribute_t_p = struct_p(MACOSX_PACKAGE, "ObjCPropertyAttribute", structName = "objc_property_attribute_t") {
	documentation = "Defines a property attribute."
	nativeImport ("<objc/objc-runtime.h>")

	charUTF8_p.member("name")
	charUTF8_p.member("value")
}

// Defines a method
val objc_method_description = struct(MACOSX_PACKAGE, "ObjCMethodDescription", structName = "objc_method_description", identifierType = StructIdentifierType.STRUCT) {
	documentation = "Defines a method."
	nativeImport ("<objc/objc-runtime.h>")

	SEL.member("name")
	charUTF8_p.member("types")
}.nativeType
val objc_method_description_p = objc_method_description.p

val EnumerationMutationHandler = CallbackType(callback(
	MACOSX_PACKAGE, void, "EnumerationMutationHandler",
	"Will be called when an object is mutated during a foreach iteration.",
	id.IN("id", "the object that was mutated"),
	samConstructor = "ObjCRuntime"
) {
	documentation = "A mutation handler."
}, "EnumerationMutationHandler")

val objc_AssociationPolicy = typedef(uintptr_t, "objc_AssociationPolicy")