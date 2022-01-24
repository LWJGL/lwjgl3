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
 * Structure specifying subpass begin information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO STRUCTURE_TYPE_SUBPASS_BEGIN_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK12#vkCmdBeginRenderPass2 CmdBeginRenderPass2}, {@link KHRCreateRenderpass2#vkCmdBeginRenderPass2KHR CmdBeginRenderPass2KHR}, {@link VK12#vkCmdNextSubpass2 CmdNextSubpass2}, {@link KHRCreateRenderpass2#vkCmdNextSubpass2KHR CmdNextSubpass2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassBeginInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSubpassContents {@link #contents};
 * }</code></pre>
 */
public class VkSubpassBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONTENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONTENTS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSubpassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassBeginInfo(ByteBuffer container) {
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
    /** a {@code VkSubpassContents} value specifying how the commands in the next subpass will be provided. */
    @NativeType("VkSubpassContents")
    public int contents() { return ncontents(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO STRUCTURE_TYPE_SUBPASS_BEGIN_INFO} value to the {@link #sType} field. */
    public VkSubpassBeginInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #contents} field. */
    public VkSubpassBeginInfo contents(@NativeType("VkSubpassContents") int value) { ncontents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassBeginInfo set(
        int sType,
        long pNext,
        int contents
    ) {
        sType(sType);
        pNext(pNext);
        contents(contents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassBeginInfo set(VkSubpassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassBeginInfo malloc() {
        return wrap(VkSubpassBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassBeginInfo calloc() {
        return wrap(VkSubpassBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkSubpassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassBeginInfo} instance for the specified memory address. */
    public static VkSubpassBeginInfo create(long address) {
        return wrap(VkSubpassBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassBeginInfo.class, address);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassBeginInfo malloc(MemoryStack stack) {
        return wrap(VkSubpassBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassBeginInfo calloc(MemoryStack stack) {
        return wrap(VkSubpassBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #contents}. */
    public static int ncontents(long struct) { return UNSAFE.getInt(null, struct + VkSubpassBeginInfo.CONTENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #contents(int) contents}. */
    public static void ncontents(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassBeginInfo.CONTENTS, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkSubpassBeginInfo, Buffer> implements NativeResource {

        private static final VkSubpassBeginInfo ELEMENT_FACTORY = VkSubpassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkSubpassBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassBeginInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassBeginInfo.nsType(address()); }
        /** @return the value of the {@link VkSubpassBeginInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassBeginInfo.npNext(address()); }
        /** @return the value of the {@link VkSubpassBeginInfo#contents} field. */
        @NativeType("VkSubpassContents")
        public int contents() { return VkSubpassBeginInfo.ncontents(address()); }

        /** Sets the specified value to the {@link VkSubpassBeginInfo#sType} field. */
        public VkSubpassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO STRUCTURE_TYPE_SUBPASS_BEGIN_INFO} value to the {@link VkSubpassBeginInfo#sType} field. */
        public VkSubpassBeginInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO); }
        /** Sets the specified value to the {@link VkSubpassBeginInfo#pNext} field. */
        public VkSubpassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkSubpassBeginInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassBeginInfo#contents} field. */
        public VkSubpassBeginInfo.Buffer contents(@NativeType("VkSubpassContents") int value) { VkSubpassBeginInfo.ncontents(address(), value); return this; }

    }

}