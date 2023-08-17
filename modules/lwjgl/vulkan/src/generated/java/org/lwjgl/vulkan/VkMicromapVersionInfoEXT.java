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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Micromap version information.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@code pVersionData} is a <em>pointer</em> to an array of 2×{@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values instead of two {@link VK10#VK_UUID_SIZE UUID_SIZE} arrays as the expected use case for this member is to be pointed at the header of a previously serialized micromap (via {@link EXTOpacityMicromap#vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT} or {@link EXTOpacityMicromap#vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT}) that is loaded in memory. Using arrays would necessitate extra memory copies of the UUIDs.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pVersionData} <b>must</b> be a valid pointer to an array of 2 &times; {@code VK_UUID_SIZE} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTOpacityMicromap#vkGetDeviceMicromapCompatibilityEXT GetDeviceMicromapCompatibilityEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMicromapVersionInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint8_t const * {@link #pVersionData};
 * }</code></pre>
 */
public class VkMicromapVersionInfoEXT extends Struct<VkMicromapVersionInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PVERSIONDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVERSIONDATA = layout.offsetof(2);
    }

    protected VkMicromapVersionInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapVersionInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapVersionInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMicromapVersionInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapVersionInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a pointer to the version header of a micromap as defined in {@link EXTOpacityMicromap#vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT}
     */
    @NativeType("uint8_t const *")
    public ByteBuffer pVersionData(int capacity) { return npVersionData(address(), capacity); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMicromapVersionInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT} value to the {@link #sType} field. */
    public VkMicromapVersionInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMicromapVersionInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pVersionData} field. */
    public VkMicromapVersionInfoEXT pVersionData(@NativeType("uint8_t const *") ByteBuffer value) { npVersionData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapVersionInfoEXT set(
        int sType,
        long pNext,
        ByteBuffer pVersionData
    ) {
        sType(sType);
        pNext(pNext);
        pVersionData(pVersionData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMicromapVersionInfoEXT set(VkMicromapVersionInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapVersionInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapVersionInfoEXT malloc() {
        return new VkMicromapVersionInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapVersionInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapVersionInfoEXT calloc() {
        return new VkMicromapVersionInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapVersionInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMicromapVersionInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapVersionInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapVersionInfoEXT} instance for the specified memory address. */
    public static VkMicromapVersionInfoEXT create(long address) {
        return new VkMicromapVersionInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapVersionInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMicromapVersionInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMicromapVersionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapVersionInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapVersionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapVersionInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapVersionInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapVersionInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapVersionInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapVersionInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapVersionInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapVersionInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapVersionInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapVersionInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapVersionInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapVersionInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapVersionInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapVersionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapVersionInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapVersionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapVersionInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMicromapVersionInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMicromapVersionInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pVersionData(int) pVersionData}. */
    public static ByteBuffer npVersionData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + VkMicromapVersionInfoEXT.PVERSIONDATA), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapVersionInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMicromapVersionInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pVersionData(ByteBuffer) pVersionData}. */
    public static void npVersionData(long struct, ByteBuffer value) { memPutAddress(struct + VkMicromapVersionInfoEXT.PVERSIONDATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkMicromapVersionInfoEXT.PVERSIONDATA));
    }

    // -----------------------------------

    /** An array of {@link VkMicromapVersionInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMicromapVersionInfoEXT, Buffer> implements NativeResource {

        private static final VkMicromapVersionInfoEXT ELEMENT_FACTORY = VkMicromapVersionInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMicromapVersionInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapVersionInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapVersionInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMicromapVersionInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMicromapVersionInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMicromapVersionInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMicromapVersionInfoEXT.npNext(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link VkMicromapVersionInfoEXT#pVersionData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t const *")
        public ByteBuffer pVersionData(int capacity) { return VkMicromapVersionInfoEXT.npVersionData(address(), capacity); }

        /** Sets the specified value to the {@link VkMicromapVersionInfoEXT#sType} field. */
        public VkMicromapVersionInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMicromapVersionInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT} value to the {@link VkMicromapVersionInfoEXT#sType} field. */
        public VkMicromapVersionInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT); }
        /** Sets the specified value to the {@link VkMicromapVersionInfoEXT#pNext} field. */
        public VkMicromapVersionInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMicromapVersionInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkMicromapVersionInfoEXT#pVersionData} field. */
        public VkMicromapVersionInfoEXT.Buffer pVersionData(@NativeType("uint8_t const *") ByteBuffer value) { VkMicromapVersionInfoEXT.npVersionData(address(), value); return this; }

    }

}