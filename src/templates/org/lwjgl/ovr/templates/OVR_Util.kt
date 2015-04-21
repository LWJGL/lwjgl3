/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_Util = "OVRUtil".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR", prefixConstant = "ovr") {
	includeOVRCAPI()

	documentation = "Native bindings to the libOVR utility functions."

	val ProjectionModifiers = IntConstant.block(
		"Enumerates modifications to the projection matrix based on the application's needs.",

		 /// Use for generating a default projection matrix that is:
	    /// * Left-handed
	    /// * Near depth values stored in the depth buffer are smaller than far depth values
	    /// * Both near and far are explicitly defined
	    /// * With a clipping range that is (0 to w)
	    "Projection_None" _ 0x00,

	    /// Enable if using right-handed transformations in your application
	    "Projection_RightHanded" _ 0x01,

	    /// After projection transform is applied, far values stored in the depth buffer will be less than closer depth values
	    /// NOTE: Enable only if application is using a floating-point depth buffer for proper precision
	    "Projection_FarLessThanNear" _ 0x02,

	    /// When this flag is used, the zfar value pushed into ovrMatrix4f_Projection() will be ignored
	    /// NOTE: Enable only if ovrProjection_FarLessThanNear is also enabled where the far clipping plane will be pushed to infinity
	    "Projection_FarClipAtInfinity" _ 0x04,

	    /// Enable if application is rendering with OpenGL and expects a projection matrix with a clipping range of (-w to w)
	    /// Ignore this flag if your application already handles the conversion from D3D range (0 to w) to OpenGL
	    "Projection_ClipRangeOpenGL" _ 0x08
	).javaDocLinks

	ovrMatrix4f.func(
		"Matrix4f_Projection",
		"Used to generate projection from ovrEyeDesc::Fov.",

		ovrFovPort.IN("fov", ""),
		float.IN("znear", ""),
		float.IN("zfar", ""),
		unsigned_int.IN("projectionModFlags", "a combination of the ovrProjectionModifier flags", ProjectionModifiers, LinkMode.BITFIELD)
	)

	ovrMatrix4f.func(
		"Matrix4f_OrthoSubProjection",
		"Used for 2D rendering, Y is down, orthoScale = 1.0f / pixelsPerTanAngleAtCenter, orthoDistance = distance from camera, such as 0.8m",

		ovrMatrix4f.IN("projection", ""),
		ovrVector2f.IN("orthoScale", ""),
		float.IN("orthoDistance", ""),
		float.IN("hmdToEyeViewOffsetX", "")
	)

	double.func(
		"_WaitTillTime",
		"Waits until the specified absolute time.",

		double.IN("absTime", "")
	)
}