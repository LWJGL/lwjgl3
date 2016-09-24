/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bgfx;

import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.bgfx.*;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.lwjgl.bgfx.BGFX.*;

/**
 * bgfx demo: 03-Raymarch
 *
 * <p>This demo is a Java port of
 * <a href="https://github.com/bkaradzic/bgfx/tree/master/examples/03-raymarch">https://github.com/bkaradzic/bgfx/tree/master/examples/03-raymarch</a>.</p>
 */
public class Raymarch extends Demo {

	private BGFXVertexDecl    decl;
	private BGFXProgramHandle program;
	private BGFXUniformHandle uniformMtx;
	private BGFXUniformHandle uniformLightDirTime;

	private Matrix4f view = new Matrix4f();
	private FloatBuffer viewBuf;
	private Matrix4f proj = new Matrix4f();
	private FloatBuffer projBuf;

	private Matrix4f ortho = new Matrix4f();
	private FloatBuffer orthoBuf;
	private Matrix4f vp     = new Matrix4f();
	private Matrix4f mtx    = new Matrix4f();
	private Matrix4f mtxInv = new Matrix4f();
	private Matrix4f mvp    = new Matrix4f();
	private Matrix4f invMvp = new Matrix4f();

	private ByteBuffer mtxBuf;
	private ByteBuffer lightDirTimeBuf;

	public static void main(String[] args) {
		new Raymarch().run(args);
	}

	private Raymarch() {
		super("03-Raymarch");
	}

	void renderScreenSpaceQuad(int _view, BGFXProgramHandle _program, float _x, float _y, float _width, float _height) {
		try ( MemoryStack stack = MemoryStack.stackPush() ) {
			BGFXTransientVertexBuffer tvb = BGFXTransientVertexBuffer.callocStack(stack);
			BGFXTransientIndexBuffer tib = BGFXTransientIndexBuffer.callocStack(stack);

			if ( bgfx_alloc_transient_buffers(tvb, decl, 4, tib, 6) ) {
				ByteBuffer vertex = tvb.data(4 * 24);

				float zz = 0.0f;

				float minx = _x;
				float maxx = _x + _width;
				float miny = _y;
				float maxy = _y + _height;

				float minu = -1.0f;
				float minv = -1.0f;
				float maxu = 1.0f;
				float maxv = 1.0f;

				vertex.putFloat(minx);
				vertex.putFloat(miny);
				vertex.putFloat(zz);
				vertex.putInt(0xff0000ff);
				vertex.putFloat(minu);
				vertex.putFloat(minv);

				vertex.putFloat(maxx);
				vertex.putFloat(miny);
				vertex.putFloat(zz);
				vertex.putInt(0xff00ff00);
				vertex.putFloat(maxu);
				vertex.putFloat(minv);

				vertex.putFloat(maxx);
				vertex.putFloat(maxy);
				vertex.putFloat(zz);
				vertex.putInt(0xffff0000);
				vertex.putFloat(maxu);
				vertex.putFloat(maxv);

				vertex.putFloat(minx);
				vertex.putFloat(maxy);
				vertex.putFloat(zz);
				vertex.putInt(0xffffffff);
				vertex.putFloat(minu);
				vertex.putFloat(maxv);

				ByteBuffer indices = tib.data(6 * 2);

				indices.putShort((short)0);
				indices.putShort((short)2);
				indices.putShort((short)1);
				indices.putShort((short)0);
				indices.putShort((short)3);
				indices.putShort((short)2);

				bgfx_set_state(BGFX_STATE_DEFAULT, 0);

				indices.flip();
				bgfx_set_transient_index_buffer(tib, 0, 6);

				vertex.flip();
				bgfx_set_transient_vertex_buffer(tvb, 0, 4);

				bgfx_submit(_view, _program, 0, false);
			}
		}
	}

	@Override
	protected void create() throws IOException {
		decl = BGFXDemoUtil.createVertexDecl(false, true, 1);

		uniformMtx = bgfx_create_uniform("u_mtx", BGFX_UNIFORM_TYPE_MAT4, 1);
		uniformLightDirTime = bgfx_create_uniform("u_lightDirTime", BGFX_UNIFORM_TYPE_VEC4, 1);

		BGFXShaderHandle vs = BGFXDemoUtil.loadShader("vs_raymarching");
		BGFXShaderHandle fs = BGFXDemoUtil.loadShader("fs_raymarching");

		program = bgfx_create_program(vs, fs, true);

		viewBuf = MemoryUtil.memAllocFloat(16);
		projBuf = MemoryUtil.memAllocFloat(16);

		orthoBuf = MemoryUtil.memAllocFloat(16);

		mtxBuf = MemoryUtil.memAlloc(16 * 4);
		lightDirTimeBuf = MemoryUtil.memAlloc(4 * 4);
	}

	@Override
	protected void frame(float time, float frameTime) {
		bgfx_set_view_rect(1, 0, 0, getWindowWidth(), getWindowHeight());

		bgfx_dbg_text_printf(0, 1, 0x4f, "bgfx/examples/03-raymarch");
		bgfx_dbg_text_printf(0, 2, 0x6f, "Description: Updating shader uniforms.");
		bgfx_dbg_text_printf(0, 3, 0x0f, String.format("Frame: % 7.3f[ms]", frameTime));

		BGFXDemoUtil.lookAt(new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -15.0f), view);
		BGFXDemoUtil.perspective(60.0f, getWindowWidth(), getWindowHeight(), 0.1f, 100.0f, proj);

		view.get(viewBuf);
		proj.get(projBuf);

		bgfx_set_view_transform(0, viewBuf, projBuf);

		ortho.setOrtho(0.0f, 1280.0f, 720.0f, 0.0f, 0.0f, 100.0f);

		// TODO: bgfx uses a left-handed version here, which will be available with JOML 1.8.4
		ortho.m22(0.01f);
		ortho.m32(0.0f);

		ortho.get(orthoBuf);
		bgfx_set_view_transform(1, null, orthoBuf);

		proj.mul(view, vp);

		mtx.setRotationXYZ(time, time * 0.37f, 0.0f);

		mtx.invert(mtxInv);

		Vector4f lightDirModel = new Vector4f(-0.4f, -0.5f, -1.0f, 0.0f);
		Vector4f lightDirModelN = new Vector4f();
		lightDirModel.normalize(lightDirModelN);

		Vector4f lightDirTime = new Vector4f();
		mtxInv.transform(lightDirModelN, lightDirTime);
		lightDirTime.w = time;

		lightDirTime.get(lightDirTimeBuf);
		bgfx_set_uniform(uniformLightDirTime, lightDirTimeBuf, 1);

		vp.mul(mtx, mvp);

		mvp.invert(invMvp);

		invMvp.get(mtxBuf);
		bgfx_set_uniform(uniformMtx, mtxBuf, 1);

		renderScreenSpaceQuad(1, program, 0.0f, 0.0f, 1280.0f, 720.0f);
	}

	@Override
	protected void dispose() {
		MemoryUtil.memFree(viewBuf);
		MemoryUtil.memFree(projBuf);
		MemoryUtil.memFree(orthoBuf);
		MemoryUtil.memFree(mtxBuf);
		MemoryUtil.memFree(lightDirTimeBuf);

		bgfx_destroy_program(program);
		bgfx_destroy_uniform(uniformMtx);
		bgfx_destroy_uniform(uniformLightDirTime);

		decl.free();
	}

}
