/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_occlusion_query = "ARBOcclusionQuery".nativeClassGL("ARB_occlusion_query", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines a mechanism whereby an application can query the number of pixels (or, more precisely, samples) drawn by a primitive or group of
		primitives.

		The primary purpose of such a query (hereafter referred to as an "occlusion query") is to determine the visibility of an object. Typically, the
		application will render the major occluders in the scene, then perform an occlusion query for the bounding box of each detail object in the scene. Only
		if said bounding box is visible, i.e., if at least one sample is drawn, should the corresponding object be drawn.

		The earlier ${registryLinkTo("HP", "occlusion_test")} extension defined a similar mechanism, but it had two major shortcomings.
		${ul(
			"It returned the result as a simple GL11#TRUE/GL11#FALSE result, when in fact it is often useful to know exactly how many samples were drawn.",
		    """
			It provided only a simple "stop-and-wait" model for using multiple queries. The application begins an occlusion test and ends it; then, at some
			later point, it asks for the result, at which point the driver must stop and wait until the result from the previous test is back before the
			application can even begin the next one. This is a very simple model, but its performance is mediocre when an application wishes to perform many
			queries, and it eliminates most of the opportunities for parallelism between the CPU and GPU.
		    """
		)}
        This extension solves both of those problems. It returns as its result the number of samples that pass the depth and stencil tests, and it encapsulates
        occlusion queries in "query objects" that allow applications to issue many queries before asking for the result of any one. As a result, they can
        overlap the time it takes for the occlusion query results to be returned with other, more useful work, such as rendering other parts of the scene or
        performing other computations on the CPU.

		There are many situations where a pixel/sample count, rather than a boolean result, is useful.
		${ul(
			"Objects that are visible but cover only a very small number of pixels can be skipped at a minimal reduction of image quality.",
			"""
			Knowing exactly how many pixels an object might cover may help the application decide which level-of-detail model should be used. If only a few
			pixels are visible, a low-detail model may be acceptable.
			""",
		    """
		    "Depth peeling" techniques, such as order-independent transparency, need to know when to stop rendering more layers; it is difficult to determine a
		    priori how many layers are needed. A boolean result allows applications to stop when more layers will not affect the image at all, but this will
		    likely result in unacceptable performance. Instead, it makes more sense to stop rendering when the number of pixels in each layer falls below a
		    given threshold.
		    """,
		    """
		    Occlusion queries can replace glReadPixels of the depth buffer to determine whether (for example) a light source is visible for the purposes of a
		    lens flare effect or a halo to simulate glare. Pixel counts allow you to compute the percentage of the light source that is visible, and the
		    brightness of these effects can be modulated accordingly.
		    """
		)}

		${GL15.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameter of BeginQueryARB, EndQueryARB, and GetQueryivARB.",

		"SAMPLES_PASSED_ARB" _ 0x8914
	)

	val QUERY_PARAMETERS = IntConstant(
		"Accepted by the {@code pname} parameter of GetQueryivARB.",

		"QUERY_COUNTER_BITS_ARB" _ 0x8864,
		"CURRENT_QUERY_ARB" _ 0x8865
	).javaDocLinks

	val QUERY_OBJECT_PARAMETERS = IntConstant(
		"Accepted by the {@code pname} parameter of GetQueryObjectivARB and GetQueryObjectuivARB.",

		"QUERY_RESULT_ARB" _ 0x8866,
		"QUERY_RESULT_AVAILABLE_ARB" _ 0x8867
	).javaDocLinks

	GLvoid(
		"GenQueriesARB",
		"Generates query object names.",

		AutoSize("ids") _ GLsizei.IN("n", "the number of query object names to be generated"),
		returnValue _ GLuint_p.OUT("ids", "a buffer in which the generated query object names are stored")
	)

	GLvoid(
		"DeleteQueriesARB",
		"Deletes named query objects.",

		AutoSize("ids") _ GLsizei.IN("n", "the number of query objects to be deleted"),
		const _ SingleValue("id") _ GLuint_p.IN("ids", "an array of query objects to be deleted")
	)

	GLboolean(
		"IsQueryARB",
		"Determine if a name corresponds to a query object.",

		GLuint.IN("id", "a value that may be the name of a query object")
	)

	GLvoid(
		"BeginQueryARB",
		"Creates a query object and makes it active.",

		GLenum.IN("target", "the target type of query object established", QUERY_TARGETS),
		GLuint.IN("id", "the name of a query object")
	)

	GLvoid(
		"EndQueryARB",
		"Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.",

		GLenum.IN("target", "the query object target", QUERY_TARGETS)
	)

	GLvoid(
		"GetQueryivARB",
		"Returns parameters of a query object target.",

		GLenum.IN("target", "the query object target", QUERY_TARGETS),
		GLenum.IN("pname", "the symbolic name of a query object target parameter", QUERY_PARAMETERS),
		Check(1) _ returnValue _ GLint_p.OUT("params", "the requested data")
	)

	GLvoid(
		"GetQueryObjectivARB",
		"Returns the integer value of a query object parameter.",

		GLuint.IN("id", "the name of a query object"),
		GLenum.IN("pname", "the symbolic name of a query object parameter", QUERY_OBJECT_PARAMETERS),
		Check(1) _ returnValue _ GLint_p.OUT("params", "the requested data")
	)

	GLvoid(
		"GetQueryObjectuivARB",
		"Unsigned version of #GetQueryObjectivARB().",

		GLuint.IN("id", "the name of a query object"),
		GLenum.IN("pname", "the symbolic name of a query object parameter", QUERY_OBJECT_PARAMETERS),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "the requested data")
	)

}