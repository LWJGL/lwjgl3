/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure defining the geometry stream used for rasterization.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code rasterizationStream} is assumed to be zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::geometryStreams} <b>must</b> be enabled</li>
 * <li>{@code rasterizationStream} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
 * <li>{@code rasterizationStream} <b>must</b> be zero if {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackRasterizationStreamSelect} is {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationStateStreamCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineRasterizationStateStreamCreateFlagsEXT {@link #flags};
 *     uint32_t {@link #rasterizationStream};
 * }</code></pre>
 */
public class VkPipelineRasterizationStateStreamCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RASTERIZATIONSTREAM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RASTERIZATIONSTREAM = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationStateStreamCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the vertex stream selected for rasterization. */
    @NativeType("uint32_t")
    public int rasterizationStream() { return nrasterizationStream(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationStateStreamCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineRasterizationStateStreamCreateInfoEXT sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationStateStreamCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineRasterizationStateStreamCreateInfoEXT flags(@NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #rasterizationStream} field. */
    public VkPipelineRasterizationStateStreamCreateInfoEXT rasterizationStream(@NativeType("uint32_t") int value) { nrasterizationStream(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationStateStreamCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int rasterizationStream
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rasterizationStream(rasterizationStream);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationStateStreamCreateInfoEXT set(VkPipelineRasterizationStateStreamCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT malloc() {
        return wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT calloc() {
        return wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT create(long address) {
        return wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationStateStreamCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationStateStreamCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateStreamCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationStateStreamCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateStreamCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #rasterizationStream}. */
    public static int nrasterizationStream(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationStateStreamCreateInfoEXT.RASTERIZATIONSTREAM); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateStreamCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationStateStreamCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateStreamCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #rasterizationStream(int) rasterizationStream}. */
    public static void nrasterizationStream(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationStateStreamCreateInfoEXT.RASTERIZATIONSTREAM, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationStateStreamCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationStateStreamCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationStateStreamCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationStateStreamCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationStateStreamCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRasterizationStateStreamCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationStateStreamCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationStateStreamCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#flags} field. */
        @NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT")
        public int flags() { return VkPipelineRasterizationStateStreamCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#rasterizationStream} field. */
        @NativeType("uint32_t")
        public int rasterizationStream() { return VkPipelineRasterizationStateStreamCreateInfoEXT.nrasterizationStream(address()); }

        /** Sets the specified value to the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT} value to the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#pNext} field. */
        public VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationStateStreamCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#flags} field. */
        public VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer flags(@NativeType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationStateStreamCreateInfoEXT#rasterizationStream} field. */
        public VkPipelineRasterizationStateStreamCreateInfoEXT.Buffer rasterizationStream(@NativeType("uint32_t") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.nrasterizationStream(address(), value); return this; }

    }

}