/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static java.lang.Float.*;

public class MeshOptimizer {

    static { LibMeshOptimizer.initialize(); }

    public static final int MESHOPTIMIZER_VERSION = 230;

    public static final int
        meshopt_EncodeExpSeparate        = 0,
        meshopt_EncodeExpSharedVector    = 1,
        meshopt_EncodeExpSharedComponent = 2,
        meshopt_EncodeExpClamped         = 3;

    public static final int
        meshopt_SimplifyLockBorder    = 1 << 0,
        meshopt_SimplifySparse        = 1 << 1,
        meshopt_SimplifyErrorAbsolute = 1 << 2,
        meshopt_SimplifyPrune         = 1 << 3;

    protected MeshOptimizer() {
        throw new UnsupportedOperationException();
    }

    // --- [ meshopt_generateVertexRemap ] ---

    /** {@code size_t meshopt_generateVertexRemap(unsigned int * destination, unsigned int const * indices, size_t index_count, void const * vertices, size_t vertex_count, size_t vertex_size)} */
    public static native long nmeshopt_generateVertexRemap(long destination, long indices, long index_count, long vertices, long vertex_count, long vertex_size);

    /** {@code size_t meshopt_generateVertexRemap(unsigned int * destination, unsigned int const * indices, size_t index_count, void const * vertices, size_t vertex_count, size_t vertex_size)} */
    @NativeType("size_t")
    public static long meshopt_generateVertexRemap(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") @Nullable IntBuffer indices, @NativeType("size_t") long index_count, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size) {
        if (CHECKS) {
            check(destination, vertex_count);
            checkSafe(indices, index_count);
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_generateVertexRemap(memAddress(destination), memAddressSafe(indices), index_count, memAddress(vertices), vertex_count, vertex_size);
    }

    // --- [ meshopt_generateVertexRemapMulti ] ---

    /** {@code size_t meshopt_generateVertexRemapMulti(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, struct meshopt_Stream const * streams, size_t stream_count)} */
    public static native long nmeshopt_generateVertexRemapMulti(long destination, long indices, long index_count, long vertex_count, long streams, long stream_count);

    /** {@code size_t meshopt_generateVertexRemapMulti(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, struct meshopt_Stream const * streams, size_t stream_count)} */
    @NativeType("size_t")
    public static long meshopt_generateVertexRemapMulti(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") @Nullable IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("struct meshopt_Stream const *") MeshoptStream.Buffer streams) {
        if (CHECKS) {
            check(destination, vertex_count);
            Struct.validate(streams.address(), streams.remaining(), MeshoptStream.SIZEOF, MeshoptStream::validate);
        }
        return nmeshopt_generateVertexRemapMulti(memAddress(destination), memAddressSafe(indices), remainingSafe(indices), vertex_count, streams.address(), streams.remaining());
    }

    // --- [ meshopt_remapVertexBuffer ] ---

    /** {@code void meshopt_remapVertexBuffer(void * destination, void const * vertices, size_t vertex_count, size_t vertex_size, unsigned int const * remap)} */
    public static native void nmeshopt_remapVertexBuffer(long destination, long vertices, long vertex_count, long vertex_size, long remap);

    /** {@code void meshopt_remapVertexBuffer(void * destination, void const * vertices, size_t vertex_count, size_t vertex_size, unsigned int const * remap)} */
    public static void meshopt_remapVertexBuffer(@NativeType("void *") ByteBuffer destination, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("unsigned int const *") IntBuffer remap) {
        if (CHECKS) {
            check(vertices, vertex_count * vertex_size);
            check(remap, vertex_count);
        }
        nmeshopt_remapVertexBuffer(memAddress(destination), memAddress(vertices), vertex_count, vertex_size, memAddress(remap));
    }

    // --- [ meshopt_remapIndexBuffer ] ---

    /** {@code void meshopt_remapIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, unsigned int const * remap)} */
    public static native void nmeshopt_remapIndexBuffer(long destination, long indices, long index_count, long remap);

    /** {@code void meshopt_remapIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, unsigned int const * remap)} */
    public static void meshopt_remapIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") @Nullable IntBuffer indices, @NativeType("size_t") long index_count, @NativeType("unsigned int const *") IntBuffer remap) {
        if (CHECKS) {
            check(destination, index_count);
            checkSafe(indices, index_count);
        }
        nmeshopt_remapIndexBuffer(memAddress(destination), memAddressSafe(indices), index_count, memAddress(remap));
    }

    // --- [ meshopt_generateShadowIndexBuffer ] ---

    /** {@code void meshopt_generateShadowIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, void const * vertices, size_t vertex_count, size_t vertex_size, size_t vertex_stride)} */
    public static native void nmeshopt_generateShadowIndexBuffer(long destination, long indices, long index_count, long vertices, long vertex_count, long vertex_size, long vertex_stride);

