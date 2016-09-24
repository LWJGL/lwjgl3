/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bgfx;

import org.joml.Math;
import org.joml.*;
import org.lwjgl.bgfx.*;
import org.lwjgl.system.MemoryUtil;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.lwjgl.bgfx.BGFX.*;

/**
 * bgfx demo: 06-Bump
 *
 * <p>This demo is a Java port of
 * <a href="https://github.com/bkaradzic/bgfx/tree/master/examples/06-bump">https://github.com/bkaradzic/bgfx/tree/master/examples/06-bump</a>.</p>
 */
public class Bump extends Demo {

	private BGFXVertexDecl         decl;
	private ByteBuffer             vertices;
	private BGFXVertexBufferHandle vbh;
	private ByteBuffer             indices;
	private BGFXIndexBufferHandle  ibh;
	private BGFXUniformHandle      uniformTexColor;
	private BGFXUniformHandle      uniformTexNormal;
	private int                    numLights;
	private BGFXUniformHandle      uniformLightPosRadius;
	private BGFXUniformHandle      uniformLightRgbInnerR;
	private BGFXProgramHandle      program;
	private BGFXTextureHandle      textureColor;
	private BGFXTextureHandle      textureNormal;
	private boolean                instancingSupported;

	private Matrix4f view = new Matrix4f();
	private FloatBuffer viewBuf;
	private Matrix4f proj = new Matrix4f();
	private FloatBuffer projBuf;
	private Matrix4f mtx = new Matrix4f();
	private FloatBuffer mtxBuf;
	private ByteBuffer  uniformBuf;

	public static void main(String[] args) {
		new Bump().run(args);
	}

	private Bump() {
		super("06-Bump");
	}

	private static int packUint32(int _x, int _y, int _z, int _w) {
		return ((_w & 0xff) << 24) | ((_z & 0xff) << 16) | ((_y & 0xff) << 8) | (_x & 0xff);
	}

	private static int packF4u(float _x, float _y, float _z) {
		return packF4u(_x, _y, _z, 0.0f);
	}

	private static int packF4u(float _x, float _y, float _z, float _w) {
		int xx = (int)(_x * 127.0f + 128.0f);
		int yy = (int)(_y * 127.0f + 128.0f);
		int zz = (int)(_z * 127.0f + 128.0f);
		int ww = (int)(_w * 127.0f + 128.0f);
		return packUint32(xx, yy, zz, ww);
	}

	private static final Object[][] cubeVertices = {
		{ -1.0f, 1.0f, 1.0f, packF4u(0.0f, 0.0f, 1.0f), 0, 0, 0 },
		{ 1.0f, 1.0f, 1.0f, packF4u(0.0f, 0.0f, 1.0f), 0, 0x7fff, 0 },
		{ -1.0f, -1.0f, 1.0f, packF4u(0.0f, 0.0f, 1.0f), 0, 0, 0x7fff },
		{ 1.0f, -1.0f, 1.0f, packF4u(0.0f, 0.0f, 1.0f), 0, 0x7fff, 0x7fff },
		{ -1.0f, 1.0f, -1.0f, packF4u(0.0f, 0.0f, -1.0f), 0, 0, 0 },
		{ 1.0f, 1.0f, -1.0f, packF4u(0.0f, 0.0f, -1.0f), 0, 0x7fff, 0 },
		{ -1.0f, -1.0f, -1.0f, packF4u(0.0f, 0.0f, -1.0f), 0, 0, 0x7fff },
		{ 1.0f, -1.0f, -1.0f, packF4u(0.0f, 0.0f, -1.0f), 0, 0x7fff, 0x7fff },
		{ -1.0f, 1.0f, 1.0f, packF4u(0.0f, 1.0f, 0.0f), 0, 0, 0 },
		{ 1.0f, 1.0f, 1.0f, packF4u(0.0f, 1.0f, 0.0f), 0, 0x7fff, 0 },
		{ -1.0f, 1.0f, -1.0f, packF4u(0.0f, 1.0f, 0.0f), 0, 0, 0x7fff },
		{ 1.0f, 1.0f, -1.0f, packF4u(0.0f, 1.0f, 0.0f), 0, 0x7fff, 0x7fff },
		{ -1.0f, -1.0f, 1.0f, packF4u(0.0f, -1.0f, 0.0f), 0, 0, 0 },
		{ 1.0f, -1.0f, 1.0f, packF4u(0.0f, -1.0f, 0.0f), 0, 0x7fff, 0 },
		{ -1.0f, -1.0f, -1.0f, packF4u(0.0f, -1.0f, 0.0f), 0, 0, 0x7fff },
		{ 1.0f, -1.0f, -1.0f, packF4u(0.0f, -1.0f, 0.0f), 0, 0x7fff, 0x7fff },
		{ 1.0f, -1.0f, 1.0f, packF4u(1.0f, 0.0f, 0.0f), 0, 0, 0 },
		{ 1.0f, 1.0f, 1.0f, packF4u(1.0f, 0.0f, 0.0f), 0, 0x7fff, 0 },
		{ 1.0f, -1.0f, -1.0f, packF4u(1.0f, 0.0f, 0.0f), 0, 0, 0x7fff },
		{ 1.0f, 1.0f, -1.0f, packF4u(1.0f, 0.0f, 0.0f), 0, 0x7fff, 0x7fff },
		{ -1.0f, -1.0f, 1.0f, packF4u(-1.0f, 0.0f, 0.0f), 0, 0, 0 },
		{ -1.0f, 1.0f, 1.0f, packF4u(-1.0f, 0.0f, 0.0f), 0, 0x7fff, 0 },
		{ -1.0f, -1.0f, -1.0f, packF4u(-1.0f, 0.0f, 0.0f), 0, 0, 0x7fff },
		{ -1.0f, 1.0f, -1.0f, packF4u(-1.0f, 0.0f, 0.0f), 0, 0x7fff, 0x7fff }
	};

