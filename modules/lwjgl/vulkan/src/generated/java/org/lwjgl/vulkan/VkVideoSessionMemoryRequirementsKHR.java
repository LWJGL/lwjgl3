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
 * Structure describing video session memory requirements.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMemoryRequirements}, {@link KHRVideoQueue#vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoSessionMemoryRequirementsKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #memoryBindIndex};
 *     {@link VkMemoryRequirements VkMemoryRequirements} {@link #memoryRequirements};
 * }</code></pre>
 */
public class VkVideoSessionMemoryRequirementsKHR extends Struct<VkVideoSessionMemoryRequirementsKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYBINDINDEX,
        MEMORYREQUIREMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkMemoryRequirements.SIZEOF, VkMemoryRequirements.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYBINDINDEX = layout.offsetof(2);
        MEMORYREQUIREMENTS = layout.offsetof(3);
    }

    protected VkVideoSessionMemoryRequirementsKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoSessionMemoryRequirementsKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoSessionMemoryRequirementsKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoSessionMemoryRequirementsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionMemoryRequirementsKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the index of the memory binding. */
    @NativeType("uint32_t")
    public int memoryBindIndex() { return nmemoryBindIndex(address()); }
    /** a {@link VkMemoryRequirements} structure in which the requested memory binding requirements for the binding index specified by {@code memoryBindIndex} are returned. */
    public VkMemoryRequirements memoryRequirements() { return nmemoryRequirements(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoSessionMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR} value to the {@link #sType} field. */
    public VkVideoSessionMemoryRequirementsKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoSessionMemoryRequirementsKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionMemoryRequirementsKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionMemoryRequirementsKHR set(VkVideoSessionMemoryRequirementsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionMemoryRequirementsKHR malloc() {
        return new VkVideoSessionMemoryRequirementsKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionMemoryRequirementsKHR calloc() {
        return new VkVideoSessionMemoryRequirementsKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoSessionMemoryRequirementsKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionMemoryRequirementsKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionMemoryRequirementsKHR} instance for the specified memory address. */
    public static VkVideoSessionMemoryRequirementsKHR create(long address) {
        return new VkVideoSessionMemoryRequirementsKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoSessionMemoryRequirementsKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoSessionMemoryRequirementsKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoSessionMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionMemoryRequirementsKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionMemoryRequirementsKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionMemoryRequirementsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionMemoryRequirementsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoSessionMemoryRequirementsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionMemoryRequirementsKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoSessionMemoryRequirementsKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionMemoryRequirementsKHR malloc(MemoryStack stack) {
        return new VkVideoSessionMemoryRequirementsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoSessionMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionMemoryRequirementsKHR calloc(MemoryStack stack) {
        return new VkVideoSessionMemoryRequirementsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoSessionMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionMemoryRequirementsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionMemoryRequirementsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoSessionMemoryRequirementsKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionMemoryRequirementsKHR.PNEXT); }
    /** Unsafe version of {@link #memoryBindIndex}. */
    public static int nmemoryBindIndex(long struct) { return memGetInt(struct + VkVideoSessionMemoryRequirementsKHR.MEMORYBINDINDEX); }
    /** Unsafe version of {@link #memoryRequirements}. */
    public static VkMemoryRequirements nmemoryRequirements(long struct) { return VkMemoryRequirements.create(struct + VkVideoSessionMemoryRequirementsKHR.MEMORYREQUIREMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoSessionMemoryRequirementsKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionMemoryRequirementsKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoSessionMemoryRequirementsKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionMemoryRequirementsKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionMemoryRequirementsKHR ELEMENT_FACTORY = VkVideoSessionMemoryRequirementsKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionMemoryRequirementsKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionMemoryRequirementsKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoSessionMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoSessionMemoryRequirementsKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionMemoryRequirementsKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoSessionMemoryRequirementsKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoSessionMemoryRequirementsKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoSessionMemoryRequirementsKHR#memoryBindIndex} field. */
        @NativeType("uint32_t")
        public int memoryBindIndex() { return VkVideoSessionMemoryRequirementsKHR.nmemoryBindIndex(address()); }
        /** @return a {@link VkMemoryRequirements} view of the {@link VkVideoSessionMemoryRequirementsKHR#memoryRequirements} field. */
        public VkMemoryRequirements memoryRequirements() { return VkVideoSessionMemoryRequirementsKHR.nmemoryRequirements(address()); }

        /** Sets the specified value to the {@link VkVideoSessionMemoryRequirementsKHR#sType} field. */
        public VkVideoSessionMemoryRequirementsKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionMemoryRequirementsKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR} value to the {@link VkVideoSessionMemoryRequirementsKHR#sType} field. */
        public VkVideoSessionMemoryRequirementsKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR); }
        /** Sets the specified value to the {@link VkVideoSessionMemoryRequirementsKHR#pNext} field. */
        public VkVideoSessionMemoryRequirementsKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoSessionMemoryRequirementsKHR.npNext(address(), value); return this; }

    }

}