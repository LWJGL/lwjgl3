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
 * Structure describing a pipeline.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR STRUCTURE_TYPE_PIPELINE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPipelineExecutableProperties#vkGetPipelineExecutablePropertiesKHR GetPipelineExecutablePropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipeline {@link #pipeline};
 * }</code></pre>
 */
public class VkPipelineInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineInfoKHR(ByteBuffer container) {
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
    /** a {@code VkPipeline} handle. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR STRUCTURE_TYPE_PIPELINE_INFO_KHR} value to the {@link #sType} field. */
    public VkPipelineInfoKHR sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipeline} field. */
    public VkPipelineInfoKHR pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineInfoKHR set(
        int sType,
        long pNext,
        long pipeline
    ) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineInfoKHR set(VkPipelineInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineInfoKHR malloc() {
        return wrap(VkPipelineInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineInfoKHR calloc() {
        return wrap(VkPipelineInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineInfoKHR} instance for the specified memory address. */
    public static VkPipelineInfoKHR create(long address) {
        return wrap(VkPipelineInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPipelineInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineInfoKHR malloc(MemoryStack stack) {
        return wrap(VkPipelineInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineInfoKHR calloc(MemoryStack stack) {
        return wrap(VkPipelineInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return UNSAFE.getLong(null, struct + VkPipelineInfoKHR.PIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkPipelineInfoKHR.PIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineInfoKHR ELEMENT_FACTORY = VkPipelineInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineInfoKHR#pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkPipelineInfoKHR.npipeline(address()); }

        /** Sets the specified value to the {@link VkPipelineInfoKHR#sType} field. */
        public VkPipelineInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR STRUCTURE_TYPE_PIPELINE_INFO_KHR} value to the {@link VkPipelineInfoKHR#sType} field. */
        public VkPipelineInfoKHR.Buffer sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR); }
        /** Sets the specified value to the {@link VkPipelineInfoKHR#pNext} field. */
        public VkPipelineInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineInfoKHR#pipeline} field. */
        public VkPipelineInfoKHR.Buffer pipeline(@NativeType("VkPipeline") long value) { VkPipelineInfoKHR.npipeline(address(), value); return this; }

    }

}