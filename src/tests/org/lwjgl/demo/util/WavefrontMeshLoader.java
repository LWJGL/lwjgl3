/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipInputStream;

import org.lwjgl.BufferUtils;

/**
 * A simple Wavefront obj file loader.
 * <p>
 * Does not load material files.
 * 
 * @author Kai Burjack
 */
public class WavefrontMeshLoader {

	public static class Mesh {
		public FloatBuffer positions;
		public FloatBuffer normals;
		public int numVertices;
		public List<MeshObject> objects = new ArrayList<MeshObject>();
	}

	private static class WavefrontInfo {
		int numberOfVertices;
		int numberOfFaces;
		int numberOfNormals;
	}

	public class MeshObject {
		public String name;
		public int first;
		public int count;
		public Vector3f min = new Vector3f(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
		public Vector3f max = new Vector3f(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);

		public String toString() {
			return name + "(" + min + " " + max + ")";
		}
	}

	public WavefrontMeshLoader() {
	}

	private WavefrontInfo getInfo(BufferedReader reader) throws IOException {
		String line = "";
		WavefrontInfo info = new WavefrontInfo();
		while (true) {
			line = reader.readLine();
			if (line == null) {
				break;
			}
			if (line.startsWith("v ")) {
				info.numberOfVertices++;
			} else if (line.startsWith("f ")) {
				info.numberOfFaces++;
			} else if (line.startsWith("vn ")) {
				info.numberOfNormals++;
			}
		}
		return info;
	}

	private byte[] readSingleFileZip(String zipResource) throws IOException {
		ZipInputStream zipStream = new ZipInputStream(WavefrontMeshLoader.class.getClassLoader().getResourceAsStream(zipResource));
		zipStream.getNextEntry();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int read = 0;
		while ((read = zipStream.read(buffer)) > 0) {
			baos.write(buffer, 0, read);
		}
		zipStream.close();
		return baos.toByteArray();
	}

	public Mesh loadMesh(String resource) throws IOException {
		byte[] arr = readSingleFileZip(resource);
		WavefrontInfo info = getInfo(new BufferedReader(new InputStreamReader(new ByteArrayInputStream(arr))));

		// Allocate buffers for all vertices/normal
		ByteBuffer positionByteBuffer = BufferUtils.createByteBuffer(3 * info.numberOfVertices * 4);
		ByteBuffer normalByteBuffer = BufferUtils.createByteBuffer(3 * info.numberOfNormals * 4);
		FloatBuffer positions = positionByteBuffer.asFloatBuffer();
		FloatBuffer normals = normalByteBuffer.asFloatBuffer();

		// Allocate buffers for the actual face vertices/normals
		ByteBuffer positionDataByteBuffer = BufferUtils.createByteBuffer(3 * 3 * info.numberOfFaces * 4);
		ByteBuffer normalDataByteBuffer = BufferUtils.createByteBuffer(3 * 3 * info.numberOfFaces * 4);
		FloatBuffer positionData = positionDataByteBuffer.asFloatBuffer();
		FloatBuffer normalData = normalDataByteBuffer.asFloatBuffer();

		Mesh mesh = new Mesh();
		MeshObject object = null;

		BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(arr)));
		String line;
		int faceIndex = 0;
		Vector3f tmp = new Vector3f();
		while ((line = reader.readLine()) != null) {
			if (line.startsWith("o ")) {
				String name = line.substring(2);
				object = new MeshObject();
				object.name = name;
				object.first = faceIndex;
				mesh.objects.add(object);
			} else if (line.startsWith("vn ")) {
				String[] ns = line.split(" +");
				float x = Float.parseFloat(ns[1]);
				float y = Float.parseFloat(ns[2]);
				float z = Float.parseFloat(ns[3]);
				normals.put(x).put(y).put(z);
			} else if (line.startsWith("v ")) {
				String[] vs = line.split(" +");
				float x = Float.parseFloat(vs[1]);
				float y = Float.parseFloat(vs[2]);
				float z = Float.parseFloat(vs[3]);
				positions.put(x).put(y).put(z);
			} else if (line.startsWith("f")) {
				String[] fs = line.split(" +");
				String[] f1 = fs[1].split("/");
				String[] f2 = fs[2].split("/");
				String[] f3 = fs[3].split("/");
				int v1 = Integer.parseInt(f1[0]);
				int v2 = Integer.parseInt(f2[0]);
				int v3 = Integer.parseInt(f3[0]);
				int n1 = Integer.parseInt(f1[2]);
				int n2 = Integer.parseInt(f2[2]);
				int n3 = Integer.parseInt(f3[2]);
				float ver1X = positions.get(3 * (v1 - 1) + 0);
				float ver1Y = positions.get(3 * (v1 - 1) + 1);
				float ver1Z = positions.get(3 * (v1 - 1) + 2);
				tmp.set(ver1X, ver1Y, ver1Z);
				if (object != null) {
					object.min.min(tmp);
					object.max.max(tmp);
				}
				float ver2X = positions.get(3 * (v2 - 1) + 0);
				float ver2Y = positions.get(3 * (v2 - 1) + 1);
				float ver2Z = positions.get(3 * (v2 - 1) + 2);
				tmp.set(ver2X, ver2Y, ver2Z);
				if (object != null) {
					object.min.min(tmp);
					object.max.max(tmp);
				}
				float ver3X = positions.get(3 * (v3 - 1) + 0);
				float ver3Y = positions.get(3 * (v3 - 1) + 1);
				float ver3Z = positions.get(3 * (v3 - 1) + 2);
				tmp.set(ver3X, ver3Y, ver3Z);
				if (object != null) {
					object.min.min(tmp);
					object.max.max(tmp);
				}
				positionData.put(ver1X).put(ver1Y).put(ver1Z);
				positionData.put(ver2X).put(ver2Y).put(ver2Z);
				positionData.put(ver3X).put(ver3Y).put(ver3Z);
				float norm1X = normals.get(3 * (n1 - 1) + 0);
				float norm1Y = normals.get(3 * (n1 - 1) + 1);
				float norm1Z = normals.get(3 * (n1 - 1) + 2);
				float norm2X = normals.get(3 * (n2 - 1) + 0);
				float norm2Y = normals.get(3 * (n2 - 1) + 1);
				float norm2Z = normals.get(3 * (n2 - 1) + 2);
				float norm3X = normals.get(3 * (n3 - 1) + 0);
				float norm3Y = normals.get(3 * (n3 - 1) + 1);
				float norm3Z = normals.get(3 * (n3 - 1) + 2);
				normalData.put(norm1X).put(norm1Y).put(norm1Z);
				normalData.put(norm2X).put(norm2Y).put(norm2Z);
				normalData.put(norm3X).put(norm3Y).put(norm3Z);
				faceIndex++;
				if (object != null) {
					object.count++;
				}
			}
		}
		if (mesh.objects.isEmpty()) {
			object = new MeshObject();
			object.count = faceIndex;
			mesh.objects.add(object);
		}
		positionData.flip();
		normalData.flip();
		mesh.positions = positionData;
		mesh.normals = normalData;
		mesh.numVertices = positionData.limit() / 3;
		return mesh;
	}
}
