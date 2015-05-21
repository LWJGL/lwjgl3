/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_accelerator = "INTELAccelerator".nativeClassCL("intel_accelerator", INTEL) {
	nativeImport (
		"OpenCL.h"
	)

	documentation =
		"""
		Native bindings to the $extensionLink extension.

		The accelerator extension consists of a unified set of OpenCL runtime APIs to create, query, and manage the lifetime of objects which represent
		acceleration processors, engines, or algorithms. Accelerator object instances are referenced with the generic cl_accelerator_intel type by the runtime
		API, but they are always associated with a specific acceleration engine type, which is assigned by the application at accelerator object creation time.
		Descriptors are used to assign acceleration engine-specific properties to the accelerator objects. This mechanism of specialized creation with generic
		referencing is analogous to the way image objects are managed in the OpenCL 1.2 runtime API via generic cl_mem referencing but specialized
		descriptor-based creation with CL12#CreateImage().

		Each accelerator object is assigned a unique type id. Vendors are freely encouraged to define new accelerator types and ids. This base extension
		provides unified mechanism for the creation and lifetime management of new accelerator types, but the semantics and creation descriptors of these types
		are to be defined in acceleration engine-specific extensions.

		Accelerator objects can be supplied to kernels as arguments. Unless an extension defines a new OpenCL C language type for the engine-specific
		accelerator (e.g. sampler_t), accelerator objects can only be used in conjunction with built-in kernels. If an extension does define such a new type,
		or if it provides a mechanism to access accelerator data within kernels, then accelerator objects can act as regular kernel arguments as well.

		Requires ${CL12.link}.
		"""

	val AcceleratorInfo = IntConstant(
		"Possible values for cl_accelerator_info_intel.",

		"ACCELERATOR_DESCRIPTOR_INTEL" _ 0x4090,
		"ACCELERATOR_REFERENCE_COUNT_INTEL" _ 0x4091,
		"ACCELERATOR_CONTEXT_INTEL" _ 0x4092,
		"ACCELERATOR_TYPE_INTEL" _ 0x4093
	).javaDocLinks

	IntConstant(
		"Error codes used by functions in this extension.",

		"INVALID_ACCELERATOR_INTEL" _ -1094,
		"INVALID_ACCELERATOR_TYPE_INTEL" _ -1095,
		"INVALID_ACCELERATOR_DESCRIPTOR_INTEL" _ -1096,
		"ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL" _ -1097
	)

	cl_accelerator_intel(
		"CreateAcceleratorINTEL",
		"""
		Accelerator objects represent the programmable state of an acceleration processor, engine, or algorithm. Accelerator objects can be supplied to kernels
		as arguments. Unless an extension defines a new OpenCL C language type for the engine-specific accelerator (e.g. sampler_t), accelerator objects can
		only be used in conjunction with built-in kernels.

		This function creates an accelerator object. The accelerator object will be created with a reference count of one. Accelerator objects created with
		this function have semantics defined by the parameter {@code accelerator_type}, which are defined and described by extensions external to this
		document.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		cl_accelerator_type_intel.IN(
			"accelerator_type",
			"""
			specifies the type of accelerator object created. The type constants are defined by acceleration engine-specific extensions. It is encouraged that
			extensions follow the naming scheme of CL_ACCELERATOR_TYPE_{name}_INTEL where {name} is a descriptive acceleration engine string.
		    """
		),
		AutoSize("descriptor") _ size_t.IN("descriptor_size", "a value which specifies of the size, in bytes, of the immediately following descriptor structure"),
		const _ void_p.IN(
			"descriptor",
			"""
			a pointer to a structure that defines the parameter set of the accelerator object. This parameter set describes the configurable state of the
			underlying object. The actual structure supplied must be consistent with {@code accelerator_type}. The descriptor structures are defined by
			acceleration engine-specific extensions. It is encouraged that extensions follow the naming scheme of cl_{name}_desc_INTEL where {name} is a
			descriptive acceleration engine string.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
	    a valid non-zero accelerator object, and $errcode_ret is set to $SUCCESS if the accelerator object is created successfully. Otherwise, it returns a
	    $NULL value with one of the following error values returned in $errcode_ret:
		${ul(
			"$INVALID_CONTEXT if {@code context} is not a valid context.",
			"#INVALID_ACCELERATOR_TYPE_INTEL if the supplied accelerator type is not valid.",
			"""
			#INVALID_ACCELERATOR_DESCRIPTOR_INTEL if values specified in {@code accelerator_desc} are not valid (or a combination of values is not valid) or if
			{@code accelerator_desc} is $NULL.
			""",
			"#ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL if the supplied accelerator type is not supported by the context.",
			"$INVALID_OPERATION if none of the devices in the context support accelerator objects.",
			OORE,
			OOHME
		)}
	    """
	)

	cl_int(
		"RetainAcceleratorINTEL",
		"Increments the accelerator reference count. #CreateAcceleratorINTEL() does an implicit retain.",

		cl_accelerator_intel.IN("accelerator", "a valid accelerator object"),

	    returnDoc =
	    """
	    $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
	    ${ul(
		    "#INVALID_ACCELERATOR_INTEL if accelerator is a not a valid accelerator object.",
	        OORE,
	        OOHME
	    )}
	    """
	)

	cl_int(
		"ReleaseAcceleratorINTEL",
		"""
		Decrements the accelerator reference count. The accelerator object is deleted after the reference count becomes zero and commands queued for execution
		on a command-queue(s) that reference accelerator have finished.
		""",

		cl_accelerator_intel.IN("accelerator", "a valid accelerator object"),

		returnDoc =
		"""
	    $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
	    ${ul(
			"#INVALID_ACCELERATOR_INTEL if accelerator is a not a valid accelerator object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetAcceleratorInfoINTEL",
		"Returns information about the accelerator object.",

		cl_accelerator_intel.IN("accelerator", "the accelerator object being queried"),
		cl_accelerator_info_intel.IN("param_name", "the information to query", AcceleratorInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

	    returnDoc =
	    """
	    $SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
	    ${ul(
		    """
		    $INVALID_VALUE if {@code param_name} is not valid or if size in bytes specified by {@code param_value_size} is &lt; size of return type and
		    {@code param_value} is not $NULL.
			""",
		    "#INVALID_ACCELERATOR_INTEL if accelerator is a not a valid accelerator object.",
	        OORE,
	        OOHME
	    )}
	    """
	)
}