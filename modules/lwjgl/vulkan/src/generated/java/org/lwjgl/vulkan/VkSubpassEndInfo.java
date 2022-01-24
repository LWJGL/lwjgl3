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
 * Structure specifying subpass end information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_END_INFO STRUCTURE_TYPE_SUBPASS_END_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK12#vkCmdEndRenderPass2 CmdEndRenderPass2}, {@link KHRCreateRenderpass2#vkCmdEndRenderPass2KHR CmdEndRenderPass2KHR}, {@link VK12#vkCmdNextSubpass2 CmdNextSubpass2}, {@link KHRCreateRenderpass2#vkCmdNextSubpass2KHR CmdNextSubpass2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassEndInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 * }</code></pre>
 */
public class VkSubpassEndInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkSubpassEndInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassEndInfo(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassEndInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_END_INFO STRUCTURE_TYPE_SUBPASS_END_INFO} value to the {@link #sType} field. */
    public VkSubpassEndInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_END_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassEndInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM} value to the {@code pNext} chain. */
    public VkSubpassEndInfo pNext(VkSubpassFragmentDensityMapOffsetEndInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkSubpassEndInfo set(
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
    public VkSubpassEndInfo set(VkSubpassEndInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassEndInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassEndInfo malloc() {
        return wrap(VkSubpassEndInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassEndInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassEndInfo calloc() {
        return wrap(VkSubpassEndInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassEndInfo} instance allocated with {@link BufferUtils}. */
    public static VkSubpassEndInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassEndInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassEndInfo} instance for the specified memory address. */
    public static VkSubpassEndInfo create(long address) {
        return wrap(VkSubpassEndInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassEndInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassEndInfo.class, address);
    }

    /**
     * Returns a new {@link VkSubpassEndInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassEndInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassEndInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassEndInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassEndInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassEndInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassEndInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassEndInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassEndInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassEndInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassEndInfo malloc(MemoryStack stack) {
        return wrap(VkSubpassEndInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassEndInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassEndInfo calloc(MemoryStack stack) {
        return wrap(VkSubpassEndInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassEndInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassEndInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassEndInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassEndInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassEndInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassEndInfo.PNEXT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassEndInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassEndInfo.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassEndInfo} structs. */
    public static class Buffer extends StructBuffer<VkSubpassEndInfo, Buffer> implements NativeResource {

        private static final VkSubpassEndInfo ELEMENT_FACTORY = VkSubpassEndInfo.create(-1L);

        /**
         * Creates a new {@code VkSubpassEndInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassEndInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassEndInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassEndInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassEndInfo.nsType(address()); }
        /** @return the value of the {@link VkSubpassEndInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassEndInfo.npNext(address()); }

        /** Sets the specified value to the {@link VkSubpassEndInfo#sType} field. */
        public VkSubpassEndInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassEndInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_END_INFO STRUCTURE_TYPE_SUBPASS_END_INFO} value to the {@link VkSubpassEndInfo#sType} field. */
        public VkSubpassEndInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_END_INFO); }
        /** Sets the specified value to the {@link VkSubpassEndInfo#pNext} field. */
        public VkSubpassEndInfo.Buffer pNext(@NativeType("void const *") long value) { VkSubpassEndInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM} value to the {@code pNext} chain. */
        public VkSubpassEndInfo.Buffer pNext(VkSubpassFragmentDensityMapOffsetEndInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}