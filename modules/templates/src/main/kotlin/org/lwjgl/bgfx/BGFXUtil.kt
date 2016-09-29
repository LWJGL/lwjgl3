/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.bgfx

import org.lwjgl.generator.*

val BGFXUtil = Generator.register(object: org.lwjgl.generator.GeneratorTarget(org.lwjgl.bgfx.BGFX_PACKAGE, "BGFXUtil") {
	init {
		javaImport("static org.lwjgl.bgfx.BGFX.*")
		documentation = "bgfx utilities."
	}

	override fun java.io.PrintWriter.generateJava() {
		generateJavaPreamble()
		print("""public final class BGFXUtil {

	private BGFXUtil() {
	}

	public static long BGFX_STATE_ALPHA_REF(long _ref) {
		return (_ref << BGFX_STATE_ALPHA_REF_SHIFT) & BGFX_STATE_ALPHA_REF_MASK;
	}

	public static long BGFX_STATE_POINT_SIZE(long _size) {
		return (_size << BGFX_STATE_POINT_SIZE_SHIFT) & BGFX_STATE_POINT_SIZE_MASK;
	}

	public static long BGFX_STATE_BLEND_FUNC_SEPARATE(long _srcRGB, long _dstRGB, long _srcA, long _dstA) {
		return ((_srcRGB | (_dstRGB << 4))) | ((_srcA | (_dstA << 4)) << 8);
	}

	public static long BGFX_STATE_BLEND_EQUATION_SEPARATE(long _rgb, long _a) {
		return _rgb | (_a << 3);
	}

	public static long BGFX_STATE_BLEND_FUNC(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC_SEPARATE(_src, _dst, _src, _dst);
	}

	public static long BGFX_STATE_BLEND_EQUATION(long _equation) {
		return BGFX_STATE_BLEND_EQUATION_SEPARATE(_equation, _equation);
	}

	public static long BGFX_STATE_BLEND_ADD(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE);
	}

	public static long BGFX_STATE_BLEND_ALPHA(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_SRC_ALPHA, BGFX_STATE_BLEND_INV_SRC_ALPHA);
	}

	public static long BGFX_STATE_BLEND_DARKEN(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE)
			| BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MIN);
	}

	public static long BGFX_STATE_BLEND_LIGHTEN(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE)
			| BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MAX);
	}

	public static long BGFX_STATE_BLEND_MULTIPLY(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_ZERO);
	}

	public static long BGFX_STATE_BLEND_NORMAL(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_ALPHA);
	}

	public static long BGFX_STATE_BLEND_SCREEN(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_COLOR);
	}

	public static long BGFX_STATE_BLEND_LINEAR_BURN(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_INV_DST_COLOR)
			| BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_SUB);
	}

	public static long BGFX_STATE_BLEND_FUNC_RT_x(long _src, long _dst) {
		return (_src >> BGFX_STATE_BLEND_SHIFT) | ((_dst >> BGFX_STATE_BLEND_SHIFT) << 4);
	}

	public static long BGFX_STATE_BLEND_FUNC_RT_xE(long _src, long _dst, long _equation) {
		return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) | ((_equation >> BGFX_STATE_BLEND_EQUATION_SHIFT) << 8);
	}

	public static long BGFX_STATE_BLEND_FUNC_RT_1(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 0;
	}

	public static long BGFX_STATE_BLEND_FUNC_RT_2(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 11;
	}

	public static long BGFX_STATE_BLEND_FUNC_RT_3(long _src, long _dst) {
		return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 22;
	}

	public static long BGFX_STATE_BLEND_FUNC_RT_1E(long _src, long _dst, long _equation) {
		return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 0;
	}
	public static long BGFX_STATE_BLEND_FUNC_RT_2E(long _src, long _dst, long _equation) {
		return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 11;
	}
	public static long BGFX_STATE_BLEND_FUNC_RT_3E(long _src, long _dst, long _equation) {
		return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 22;
	}

	public static int BGFX_STENCIL_FUNC_REF(int _ref) {
		return (_ref << BGFX_STENCIL_FUNC_REF_SHIFT) & BGFX_STENCIL_FUNC_REF_MASK;
	}

	public static int BGFX_STENCIL_FUNC_RMASK(int _mask) {
		return (_mask << BGFX_STENCIL_FUNC_RMASK_SHIFT) & BGFX_STENCIL_FUNC_RMASK_MASK;
	}

	public static int BGFX_TEXTURE_BORDER_COLOR(int _index) {
		return (_index << BGFX_TEXTURE_BORDER_COLOR_SHIFT) & BGFX_TEXTURE_BORDER_COLOR_MASK;
	}

}""")
	}
})