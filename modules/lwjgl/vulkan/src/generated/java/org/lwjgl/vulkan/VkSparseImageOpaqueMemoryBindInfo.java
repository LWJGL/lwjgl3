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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying sparse image opaque memory bind information.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This structure is normally used to bind memory to fully-resident sparse images or for mip tail regions of partially resident images. However, it <b>can</b> also be used to bind memory for the entire binding range of partially resident images.</p>
 * 
 * <p>If the {@code pBinds}[i].flags of an element <em>i</em> of {@code pBinds} does not contain {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the {@code resourceOffset} is in the range <code>[0, {@link VkMemoryRequirements}::size)</code>, This range includes data from all aspects of the image, including metadata. For most implementations this will probably mean that the {@code resourceOffset} is a simple device address offset within the resource. It is possible for an application to bind a range of memory that includes both resource data and metadata. However, the application would not know what part of the image the memory is used for, or if any range is being used for metadata.</p>
 * 
 * <p>If the {@code pBinds}[i].flags of an element <em>i</em> of {@code pBinds} contains {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range specified <b>must</b> be within the mip tail region of the metadata aspect. In this case the {@code resourceOffset} is not <b>required</b> to be a simple device address offset within the resource. However, it <em>is</em> defined to be within <code>[imageMipTailOffset, imageMipTailOffset + imageMipTailSize)</code> for the metadata aspect. See {@link VkSparseMemoryBind} for the full constraints on binding region with this flag present.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code flags} member of any element of {@code pBinds} contains {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range defined <b>must</b> be within the mip tail region of the metadata aspect of {@code image}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code pBinds} <b>must</b> be a valid pointer to an array of {@code bindCount} valid {@link VkSparseMemoryBind} structures</li>
 * <li>{@code bindCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBindSparseInfo}, {@link VkSparseMemoryBind}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageOpaqueMemoryBindInfo {
 *     VkImage {@link #image};
 *     uint32_t {@link #bindCount};
 *     {@link VkSparseMemoryBind VkSparseMemoryBind} const * {@link #pBinds};
 * }</code></pre>
 */
public class VkSparseImageOpaqueMemoryBindInfo extends Struct<VkSparseImageOpaqueMemoryBindInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE,
        BINDCOUNT,
        PBINDS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE = layout.offsetof(0);
        BINDCOUNT = layout.offsetof(1);
        PBINDS = layout.offsetof(2);
    }

    protected VkSparseImageOpaqueMemoryBindInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseImageOpaqueMemoryBindInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSparseImageOpaqueMemoryBindInfo(address, container);
    }

    /**
     * Creates a {@code VkSparseImageOpaqueMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageOpaqueMemoryBindInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code VkImage} object to be bound. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** the number of {@link VkSparseMemoryBind} structures in the {@code pBinds} array. */
    @NativeType("uint32_t")
    public int bindCount() { return nbindCount(address()); }
    /** a pointer to an array of {@link VkSparseMemoryBind} structures. */
    @NativeType("VkSparseMemoryBind const *")
    public VkSparseMemoryBind.Buffer pBinds() { return npBinds(address()); }

    /** Sets the specified value to the {@link #image} field. */
    public VkSparseImageOpaqueMemoryBindInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@link #pBinds} field. */
    public VkSparseImageOpaqueMemoryBindInfo pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) { npBinds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseImageOpaqueMemoryBindInfo set(
        long image,
        VkSparseMemoryBind.Buffer pBinds
    ) {
        image(image);
        pBinds(pBinds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSparseImageOpaqueMemoryBindInfo set(VkSparseImageOpaqueMemoryBindInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageOpaqueMemoryBindInfo malloc() {
        return new VkSparseImageOpaqueMemoryBindInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageOpaqueMemoryBindInfo calloc() {
        return new VkSparseImageOpaqueMemoryBindInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageOpaqueMemoryBindInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageOpaqueMemoryBindInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageOpaqueMemoryBindInfo} instance for the specified memory address. */
    public static VkSparseImageOpaqueMemoryBindInfo create(long address) {
        return new VkSparseImageOpaqueMemoryBindInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseImageOpaqueMemoryBindInfo createSafe(long address) {
        return address == NULL ? null : new VkSparseImageOpaqueMemoryBindInfo(address, null);
    }

    /**
     * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageOpaqueMemoryBindInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageOpaqueMemoryBindInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageOpaqueMemoryBindInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageOpaqueMemoryBindInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageOpaqueMemoryBindInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageOpaqueMemoryBindInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageOpaqueMemoryBindInfo malloc(MemoryStack stack) {
        return new VkSparseImageOpaqueMemoryBindInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseImageOpaqueMemoryBindInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageOpaqueMemoryBindInfo calloc(MemoryStack stack) {
        return new VkSparseImageOpaqueMemoryBindInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageOpaqueMemoryBindInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageOpaqueMemoryBindInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkSparseImageOpaqueMemoryBindInfo.IMAGE); }
    /** Unsafe version of {@link #bindCount}. */
    public static int nbindCount(long struct) { return memGetInt(struct + VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT); }
    /** Unsafe version of {@link #pBinds}. */
    public static VkSparseMemoryBind.Buffer npBinds(long struct) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS), nbindCount(struct)); }

    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkSparseImageOpaqueMemoryBindInfo.IMAGE, value); }
    /** Sets the specified value to the {@code bindCount} field of the specified {@code struct}. */
    public static void nbindCount(long struct, int value) { memPutInt(struct + VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT, value); }
    /** Unsafe version of {@link #pBinds(VkSparseMemoryBind.Buffer) pBinds}. */
    public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) { memPutAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS, value.address()); nbindCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS));
    }

    // -----------------------------------

    /** An array of {@link VkSparseImageOpaqueMemoryBindInfo} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageOpaqueMemoryBindInfo, Buffer> implements NativeResource {

        private static final VkSparseImageOpaqueMemoryBindInfo ELEMENT_FACTORY = VkSparseImageOpaqueMemoryBindInfo.create(-1L);

        /**
         * Creates a new {@code VkSparseImageOpaqueMemoryBindInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageOpaqueMemoryBindInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSparseImageOpaqueMemoryBindInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSparseImageOpaqueMemoryBindInfo#image} field. */
        @NativeType("VkImage")
        public long image() { return VkSparseImageOpaqueMemoryBindInfo.nimage(address()); }
        /** @return the value of the {@link VkSparseImageOpaqueMemoryBindInfo#bindCount} field. */
        @NativeType("uint32_t")
        public int bindCount() { return VkSparseImageOpaqueMemoryBindInfo.nbindCount(address()); }
        /** @return a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@link VkSparseImageOpaqueMemoryBindInfo#pBinds} field. */
        @NativeType("VkSparseMemoryBind const *")
        public VkSparseMemoryBind.Buffer pBinds() { return VkSparseImageOpaqueMemoryBindInfo.npBinds(address()); }

        /** Sets the specified value to the {@link VkSparseImageOpaqueMemoryBindInfo#image} field. */
        public VkSparseImageOpaqueMemoryBindInfo.Buffer image(@NativeType("VkImage") long value) { VkSparseImageOpaqueMemoryBindInfo.nimage(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@link VkSparseImageOpaqueMemoryBindInfo#pBinds} field. */
        public VkSparseImageOpaqueMemoryBindInfo.Buffer pBinds(@NativeType("VkSparseMemoryBind const *") VkSparseMemoryBind.Buffer value) { VkSparseImageOpaqueMemoryBindInfo.npBinds(address(), value); return this; }

    }

}