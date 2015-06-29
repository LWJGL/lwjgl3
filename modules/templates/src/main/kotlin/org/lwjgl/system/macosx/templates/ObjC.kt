/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.macosx.*

val objc_runtime = dependsOn(Module.MACOSX_OBJC) {
	"ObjCRuntime".nativeClass(MACOSX_PACKAGE) {
		nativeImport("<objc/objc-runtime.h>")
		nativeDirective ("typedef void (*EnumerationMutationHandler)(id);", afterIncludes = true)

		documentation = "Native bindings to Objective-C Runtime."

		LongConstant(
			"Nil value.",

			"nil" _ 0L
		)


		ByteConstant(
			"Boolean values.",

			"YES" _ 1.b,
			"NO" _ 0.b
		)

		CharConstant(
			"Types.",

			"_C_ID" _ '@',
			"_C_CLASS" _ '#',
			"_C_SEL" _ ':',
			"_C_CHR" _ 'c',
			"_C_UCHR" _ 'C',
			"_C_SHT" _ 's',
			"_C_USHT" _ 'S',
			"_C_INT" _ 'i',
			"_C_UINT" _ 'I',
			"_C_LNG" _ 'l',
			"_C_ULNG" _ 'L',
			"_C_LNG_LNG" _ 'q',
			"_C_ULNG_LNG" _ 'Q',
			"_C_FLT" _ 'f',
			"_C_DBL" _ 'd',
			"_C_BFLD" _ 'b',
			"_C_BOOL" _ 'B',
			"_C_VOID" _ 'v',
			"_C_UNDEF" _ '?',
			"_C_PTR" _ '^',
			"_C_CHARPTR" _ '*',
			"_C_ATOM" _ '%',
			"_C_ARY_B" _ '[',
			"_C_ARY_E" _ ']',
			"_C_UNION_B" _ '(',
			"_C_UNION_E" _ ')',
			"_C_STRUCT_B" _ '{',
			"_C_STRUCT_E" _ '}',
			"_C_VECTOR" _ '!',
			"_C_CONST" _ 'r'
		)

		// Working with Instances

		id(
			"object_copy",
			"Returns a copy of a given object.",

			id.IN("obj", "an Objective-C object"),
			size_t.IN("size", "the size of the object {@code obj}"),

			returnDoc = "a copy of obj"
		)

		id(
			"object_dispose",
			"Frees the memory occupied by a given object.",

			id.IN("obj", "an Objective-C object"),

			returnDoc = "#nil"
		)

		Class(
			"object_getClass",
			"Returns the class of an object.",

			nullable _ id.IN("obj", "an Objective-C object"),

			returnDoc = "the class object of which object is an instance, or Nil if {@code obj} is #nil"
		)

		Class(
			"object_setClass",
			"Sets the class of an object.",

			nullable _ id.IN("obj", "the object to modify"),
			Class.IN("cls", "a class object"),

			returnDoc = "the previous value of object's class, or Nil if {@code obj} is #nil"
		)

		(const _ charUTF8_p)(
			"object_getClassName",
			"Returns the class name of a given object.",

			nullable _ id.IN("obj", "an Objective-C object"),

			returnDoc = "the name of the class of which {@code obj} is an instance"
		)

		voidptr(
			"object_getIndexedIvars",
			"""
		This function returns a pointer to any extra bytes allocated with the instance (as specified by #class_createInstance() with extraBytes&gt;0). This
		memory follows the object's ordinary ivars, but may not be adjacent to the last ivar.

		The returned pointer is guaranteed to be pointer-size aligned, even if the area following the object's last ivar is less aligned than that. Alignment
		greater than pointer-size is never guaranteed, even if the area following the object's last ivar is more aligned than that.

		In a garbage-collected environment, the memory is scanned conservatively.
	    """,

			id.IN("obj", "an Objective-C object"),

			returnDoc =
			"""
		a pointer to any extra bytes allocated with {@code obj}. If {@code obj} was not allocated with any extra bytes, then dereferencing the returned pointer
		is undefined.
		"""
		)

		id(
			"object_getIvar",
			"Reads the value of an instance variable in an object.",

			nullable _ id.IN("obj", "the object containing the instance variable whose value you want to read"),
			Ivar.IN("ivar", "the Ivar describing the instance variable whose value you want to read"),

			returnDoc = "the value of the instance variable specified by {@code ivar}, or #nil if {@code obj} is #nil"
		)

		void(
			"object_setIvar",
			"""
		Sets the value of an instance variable in an object.

		object_setIvar is faster than #object_setInstanceVariable() if the Ivar for the instance variable is already known.
		""",

			id.IN("obj", "the object containing the instance variable whose value you want to set"),
			Ivar.IN("ivar", "the Ivar describing the instance variable whose value you want to set"),
			id.IN("value", "the new value for the instance variable")
		)

		Ivar(
			"object_setInstanceVariable",
			"Changes the value of an instance variable of a class instance.",

			id.IN("obj", "a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to modify"),
			const _ charUTF8_p.IN("name", "a C string. Pass the name of the instance variable whose value you wish to modify"),
			void_p.IN("value", "the new value for the instance variable"),

			returnDoc = "a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name"
		)

		Ivar(
			"object_getInstanceVariable",
			"Obtains the value of an instance variable of a class instance.",

			id.IN("obj", "a pointer to an instance of a class. Pass the object containing the instance variable whose value you wish to obtain"),
			const _ charUTF8_p.IN("name", "a C string. Pass the name of the instance variable whose value you wish to obtain"),
			void_pp.OUT("outValue", "on return, contains a pointer to the value of the instance variable"),

			returnDoc = "a pointer to the Ivar data structure that defines the type and name of the instance variable specified by name"
		)

		// Obtaining Class Definitions

		Class(
			"objc_getClass",
			"""
	    Returns the class definition of a specified class.

	    objc_getClass is different from #objc_lookUpClass() in that if the class is not registered, objc_getClass calls the class handler callback and then
	    checks a second time to see whether the class is registered. objc_lookUpClass does not call the class handler callback.
	    """,

			const _ charUTF8_p.IN("name", "the name of the class to look up"),

			returnDoc = "the Class object for the named class, or #nil if the class is not registered with the Objective-C runtime"
		)

		Class(
			"objc_getMetaClass",
			"""
	    Returns the metaclass definition of a specified class.

	    If the definition for the named class is not registered, this function calls the class handler callback and then checks a second time to see if the
	    class is registered. However, every class definition must have a valid metaclass definition, and so the metaclass definition is always returned,
	    whether it’s valid or not.
	    """,

			const _ charUTF8_p.IN("name", "the name of the class to look up"),

			returnDoc = "the Class object for the metaclass of the named class, or #nil if the class is not registered with the Objective-C runtime"
		)

		Class(
			"objc_lookUpClass",
			"""
	    Returns the class definition of a specified class.

	    #objc_getClass() is different from this function in that if the class is not registered, objc_getClass calls the class handler callback and then checks
	    a second time to see whether the class is registered. This function does not call the class handler callback.
	    """,

			const _ charUTF8_p.IN("name", "the name of the class to look up"),

			returnDoc = "the Class object for the named class, or #nil if the class is not registered with the Objective-C runtime"
		)

		Class(
			"objc_getRequiredClass",
			"""
	    Returns the class definition of a specified class.

	    This function is the same as #objc_getClass(), but kills the process if the class is not found.

		This function is used by ZeroLink, where failing to find a class would be a compile-time link error without ZeroLink.
	    """,

			const _ charUTF8_p.IN("name", "the name of the class to look up"),

			returnDoc = "the Class object for the named class"
		)

		int(
			"objc_getClassList",
			"""
	    Obtains the list of registered class definitions.

	    The Objective-C runtime library automatically registers all the classes defined in your source code. You can create class definitions at runtime and
	    register them with the #objc_addClass() function.

		<h3>Special Considerations</h3>
	    You cannot assume that class objects you get from this function are classes that inherit from NSObject, so you cannot safely call any methods on such
	    classes without detecting that the method is implemented first.
	    """,

			nullable _ Class_p.OUT(
				"buffer",
				"""
		    an array of Class values. On output, each Class value points to one class definition, up to either {@code bufferCount} or the total number of
		    registered classes, whichever is less. You can pass $NULL to obtain the total number of registered class definitions without actually retrieving
		    any class definitions.
		    """
			),
			AutoSize("buffer") _ int.IN(
				"bufferCount",
				"""
		    the number of pointers for which you have allocated space in buffer. On return, this function fills in only this number of elements. If this number
		    is less than the number of registered classes, this function returns an arbitrary subset of the registered classes.
		    """
			),

			returnDoc = "an integer value indicating the total number of registered classes"
		)

		Class_p(
			"objc_copyClassList",
			"Creates and returns a list of pointers to all registered class definitions.",

			nullable _ autoSizeResult _ unsigned_int_p.OUT(
				"outCount",
				"an integer pointer used to store the number of classes returned by this function in the list. This parameter may be #nil"
			),

			returnDoc = "a #nil terminated array of classes. You must free the array with free()"
		)

		// Working with Classes

		(const _ charUTF8_p)(
			"class_getName",
			"Returns the name of a class.",

			nullable _ Class.IN("cls", "a class object"),

			returnDoc = "the name of the class, or the empty string if cls is Nil"
		)

		BOOL(
			"class_isMetaClass",
			"Returns a Boolean value that indicates whether a class object is a metaclass.",

			nullable _ Class.IN("cls", "a class object"),

			returnDoc = "#YES if cls is a metaclass, #NO if cls is a non-meta class, #NO if cls is Nil"
		)

		Class(
			"class_getSuperclass",
			"Returns the superclass of a class.",

			nullable _ Class.IN("cls", "a class object"),

			returnDoc = "the superclass of the class, or Nil if cls is a root class, or Nil if cls is Nil"
		)

		// class_setSuperclass

		int(
			"class_getVersion",
			"""
	    Returns the version number of a class definition.

	    You can use the version number of the class definition to provide versioning of the interface that your class represents to other classes. This is
	    especially useful for object serialization (that is, archiving of the object in a flattened form), where it is important to recognize changes to the
	    layout of the instance variables in different class-definition versions.

		Classes derived from the Foundation framework NSObject class can obtain the class-definition version number using the getVersion class method, which is
		implemented using the class_getVersion function.
	    """,

			Class.IN("cls", "a pointer to an Class data structure. Pass the class definition for which you wish to obtain the version"),

			returnDoc = "an integer indicating the version number of the class definition"
		)

		void(
			"class_setVersion",
			"""
	    Sets the version number of a class definition.

	    You can use the version number of the class definition to provide versioning of the interface that your class represents to other classes. This is
	    especially useful for object serialization (that is, archiving of the object in a flattened form), where it is important to recognize changes to the
	    layout of the instance variables in different class-definition versions.

		Classes derived from the Foundation framework NSObject class can set the class-definition version number using the setVersion: class method, which is
		implemented using the class_setVersion function.
	    """,

			Class.IN("cls", "a pointer to an Class data structure. Pass the class definition for which you wish to set the version"),
			int.IN("version", "the new version number of the class definition")
		)

		size_t(
			"class_getInstanceSize",
			"Returns the size of instances of a class.",

			nullable _ Class.IN("cls", "a class object"),

			returnDoc = "the size in bytes of instances of the class {@code cls}, or 0 if {@code cls} is Nil"
		)

		Ivar(
			"class_getInstanceVariable",
			"Returns the Ivar for a specified instance variable of a given class.",

			Class.IN("cls", "the class whose instance variable you wish to obtain"),
			const _ charUTF8_p.IN("name", "the name of the instance variable definition to obtain"),

			returnDoc = "a pointer to an Ivar data structure containing information about the instance variable specified by name"
		)

		Ivar(
			"class_getClassVariable",
			"Returns the Ivar for a specified class variable of a given class.",

			Class.IN("cls", "the class definition whose class variable you wish to obtain"),
			const _ charUTF8_p.IN("name", "the name of the class variable definition to obtain"),

			returnDoc = "a pointer to an Ivar data structure containing information about the class variable specified by name"
		)

		Ivar_p(
			"class_copyIvarList",
			"Describes the instance variables declared by a class.",

			nullable _ Class.IN("cls", "the class to inspect"),
			nullable _ autoSizeResult _ unsigned_int_p.OUT(
				"outCount",
				"on return, contains the length of the returned array. If {@code outCount} is $NULL, the length is not returned"
			),

			returnDoc =
			"""
	    an array of pointers of type Ivar describing the instance variables declared by the class. Any instance variables declared by superclasses are not
	    included. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the array with free().

		If the class declares no instance variables, or {@code cls} is Nil, $NULL is returned and {@code *outCount} is 0.
	    """
		)

		Method(
			"class_getInstanceMethod",
			"""
	    Returns a specified instance method for a given class.

	    Note that this function searches superclasses for implementations, whereas #class_copyMethodList() does not.
	    """,

			Class.IN("cls", "the class you want to inspect"),
			SEL.IN("name", "the selector of the method you want to retrieve"),

			returnDoc =
			"""
	    the method that corresponds to the implementation of the selector specified by aSelector for the class specified by {@code cls}, or $NULL if the
	    specified class or its superclasses do not contain an instance method with the specified selector.
	    """
		)

		Method(
			"class_getClassMethod",
			"""
		Returns a pointer to the data structure describing a given class method for a given class.

		Note that this function searches superclasses for implementations, whereas #class_copyMethodList() does not.
		""",

			Class.IN("cls", "a pointer to a class definition. Pass the class that contains the method you want to retrieve"),
			SEL.IN("name", "a pointer of type SEL. Pass the selector of the method you want to retrieve"),

			returnDoc =
			"""
	    a pointer to the Method data structure that corresponds to the implementation of the selector specified by {@code name} for the class specified by
	    {@code cls}, or $NULL if the specified class or its superclasses do not contain a class method with the specified selector.
	    """
		)

		IMP(
			"class_getMethodImplementation",
			"""
		Returns the function pointer that would be called if a particular message were sent to an instance of a class.

		class_getMethodImplementation may be faster than ${code("method_getImplementation(class_getInstanceMethod(cls, name))")}.

		The function pointer returned may be a function internal to the runtime instead of an actual method implementation. For example, if instances of the
		class do not respond to the selector, the function pointer returned will be part of the runtime's message forwarding machinery.
		""",

			nullable _ Class.IN("cls", "the class you want to inspect"),
			SEL.IN("name", "a selector"),

			returnDoc =
			"the function pointer that would be called if ${code("[object name]")} were called with an instance of the class, or $NULL if {@code cls} is Nil"
		)

		// class_getMethodImplementation_stret

		BOOL(
			"class_respondsToSelector",
			"""
	    Returns a Boolean value that indicates whether instances of a class respond to a particular selector.

	    You should usually use NSObject's respondsToSelector: or instancesRespondToSelector: methods instead of this function.
	    """,

			Class.IN("cls", "the class you want to inspect"),
			SEL.IN("name", "a selector"),

			returnDoc = "#YES if instances of the class respond to the selector, otherwise #NO"
		)

		Method_p(
			"class_copyMethodList",
			"Describes the instance methods implemented by a class.",

			nullable _ Class.IN("cls", "the class you want to inspect"),
			nullable _ autoSizeResult _ unsigned_int_p.OUT(
				"outCount",
				"on return, contains the length of the returned array. If {@code outCount} is $NULL, the length is not returned"
			),

			returnDoc =
			"""
	    an array of pointers of type Method describing the instance methods implemented by the class—any instance methods implemented by superclasses are not
	    included. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the array with free().

	    If {@code cls} implements no instance methods, or {@code cls} is Nil, returns $NULL and {@code *outCount} is 0.
	    """
		)

		BOOL(
			"class_conformsToProtocol",
			"""
	    Returns a Boolean value that indicates whether a class conforms to a given protocol.

	    You should usually use NSObject's conformsToProtocol: method instead of this function.
	    """,

			Class.IN("cls", "the class you want to inspect"),
			Protocol_p.IN("protocol", "a protocol"),

			returnDoc = "#YES if {@code cls} conforms to {@code protocol}, otherwise #NO"
		)

		Protocol_pp(
			"class_copyProtocolList",
			"Describes the protocols adopted by a class.",

			nullable _ Class.IN("cls", "the class you want to inspect"),
			nullable _ autoSizeResult _ unsigned_int_p.OUT(
				"outCount",
				"on return, contains the length of the returned array. If {@code outCount} is $NULL, the length is not returned"
			),

			returnDoc =
			"""
		an array of pointers of type Protocol* describing the protocols adopted by the class. Any protocols adopted by superclasses or other protocols are not
		included. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the array with free().

		If {@code cls} adopts no protocols, or {@code cls} is Nil, returns $NULL and {@code *outCount} is 0.
		"""
		)

		objc_property_t(
			"class_getProperty",
			"Returns a property with a given name of a given class.",

			nullable _ Class.IN("cls", "the class you want to inspect"),
			const _ charUTF8_p.IN("name", "a C string. Pass the name of the instance variable whose value you wish to modify."),

			returnDoc =
			"""
		a pointer of type {@code objc_property_t} describing the property, or $NULL if the class does not declare a property with that name, or $NULL if
		{@code cls} is Nil.
		"""
		)

		objc_property_t_p(
			"class_copyPropertyList",
			"Describes the properties declared by a class.",

			nullable _ Class.IN("cls", "the class you want to inspect"),
			nullable _ autoSizeResult _ unsigned_int_p.OUT(
				"outCount",
				"on return, contains the length of the returned array. If {@code outCount} is $NULL, the length is not returned"
			),

			returnDoc =
			"""
		an array of pointers of type {@code objc_property_t} describing the properties declared by the class. Any properties declared by superclasses are not
		included. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the array with free().

		If {@code cls} declares no properties, or {@code cls} is Nil, returns $NULL and {@code *outCount} is 0.
		"""
		)

		(const _ uint8_tASCII_p)(
			"class_getIvarLayout",
			"Returns a description of the Ivar layout for a given class.",

			Class.IN("cls", "the class to inspect"),

			returnDoc = "a description of the Ivar layout for {@code cls}"
		)

		(const _ uint8_tASCII_p)(
			"class_getWeakIvarLayout",
			"Returns a description of the layout of weak Ivars for a given class.",

			Class.IN("cls", "the class to inspect"),

			returnDoc = "a description of the layout of the weak Ivars for {@code cls}"
		)

		BOOL(
			"class_addMethod",
			"""
	    Adds a new method to a class with a given name and implementation.

	    <h3>Discussion</h3>
	    class_addMethod will add an override of a superclass's implementation, but will not replace an existing implementation in this class. To change an
	    existing implementation, use #method_setImplementation().

		An Objective-C method is simply a C function that takes at least two arguments &ndash; {@code self} and {@code _cmd}. For example, given the following
		function:
		${codeBlock("""
void myMethodIMP(id self, SEL _cmd)
{
    // implementation ....
}""")}
		you can dynamically add it to a class as a method (called {@code resolveThisMethodDynamically}) like this:
		${codeBlock("""class_addMethod([self class], @selector(resolveThisMethodDynamically), (IMP) myMethodIMP, "v@:");""")}
	    """,

			Class.IN("cls", "the class to which to add a method"),
			SEL.IN("name", "a selector that specifies the name of the method being added"),
			IMP.IN(
				"imp",
				"a function which is the implementation of the new method. The function must take at least two arguments &ndash; {@code self} and {@code _cmd}."
			),
			const _ charUTF8_p.IN(
				"types",
				"""
			an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming Guide
			&gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self} and
			{@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
			"""
			),

			returnDoc = "#YES if the method was added successfully, otherwise #NO (for example, the class already contains a method implementation with that name)"
		)

		IMP(
			"class_replaceMethod",
			"""
	    Replaces the implementation of a method for a given class.

	    <h3>Discussion</h3>
	    This function behaves in two different ways:
		${ul(
				"""
			If the method identified by name does not yet exist, it is added as if class_addMethod were called. The type encoding specified by types is used as
			given.
			""",
				"""
		    If the method identified by name does exist, its IMP is replaced as if method_setImplementation were called. The type encoding specified by types
		    is ignored.
		    """
			)}
	    """,

			Class.IN("cls", "the class you want to modify"),
			SEL.IN("name", "a selector that identifies the method whose implementation you want to replace"),
			IMP.IN(
				"imp",
				"the new implementation for the method identified by {@code name} for the class identified by {@code cls}"
			),
			const _ charUTF8_p.IN(
				"types",
				"""
			an array of characters that describe the types of the arguments to the method. For possible values, see <em>Objective-C Runtime Programming Guide
			&gt; Type Encodings in Objective-C Runtime Programming Guide. Since the function must take at least two arguments &ndash; {@code self} and
			{@code _cmd}, the second and third characters must be “@:” (the first character is the return type).
			"""
			),

			returnDoc = "the previous implementation of the method identified by {@code name} for the class identified by {@code cls}"
		)

		BOOL(
			"class_addIvar",
			"""
	    Adds a new instance variable to a class.

	    This function may only be called after #objc_allocateClassPair() and before #objc_registerClassPair(). Adding an instance variable to an existing class
	    is not supported.

		The class must not be a metaclass. Adding an instance variable to a metaclass is not supported.

		The instance variable's minimum alignment in bytes is ${code("1<<align")}. The minimum alignment of an instance variable depends on the ivar's type and
		the machine architecture. For variables of any pointer type, pass ${code("log2(sizeof(pointer_type))")}.
	    """,

			Class.IN("cls", ""),
			const _ charUTF8_p.IN("name", ""),
			size_t.IN("size", ""),
			uint8_t.IN("alignment", ""),
			const _ charUTF8_p.IN("types", ""),

			returnDoc =
			"#YES if the instance variable was added successfully, otherwise #NO (for example, the class already contains an instance variable with that name)"
		)

		BOOL(
			"class_addProtocol",
			"Adds a protocol to a class.",

			Class.IN("cls", "the class to modify"),
			Protocol_p.IN("protocol", "the protocol to add to {@code cls}"),

			returnDoc = "#YES if the protocol was added successfully, otherwise #NO (for example, the class already conforms to that protocol)"
		)

		BOOL(
			"class_addProperty",
			"Adds a property to a class.",

			Class.IN("cls", "the class to modify"),
			const _ charUTF8_p.IN("name", "the name of the property"),
			const _ objc_property_attribute_t_p.IN("attributes", "an array of property attributes"),
			AutoSize("attributes") _ unsigned_int.IN("attributeCount", "the number of attributes in {@code attributes}"),

			returnDoc = "#YES if the property was added successfully; otherwise #NO (for example, this function returns #NO if the class already has that property)"
		)

		void(
			"class_replaceProperty",
			"Replaces a property of a class.",

			Class.IN("cls", "the class to modify"),
			const _ charUTF8_p.IN("name", "the name of the property"),
			const _ objc_property_attribute_t_p.IN("attributes", "an array of property attributes"),
			AutoSize("attributes") _ unsigned_int.IN("attributeCount", "the number of attributes in {@code attributes}")
		)

		void(
			"class_setIvarLayout",
			"Sets the Ivar layout for a given class.",

			Class.IN("cls", "the class to modify"),
			const _ uint8_tASCII_p.IN("layout", "the layout of the Ivars for {@code cls}")
		)

		void(
			"class_setWeakIvarLayout",
			"Sets the layout for weak Ivars for a given class.",

			Class.IN("cls", "the class to modify"),
			const _ uint8_tASCII_p.IN("layout", "the layout of the weak Ivars for {@code cls}")
		)

		// Instantiating Classes

		id(
			"class_createInstance",
			"Creates an instance of a class, allocating memory for the class in the default malloc memory zone.",

			Class.IN("cls", "the class that you want to allocate an instance of"),
			size_t.IN(
				"extraBytes",
				"""
		    an integer indicating the number of extra bytes to allocate. The additional bytes can be used to store additional instance variables beyond those
		    defined in the class definition.
		    """),

			returnDoc = "an instance of the class {@code cls}"
		)

		id(
			"objc_constructInstance",
			"Creates an instance of a class at the specified location.",

			nullable _ Class.IN("cls", "the class that you want to allocate an instance of"),
			nullable _ void_p.IN(
				"bytes",
				"""
		    the location at which to allocate an instance of the {@code cls} class. {@code bytes} must point to at least ${code("class_getInstanceSize(cls)")}
		    bytes of well-aligned, zero-filled memory.
		    """),

			returnDoc =
			"an instance of the class {@code cls} at {@code bytes}, if successful; otherwise #nil (for example, if {@code cls} or {@code bytes} are themselves #nil)"
		)

		voidptr(
			"objc_destructInstance",
			"""
	    Destroys an instance of a class without freeing memory and removes any of its associated references.

	    This method does nothing if obj is #nil.

	    <h3>Important</h3>
	    The garbage collector does not call this function. As a result, if you edit this function, you should also edit finalize. That said, Core Foundation
	    and other clients do call this function under garbage collection.
	    """,

			id.IN("obj", "the instance to destroy")
		)

		// Adding Classes

		Class(
			"objc_allocateClassPair",
			"""
	    Creates a new class and metaclass.

	    You can get a pointer to the new metaclass by calling ${code("object_getClass(newClass)")}.

		To create a new class, start by calling objc_allocateClassPair. Then set the class's attributes with functions like #class_addMethod() and
		#class_addIvar(). When you are done building the class, call #objc_registerClassPair(). The new class is now ready for use.

		Instance methods and instance variables should be added to the class itself. Class methods should be added to the metaclass.
	    """,

			nullable _ Class.IN("superclass", "the class to use as the new class's superclass, or Nil to create a new root class"),
			const _ charUTF8_p.IN("name", "the string to use as the new class's name. The string will be copied."),
			size_t.IN("extraBytes", "the number of bytes to allocate for indexed ivars at the end of the class and metaclass objects. This should usually be 0."),

			returnDoc = "the new class, or Nil if the class could not be created (for example, the desired name is already in use)"
		)

		void(
			"objc_registerClassPair",
			"Registers a class that was allocated using #objc_allocateClassPair().",

			Class.IN("cls", "the class you want to register")
		)

		void(
			"objc_disposeClassPair",
			"""
	    Destroys a class and its associated metaclass.

	    Do not call this function if instances of the {@code cls} class or any subclass exist.
	    """,

			Class.IN("cls", "the class to be destroyed. This class must have been allocated using #objc_allocateClassPair().")
		)

		// Working with Methods

		SEL(
			"method_getName",
			"""
	    Returns the name of a method.

		To get the method name as a C string, call ${code("sel_getName(method_getName(method))")}.
	    """,

			Method.IN("m", "the method to inspect"),

			returnDoc = "a pointer of type SEL"
		)

		IMP(
			"method_getImplementation",
			"Returns the implementation of a method.",

			Method.IN("m", "the method to inspect"),

			returnDoc = "a function pointer of type IMP"
		)

		(const _ charUTF8_p)(
			"method_getTypeEncoding",
			"Returns a string describing a method's parameter and return types.",

			Method.IN("m", "the method to inspect"),

			returnDoc = "a C string. The string may be $NULL"
		)

		unsigned_int(
			"method_getNumberOfArguments",
			"Returns the number of arguments accepted by a method.",

			Method.IN("m", "a pointer to a Method data structure. Pass the method in question."),

			returnDoc = "an integer containing the number of arguments accepted by the given method"
		)

		charUTF8_p(
			"method_copyReturnType",
			"Returns a string describing a method's return type.",

			Method.IN("m", "the method to inspect"),

			returnDoc = "a C string describing the return type. You must free the string with free()."
		)

		charUTF8_p(
			"method_copyArgumentType",
			"Returns a string describing a single parameter type of a method.",

			Method.IN("m", "the method to inspect"),
			unsigned_int.IN("index", "the index of the parameter to inspect"),

			returnDoc =
			"""
		a C string describing the type of the parameter at index {@code index}, or $NULL if method has no parameter index {@code index}. You must free the
		string with free().
		"""
		)

		void(
			"method_getReturnType",
			"""
	    Returns by reference a string describing a method's return type.

	    The method's return type string is copied to {@code dst}. {@code dst} is filled as if ${code("strncpy(dst, parameter_type, dst_len)")} were called.
	    """,

			Method.IN("m", "the method to inspect"),
			Return(null) _ charUTF8_p.OUT("dst", "the reference string to store the description"),
			AutoSize("dst") _ size_t.IN("dst_len", "the maximum number of characters that can be stored in {@code dst}")
		)

		void(
			"method_getArgumentType",
			"""
	    Returns by reference a string describing a single parameter type of a method.

	    The parameter type string is copied to {@code dst}. {@code dst} is filled as if ${code("strncpy(dst, parameter_type, dst_len)")} were called. If the
	    method contains no parameter with that index, {@code dst} is filled as if ${code("""strncpy(dst, "", dst_len)""")} were called.
	    """,

			Method.IN("m", "the method you want to inquire about"),
			unsigned_int.IN("index", "the index of the parameter you want to inquire about"),
			Return(null) _ charUTF8_p.OUT("dst", "the reference string to store the description"),
			AutoSize("dst") _ size_t.IN("dst_len", "the maximum number of characters that can be stored in {@code dst}")
		)

		IMP(
			"method_setImplementation",
			"Sets the implementation of a method.",

			Method.IN("m", "the method for which to set an implementation"),
			IMP.IN("imp", "the implemention to set to this method"),

			returnDoc = "the previous implementation of the method"
		)

		void(
			"method_exchangeImplementations",
			"Exchanges the implementations of two methods.",

			Method.IN("m1", "the method to exchange with second method"),
			Method.IN("m2", "the method to exchange with first method")
		)

		// Working with Instance Variables

		(const _ charUTF8_p)(
			"ivar_getName",
			"Returns the name of an instance variable.",

			Ivar.IN("v", "the instance variable"),

			returnDoc = "a C string containing the instance variable's name"
		)

		(const _ charUTF8_p)(
			"ivar_getTypeEncoding",
			"Returns the type string of an instance variable.",

			Ivar.IN("v", "the instance variable"),

			returnDoc = "a C string containing the instance variable's type encoding"
		)

		ptrdiff_t(
			"ivar_getOffset",
			"""
	    Returns the offset of an instance variable.

	    For instance variables of type {@code id} or other object types, call #object_getIvar() and #object_setIvar() instead of using this offset to access
	    the instance variable data directly.
	    """,

			Ivar.IN("v", "the instance variable"),

			returnDoc = "the offset of {@code v}"
		)

		// Working with Properties

		(const _ charUTF8_p)(
			"property_getName",
			"Returns the name of a property.",

			objc_property_t.IN("property", "the property you want to inquire about"),

			returnDoc = "a C string containing the property's name"
		)

		(const _ charUTF8_p)(
			"property_getAttributes",
			"Returns the attribute string of a property.",

			objc_property_t.IN("property", "a property"),

			returnDoc = "a C string containing the property's attributes"
		)

		objc_property_attribute_t_p(
			"property_copyAttributeList",
			"Returns an array of property attributes for a given property.",

			objc_property_t.IN("property", "the property whose attributes you want to copy"),
			autoSizeResult _ unsigned_int_p.OUT("outCount", "the number of attributes returned in the array"),

			returnDoc = "an array of property attributes. You must free the array with free()."
		)

		charUTF8_p(
			"property_copyAttributeValue",
			"Returns the value of a property attribute given the attribute name.",

			objc_property_t.IN("property", "the property whose value you are interested in"),
			const _ charUTF8_p.IN("attributeName", "a C string representing the name of the attribute"),

			returnDoc =
			"""
		The value string of the {@code attributeName} attribute, if one exists in {@code property}; otherwise, #nil. You must free the returned value string
		with free().
		"""
		)

		// Working with Protocols

		Protocol_p(
			"objc_getProtocol",
			"""
	    Returns a specified protocol.

	    This function acquires the runtime lock.
	    """,

			const _ charUTF8_p.IN("name", "the name of a protocol"),

			returnDoc = "the protocol named {@code name}{, or $NULL if no protocol named name could be found"
		)

		Protocol_pp(
			"objc_copyProtocolList",
			"Returns an array of all the protocols known to the runtime.",

			autoSizeResult _ unsigned_int_p.OUT("outCount", "upon return, contains the number of protocols in the returned array"),

			returnDoc =
			"""
		a C array of all the protocols known to the runtime. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the
		list with free().
		"""
		)

		BOOL(
			"protocol_conformsToProtocol",
			"""
	    Returns a Boolean value that indicates whether one protocol conforms to another protocol.

	    <h3>Discussion</h3>
	    One protocol can incorporate other protocols using the same syntax that classes use to adopt a protocol:

		${code("""@protocol ProtocolName < protocol list >""")}

		All the protocols listed between angle brackets are considered part of the {@code ProtocolName} protocol.
	    """,

			Protocol_p.IN("proto", "a protocol"),
			Protocol_p.IN("other", "a protocol"),

			returnDoc = "#YES if {@code proto} conforms to {@code other}, otherwise #NO"
		)

		BOOL(
			"protocol_isEqual",
			"Returns a Boolean value that indicates whether two protocols are equal.",

			Protocol_p.IN("proto", "a protocol"),
			Protocol_p.IN("other", "a protocol"),

			returnDoc = "#YES if proto is the same as other, otherwise #NO"
		)

		(const _ charUTF8_p)(
			"protocol_getName",
			"Returns a the name of a protocol.",

			Protocol_p.IN("p", "a protocol"),

			returnDoc = "the name of the protocol {@code p} as a C string"
		)

		objc_method_description(
			"protocol_getMethodDescription",
			"Returns a method description structure for a specified method of a given protocol.",

			Protocol_p.IN("p", "a protocol"),
			SEL.IN("aSel", "a selector"),
			BOOL.IN("isRequiredMethod", "a Boolean value that indicates whether {@code aSel} is a required method"),
			BOOL.IN("isInstanceMethod", "a Boolean value that indicates whether {@code aSel} is a instance method"),

			returnDoc =
			"""
		an objc_method_description structure that describes the method specified by {@code aSel}, {@code isRequiredMethod}, and {@code isInstanceMethod} for
		the protocol {@code p}.

		If the protocol does not contain the specified method, returns an objc_method_description structure with the value ${code("{NULL, NULL}")}.
		"""
		)

		objc_method_description_p(
			"protocol_copyMethodDescriptionList",
			"""
		Returns an array of method descriptions of methods meeting a given specification for a given protocol.

		Methods in other protocols adopted by this protocol are not included.
		""",

			Protocol_p.IN("p", "a protocol"),
			BOOL.IN("isRequiredMethod", "a Boolean value that indicates whether returned methods should be required methods (pass #YES to specify required methods)"),
			BOOL.IN("isInstanceMethod", "a Boolean value that indicates whether returned methods should be instance methods (pass #YES to specify instance methods)"),
			autoSizeResult _ unsigned_int_p.OUT("outCount", "upon return, contains the number of method description structures in the returned array"),

			returnDoc =
			"""
		a C array of objc_method_description structures containing the names and types of {@code p}'s methods specified by {@code isRequiredMethod} and
		{@code isInstanceMethod}. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the list with free().

		If the protocol declares no methods that meet the specification, $NULL is returned and {@code *outCount} is 0.
		"""
		)

		objc_property_t(
			"protocol_getProperty",
			"Returns the specified property of a given protocol.",

			Protocol_p.IN("proto", "a protocol"),
			const _ charUTF8_p.IN("name", "the name of a property"),
			BOOL.IN("isRequiredProperty", "a Boolean value that indicates whether {@code name} is a required property"),
			BOOL.IN("isInstanceProperty", "a Boolean value that indicates whether {@code name} is a instance property"),

			returnDoc =
			"""
		the property specified by {@code name}, {@code isRequiredProperty}, and {@code isInstanceProperty} for {@code proto}, or $NULL if none of
		{@code proto}'s properties meets the specification
		"""
		)

		objc_property_t_p(
			"protocol_copyPropertyList",
			"Returns an array of the properties declared by a protocol.",

			Protocol_p.IN("proto", "a protocol"),
			autoSizeResult _ unsigned_int_p.OUT("outCount", "upon return, contains the number of elements in the returned array"),

			returnDoc =
			"""
		a C array of pointers of type objc_property_t describing the properties declared by {@code proto}. Any properties declared by other protocols adopted
		by this protocol are not included. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the array with free().

		If the protocol declares no properties, $NULL is returned and {@code *outCount} is 0.
		"""
		)

		Protocol_pp(
			"protocol_copyProtocolList",
			"eturns an array of the protocols adopted by a protocol.",

			Protocol_p.IN("proto", "a protocol"),
			autoSizeResult _ unsigned_int_p.OUT("outCount", "upon return, contains the number of elements in the returned array"),

			returnDoc =
			"""
		a C array of protocols adopted by {@code proto}. The array contains {@code *outCount} pointers followed by a $NULL terminator. You must free the array
		with free().

		If the protocol declares no properties, $NULL is returned and {@code *outCount} is 0.
		"""
		)

		Protocol_p(
			"objc_allocateProtocol",
			"""
	    Creates a new protocol instance.

	    You must register the returned protocol instance with the #objc_registerProtocol() function before you can use it.

		There is no dispose method associated with this function.
	    """,

			const _ charUTF8_p.IN("name", "the name of the protocol you want to create"),

			returnDoc = "a new protocol instance or #nil if a protocol with the same name as {@code name} already exists"
		)

		void(
			"objc_registerProtocol",
			"""
	    Registers a newly created protocol with the Objective-C runtime.

	    When you create a new protocol using the #objc_allocateProtocol(), you then register it with the Objective-C runtime by calling this function. After a
	    protocol is successfully registered, it is immutable and ready to use.
	    """,

			Protocol_p.IN("proto", "the protocol you want to register with the Objective-C runtime")
		)

		void(
			"protocol_addMethodDescription",
			"""
	    Adds a method to a protocol.

	    To add a method to a protocol using this function, the protocol must be under construction. That is, you must add any methods to proto before you
	    register it with the Objective-C runtime (via the #objc_registerProtocol() function).
	    """,

			Protocol_p.IN("proto", "the protocol you want to add a method to"),
			SEL.IN("name", "the name of the method you want to add"),
			const _ charUTF8_p.IN("types", "a C string representing the signature of the method you want to add"),
			BOOL.IN(
				"isRequiredMethod",
				"""
	        a Boolean indicating whether the method is a required method of the {@code proto} protocol. If #YES, the method is a required method; if #NO, the
	        method is an optional method.
	        """
			),
			BOOL.IN(
				"isInstanceMethod",
				"a Boolean indicating whether the method is an instance method. If #YES, the method is an instance method; if #NO, the method is a class method."
			)
		)

		void(
			"protocol_addProtocol",
			"""
	    Adds a registered protocol to another protocol that is under construction.

	    The protocol you want to add to ({@code proto}) must be under construction &ndash; allocated but not yet registered with the Objective-C runtime. The
	    protocol you want to add ({@code addition}) must be registered already.
	    """,

			Protocol_p.IN("proto", "the protocol you want to add the registered protocol to"),
			Protocol_p.IN("addition", "the registered protocol you want to add to {@code proto}")
		)

		void(
			"protocol_addProperty",
			"""
	    Adds a property to a protocol that is under construction.

	    The protocol you want to add the property to must be under construction &ndash; allocated but not yet registered with the Objective-C runtime (via the
	    #objc_registerProtocol() function).
	    """,

			Protocol_p.IN("proto", "the protocol you want to add a property to"),
			const _ charUTF8_p.IN("name", "the name of the property you want to add."),
			const _ objc_property_attribute_t_p.IN("attributes", "an array of property attributes"),
			AutoSize("attributes") _ unsigned_int.IN("attributeCount", "the number of properties in {@code attributes}"),
			BOOL.IN(
				"isRequiredProperty",
				"""
		    a Boolean indicating whether the property's accessor methods are required methods of the {@code proto} protocol. If #YES, the property's accessor
		    methods are required methods; if #NO, the property's accessor methods are optional methods.
		    """
			),
			BOOL.IN(
				"isInstanceProperty",
				"""
			a Boolean indicating whether the property's accessor methods are instance methods. If #YES, the property's accessor methods are instance methods.
			#YES is the only value allowed for a property. As a result, if you set this value to #NO, the property will not be added to the protocol.
			"""
			)
		)

		// Working with Libraries

		(const _ charUTF8_pp)(
			"objc_copyImageNames",
			"Returns the names of all the loaded Objective-C frameworks and dynamic libraries.",

			autoSizeResult _ unsigned_int_p.OUT("outCount", "the number of names in the returned array"),

			returnDoc = "an array of C strings representing the names of all the loaded Objective-C frameworks and dynamic libraries"
		)

		(const _ charUTF8_p)(
			"class_getImageName",
			"Returns the name of the dynamic library a class originated from.",

			Class.IN("cls", "the class you are inquiring about"),

			returnDoc = "a C string representing the name of the library containing the {@code cls} class."
		)

		(const _ charUTF8_pp)(
			"objc_copyClassNamesForImage",
			"Returns the names of all the classes within a specified library or framework.",

			const _ charUTF8_p.IN("image", "the library or framework you are inquiring about"),
			autoSizeResult _ unsigned_int_p.OUT("outCount", "the number of names in the returned array"),

			returnDoc = "an array of C strings representing all of the class names within the specified library or framework"
		)

		// Working with Selectors

		(const _ charUTF8_p)(
			"sel_getName",
			"Returns the name of the method specified by a given selector.",

			SEL.IN("sel", "a pointer of type SEL. Pass the selector whose name you wish to determine."),

			returnDoc = "a C string indicating the name of the selector"
		)

		SEL(
			"sel_getUid",
			"""
	    Registers a method name with the Objective-C runtime system.

	    The implementation of this method is identical to the implementation of #sel_registerName().
	    """,

			const _ charUTF8_p.IN("str", "a pointer to a C string. Pass the name of the method you wish to register"),

			returnDoc = "a pointer of type SEL specifying the selector for the named method"
		)

		SEL(
			"sel_registerName",
			"""
	    Registers a method with the Objective-C runtime system, maps the method name to a selector, and returns the selector value.

	    You must register a method name with the Objective-C runtime system to obtain the method’s selector before you can add the method to a class
	    definition. If the method name has already been registered, this function simply returns the selector.
	    """,

			const _ charUTF8_p.IN("str", "a pointer to a C string. Pass the name of the method you wish to register"),

			returnDoc = "a pointer of type SEL specifying the selector for the named method"
		)

		BOOL(
			"sel_isEqual",
			"""
	    Returns a Boolean value that indicates whether two selectors are equal.

	    sel_isEqual is equivalent to {@code ==}.
	    """,

			SEL.IN("lhs", "the selector to compare with {@code rhs}"),
			SEL.IN("rhs", "the selector to compare with {@code lhs}"),

			returnDoc = "#YES if rhs and rhs are equal, otherwise #NO"
		)

		// Objective-C Language Features

		void(
			"objc_enumerationMutation",
			"""
	    Inserted by the compiler when a mutation is detected during a foreach iteration.

	    The compiler inserts this function when it detects that an object is mutated during a foreach iteration. The function is called when a mutation occurs,
	    and the enumeration mutation handler is enacted if it is set up (via the #objc_setEnumerationMutationHandler() function). If the handler is not set up,
	    a fatal error occurs.
	    """,

			id.IN("obj", "the object being mutated")
		)

		void(
			"objc_setEnumerationMutationHandler",
			"Sets the current mutation handler.",

			EnumerationMutationHandler.IN("handler", "a function pointer to the new mutation handler")
		)

		IMP(
			"imp_implementationWithBlock",
			"Creates a pointer to a function that calls the specified block when the method is called.",

			id.IN(
				"block",
				"""
		    the block that implements this method. The signature of {@code block} should be ${code("method_return_type ^(id self, self, method_args …)")}. The
		    selector of the method is not available to {@code block}. {@code block} is copied with ${code("Block_copy()")}.
		    """
			),

			returnDoc = "the IMP that calls {@code block}. You must dispose of the returned IMP using the function."
		)

		id(
			"imp_getBlock",
			"Returns the block associated with an IMP that was created using #imp_implementationWithBlock().",

			IMP.IN("anImp", "the IMP that calls this block"),

			returnDoc = "the block called by {@code anImp}"
		)

		BOOL(
			"imp_removeBlock",
			"Disassociates a block from an IMP that was created using #imp_implementationWithBlock(), and releases the copy of the block that was created.",

			IMP.IN("anImp", "an IMP that was created using the #imp_implementationWithBlock() function."),

			returnDoc =
			"""
		#YES if the block was released successfully; otherwise, #NO (for example, the function returns #NO if the block was not used to create {@code anImp}
		previously).
		"""
		)

		id(
			"objc_loadWeak",
			"""
	    Loads the object referenced by a weak pointer and returns it.

	    This function loads the object referenced by a weak pointer and returns it after retaining and autoreleasing the object. As a result, the object stays
	    alive long enough for the caller to use it. This function is typically used anywhere a {@code __weak} variable is used in an expression.
	    """,

			nullable _ id_p.IN("location", "the address of the weak pointer"),

			returnDoc = "the object pointed to by location, or #nil if location is #nil"
		)

		id(
			"objc_storeWeak",
			"""
	    Stores a new value in a {@code __weak} variable.

	    This function is typically used anywhere a {@code __weak} variable is the target of an assignment.
	    """,

			id_p.IN("location", "the address of the weak pointer"),
			id.IN("obj", "the new object you want the weak pointer to now point to"),

			returnDoc = "the value stored in location (that is, {@code obj})"
		)

		// Associative References

		val AssociationPolicies = IntConstant(
			"Policies related to associative references.",

			"OBJC_ASSOCIATION_ASSIGN" _ 0,
			"OBJC_ASSOCIATION_RETAIN_NONATOMIC" _ 1,
			"OBJC_ASSOCIATION_COPY_NONATOMIC" _ 3,
			"OBJC_ASSOCIATION_RETAIN" _ 1401,
			"OBJC_ASSOCIATION_COPY" _ 1403
		).javaDocLinks

		void(
			"objc_setAssociatedObject",
			"Sets an associated value for a given object using a given key and association policy.",

			id.IN("object", "the source object for the association"),
			const _ voidptr.IN("key", "the key for the association"),
			id.IN("value", "the value to associate with the key {@code key} for {@code object}. Pass #nil to clear an existing association."),
			objc_AssociationPolicy.IN("policy", "the policy for the association", AssociationPolicies)
		)

		id(
			"objc_getAssociatedObject",
			"Returns the value associated with a given object for a given key.",

			id.IN("object", "the source object for the association"),
			const _ voidptr.IN("key", "the key for the association"),

			returnDoc = "the value associated with the key {@code key} for {@code object}."
		)

		void(
			"objc_removeAssociatedObjects",
			"""
	    Removes all associations for a given object.

	    The main purpose of this function is to make it easy to return an object to a "pristine state". You should not use this function for general removal of
	    associations from objects, since it also removes associations that other clients may have added to the object. Typically you should use
	    #objc_setAssociatedObject() with a #nil value to clear an association.
	    """,

			id.IN("object", "an object that maintains associated objects")
		)
	}
}