/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPipelineRobustnessCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineRobustnessBufferBehavior storageBuffers;
 *     VkPipelineRobustnessBufferBehavior uniformBuffers;
 *     VkPipelineRobustnessBufferBehavior vertexInputs;
 *     VkPipelineRobustnessImageBehavior images;
 * }}</pre>
 */
public class VkPipelineRobustnessCreateInfo extends Struct<VkPipelineRobustnessCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFERS,
        UNIFORMBUFFERS,
        VERTEXINPUTS,
        IMAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFERS = layout.offsetof(2);
        UNIFORMBUFFERS = layout.offsetof(3);
        VERTEXINPUTS = layout.offsetof(4);
        IMAGES = layout.offsetof(5);
    }

    protected VkPipelineRobustnessCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRobustnessCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRobustnessCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineRobustnessCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRobustnessCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code storageBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int storageBuffers() { return nstorageBuffers(address()); }
    /** @return the value of the {@code uniformBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int uniformBuffers() { return nuniformBuffers(address()); }
    /** @return the value of the {@code vertexInputs} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int vertexInputs() { return nvertexInputs(address()); }
    /** @return the value of the {@code images} field. */
    @NativeType("VkPipelineRobustnessImageBehavior")
    public int images() { return nimages(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRobustnessCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineRobustnessCreateInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRobustnessCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffers} field. */
    public VkPipelineRobustnessCreateInfo storageBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { nstorageBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code uniformBuffers} field. */
    public VkPipelineRobustnessCreateInfo uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { nuniformBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code vertexInputs} field. */
    public VkPipelineRobustnessCreateInfo vertexInputs(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { nvertexInputs(address(), value); return this; }
    /** Sets the specified value to the {@code images} field. */
    public VkPipelineRobustnessCreateInfo images(@NativeType("VkPipelineRobustnessImageBehavior") int value) { nimages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRobustnessCreateInfo set(
        int sType,
        long pNext,
        int storageBuffers,
        int uniformBuffers,
        int vertexInputs,
        int images
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffers(storageBuffers);
        uniformBuffers(uniformBuffers);
        vertexInputs(vertexInputs);
        images(images);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRobustnessCreateInfo set(VkPipelineRobustnessCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRobustnessCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRobustnessCreateInfo malloc() {
        return new VkPipelineRobustnessCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRobustnessCreateInfo calloc() {
        return new VkPipelineRobustnessCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRobustnessCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRobustnessCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfo} instance for the specified memory address. */
    public static VkPipelineRobustnessCreateInfo create(long address) {
        return new VkPipelineRobustnessCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRobustnessCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineRobustnessCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRobustnessCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRobustnessCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRobustnessCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRobustnessCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineRobustnessCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRobustnessCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRobustnessCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineRobustnessCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineRobustnessCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRobustnessCreateInfo.PNEXT); }
    /** Unsafe version of {@link #storageBuffers}. */
    public static int nstorageBuffers(long struct) { return memGetInt(struct + VkPipelineRobustnessCreateInfo.STORAGEBUFFERS); }
    /** Unsafe version of {@link #uniformBuffers}. */
    public static int nuniformBuffers(long struct) { return memGetInt(struct + VkPipelineRobustnessCreateInfo.UNIFORMBUFFERS); }
    /** Unsafe version of {@link #vertexInputs}. */
    public static int nvertexInputs(long struct) { return memGetInt(struct + VkPipelineRobustnessCreateInfo.VERTEXINPUTS); }
    /** Unsafe version of {@link #images}. */
    public static int nimages(long struct) { return memGetInt(struct + VkPipelineRobustnessCreateInfo.IMAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRobustnessCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRobustnessCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffers(int) storageBuffers}. */
    public static void nstorageBuffers(long struct, int value) { memPutInt(struct + VkPipelineRobustnessCreateInfo.STORAGEBUFFERS, value); }
    /** Unsafe version of {@link #uniformBuffers(int) uniformBuffers}. */
    public static void nuniformBuffers(long struct, int value) { memPutInt(struct + VkPipelineRobustnessCreateInfo.UNIFORMBUFFERS, value); }
    /** Unsafe version of {@link #vertexInputs(int) vertexInputs}. */
    public static void nvertexInputs(long struct, int value) { memPutInt(struct + VkPipelineRobustnessCreateInfo.VERTEXINPUTS, value); }
    /** Unsafe version of {@link #images(int) images}. */
    public static void nimages(long struct, int value) { memPutInt(struct + VkPipelineRobustnessCreateInfo.IMAGES, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRobustnessCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRobustnessCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineRobustnessCreateInfo ELEMENT_FACTORY = VkPipelineRobustnessCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineRobustnessCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRobustnessCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPipelineRobustnessCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRobustnessCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRobustnessCreateInfo.npNext(address()); }
        /** @return the value of the {@code storageBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int storageBuffers() { return VkPipelineRobustnessCreateInfo.nstorageBuffers(address()); }
        /** @return the value of the {@code uniformBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int uniformBuffers() { return VkPipelineRobustnessCreateInfo.nuniformBuffers(address()); }
        /** @return the value of the {@code vertexInputs} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int vertexInputs() { return VkPipelineRobustnessCreateInfo.nvertexInputs(address()); }
        /** @return the value of the {@code images} field. */
        @NativeType("VkPipelineRobustnessImageBehavior")
        public int images() { return VkPipelineRobustnessCreateInfo.nimages(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRobustnessCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRobustnessCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineRobustnessCreateInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRobustnessCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRobustnessCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffers} field. */
        public VkPipelineRobustnessCreateInfo.Buffer storageBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.nstorageBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code uniformBuffers} field. */
        public VkPipelineRobustnessCreateInfo.Buffer uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.nuniformBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code vertexInputs} field. */
        public VkPipelineRobustnessCreateInfo.Buffer vertexInputs(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfo.nvertexInputs(address(), value); return this; }
        /** Sets the specified value to the {@code images} field. */
        public VkPipelineRobustnessCreateInfo.Buffer images(@NativeType("VkPipelineRobustnessImageBehavior") int value) { VkPipelineRobustnessCreateInfo.nimages(address(), value); return this; }

    }

}