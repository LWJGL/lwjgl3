/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bgfx;

import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.bgfx.BGFXVertexDecl;
import org.lwjgl.system.MemoryUtil;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.lwjgl.bgfx.BGFX.*;

/**
 * bgfx demo: 01-Cubes
 *
 * <p>This demo is a Java port of
 * <a href="https://github.com/bkaradzic/bgfx/tree/master/examples/01-cubes">https://github.com/bkaradzic/bgfx/tree/master/examples/01-cubes</a>.</p>
 */
public class Cubes extends Demo {

	private static final Object[][] cubeVertices = {
		{ -1.0f, 1.0f, 1.0f, 0xff000000 },
		{ 1.0f, 1.0f, 1.0f, 0xff0000ff },
		{ -1.0f, -1.0f, 1.0f, 0xff00ff00 },
		{ 1.0f, -1.0f, 1.0f, 0xff00ffff },
		{ -1.0f, 1.0f, -1.0f, 0xffff0000 },
		{ 1.0f, 1.0f, -1.0f, 0xffff00ff },
		{ -1.0f, -1.0f, -1.0f, 0xffffff00 },
		{ 1.0f, -1.0f, -1.0f, 0xffffffff }
	};

	private static final int[] cubeIndices = {
		0, 1, 2, // 0
		1, 3, 2,
		4, 6, 5, // 2
		5, 6, 7,
		0, 2, 4, // 4
		4, 2, 6,
		1, 5, 3, // 6
		5, 7, 3,
		0, 4, 1, // 8
		4, 5, 1,
		2, 3, 6, // 10
		6, 3, 7
	};

	private BGFXVertexDecl decl;
	private ByteBuffer     vertices;
	private short          vbh;
	private ByteBuffer     indices;
	private short          ibh;
	private short          program;

	private Matrix4f view = new Matrix4f();
	private FloatBuffer viewBuf;
	private Matrix4f proj = new Matrix4f();
	private FloatBuffer projBuf;
	private Matrix4f model = new Matrix4f();
	private FloatBuffer modelBuf;

	public static void main(String[] args) {
		new Cubes().run(args);
	}

	private Cubes() {
		super("01-Cubes");
	}

	@Override
	protected void create() throws IOException {
		decl = BGFXDemoUtil.createVertexDecl(false, true, 0);

		vertices = MemoryUtil.memAlloc(8 * (3 * 4 + 1 * 4));

		vbh = BGFXDemoUtil.createVertexBuffer(vertices, decl, cubeVertices);

		indices = MemoryUtil.memAlloc(cubeIndices.length * 2);

		ibh = BGFXDemoUtil.createIndexBuffer(indices, cubeIndices);

		short vs = BGFXDemoUtil.loadShader("vs_cubes");
		short fs = BGFXDemoUtil.loadShader("fs_cubes");

		program = bgfx_create_program(vs, fs, true);

		viewBuf = MemoryUtil.memAllocFloat(16);
		projBuf = MemoryUtil.memAllocFloat(16);
		modelBuf = MemoryUtil.memAllocFloat(16);
	}

	@Override
	protected void frame(float time, float frameTime) {
		bgfx_dbg_text_printf(0, 1, 0x4f, "bgfx/examples/01-cubes");
		bgfx_dbg_text_printf(0, 2, 0x6f, "Description: Rendering simple static mesh.");
		bgfx_dbg_text_printf(0, 3, 0x0f, String.format("Frame: %7.3f[ms]", frameTime));

		BGFXDemoUtil.lookAt(new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -35.0f), view);
		BGFXDemoUtil.perspective(60.0f, getWindowWidth(), getWindowHeight(), 0.1f, 100.0f, proj);

		view.get(viewBuf);
		proj.get(projBuf);

		bgfx_set_view_transform(0, viewBuf, projBuf);

		for ( int yy = 0; yy < 11; ++yy ) {
			for ( int xx = 0; xx < 11; ++xx ) {
				model
					.identity()
					.translate(
						-15.0f + xx * 3.0f,
						-15.0f + yy * 3.0f,
						0.0f)
					.rotateAffineXYZ(
						time + xx * 0.21f,
						time + yy * 0.37f,
						0.0f)
				;

				model.get(modelBuf);

				bgfx_set_transform(modelBuf, 1);

				bgfx_set_vertex_buffer(vbh, 0, 8);
				bgfx_set_index_buffer(ibh, 0, 36);

				bgfx_set_state(BGFX_STATE_DEFAULT, 0);

				bgfx_submit(0, program, 0, false);
			}
		}
	}

	@Override
	protected void dispose() {
		MemoryUtil.memFree(viewBuf);
		MemoryUtil.memFree(projBuf);
		MemoryUtil.memFree(modelBuf);

		bgfx_destroy_program(program);

		bgfx_destroy_index_buffer(ibh);
		MemoryUtil.memFree(indices);

		bgfx_destroy_vertex_buffer(vbh);
		MemoryUtil.memFree(vertices);

		decl.free();
	}

}