	private static final int[] cubeIndices = {
		0, 2, 1,
		1, 2, 3,
		4, 5, 6,
		5, 7, 6,

		8, 10, 9,
		9, 10, 11,
		12, 13, 14,
		13, 15, 14,

		16, 18, 17,
		17, 18, 19,
		20, 21, 22,
		21, 23, 22
	};

	private static class PosTexcoord {
		float[] m_xyz = new float[4];
		float[] m_uv  = new float[4];
	}

	private static ByteBuffer calcTangents(
		Object[][] _vertices, int _numVertices,
		BGFXVertexDecl _decl, int[] _indices, int _numIndices
	) {

		float[] out = new float[4];
		float[] tangents = new float[6 * _numVertices];

		PosTexcoord v0 = new PosTexcoord();
		PosTexcoord v1 = new PosTexcoord();
		PosTexcoord v2 = new PosTexcoord();

		ByteBuffer vertices = MemoryUtil.memAlloc(_numVertices * 6 * 4);
		for ( Object[] vv : _vertices ) {
			vertices.putFloat((float)vv[0]);
			vertices.putFloat((float)vv[1]);
			vertices.putFloat((float)vv[2]);
			vertices.putInt((int)vv[3]);
			vertices.putInt((int)vv[4]);
			vertices.putShort((short)(int)vv[5]);
			vertices.putShort((short)(int)vv[6]);
		}

		vertices.flip();

		for ( int ii = 0, num = _numIndices / 3; ii < num; ++ii ) {
			int index0 = ii * 3;
			int i0 = _indices[index0 + 0];
			int i1 = _indices[index0 + 1];
			int i2 = _indices[index0 + 2];

			bgfx_vertex_unpack(v0.m_xyz, BGFX_ATTRIB_POSITION, _decl, vertices, i0);
			bgfx_vertex_unpack(v0.m_uv, BGFX_ATTRIB_TEXCOORD0, _decl, vertices, i0);

			bgfx_vertex_unpack(v1.m_xyz, BGFX_ATTRIB_POSITION, _decl, vertices, i1);
			bgfx_vertex_unpack(v1.m_uv, BGFX_ATTRIB_TEXCOORD0, _decl, vertices, i1);

			bgfx_vertex_unpack(v2.m_xyz, BGFX_ATTRIB_POSITION, _decl, vertices, i2);
			bgfx_vertex_unpack(v2.m_uv, BGFX_ATTRIB_TEXCOORD0, _decl, vertices, i2);

			float bax = v1.m_xyz[0] - v0.m_xyz[0];
			float bay = v1.m_xyz[1] - v0.m_xyz[1];
			float baz = v1.m_xyz[2] - v0.m_xyz[2];
			float bau = v1.m_uv[0] - v0.m_uv[0];
			float bav = v1.m_uv[1] - v0.m_uv[1];

			float cax = v2.m_xyz[0] - v0.m_xyz[0];
			float cay = v2.m_xyz[1] - v0.m_xyz[1];
			float caz = v2.m_xyz[2] - v0.m_xyz[2];
			float cau = v2.m_uv[0] - v0.m_uv[0];
			float cav = v2.m_uv[1] - v0.m_uv[1];

			float det = (bau * cav - bav * cau);
			float invDet = 1.0f / det;

			float tx = (bax * cav - cax * bav) * invDet;
			float ty = (bay * cav - cay * bav) * invDet;
			float tz = (baz * cav - caz * bav) * invDet;

			float bx = (cax * bau - bax * cau) * invDet;
			float by = (cay * bau - bay * cau) * invDet;
			float bz = (caz * bau - baz * cau) * invDet;

			for ( int jj = 0; jj < 3; ++jj ) {
				int _tanu = _indices[index0 + jj] * 6;
				int _tanv = _tanu + 3;

				tangents[_tanu + 0] += tx;
				tangents[_tanu + 1] += ty;
				tangents[_tanu + 2] += tz;

				tangents[_tanv + 0] += bx;
				tangents[_tanv + 1] += by;
				tangents[_tanv + 2] += bz;
			}
		}

		for ( int ii = 0; ii < _numVertices; ++ii ) {
			Vector3f tanu = new Vector3f(tangents[ii * 6 + 0], tangents[ii * 6 + 1], tangents[ii * 6 + 2]);
			Vector3f tanv = new Vector3f(tangents[ii * 6 + 3], tangents[ii * 6 + 4], tangents[ii * 6 + 5]);

			bgfx_vertex_unpack(out, BGFX_ATTRIB_NORMAL, _decl, vertices, ii);
			Vector3f normal = new Vector3f(out[0], out[1], out[2]);
			float ndt = normal.dot(tanu);

			Vector3f nxt = new Vector3f();
			normal.cross(tanu, nxt);

			Vector3f tmp = new Vector3f(tanu.x - normal.x * ndt, tanu.y - normal.y * ndt, tanu.z - normal.z * ndt);

			Vector3f tangent = new Vector3f();
			tmp.normalize(tangent);

			out[0] = tangent.x;
			out[1] = tangent.y;
			out[2] = tangent.z;
			out[3] = nxt.dot(tanv) < 0.0f ? -1.0f : 1.0f;
			bgfx_vertex_pack(out, true, BGFX_ATTRIB_TANGENT, _decl, vertices, ii);
		}

		return vertices;
	}

