/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the type and dimensions of the image or image array.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_image_desc {
 *     cl_mem_object_type {@link #image_type};
 *     size_t {@link #image_width};
 *     size_t {@link #image_height};
 *     size_t {@link #image_depth};
 *     size_t {@link #image_array_size};
 *     size_t {@link #image_row_pitch};
 *     size_t {@link #image_slice_pitch};
 *     cl_uint {@link #num_mip_levels};
 *     cl_uint {@link #num_samples};
 *     union {
 *         cl_mem {@link #buffer};
 *         cl_mem {@link #mem_object};
 *     };
 * }</code></pre>
 */
@NativeType("struct cl_image_desc")
public class CLImageDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE_TYPE,
        IMAGE_WIDTH,
        IMAGE_HEIGHT,
        IMAGE_DEPTH,
        IMAGE_ARRAY_SIZE,
        IMAGE_ROW_PITCH,
        IMAGE_SLICE_PITCH,
        NUM_MIP_LEVELS,
        NUM_SAMPLES,
        BUFFER,
        MEM_OBJECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE_TYPE = layout.offsetof(0);
        IMAGE_WIDTH = layout.offsetof(1);
        IMAGE_HEIGHT = layout.offsetof(2);
        IMAGE_DEPTH = layout.offsetof(3);
        IMAGE_ARRAY_SIZE = layout.offsetof(4);
        IMAGE_ROW_PITCH = layout.offsetof(5);
        IMAGE_SLICE_PITCH = layout.offsetof(6);
        NUM_MIP_LEVELS = layout.offsetof(7);
        NUM_SAMPLES = layout.offsetof(8);
        BUFFER = layout.offsetof(10);
        MEM_OBJECT = layout.offsetof(11);
    }

    /**
     * Creates a {@code CLImageDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLImageDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** describes the image type */
    @NativeType("cl_mem_object_type")
    public int image_type() { return nimage_type(address()); }
    /**
     * the width of the image in pixels. For a 2D image and image array, the image width must be &le; {@link CL10#CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}. For a 3D image, the
     * image width must be &le; {@link CL10#CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}. For a 1D image buffer, the image width must be &le; {@link CL12#CL_DEVICE_IMAGE_MAX_BUFFER_SIZE DEVICE_IMAGE_MAX_BUFFER_SIZE}.
     * For a 1D image and 1D image array, the image width must be &le; {@link CL10#CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}.
     */
    @NativeType("size_t")
    public long image_width() { return nimage_width(address()); }
    /**
     * the height of the image in pixels. This is only used if the image is a 2D, 3D or 2D image array. For a 2D image or image array, the image height must
     * be &le; {@link CL10#CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT}. For a 3D image, the image height must be &le; {@link CL10#CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT}.
     */
    @NativeType("size_t")
    public long image_height() { return nimage_height(address()); }
    /** the depth of the image in pixels. This is only used if the image is a 3D image and must be a value &ge; 1 and &le; {@link CL10#CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH}. */
    @NativeType("size_t")
    public long image_depth() { return nimage_depth(address()); }
    /**
     * the number of images in the image array. This is only used if the image is a 1D or 2D image array. The values for {@code image_array_size}, if
     * specified, must be a value &ge; 1 and &le; {@link CL12#CL_DEVICE_IMAGE_MAX_ARRAY_SIZE DEVICE_IMAGE_MAX_ARRAY_SIZE}.
     * 
     * <p>Note that reading and writing 2D image arrays from a kernel with {@code image_array_size = 1} may be lower performance than 2D images.</p>
     */
    @NativeType("size_t")
    public long image_array_size() { return nimage_array_size(address()); }
    /**
     * the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &ge; {@code image_width * size} of element in bytes if
     * {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch = 0}, {@code image_row_pitch} is calculated as
     * {@code image_width * size} of element in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     */
    @NativeType("size_t")
    public long image_row_pitch() { return nimage_row_pitch(address()); }
    /**
     * the size in bytes of each 2D slice in the 3D image or the size in bytes of each image in a 1D or 2D image array. This must be 0 if {@code host_ptr} is
     * {@code NULL}. If {@code host_ptr} is not {@code NULL}, {@code image_slice_pitch} can be either 0 or &ge; {@code image_row_pitch * image_height} for a 2D image array
     * or 3D image and can be either 0 or &ge; {@code image_row_pitch} for a 1D image array. If {@code host_ptr} is not {@code NULL} and
     * {@code image_slice_pitch = 0}, {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height} for a 2D image array or 3D image and
     * {@code image_row_pitch} for a 1D image array. If {@code image_slice_pitch} is not 0, it must be a multiple of the {@code image_row_pitch}.
     */
    @NativeType("size_t")
    public long image_slice_pitch() { return nimage_slice_pitch(address()); }
    /** must be 0 */
    @NativeType("cl_uint")
    public int num_mip_levels() { return nnum_mip_levels(address()); }
    /** must be 0 */
    @NativeType("cl_uint")
    public int num_samples() { return nnum_samples(address()); }
    /** alias for {@code mem_object} */
    @NativeType("cl_mem")
    public long buffer() { return nbuffer(address()); }
    /**
     * refers to a valid buffer or image memory object.
     * 
     * <p>{@code mem_object} can be a buffer memory object if {@code image_type} is {@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER} or {@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}. {@code mem_object} can
     * be an image object if {@code image_type} is {@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}. Otherwise it must be {@code NULL}. The image pixels are taken from the memory object’s
     * data store. When the contents of the specified memory object’s data store are modified, those changes are reflected in the contents of the image
     * object and vice-versa at corresponding sychronization points. For a 1D image buffer object, the {@code image_width * size} of element in bytes must
     * be &le; size of buffer object data store. For a 2D image created from a buffer, the {@code image_row_pitch * image_height} must be &le; size of
     * buffer object data store. For an image object created from another image object, the values specified in the image descriptor except for
     * {@code mem_object} must match the image descriptor information associated with {@code mem_object}.</p>
     */
    @NativeType("cl_mem")
    public long mem_object() { return nmem_object(address()); }

    /** Sets the specified value to the {@link #image_type} field. */
    public CLImageDesc image_type(@NativeType("cl_mem_object_type") int value) { nimage_type(address(), value); return this; }
    /** Sets the specified value to the {@link #image_width} field. */
    public CLImageDesc image_width(@NativeType("size_t") long value) { nimage_width(address(), value); return this; }
    /** Sets the specified value to the {@link #image_height} field. */
    public CLImageDesc image_height(@NativeType("size_t") long value) { nimage_height(address(), value); return this; }
    /** Sets the specified value to the {@link #image_depth} field. */
    public CLImageDesc image_depth(@NativeType("size_t") long value) { nimage_depth(address(), value); return this; }
    /** Sets the specified value to the {@link #image_array_size} field. */
    public CLImageDesc image_array_size(@NativeType("size_t") long value) { nimage_array_size(address(), value); return this; }
    /** Sets the specified value to the {@link #image_row_pitch} field. */
    public CLImageDesc image_row_pitch(@NativeType("size_t") long value) { nimage_row_pitch(address(), value); return this; }
    /** Sets the specified value to the {@link #image_slice_pitch} field. */
    public CLImageDesc image_slice_pitch(@NativeType("size_t") long value) { nimage_slice_pitch(address(), value); return this; }
    /** Sets the specified value to the {@link #num_mip_levels} field. */
    public CLImageDesc num_mip_levels(@NativeType("cl_uint") int value) { nnum_mip_levels(address(), value); return this; }
    /** Sets the specified value to the {@link #num_samples} field. */
    public CLImageDesc num_samples(@NativeType("cl_uint") int value) { nnum_samples(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public CLImageDesc buffer(@NativeType("cl_mem") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #mem_object} field. */
    public CLImageDesc mem_object(@NativeType("cl_mem") long value) { nmem_object(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLImageDesc set(CLImageDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLImageDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLImageDesc malloc() {
        return wrap(CLImageDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLImageDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLImageDesc calloc() {
        return wrap(CLImageDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLImageDesc} instance allocated with {@link BufferUtils}. */
    public static CLImageDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLImageDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code CLImageDesc} instance for the specified memory address. */
    public static CLImageDesc create(long address) {
        return wrap(CLImageDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLImageDesc createSafe(long address) {
        return address == NULL ? null : wrap(CLImageDesc.class, address);
    }

    /**
     * Returns a new {@link CLImageDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLImageDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLImageDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLImageDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLImageDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLImageDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLImageDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLImageDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLImageDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLImageDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLImageDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLImageDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLImageDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLImageDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CLImageDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLImageDesc malloc(MemoryStack stack) {
        return wrap(CLImageDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLImageDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLImageDesc calloc(MemoryStack stack) {
        return wrap(CLImageDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLImageDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLImageDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLImageDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLImageDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image_type}. */
    public static int nimage_type(long struct) { return UNSAFE.getInt(null, struct + CLImageDesc.IMAGE_TYPE); }
    /** Unsafe version of {@link #image_width}. */
    public static long nimage_width(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_WIDTH); }
    /** Unsafe version of {@link #image_height}. */
    public static long nimage_height(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_HEIGHT); }
    /** Unsafe version of {@link #image_depth}. */
    public static long nimage_depth(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_DEPTH); }
    /** Unsafe version of {@link #image_array_size}. */
    public static long nimage_array_size(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_ARRAY_SIZE); }
    /** Unsafe version of {@link #image_row_pitch}. */
    public static long nimage_row_pitch(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_ROW_PITCH); }
    /** Unsafe version of {@link #image_slice_pitch}. */
    public static long nimage_slice_pitch(long struct) { return memGetAddress(struct + CLImageDesc.IMAGE_SLICE_PITCH); }
    /** Unsafe version of {@link #num_mip_levels}. */
    public static int nnum_mip_levels(long struct) { return UNSAFE.getInt(null, struct + CLImageDesc.NUM_MIP_LEVELS); }
    /** Unsafe version of {@link #num_samples}. */
    public static int nnum_samples(long struct) { return UNSAFE.getInt(null, struct + CLImageDesc.NUM_SAMPLES); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetAddress(struct + CLImageDesc.BUFFER); }
    /** Unsafe version of {@link #mem_object}. */
    public static long nmem_object(long struct) { return memGetAddress(struct + CLImageDesc.MEM_OBJECT); }

    /** Unsafe version of {@link #image_type(int) image_type}. */
    public static void nimage_type(long struct, int value) { UNSAFE.putInt(null, struct + CLImageDesc.IMAGE_TYPE, value); }
    /** Unsafe version of {@link #image_width(long) image_width}. */
    public static void nimage_width(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_WIDTH, value); }
    /** Unsafe version of {@link #image_height(long) image_height}. */
    public static void nimage_height(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_HEIGHT, value); }
    /** Unsafe version of {@link #image_depth(long) image_depth}. */
    public static void nimage_depth(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_DEPTH, value); }
    /** Unsafe version of {@link #image_array_size(long) image_array_size}. */
    public static void nimage_array_size(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_ARRAY_SIZE, value); }
    /** Unsafe version of {@link #image_row_pitch(long) image_row_pitch}. */
    public static void nimage_row_pitch(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_ROW_PITCH, value); }
    /** Unsafe version of {@link #image_slice_pitch(long) image_slice_pitch}. */
    public static void nimage_slice_pitch(long struct, long value) { memPutAddress(struct + CLImageDesc.IMAGE_SLICE_PITCH, value); }
    /** Unsafe version of {@link #num_mip_levels(int) num_mip_levels}. */
    public static void nnum_mip_levels(long struct, int value) { UNSAFE.putInt(null, struct + CLImageDesc.NUM_MIP_LEVELS, value); }
    /** Unsafe version of {@link #num_samples(int) num_samples}. */
    public static void nnum_samples(long struct, int value) { UNSAFE.putInt(null, struct + CLImageDesc.NUM_SAMPLES, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutAddress(struct + CLImageDesc.BUFFER, value); }
    /** Unsafe version of {@link #mem_object(long) mem_object}. */
    public static void nmem_object(long struct, long value) { memPutAddress(struct + CLImageDesc.MEM_OBJECT, value); }

    // -----------------------------------

    /** An array of {@link CLImageDesc} structs. */
    public static class Buffer extends StructBuffer<CLImageDesc, Buffer> implements NativeResource {

        private static final CLImageDesc ELEMENT_FACTORY = CLImageDesc.create(-1L);

        /**
         * Creates a new {@code CLImageDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLImageDesc#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected CLImageDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CLImageDesc#image_type} field. */
        @NativeType("cl_mem_object_type")
        public int image_type() { return CLImageDesc.nimage_type(address()); }
        /** @return the value of the {@link CLImageDesc#image_width} field. */
        @NativeType("size_t")
        public long image_width() { return CLImageDesc.nimage_width(address()); }
        /** @return the value of the {@link CLImageDesc#image_height} field. */
        @NativeType("size_t")
        public long image_height() { return CLImageDesc.nimage_height(address()); }
        /** @return the value of the {@link CLImageDesc#image_depth} field. */
        @NativeType("size_t")
        public long image_depth() { return CLImageDesc.nimage_depth(address()); }
        /** @return the value of the {@link CLImageDesc#image_array_size} field. */
        @NativeType("size_t")
        public long image_array_size() { return CLImageDesc.nimage_array_size(address()); }
        /** @return the value of the {@link CLImageDesc#image_row_pitch} field. */
        @NativeType("size_t")
        public long image_row_pitch() { return CLImageDesc.nimage_row_pitch(address()); }
        /** @return the value of the {@link CLImageDesc#image_slice_pitch} field. */
        @NativeType("size_t")
        public long image_slice_pitch() { return CLImageDesc.nimage_slice_pitch(address()); }
        /** @return the value of the {@link CLImageDesc#num_mip_levels} field. */
        @NativeType("cl_uint")
        public int num_mip_levels() { return CLImageDesc.nnum_mip_levels(address()); }
        /** @return the value of the {@link CLImageDesc#num_samples} field. */
        @NativeType("cl_uint")
        public int num_samples() { return CLImageDesc.nnum_samples(address()); }
        /** @return the value of the {@link CLImageDesc#buffer} field. */
        @NativeType("cl_mem")
        public long buffer() { return CLImageDesc.nbuffer(address()); }
        /** @return the value of the {@link CLImageDesc#mem_object} field. */
        @NativeType("cl_mem")
        public long mem_object() { return CLImageDesc.nmem_object(address()); }

        /** Sets the specified value to the {@link CLImageDesc#image_type} field. */
        public CLImageDesc.Buffer image_type(@NativeType("cl_mem_object_type") int value) { CLImageDesc.nimage_type(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#image_width} field. */
        public CLImageDesc.Buffer image_width(@NativeType("size_t") long value) { CLImageDesc.nimage_width(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#image_height} field. */
        public CLImageDesc.Buffer image_height(@NativeType("size_t") long value) { CLImageDesc.nimage_height(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#image_depth} field. */
        public CLImageDesc.Buffer image_depth(@NativeType("size_t") long value) { CLImageDesc.nimage_depth(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#image_array_size} field. */
        public CLImageDesc.Buffer image_array_size(@NativeType("size_t") long value) { CLImageDesc.nimage_array_size(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#image_row_pitch} field. */
        public CLImageDesc.Buffer image_row_pitch(@NativeType("size_t") long value) { CLImageDesc.nimage_row_pitch(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#image_slice_pitch} field. */
        public CLImageDesc.Buffer image_slice_pitch(@NativeType("size_t") long value) { CLImageDesc.nimage_slice_pitch(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#num_mip_levels} field. */
        public CLImageDesc.Buffer num_mip_levels(@NativeType("cl_uint") int value) { CLImageDesc.nnum_mip_levels(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#num_samples} field. */
        public CLImageDesc.Buffer num_samples(@NativeType("cl_uint") int value) { CLImageDesc.nnum_samples(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#buffer} field. */
        public CLImageDesc.Buffer buffer(@NativeType("cl_mem") long value) { CLImageDesc.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link CLImageDesc#mem_object} field. */
        public CLImageDesc.Buffer mem_object(@NativeType("cl_mem") long value) { CLImageDesc.nmem_object(address(), value); return this; }

    }

}