    /** {@code void meshopt_generateShadowIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, void const * vertices, size_t vertex_count, size_t vertex_size, size_t vertex_stride)} */
    public static void meshopt_generateShadowIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("size_t") long vertex_stride) {
        if (CHECKS) {
            check(destination, indices.remaining());
            check(vertices, vertex_count * vertex_stride);
        }
        nmeshopt_generateShadowIndexBuffer(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertices), vertex_count, vertex_size, vertex_stride);
    }

    // --- [ meshopt_generateShadowIndexBufferMulti ] ---

    /** {@code void meshopt_generateShadowIndexBufferMulti(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, struct meshopt_Stream const * streams, size_t stream_count)} */
    public static native void nmeshopt_generateShadowIndexBufferMulti(long destination, long indices, long index_count, long vertex_count, long streams, long stream_count);

    /** {@code void meshopt_generateShadowIndexBufferMulti(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, struct meshopt_Stream const * streams, size_t stream_count)} */
    public static void meshopt_generateShadowIndexBufferMulti(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("struct meshopt_Stream const *") MeshoptStream.Buffer streams) {
        if (CHECKS) {
            check(destination, indices.remaining());
            Struct.validate(streams.address(), streams.remaining(), MeshoptStream.SIZEOF, MeshoptStream::validate);
        }
        nmeshopt_generateShadowIndexBufferMulti(memAddress(destination), memAddress(indices), indices.remaining(), vertex_count, streams.address(), streams.remaining());
    }

    // --- [ meshopt_generateAdjacencyIndexBuffer ] ---

    /** {@code void meshopt_generateAdjacencyIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_generateAdjacencyIndexBuffer(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /** {@code void meshopt_generateAdjacencyIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static void meshopt_generateAdjacencyIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(destination, indices.remaining() << 1);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_generateAdjacencyIndexBuffer(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_generateTessellationIndexBuffer ] ---

    /** {@code void meshopt_generateTessellationIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_generateTessellationIndexBuffer(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /** {@code void meshopt_generateTessellationIndexBuffer(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static void meshopt_generateTessellationIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(destination, indices.remaining() << 2);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_generateTessellationIndexBuffer(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_generateProvokingIndexBuffer ] ---

    /** {@code size_t meshopt_generateProvokingIndexBuffer(unsigned int * destination, unsigned int * reorder, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    public static native long nmeshopt_generateProvokingIndexBuffer(long destination, long reorder, long indices, long index_count, long vertex_count);

    /** {@code size_t meshopt_generateProvokingIndexBuffer(unsigned int * destination, unsigned int * reorder, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    @NativeType("size_t")
    public static long meshopt_generateProvokingIndexBuffer(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int *") IntBuffer reorder, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long index_count, @NativeType("size_t") long vertex_count) {
        if (CHECKS) {
            check(destination, index_count);
            check(reorder, vertex_count + index_count / 3);
            check(indices, index_count);
        }
        return nmeshopt_generateProvokingIndexBuffer(memAddress(destination), memAddress(reorder), memAddress(indices), index_count, vertex_count);
    }

    // --- [ meshopt_optimizeVertexCache ] ---

    /** {@code void meshopt_optimizeVertexCache(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    public static native void nmeshopt_optimizeVertexCache(long destination, long indices, long index_count, long vertex_count);

    /** {@code void meshopt_optimizeVertexCache(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    public static void meshopt_optimizeVertexCache(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count) {
        if (CHECKS) {
            check(destination, indices.remaining());
        }
        nmeshopt_optimizeVertexCache(memAddress(destination), memAddress(indices), indices.remaining(), vertex_count);
    }

    // --- [ meshopt_optimizeVertexCacheStrip ] ---

    /** {@code void meshopt_optimizeVertexCacheStrip(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    public static native void nmeshopt_optimizeVertexCacheStrip(long destination, long indices, long index_count, long vertex_count);

    /** {@code void meshopt_optimizeVertexCacheStrip(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    public static void meshopt_optimizeVertexCacheStrip(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count) {
        if (CHECKS) {
            check(destination, indices.remaining());
        }
        nmeshopt_optimizeVertexCacheStrip(memAddress(destination), memAddress(indices), indices.remaining(), vertex_count);
    }

    // --- [ meshopt_optimizeVertexCacheFifo ] ---

    /** {@code void meshopt_optimizeVertexCacheFifo(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, unsigned int cache_size)} */
    public static native void nmeshopt_optimizeVertexCacheFifo(long destination, long indices, long index_count, long vertex_count, int cache_size);

    /** {@code void meshopt_optimizeVertexCacheFifo(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, unsigned int cache_size)} */
    public static void meshopt_optimizeVertexCacheFifo(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("unsigned int") int cache_size) {
        if (CHECKS) {
            check(destination, indices.remaining());
        }
        nmeshopt_optimizeVertexCacheFifo(memAddress(destination), memAddress(indices), indices.remaining(), vertex_count, cache_size);
    }

    // --- [ meshopt_optimizeOverdraw ] ---

    /** {@code void meshopt_optimizeOverdraw(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, float threshold)} */
    public static native void nmeshopt_optimizeOverdraw(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, float threshold);

    /** {@code void meshopt_optimizeOverdraw(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, float threshold)} */
    public static void meshopt_optimizeOverdraw(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, float threshold) {
        if (CHECKS) {
            check(destination, indices.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_optimizeOverdraw(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, threshold);
    }

    // --- [ meshopt_optimizeVertexFetch ] ---

    /** {@code size_t meshopt_optimizeVertexFetch(void * destination, unsigned int * indices, size_t index_count, void const * vertices, size_t vertex_count, size_t vertex_size)} */
    public static native long nmeshopt_optimizeVertexFetch(long destination, long indices, long index_count, long vertices, long vertex_count, long vertex_size);

    /** {@code size_t meshopt_optimizeVertexFetch(void * destination, unsigned int * indices, size_t index_count, void const * vertices, size_t vertex_count, size_t vertex_size)} */
    @NativeType("size_t")
    public static long meshopt_optimizeVertexFetch(@NativeType("void *") ByteBuffer destination, @NativeType("unsigned int *") IntBuffer indices, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size) {
        if (CHECKS) {
            check(destination, vertex_count * vertex_size);
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_optimizeVertexFetch(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertices), vertex_count, vertex_size);
    }

    // --- [ meshopt_optimizeVertexFetchRemap ] ---

    /** {@code size_t meshopt_optimizeVertexFetchRemap(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    public static native long nmeshopt_optimizeVertexFetchRemap(long destination, long indices, long index_count, long vertex_count);

    /** {@code size_t meshopt_optimizeVertexFetchRemap(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count)} */
    @NativeType("size_t")
    public static long meshopt_optimizeVertexFetchRemap(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices) {
        return nmeshopt_optimizeVertexFetchRemap(memAddress(destination), memAddress(indices), indices.remaining(), destination.remaining());
    }

    // --- [ meshopt_encodeIndexBuffer ] ---

    /** {@code size_t meshopt_encodeIndexBuffer(unsigned char * buffer, size_t buffer_size, unsigned int const * indices, size_t index_count)} */
    public static native long nmeshopt_encodeIndexBuffer(long buffer, long buffer_size, long indices, long index_count);

    /** {@code size_t meshopt_encodeIndexBuffer(unsigned char * buffer, size_t buffer_size, unsigned int const * indices, size_t index_count)} */
    @NativeType("size_t")
    public static long meshopt_encodeIndexBuffer(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("unsigned int const *") IntBuffer indices) {
        return nmeshopt_encodeIndexBuffer(memAddress(buffer), buffer.remaining(), memAddress(indices), indices.remaining());
    }

    // --- [ meshopt_encodeIndexBufferBound ] ---

    /** {@code size_t meshopt_encodeIndexBufferBound(size_t index_count, size_t vertex_count)} */
    @NativeType("size_t")
    public static native long meshopt_encodeIndexBufferBound(@NativeType("size_t") long index_count, @NativeType("size_t") long vertex_count);

    // --- [ meshopt_encodeIndexVersion ] ---

    /** {@code void meshopt_encodeIndexVersion(int version)} */
    public static native void meshopt_encodeIndexVersion(int version);

    // --- [ meshopt_decodeIndexBuffer ] ---

    /** {@code int meshopt_decodeIndexBuffer(void * destination, size_t index_count, size_t index_size, unsigned char const * buffer, size_t buffer_size)} */
    public static native int nmeshopt_decodeIndexBuffer(long destination, long index_count, long index_size, long buffer, long buffer_size);

    /** {@code int meshopt_decodeIndexBuffer(void * destination, size_t index_count, size_t index_size, unsigned char const * buffer, size_t buffer_size)} */
    public static int meshopt_decodeIndexBuffer(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long index_count, @NativeType("size_t") long index_size, @NativeType("unsigned char const *") ByteBuffer buffer) {
        if (CHECKS) {
            check(destination, index_count * index_size);
        }
        return nmeshopt_decodeIndexBuffer(memAddress(destination), index_count, index_size, memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_decodeIndexVersion ] ---

    /** {@code int meshopt_decodeIndexVersion(unsigned char const * buffer, size_t buffer_size)} */
    public static native int nmeshopt_decodeIndexVersion(long buffer, long buffer_size);

    /** {@code int meshopt_decodeIndexVersion(unsigned char const * buffer, size_t buffer_size)} */
    public static int meshopt_decodeIndexVersion(@NativeType("unsigned char const *") ByteBuffer buffer) {
        return nmeshopt_decodeIndexVersion(memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_encodeIndexSequence ] ---

    /** {@code size_t meshopt_encodeIndexSequence(unsigned char * buffer, size_t buffer_size, unsigned int const * indices, size_t index_count)} */
    public static native long nmeshopt_encodeIndexSequence(long buffer, long buffer_size, long indices, long index_count);

    /** {@code size_t meshopt_encodeIndexSequence(unsigned char * buffer, size_t buffer_size, unsigned int const * indices, size_t index_count)} */
    @NativeType("size_t")
    public static long meshopt_encodeIndexSequence(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("unsigned int const *") IntBuffer indices) {
        return nmeshopt_encodeIndexSequence(memAddress(buffer), buffer.remaining(), memAddress(indices), indices.remaining());
    }

    // --- [ meshopt_encodeIndexSequenceBound ] ---

    /** {@code size_t meshopt_encodeIndexSequenceBound(size_t index_count, size_t vertex_count)} */
    @NativeType("size_t")
    public static native long meshopt_encodeIndexSequenceBound(@NativeType("size_t") long index_count, @NativeType("size_t") long vertex_count);

    // --- [ meshopt_decodeIndexSequence ] ---

    /** {@code int meshopt_decodeIndexSequence(void * destination, size_t index_count, size_t index_size, unsigned char const * buffer, size_t buffer_size)} */
    public static native int nmeshopt_decodeIndexSequence(long destination, long index_count, long index_size, long buffer, long buffer_size);

    /** {@code int meshopt_decodeIndexSequence(void * destination, size_t index_count, size_t index_size, unsigned char const * buffer, size_t buffer_size)} */
    public static int meshopt_decodeIndexSequence(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long index_count, @NativeType("size_t") long index_size, @NativeType("unsigned char const *") ByteBuffer buffer) {
        if (CHECKS) {
            check(destination, index_count * index_size);
        }
        return nmeshopt_decodeIndexSequence(memAddress(destination), index_count, index_size, memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_encodeVertexBuffer ] ---

    /** {@code size_t meshopt_encodeVertexBuffer(unsigned char * buffer, size_t buffer_size, void const * vertices, size_t vertex_count, size_t vertex_size)} */
    public static native long nmeshopt_encodeVertexBuffer(long buffer, long buffer_size, long vertices, long vertex_count, long vertex_size);

    /** {@code size_t meshopt_encodeVertexBuffer(unsigned char * buffer, size_t buffer_size, void const * vertices, size_t vertex_count, size_t vertex_size)} */
    @NativeType("size_t")
    public static long meshopt_encodeVertexBuffer(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size) {
        if (CHECKS) {
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_encodeVertexBuffer(memAddress(buffer), buffer.remaining(), memAddress(vertices), vertex_count, vertex_size);
    }

    // --- [ meshopt_encodeVertexBufferBound ] ---

    /** {@code size_t meshopt_encodeVertexBufferBound(size_t vertex_count, size_t vertex_size)} */
    @NativeType("size_t")
    public static native long meshopt_encodeVertexBufferBound(@NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size);

    // --- [ meshopt_encodeVertexBufferLevel ] ---

    /** {@code size_t meshopt_encodeVertexBufferLevel(unsigned char * buffer, size_t buffer_size, void const * vertices, size_t vertex_count, size_t vertex_size, int level)} */
    public static native long nmeshopt_encodeVertexBufferLevel(long buffer, long buffer_size, long vertices, long vertex_count, long vertex_size, int level);

    /** {@code size_t meshopt_encodeVertexBufferLevel(unsigned char * buffer, size_t buffer_size, void const * vertices, size_t vertex_count, size_t vertex_size, int level)} */
    @NativeType("size_t")
    public static long meshopt_encodeVertexBufferLevel(@NativeType("unsigned char *") ByteBuffer buffer, @NativeType("void const *") ByteBuffer vertices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, int level) {
        if (CHECKS) {
            check(vertices, vertex_count * vertex_size);
        }
        return nmeshopt_encodeVertexBufferLevel(memAddress(buffer), buffer.remaining(), memAddress(vertices), vertex_count, vertex_size, level);
    }

    // --- [ meshopt_encodeVertexVersion ] ---

    /** {@code void meshopt_encodeVertexVersion(int version)} */
    public static native void meshopt_encodeVertexVersion(int version);

    // --- [ meshopt_decodeVertexBuffer ] ---

    /** {@code int meshopt_decodeVertexBuffer(void * destination, size_t vertex_count, size_t vertex_size, unsigned char const * buffer, size_t buffer_size)} */
    public static native int nmeshopt_decodeVertexBuffer(long destination, long vertex_count, long vertex_size, long buffer, long buffer_size);

    /** {@code int meshopt_decodeVertexBuffer(void * destination, size_t vertex_count, size_t vertex_size, unsigned char const * buffer, size_t buffer_size)} */
    public static int meshopt_decodeVertexBuffer(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("unsigned char const *") ByteBuffer buffer) {
        if (CHECKS) {
            check(destination, vertex_count * vertex_size);
        }
        return nmeshopt_decodeVertexBuffer(memAddress(destination), vertex_count, vertex_size, memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_decodeVertexVersion ] ---

    /** {@code int meshopt_decodeVertexVersion(unsigned char const * buffer, size_t buffer_size)} */
    public static native int nmeshopt_decodeVertexVersion(long buffer, long buffer_size);

    /** {@code int meshopt_decodeVertexVersion(unsigned char const * buffer, size_t buffer_size)} */
    public static int meshopt_decodeVertexVersion(@NativeType("unsigned char const *") ByteBuffer buffer) {
        return nmeshopt_decodeVertexVersion(memAddress(buffer), buffer.remaining());
    }

    // --- [ meshopt_decodeFilterOct ] ---

    /** {@code void meshopt_decodeFilterOct(void * buffer, size_t count, size_t stride)} */
    public static native void nmeshopt_decodeFilterOct(long buffer, long count, long stride);

    /** {@code void meshopt_decodeFilterOct(void * buffer, size_t count, size_t stride)} */
    public static void meshopt_decodeFilterOct(@NativeType("void *") ByteBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, count * stride);
        }
        nmeshopt_decodeFilterOct(memAddress(buffer), count, stride);
    }

    /** {@code void meshopt_decodeFilterOct(void * buffer, size_t count, size_t stride)} */
    public static void meshopt_decodeFilterOct(@NativeType("void *") ShortBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, (count * stride) >> 1);
        }
        nmeshopt_decodeFilterOct(memAddress(buffer), count, stride);
    }

    // --- [ meshopt_decodeFilterQuat ] ---

    /** {@code void meshopt_decodeFilterQuat(void * buffer, size_t count, size_t stride)} */
    public static native void nmeshopt_decodeFilterQuat(long buffer, long count, long stride);

    /** {@code void meshopt_decodeFilterQuat(void * buffer, size_t count, size_t stride)} */
    public static void meshopt_decodeFilterQuat(@NativeType("void *") ByteBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, count * stride);
        }
        nmeshopt_decodeFilterQuat(memAddress(buffer), count, stride);
    }

    /** {@code void meshopt_decodeFilterQuat(void * buffer, size_t count, size_t stride)} */
    public static void meshopt_decodeFilterQuat(@NativeType("void *") ShortBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, (count * stride) >> 1);
        }
        nmeshopt_decodeFilterQuat(memAddress(buffer), count, stride);
    }

    // --- [ meshopt_decodeFilterExp ] ---

    /** {@code void meshopt_decodeFilterExp(void * buffer, size_t count, size_t stride)} */
    public static native void nmeshopt_decodeFilterExp(long buffer, long count, long stride);

    /** {@code void meshopt_decodeFilterExp(void * buffer, size_t count, size_t stride)} */
    public static void meshopt_decodeFilterExp(@NativeType("void *") ByteBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, count * stride);
        }
        nmeshopt_decodeFilterExp(memAddress(buffer), count, stride);
    }

    /** {@code void meshopt_decodeFilterExp(void * buffer, size_t count, size_t stride)} */
    public static void meshopt_decodeFilterExp(@NativeType("void *") IntBuffer buffer, @NativeType("size_t") long count, @NativeType("size_t") long stride) {
        if (CHECKS) {
            check(buffer, (count * stride) >> 2);
        }
        nmeshopt_decodeFilterExp(memAddress(buffer), count, stride);
    }

    // --- [ meshopt_encodeFilterOct ] ---

    /** {@code void meshopt_encodeFilterOct(void * destination, size_t count, size_t stride, int bits, float const * data)} */
    public static native void nmeshopt_encodeFilterOct(long destination, long count, long stride, int bits, long data);

    /** {@code void meshopt_encodeFilterOct(void * destination, size_t count, size_t stride, int bits, float const * data)} */
    public static void meshopt_encodeFilterOct(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, count * 4 * (stride >> 2));
            check(data, count * 4);
        }
        nmeshopt_encodeFilterOct(memAddress(destination), count, stride, bits, memAddress(data));
    }

    /** {@code void meshopt_encodeFilterOct(void * destination, size_t count, size_t stride, int bits, float const * data)} */
    public static void meshopt_encodeFilterOct(@NativeType("void *") ShortBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, (count * 4 * (stride >> 2)) >> 1);
            check(data, count * 4);
        }
        nmeshopt_encodeFilterOct(memAddress(destination), count, stride, bits, memAddress(data));
    }

    // --- [ meshopt_encodeFilterQuat ] ---

    /** {@code void meshopt_encodeFilterQuat(void * destination, size_t count, size_t stride, int bits, float const * data)} */
    public static native void nmeshopt_encodeFilterQuat(long destination, long count, long stride, int bits, long data);

    /** {@code void meshopt_encodeFilterQuat(void * destination, size_t count, size_t stride, int bits, float const * data)} */
    public static void meshopt_encodeFilterQuat(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, count * 4 * 2);
            check(data, count * 4);
        }
        nmeshopt_encodeFilterQuat(memAddress(destination), count, stride, bits, memAddress(data));
    }

    /** {@code void meshopt_encodeFilterQuat(void * destination, size_t count, size_t stride, int bits, float const * data)} */
    public static void meshopt_encodeFilterQuat(@NativeType("void *") ShortBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data) {
        if (CHECKS) {
            check(destination, (count * 4 * 2) >> 1);
            check(data, count * 4);
        }
        nmeshopt_encodeFilterQuat(memAddress(destination), count, stride, bits, memAddress(data));
    }

    // --- [ meshopt_encodeFilterExp ] ---

    /** {@code void meshopt_encodeFilterExp(void * destination, size_t count, size_t stride, int bits, float const * data, enum meshopt_EncodeExpMode mode)} */
    public static native void nmeshopt_encodeFilterExp(long destination, long count, long stride, int bits, long data, int mode);

    /** {@code void meshopt_encodeFilterExp(void * destination, size_t count, size_t stride, int bits, float const * data, enum meshopt_EncodeExpMode mode)} */
    public static void meshopt_encodeFilterExp(@NativeType("void *") ByteBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data, @NativeType("enum meshopt_EncodeExpMode") int mode) {
        if (CHECKS) {
            check(destination, count * (stride >> 2) * 4);
            check(data, count * (stride >> 2));
        }
        nmeshopt_encodeFilterExp(memAddress(destination), count, stride, bits, memAddress(data), mode);
    }

    /** {@code void meshopt_encodeFilterExp(void * destination, size_t count, size_t stride, int bits, float const * data, enum meshopt_EncodeExpMode mode)} */
    public static void meshopt_encodeFilterExp(@NativeType("void *") IntBuffer destination, @NativeType("size_t") long count, @NativeType("size_t") long stride, int bits, @NativeType("float const *") FloatBuffer data, @NativeType("enum meshopt_EncodeExpMode") int mode) {
        if (CHECKS) {
            check(destination, (count * (stride >> 2) * 4) >> 2);
            check(data, count * (stride >> 2));
        }
        nmeshopt_encodeFilterExp(memAddress(destination), count, stride, bits, memAddress(data), mode);
    }

    // --- [ meshopt_simplify ] ---

    /** {@code size_t meshopt_simplify(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t target_index_count, float target_error, unsigned int options, float * result_error)} */
    public static native long nmeshopt_simplify(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long target_index_count, float target_error, int options, long result_error);

    /** {@code size_t meshopt_simplify(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t target_index_count, float target_error, unsigned int options, float * result_error)} */
    @NativeType("size_t")
    public static long meshopt_simplify(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long target_index_count, float target_error, @NativeType("unsigned int") int options, @NativeType("float *") @Nullable FloatBuffer result_error) {
        if (CHECKS) {
            check(destination, indices.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
            checkSafe(result_error, 1);
        }
        return nmeshopt_simplify(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, target_index_count, target_error, options, memAddressSafe(result_error));
    }

    // --- [ meshopt_simplifyWithAttributes ] ---

    /** {@code size_t meshopt_simplifyWithAttributes(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, float const * vertex_attributes, size_t vertex_attributes_stride, float const * attribute_weights, size_t attribute_count, unsigned char const * vertex_lock, size_t target_index_count, float target_error, unsigned int options, float * result_error)} */
    public static native long nmeshopt_simplifyWithAttributes(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long vertex_attributes, long vertex_attributes_stride, long attribute_weights, long attribute_count, long vertex_lock, long target_index_count, float target_error, int options, long result_error);

    /** {@code size_t meshopt_simplifyWithAttributes(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, float const * vertex_attributes, size_t vertex_attributes_stride, float const * attribute_weights, size_t attribute_count, unsigned char const * vertex_lock, size_t target_index_count, float target_error, unsigned int options, float * result_error)} */
    @NativeType("size_t")
    public static long meshopt_simplifyWithAttributes(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("float const *") FloatBuffer vertex_attributes, @NativeType("size_t") long vertex_attributes_stride, @NativeType("float const *") FloatBuffer attribute_weights, @NativeType("unsigned char const *") @Nullable ByteBuffer vertex_lock, @NativeType("size_t") long target_index_count, float target_error, @NativeType("unsigned int") int options, @NativeType("float *") @Nullable FloatBuffer result_error) {
        if (CHECKS) {
            check(destination, indices.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
            check(vertex_attributes, vertex_count * (vertex_attributes_stride >>> 2));
            checkSafe(vertex_lock, vertex_count);
            checkSafe(result_error, 1);
        }
        return nmeshopt_simplifyWithAttributes(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, memAddress(vertex_attributes), vertex_attributes_stride, memAddress(attribute_weights), attribute_weights.remaining(), memAddressSafe(vertex_lock), target_index_count, target_error, options, memAddressSafe(result_error));
    }

    // --- [ meshopt_simplifySloppy ] ---

    /** {@code size_t meshopt_simplifySloppy(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t target_index_count, float target_error, float * result_error)} */
    public static native long nmeshopt_simplifySloppy(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long target_index_count, float target_error, long result_error);

    /** {@code size_t meshopt_simplifySloppy(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t target_index_count, float target_error, float * result_error)} */
    @NativeType("size_t")
    public static long meshopt_simplifySloppy(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long target_index_count, float target_error, @NativeType("float *") @Nullable FloatBuffer result_error) {
        if (CHECKS) {
            check(destination, indices.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
            checkSafe(result_error, 1);
        }
        return nmeshopt_simplifySloppy(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, target_index_count, target_error, memAddressSafe(result_error));
    }

    // --- [ meshopt_simplifyPoints ] ---

    /** {@code size_t meshopt_simplifyPoints(unsigned int * destination, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, float const * vertex_colors, size_t vertex_colors_stride, float color_weight, size_t target_vertex_count)} */
    public static native long nmeshopt_simplifyPoints(long destination, long vertex_positions, long vertex_count, long vertex_positions_stride, long vertex_colors, long vertex_colors_stride, float color_weight, long target_vertex_count);

    /** {@code size_t meshopt_simplifyPoints(unsigned int * destination, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, float const * vertex_colors, size_t vertex_colors_stride, float color_weight, size_t target_vertex_count)} */
    @NativeType("size_t")
    public static long meshopt_simplifyPoints(@NativeType("unsigned int *") IntBuffer destination, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("float const *") @Nullable FloatBuffer vertex_colors, @NativeType("size_t") long vertex_colors_stride, float color_weight, @NativeType("size_t") long target_vertex_count) {
        if (CHECKS) {
            check(destination, target_vertex_count);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
            checkSafe(vertex_colors, vertex_count * (vertex_colors_stride >>> 2));
        }
        return nmeshopt_simplifyPoints(memAddress(destination), memAddress(vertex_positions), vertex_count, vertex_positions_stride, memAddressSafe(vertex_colors), vertex_colors_stride, color_weight, target_vertex_count);
    }

    // --- [ meshopt_simplifyScale ] ---

    /** {@code float meshopt_simplifyScale(float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native float nmeshopt_simplifyScale(long vertex_positions, long vertex_count, long vertex_positions_stride);

    /** {@code float meshopt_simplifyScale(float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static float meshopt_simplifyScale(@NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        return nmeshopt_simplifyScale(memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_stripify ] ---

    /** {@code size_t meshopt_stripify(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, unsigned int restart_index)} */
    public static native long nmeshopt_stripify(long destination, long indices, long index_count, long vertex_count, int restart_index);

    /** {@code size_t meshopt_stripify(unsigned int * destination, unsigned int const * indices, size_t index_count, size_t vertex_count, unsigned int restart_index)} */
    @NativeType("size_t")
    public static long meshopt_stripify(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("unsigned int") int restart_index) {
        return nmeshopt_stripify(memAddress(destination), memAddress(indices), indices.remaining(), vertex_count, restart_index);
    }

    // --- [ meshopt_stripifyBound ] ---

    /** {@code size_t meshopt_stripifyBound(size_t index_count)} */
    @NativeType("size_t")
    public static native long meshopt_stripifyBound(@NativeType("size_t") long index_count);

    // --- [ meshopt_unstripify ] ---

    /** {@code size_t meshopt_unstripify(unsigned int * destination, unsigned int const * indices, size_t index_count, unsigned int restart_index)} */
    public static native long nmeshopt_unstripify(long destination, long indices, long index_count, int restart_index);

    /** {@code size_t meshopt_unstripify(unsigned int * destination, unsigned int const * indices, size_t index_count, unsigned int restart_index)} */
    @NativeType("size_t")
    public static long meshopt_unstripify(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("unsigned int") int restart_index) {
        return nmeshopt_unstripify(memAddress(destination), memAddress(indices), indices.remaining(), restart_index);
    }

    // --- [ meshopt_unstripifyBound ] ---

    /** {@code size_t meshopt_unstripifyBound(size_t index_count)} */
    @NativeType("size_t")
    public static native long meshopt_unstripifyBound(@NativeType("size_t") long index_count);

    // --- [ meshopt_analyzeVertexCache ] ---

    /** {@code struct meshopt_VertexCacheStatistics meshopt_analyzeVertexCache(unsigned int const * indices, size_t index_count, size_t vertex_count, unsigned int cache_size, unsigned int warp_size, unsigned int primgroup_size)} */
    public static native void nmeshopt_analyzeVertexCache(long indices, long index_count, long vertex_count, int cache_size, int warp_size, int primgroup_size, long __result);

    /** {@code struct meshopt_VertexCacheStatistics meshopt_analyzeVertexCache(unsigned int const * indices, size_t index_count, size_t vertex_count, unsigned int cache_size, unsigned int warp_size, unsigned int primgroup_size)} */
    @NativeType("struct meshopt_VertexCacheStatistics")
    public static MeshoptVertexCacheStatistics meshopt_analyzeVertexCache(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("unsigned int") int cache_size, @NativeType("unsigned int") int warp_size, @NativeType("unsigned int") int primgroup_size, @NativeType("struct meshopt_VertexCacheStatistics") MeshoptVertexCacheStatistics __result) {
        nmeshopt_analyzeVertexCache(memAddress(indices), indices.remaining(), vertex_count, cache_size, warp_size, primgroup_size, __result.address());
        return __result;
    }

    // --- [ meshopt_analyzeOverdraw ] ---

    /** {@code struct meshopt_OverdrawStatistics meshopt_analyzeOverdraw(unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_analyzeOverdraw(long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long __result);

    /** {@code struct meshopt_OverdrawStatistics meshopt_analyzeOverdraw(unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    @NativeType("struct meshopt_OverdrawStatistics")
    public static MeshoptOverdrawStatistics meshopt_analyzeOverdraw(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("struct meshopt_OverdrawStatistics") MeshoptOverdrawStatistics __result) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_analyzeOverdraw(memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_analyzeVertexFetch ] ---

    /** {@code struct meshopt_VertexFetchStatistics meshopt_analyzeVertexFetch(unsigned int const * indices, size_t index_count, size_t vertex_count, size_t vertex_size)} */
    public static native void nmeshopt_analyzeVertexFetch(long indices, long index_count, long vertex_count, long vertex_size, long __result);

    /** {@code struct meshopt_VertexFetchStatistics meshopt_analyzeVertexFetch(unsigned int const * indices, size_t index_count, size_t vertex_count, size_t vertex_size)} */
    @NativeType("struct meshopt_VertexFetchStatistics")
    public static MeshoptVertexFetchStatistics meshopt_analyzeVertexFetch(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_size, @NativeType("struct meshopt_VertexFetchStatistics") MeshoptVertexFetchStatistics __result) {
        nmeshopt_analyzeVertexFetch(memAddress(indices), indices.remaining(), vertex_count, vertex_size, __result.address());
        return __result;
    }

    // --- [ meshopt_buildMeshlets ] ---

    /** {@code size_t meshopt_buildMeshlets(struct meshopt_Meshlet * meshlets, unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t max_vertices, size_t max_triangles, float cone_weight)} */
    public static native long nmeshopt_buildMeshlets(long meshlets, long meshlet_vertices, long meshlet_triangles, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long max_vertices, long max_triangles, float cone_weight);

    /** {@code size_t meshopt_buildMeshlets(struct meshopt_Meshlet * meshlets, unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t max_vertices, size_t max_triangles, float cone_weight)} */
    @NativeType("size_t")
    public static long meshopt_buildMeshlets(@NativeType("struct meshopt_Meshlet *") MeshoptMeshlet.Buffer meshlets, @NativeType("unsigned int *") IntBuffer meshlet_vertices, @NativeType("unsigned char *") ByteBuffer meshlet_triangles, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long max_vertices, @NativeType("size_t") long max_triangles, float cone_weight) {
        if (CHECKS) {
            check(meshlet_vertices, meshlets.remaining() * max_vertices);
            check(meshlet_triangles, meshlets.remaining() * max_triangles * 3);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        return nmeshopt_buildMeshlets(meshlets.address(), memAddress(meshlet_vertices), memAddress(meshlet_triangles), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, max_vertices, max_triangles, cone_weight);
    }

    // --- [ meshopt_buildMeshletsScan ] ---

    /** {@code size_t meshopt_buildMeshletsScan(struct meshopt_Meshlet * meshlets, unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, unsigned int const * indices, size_t index_count, size_t vertex_count, size_t max_vertices, size_t max_triangles)} */
    public static native long nmeshopt_buildMeshletsScan(long meshlets, long meshlet_vertices, long meshlet_triangles, long indices, long index_count, long vertex_count, long max_vertices, long max_triangles);

    /** {@code size_t meshopt_buildMeshletsScan(struct meshopt_Meshlet * meshlets, unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, unsigned int const * indices, size_t index_count, size_t vertex_count, size_t max_vertices, size_t max_triangles)} */
    @NativeType("size_t")
    public static long meshopt_buildMeshletsScan(@NativeType("struct meshopt_Meshlet *") MeshoptMeshlet.Buffer meshlets, @NativeType("unsigned int *") IntBuffer meshlet_vertices, @NativeType("unsigned char *") ByteBuffer meshlet_triangles, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("size_t") long vertex_count, @NativeType("size_t") long max_vertices, @NativeType("size_t") long max_triangles) {
        if (CHECKS) {
            check(meshlet_vertices, meshlets.remaining() * max_vertices);
            check(meshlet_triangles, meshlets.remaining() * max_triangles * 3);
        }
        return nmeshopt_buildMeshletsScan(meshlets.address(), memAddress(meshlet_vertices), memAddress(meshlet_triangles), memAddress(indices), indices.remaining(), vertex_count, max_vertices, max_triangles);
    }

    // --- [ meshopt_buildMeshletsBound ] ---

    /** {@code size_t meshopt_buildMeshletsBound(size_t index_count, size_t max_vertices, size_t max_triangles)} */
    @NativeType("size_t")
    public static native long meshopt_buildMeshletsBound(@NativeType("size_t") long index_count, @NativeType("size_t") long max_vertices, @NativeType("size_t") long max_triangles);

    // --- [ meshopt_buildMeshletsFlex ] ---

    /** {@code size_t meshopt_buildMeshletsFlex(struct meshopt_Meshlet * meshlets, unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t max_vertices, size_t min_triangles, size_t max_triangles, float cone_weight, float split_factor)} */
    public static native long nmeshopt_buildMeshletsFlex(long meshlets, long meshlet_vertices, long meshlet_triangles, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long max_vertices, long min_triangles, long max_triangles, float cone_weight, float split_factor);

    /** {@code size_t meshopt_buildMeshletsFlex(struct meshopt_Meshlet * meshlets, unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride, size_t max_vertices, size_t min_triangles, size_t max_triangles, float cone_weight, float split_factor)} */
    @NativeType("size_t")
    public static long meshopt_buildMeshletsFlex(@NativeType("struct meshopt_Meshlet *") MeshoptMeshlet.Buffer meshlets, @NativeType("unsigned int *") IntBuffer meshlet_vertices, @NativeType("unsigned char *") ByteBuffer meshlet_triangles, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("size_t") long max_vertices, @NativeType("size_t") long min_triangles, @NativeType("size_t") long max_triangles, float cone_weight, float split_factor) {
        if (CHECKS) {
            check(meshlet_vertices, meshlets.remaining() * max_vertices);
            check(meshlet_triangles, meshlets.remaining() * max_triangles * 3);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        return nmeshopt_buildMeshletsFlex(meshlets.address(), memAddress(meshlet_vertices), memAddress(meshlet_triangles), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, max_vertices, min_triangles, max_triangles, cone_weight, split_factor);
    }

    // --- [ meshopt_optimizeMeshlet ] ---

    /** {@code void meshopt_optimizeMeshlet(unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, size_t triangle_count, size_t vertex_count)} */
    public static native void nmeshopt_optimizeMeshlet(long meshlet_vertices, long meshlet_triangles, long triangle_count, long vertex_count);

    /** {@code void meshopt_optimizeMeshlet(unsigned int * meshlet_vertices, unsigned char * meshlet_triangles, size_t triangle_count, size_t vertex_count)} */
    public static void meshopt_optimizeMeshlet(@NativeType("unsigned int *") IntBuffer meshlet_vertices, @NativeType("unsigned char *") ByteBuffer meshlet_triangles) {
        nmeshopt_optimizeMeshlet(memAddress(meshlet_vertices), memAddress(meshlet_triangles), Integer.toUnsignedLong(meshlet_triangles.remaining()) / 3, meshlet_vertices.remaining());
    }

    // --- [ meshopt_computeClusterBounds ] ---

    /** {@code struct meshopt_Bounds meshopt_computeClusterBounds(unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_computeClusterBounds(long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long __result);

    /** {@code struct meshopt_Bounds meshopt_computeClusterBounds(unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    @NativeType("struct meshopt_Bounds")
    public static MeshoptBounds meshopt_computeClusterBounds(@NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("struct meshopt_Bounds") MeshoptBounds __result) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_computeClusterBounds(memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_computeMeshletBounds ] ---

    /** {@code struct meshopt_Bounds meshopt_computeMeshletBounds(unsigned int const * meshlet_vertices, unsigned char const * meshlet_triangles, size_t triangle_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_computeMeshletBounds(long meshlet_vertices, long meshlet_triangles, long triangle_count, long vertex_positions, long vertex_count, long vertex_positions_stride, long __result);

    /** {@code struct meshopt_Bounds meshopt_computeMeshletBounds(unsigned int const * meshlet_vertices, unsigned char const * meshlet_triangles, size_t triangle_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    @NativeType("struct meshopt_Bounds")
    public static MeshoptBounds meshopt_computeMeshletBounds(@NativeType("unsigned int const *") IntBuffer meshlet_vertices, @NativeType("unsigned char const *") ByteBuffer meshlet_triangles, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride, @NativeType("struct meshopt_Bounds") MeshoptBounds __result) {
        if (CHECKS) {
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_computeMeshletBounds(memAddress(meshlet_vertices), memAddress(meshlet_triangles), Integer.toUnsignedLong(meshlet_triangles.remaining()) / 3, memAddress(vertex_positions), vertex_count, vertex_positions_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_computeSphereBounds ] ---

    /** {@code struct meshopt_Bounds meshopt_computeSphereBounds(float const * positions, size_t count, size_t positions_stride, float const * radii, size_t radii_stride)} */
    public static native void nmeshopt_computeSphereBounds(long positions, long count, long positions_stride, long radii, long radii_stride, long __result);

    /** {@code struct meshopt_Bounds meshopt_computeSphereBounds(float const * positions, size_t count, size_t positions_stride, float const * radii, size_t radii_stride)} */
    @NativeType("struct meshopt_Bounds")
    public static MeshoptBounds meshopt_computeSphereBounds(@NativeType("float const *") FloatBuffer positions, @NativeType("size_t") long count, @NativeType("size_t") long positions_stride, @NativeType("float const *") @Nullable FloatBuffer radii, @NativeType("size_t") long radii_stride, @NativeType("struct meshopt_Bounds") MeshoptBounds __result) {
        if (CHECKS) {
            check(positions, count * (positions_stride >>> 2));
            checkSafe(radii, count * (radii_stride >>> 2));
        }
        nmeshopt_computeSphereBounds(memAddress(positions), count, positions_stride, memAddressSafe(radii), radii_stride, __result.address());
        return __result;
    }

    // --- [ meshopt_partitionClusters ] ---

    /** {@code size_t meshopt_partitionClusters(unsigned int * destination, unsigned int const * cluster_indices, size_t total_index_count, unsigned int const * cluster_index_counts, size_t cluster_count, size_t vertex_count, size_t target_partition_size)} */
    public static native long nmeshopt_partitionClusters(long destination, long cluster_indices, long total_index_count, long cluster_index_counts, long cluster_count, long vertex_count, long target_partition_size);

    /** {@code size_t meshopt_partitionClusters(unsigned int * destination, unsigned int const * cluster_indices, size_t total_index_count, unsigned int const * cluster_index_counts, size_t cluster_count, size_t vertex_count, size_t target_partition_size)} */
    @NativeType("size_t")
    public static long meshopt_partitionClusters(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer cluster_indices, @NativeType("unsigned int const *") IntBuffer cluster_index_counts, @NativeType("size_t") long vertex_count, @NativeType("size_t") long target_partition_size) {
        if (CHECKS) {
            check(destination, cluster_index_counts.remaining());
        }
        return nmeshopt_partitionClusters(memAddress(destination), memAddress(cluster_indices), cluster_indices.remaining(), memAddress(cluster_index_counts), cluster_index_counts.remaining(), vertex_count, target_partition_size);
    }

    // --- [ meshopt_spatialSortRemap ] ---

    /** {@code void meshopt_spatialSortRemap(unsigned int * destination, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_spatialSortRemap(long destination, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /** {@code void meshopt_spatialSortRemap(unsigned int * destination, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static void meshopt_spatialSortRemap(@NativeType("unsigned int *") IntBuffer destination, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(destination, vertex_count);
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_spatialSortRemap(memAddress(destination), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_spatialSortTriangles ] ---

    /** {@code void meshopt_spatialSortTriangles(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static native void nmeshopt_spatialSortTriangles(long destination, long indices, long index_count, long vertex_positions, long vertex_count, long vertex_positions_stride);

    /** {@code void meshopt_spatialSortTriangles(unsigned int * destination, unsigned int const * indices, size_t index_count, float const * vertex_positions, size_t vertex_count, size_t vertex_positions_stride)} */
    public static void meshopt_spatialSortTriangles(@NativeType("unsigned int *") IntBuffer destination, @NativeType("unsigned int const *") IntBuffer indices, @NativeType("float const *") FloatBuffer vertex_positions, @NativeType("size_t") long vertex_count, @NativeType("size_t") long vertex_positions_stride) {
        if (CHECKS) {
            check(destination, indices.remaining());
            check(vertex_positions, vertex_count * (vertex_positions_stride >>> 2));
        }
        nmeshopt_spatialSortTriangles(memAddress(destination), memAddress(indices), indices.remaining(), memAddress(vertex_positions), vertex_count, vertex_positions_stride);
    }

    // --- [ meshopt_quantizeUnorm_ref ] ---

    /** {@code int meshopt_quantizeUnorm_ref(float v, int N)} */
    static native int nmeshopt_quantizeUnorm_ref(float v, int N);

    /** {@code int meshopt_quantizeUnorm_ref(float v, int N)} */
    static int meshopt_quantizeUnorm_ref(float v, int N) {
        return nmeshopt_quantizeUnorm_ref(v, N);
    }

    // --- [ meshopt_quantizeSnorm_ref ] ---

    /** {@code int meshopt_quantizeSnorm_ref(float v, int N)} */
    static native int nmeshopt_quantizeSnorm_ref(float v, int N);

    /** {@code int meshopt_quantizeSnorm_ref(float v, int N)} */
    static int meshopt_quantizeSnorm_ref(float v, int N) {
        return nmeshopt_quantizeSnorm_ref(v, N);
    }

    // --- [ meshopt_quantizeHalf_ref ] ---

    /** {@code short meshopt_quantizeHalf_ref(float v)} */
    static native short nmeshopt_quantizeHalf_ref(float v);

    /** {@code short meshopt_quantizeHalf_ref(float v)} */
    static short meshopt_quantizeHalf_ref(float v) {
        return nmeshopt_quantizeHalf_ref(v);
    }

    // --- [ meshopt_quantizeFloat_ref ] ---

    /** {@code float meshopt_quantizeFloat_ref(float v, int N)} */
    static native float nmeshopt_quantizeFloat_ref(float v, int N);

    /** {@code float meshopt_quantizeFloat_ref(float v, int N)} */
    static float meshopt_quantizeFloat_ref(float v, int N) {
        return nmeshopt_quantizeFloat_ref(v, N);
    }

    // --- [ meshopt_dequantizeHalf_ref ] ---

    /** {@code float meshopt_dequantizeHalf_ref(unsigned short h)} */
    static native float nmeshopt_dequantizeHalf_ref(short h);

    /** {@code float meshopt_dequantizeHalf_ref(unsigned short h)} */
    static float meshopt_dequantizeHalf_ref(@NativeType("unsigned short") short h) {
        return nmeshopt_dequantizeHalf_ref(h);
    }

    // --- [ meshopt_setAllocator ] ---

    /** {@code void meshopt_setAllocator(void * (*) (size_t) allocate, void (*) (void *) deallocate)} */
    public static native void nmeshopt_setAllocator(long allocate, long deallocate);

    /** {@code void meshopt_setAllocator(void * (*) (size_t) allocate, void (*) (void *) deallocate)} */
    public static void meshopt_setAllocator(@NativeType("void * (*) (size_t)") MeshoptAllocateI allocate, @NativeType("void (*) (void *)") MeshoptDeallocateI deallocate) {
        nmeshopt_setAllocator(allocate.address(), deallocate.address());
    }

    /**
     * Quantizes a float in {@code [0..1]} range into an N-bit fixed point {@code unorm} value.
     * 
     * <p>Assumes reconstruction function <code>q / (2<sup>N</sup> - 1)</code>, which is the case for fixed-function normalized fixed point conversion. Maximum
     * reconstruction error: <code>1 / 2<sup>N+1</sup></code>.</p>
     */
    public static int meshopt_quantizeUnorm(float v, int N) {
        float scale = (1 << N) - 1;

        v = (v >= 0f) ? v : 0f;
        v = (v <= 1f) ? v : 1f;

        return (int)(v * scale + 0.5f);
    }

    /**
     * Quantizes a float in {@code [-1..1]} range into an N-bit fixed point {@code snorm} value.
     * 
     * <p>Assumes reconstruction function <code>q / (2<sup>N-1</sup> - 1)</code>, which is the case for fixed-function normalized fixed point conversion (except early
     * OpenGL versions). Maximum reconstruction error: <code>1 / 2<sup>N</sup></code>.</p>
     */
    public static int meshopt_quantizeSnorm(float v, int N) {
        float scale = (1 << (N - 1)) - 1;

        float round = (v >= 0f ? 0.5f : -0.5f);

        v = (v >= -1f) ? v : -1f;
        v = (v <= +1f) ? v : +1f;

        return (int)(v * scale + round);
    }

    /**
     * Quantizes a float into half-precision (as defined by IEEE-754 fp16) floating point value.
     * 
     * <p>Generates {@code +-inf} for overflow, preserves {@code NaN}, flushes denormals to zero, rounds to nearest. Representable magnitude range:
     * {@code [6e-5; 65504]}. Maximum relative reconstruction error: {@code 5e-4}.</p>
     */
    public static short meshopt_quantizeHalf(float v) {
        int ui = floatToRawIntBits(v);

        int s  = (ui >>> 16) & 0x8000;
        int em = ui & 0x7fffffff;

        /* bias exponent and round to nearest; 112 is relative exponent bias (127-15) */
        int h = (em - (112 << 23) + (1 << 12)) >> 13;

        /* underflow: flush to zero; 113 encodes exponent -14 */
        h = (em < (113 << 23)) ? 0 : h;

        /* overflow: infinity; 143 encodes exponent 16 */
        h = (em >= (143 << 23)) ? 0x7c00 : h;

        /* NaN; note that we convert all types of NaN to qNaN */
        h = (em > (255 << 23)) ? 0x7e00 : h;

        return (short)(s | h);
    }

    /**
     * Quantizes a float into a floating point value with a limited number of significant mantissa bits, preserving the IEEE-754 fp32 binary representation.
     * 
     * <p>Generates {@code +-inf} for overflow, preserves {@code NaN}, flushes denormals to zero, rounds to nearest. Assumes {@code N} is in a valid mantissa
     * precision range, which is {@code 1..23}.</p>
     */
    public static float meshopt_quantizeFloat(float v, int N) {
        int ui = floatToRawIntBits(v);

        int mask  = (1 << (23 - N)) - 1;
        int round = (1 << (23 - N)) >> 1;

        int e   = ui & 0x7f800000;
        int rui = (ui + round) & ~mask;

        /* round all numbers except inf/nan; this is important to make sure nan doesn't overflow into -0 */
        ui = e == 0x7f800000 ? ui : rui;

        /* flush denormals to zero */
        ui = e == 0 ? 0 : ui;

        return intBitsToFloat(ui);
    }

    /**
     * Reverse quantization of a half-precision (as defined by IEEE-754 fp16) floating point value.
     * 
     * <p>Preserves Inf/NaN, flushes denormals to zero.</p>
     */
    public static float meshopt_dequantizeHalf(@NativeType("unsigned short") short h) {
        int s = (h & 0x8000) << 16;
        int em = h & 0x7fff;

        // bias exponent and pad mantissa with 0; 112 is relative exponent bias (127-15)
        int r = (em + (112 << 10)) << 13;

        // denormal: flush to zero
        r = (em < (1 << 10)) ? 0 : r;

        // infinity/NaN; note that we preserve NaN payload as a byproduct of unifying inf/nan cases
        // 112 is an exponent bias fixup; since we already applied it once, applying it twice converts 31 to 255
        r += (em >= (31 << 10)) ? (112 << 23) : 0;

        return intBitsToFloat(s | r);
    }

}