	@Override
	protected void create() throws IOException {
		decl = BGFXVertexDecl.calloc();
		bgfx_vertex_decl_begin(decl, renderer);
		bgfx_vertex_decl_add(decl, BGFX_ATTRIB_POSITION, 3, BGFX_ATTRIB_TYPE_FLOAT, false, false);
		bgfx_vertex_decl_add(decl, BGFX_ATTRIB_NORMAL, 4, BGFX_ATTRIB_TYPE_UINT8, true, true);
		bgfx_vertex_decl_add(decl, BGFX_ATTRIB_TANGENT, 4, BGFX_ATTRIB_TYPE_UINT8, true, true);
		bgfx_vertex_decl_add(decl, BGFX_ATTRIB_TEXCOORD0, 2, BGFX_ATTRIB_TYPE_INT16, true, true);
		bgfx_vertex_decl_end(decl);

		BGFXCaps caps = bgfx_get_caps();
		instancingSupported = (caps.supported() & BGFX_CAPS_INSTANCING) != 0;

		vertices = calcTangents(cubeVertices, cubeVertices.length, decl, cubeIndices, cubeIndices.length);

		vbh = BGFXDemoUtil.createVertexBuffer(vertices, decl);

		indices = MemoryUtil.memAlloc(cubeIndices.length * 2);

		ibh = BGFXDemoUtil.createIndexBuffer(indices, cubeIndices);

		uniformTexColor = bgfx_create_uniform("s_texColor", BGFX_UNIFORM_TYPE_INT1, 1);
		uniformTexNormal = bgfx_create_uniform("s_texNormal", BGFX_UNIFORM_TYPE_INT1, 1);

		numLights = 4;
		uniformLightPosRadius = bgfx_create_uniform("u_lightPosRadius", BGFX_UNIFORM_TYPE_VEC4, numLights);
		uniformLightRgbInnerR = bgfx_create_uniform("u_lightRgbInnerR", BGFX_UNIFORM_TYPE_VEC4, numLights);

		BGFXShaderHandle vs = BGFXDemoUtil.loadShader(instancingSupported ? "vs_bump_instanced" : "vs_bump");
		BGFXShaderHandle fs = BGFXDemoUtil.loadShader("fs_bump");

		program = bgfx_create_program(vs, fs, true);

		textureColor = BGFXDemoUtil.loadTexture("fieldstone-rgba.dds");
		textureNormal = BGFXDemoUtil.loadTexture("fieldstone-n.dds");

		viewBuf = MemoryUtil.memAllocFloat(16);
		projBuf = MemoryUtil.memAllocFloat(16);
		mtxBuf = MemoryUtil.memAllocFloat(16);
		uniformBuf = MemoryUtil.memAlloc(16 * 4);
	}

	private static final float[][] lightRgbInnerR = {
		{ 1.0f, 0.7f, 0.2f, 0.8f },
		{ 0.7f, 0.2f, 1.0f, 0.8f },
		{ 0.2f, 1.0f, 0.7f, 0.8f },
		{ 1.0f, 0.4f, 0.2f, 0.8f }
	};

	@Override
	protected void frame(float time, float frameTime) {
		bgfx_dbg_text_printf(0, 1, 0x4f, "bgfx/examples/06-bump");
		bgfx_dbg_text_printf(0, 2, 0x6f, "Description: Loading textures.");
		bgfx_dbg_text_printf(0, 3, 0x0f, String.format("Frame: % 7.3f[ms]", frameTime));

		Vector3f eye = new Vector3f(0.0f, 0.0f, -7.0f);

		BGFXHmd hmd = bgfx_get_hmd();
		if ( hmd != null && ((hmd.flags() & BGFX_HMD_RENDERING) != 0) ) {
			FloatBuffer rotation = hmd.eye(0).rotation();
			Quaternionf quat = new Quaternionf(rotation.get(0), rotation.get(1), rotation.get(2), rotation.get(3));

			quat.get(view);
			view.translate(-eye.x, -eye.y, -eye.z);
			view.get(viewBuf);

			bgfx_set_view_transform_stereo(0, viewBuf, hmd.eye(0).projection(), BGFX_VIEW_STEREO, hmd.eye(1).projection());

			bgfx_set_view_rect(0, 0, 0, hmd.width(), hmd.height());
		} else {
			BGFXDemoUtil.lookAt(new Vector3f(0.0f, 0.0f, 0.0f), eye, view);
			BGFXDemoUtil.perspective(60.0f, getWindowWidth(), getWindowHeight(), 0.1f, 100.0f, proj);

			view.get(viewBuf);
			proj.get(projBuf);

			bgfx_set_view_transform(0, viewBuf, projBuf);

			bgfx_set_view_rect(0, 0, 0, getWindowWidth(), getWindowHeight());
		}

		uniformBuf.clear();
		for ( int ii = 0; ii < numLights; ++ii ) {
			uniformBuf.putFloat((float)(Math.sin((time * (0.1f + ii * 0.17f) + ii * Math.PI * 0.5f * 1.37f)) * 3.0f));
			uniformBuf.putFloat((float)(Math.cos((time * (0.2f + ii * 0.29f) + ii * Math.PI * 0.5f * 1.49f)) * 3.0f));
			uniformBuf.putFloat(-2.5f);
			uniformBuf.putFloat(3.0f);
		}

		uniformBuf.flip();
		bgfx_set_uniform(uniformLightPosRadius, uniformBuf, numLights);

		uniformBuf.clear();
		for ( float[] ll : lightRgbInnerR ) {
			for ( float l : ll ) {
				uniformBuf.putFloat(l);
			}
		}

		uniformBuf.flip();
		bgfx_set_uniform(uniformLightRgbInnerR, uniformBuf, numLights);

		int instanceStride = 64;
		int numInstances = 3;

		if ( instancingSupported ) {
			// Write instance data for 3x3 cubes.
			for ( int yy = 0; yy < 3; ++yy ) {
				BGFXInstanceDataBuffer idb = bgfx_alloc_instance_data_buffer(numInstances, instanceStride);
				if ( idb != null ) {
					ByteBuffer data = idb.data(numInstances * instanceStride);

					for ( int xx = 0; xx < 3; ++xx ) {
						mtx.setRotationXYZ(time * 0.023f + xx * 0.21f, time * 0.03f + yy * 0.37f, 0.0f);
						mtx.m30(-3.0f + xx * 3.0f);
						mtx.m31(-3.0f + yy * 3.0f);
						mtx.m32(0.0f);

						mtx.get(data);
						data.position(data.position() + instanceStride);
					}

					// Set instance data buffer.
					bgfx_set_instance_data_buffer(idb, numInstances);

					// Set vertex and index buffer.
					bgfx_set_vertex_buffer(vbh, 0, 24);
					bgfx_set_index_buffer(ibh, 0, 36);

					// Bind textures.
					bgfx_set_texture(0, uniformTexColor, textureColor, 0xffffffff);
					bgfx_set_texture(1, uniformTexNormal, textureNormal, 0xffffffff);

					// Set render states.
					bgfx_set_state(BGFX_STATE_RGB_WRITE
						               | BGFX_STATE_ALPHA_WRITE
						               | BGFX_STATE_DEPTH_WRITE
						               | BGFX_STATE_DEPTH_TEST_LESS
						               | BGFX_STATE_MSAA, 0);

					// Submit primitive for rendering to view 0.
					bgfx_submit(0, program, 0, false);
				}
			}
		} else {
			for ( int yy = 0; yy < 3; ++yy ) {
				for ( int xx = 0; xx < 3; ++xx ) {
					mtx.setRotationXYZ(time * 0.023f + xx * 0.21f, time * 0.03f + yy * 0.37f, 0.0f);
					mtx.m30(-3.0f + xx * 3.0f);
					mtx.m31(-3.0f + yy * 3.0f);
					mtx.m32(0.0f);

					// Set transform for draw call.
					mtx.get(mtxBuf);
					bgfx_set_transform(mtxBuf, 1);

					// Set vertex and index buffer.
					bgfx_set_vertex_buffer(vbh, 0, 24);
					bgfx_set_index_buffer(ibh, 0, 36);

					// Bind textures.
					bgfx_set_texture(0, uniformTexColor, textureColor, 0xffffffff);
					bgfx_set_texture(1, uniformTexNormal, textureNormal, 0xffffffff);

					// Set render states.
					bgfx_set_state(BGFX_STATE_RGB_WRITE
						               | BGFX_STATE_ALPHA_WRITE
						               | BGFX_STATE_DEPTH_WRITE
						               | BGFX_STATE_DEPTH_TEST_LESS
						               | BGFX_STATE_MSAA, 0);

					// Submit primitive for rendering to view 0.
					bgfx_submit(0, program, 0, false);
				}
			}
		}

	}

	@Override
	protected void dispose() {
		bgfx_destroy_index_buffer(ibh);
		bgfx_destroy_vertex_buffer(vbh);
		bgfx_destroy_program(program);
		bgfx_destroy_texture(textureColor);
		bgfx_destroy_texture(textureNormal);
		bgfx_destroy_uniform(uniformTexColor);
		bgfx_destroy_uniform(uniformTexNormal);
		bgfx_destroy_uniform(uniformLightPosRadius);
		bgfx_destroy_uniform(uniformLightRgbInnerR);

		MemoryUtil.memFree(vertices);
		MemoryUtil.memFree(indices);
		MemoryUtil.memFree(viewBuf);
		MemoryUtil.memFree(projBuf);
		MemoryUtil.memFree(mtxBuf);
		MemoryUtil.memFree(uniformBuf);

		decl.free();
	}
}
