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
 * Structure specifying an image blit operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>For each element of the {@code pRegions} array, a blit operation is performed the specified source and destination regions.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * <li>If either of the calling command&#8217;s {@code srcImage} or {@code dstImage} parameters are of {@code VkImageType} {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, the {@code baseArrayLayer} and {@code layerCount} members of both {@code srcSubresource} and {@code dstSubresource} <b>must</b> be 0 and 1, respectively</li>
 * <li>The {@code aspectMask} member of {@code srcSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code srcImage}</li>
 * <li>The {@code aspectMask} member of {@code dstSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code dstImage}</li>
 * <li>{@code srcOffset}[0].{@code x} and {@code srcOffset}[1].{@code x} <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource width</li>
 * <li>{@code srcOffset}[0].{@code y} and {@code srcOffset}[1].{@code y} <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource height</li>
 * <li>If the calling command&#8217;s {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then {@code srcOffset}[0].y <b>must</b> be 0 and {@code srcOffset}[1].y <b>must</b> be 1.</li>
 * <li>{@code srcOffset}[0].{@code z} and {@code srcOffset}[1].{@code z} <b>must</b> both be greater than or equal to 0 and less than or equal to the source image subresource depth</li>
 * <li>If the calling command&#8217;s {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then {@code srcOffset}[0].z <b>must</b> be 0 and {@code srcOffset}[1].z <b>must</b> be 1.</li>
 * <li>{@code dstOffset}[0].{@code x} and {@code dstOffset}[1].{@code x} <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource width</li>
 * <li>{@code dstOffset}[0].{@code y} and {@code dstOffset}[1].{@code y} <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource height</li>
 * <li>If the calling command&#8217;s {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then {@code dstOffset}[0].y <b>must</b> be 0 and {@code dstOffset}[1].y <b>must</b> be 1.</li>
 * <li>{@code dstOffset}[0].{@code z} and {@code dstOffset}[1].{@code z} <b>must</b> both be greater than or equal to 0 and less than or equal to the destination image subresource depth</li>
 * <li>If the calling command&#8217;s {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then {@code dstOffset}[0].z <b>must</b> be 0 and {@code dstOffset}[1].z <b>must</b> be 1.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code srcSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * <li>{@code dstSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageSubresourceLayers}, {@link VkOffset3D}, {@link VK10#vkCmdBlitImage CmdBlitImage}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code srcSubresource} &ndash; the subresource to blit from.</li>
 * <li>{@code srcOffsets[2]} &ndash; an array of two {@link VkOffset3D} structures specifying the bounds of the source region within {@code srcSubresource}.</li>
 * <li>{@code dstSubresource} &ndash; the subresource to blit into.</li>
 * <li>{@code dstOffsets[2]} &ndash; an array of two {@link VkOffset3D} structures specifying the bounds of the destination region within {@code dstSubresource}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageBlit {
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
 *     {@link VkOffset3D VkOffset3D} srcOffsets[2];
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
 *     {@link VkOffset3D VkOffset3D} dstOffsets[2];
 * }</code></pre>
 */
public class VkImageBlit extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCSUBRESOURCE,
        SRCOFFSETS,
        DSTSUBRESOURCE,
        DSTOFFSETS;

    static {
        Layout layout = __struct(
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCSUBRESOURCE = layout.offsetof(0);
        SRCOFFSETS = layout.offsetof(1);
        DSTSUBRESOURCE = layout.offsetof(2);
        DSTOFFSETS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkImageBlit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageBlit(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
    public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
    /** Returns a {@link VkOffset3D}.Buffer view of the {@code srcOffsets} field. */
    @NativeType("VkOffset3D[2]")
    public VkOffset3D.Buffer srcOffsets() { return nsrcOffsets(address()); }
    /** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code srcOffsets} field. */
    public VkOffset3D srcOffsets(int index) { return nsrcOffsets(address(), index); }
    /** Returns a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
    public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
    /** Returns a {@link VkOffset3D}.Buffer view of the {@code dstOffsets} field. */
    @NativeType("VkOffset3D[2]")
    public VkOffset3D.Buffer dstOffsets() { return ndstOffsets(address()); }
    /** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code dstOffsets} field. */
    public VkOffset3D dstOffsets(int index) { return ndstOffsets(address(), index); }

    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
    public VkImageBlit srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D.Buffer} to the {@code srcOffsets} field. */
    public VkImageBlit srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { nsrcOffsets(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} at the specified index of the {@code srcOffsets} field. */
    public VkImageBlit srcOffsets(int index, VkOffset3D value) { nsrcOffsets(address(), index, value); return this; }
    /** Passes the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit srcOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(srcOffsets()); return this; }
    /** Passes the element at {@code index} of the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit srcOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffsets(index)); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
    public VkImageBlit dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D.Buffer} to the {@code dstOffsets} field. */
    public VkImageBlit dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { ndstOffsets(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} at the specified index of the {@code dstOffsets} field. */
    public VkImageBlit dstOffsets(int index, VkOffset3D value) { ndstOffsets(address(), index, value); return this; }
    /** Passes the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit dstOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(dstOffsets()); return this; }
    /** Passes the element at {@code index} of the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit dstOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffsets(index)); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageBlit set(
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D.Buffer srcOffsets,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D.Buffer dstOffsets
    ) {
        srcSubresource(srcSubresource);
        srcOffsets(srcOffsets);
        dstSubresource(dstSubresource);
        dstOffsets(dstOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageBlit set(VkImageBlit src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageBlit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageBlit malloc() {
        return wrap(VkImageBlit.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageBlit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageBlit calloc() {
        return wrap(VkImageBlit.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageBlit} instance allocated with {@link BufferUtils}. */
    public static VkImageBlit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageBlit.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageBlit} instance for the specified memory address. */
    public static VkImageBlit create(long address) {
        return wrap(VkImageBlit.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageBlit createSafe(long address) {
        return address == NULL ? null : wrap(VkImageBlit.class, address);
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageBlit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageBlit.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImageBlit} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageBlit mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageBlit} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageBlit callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageBlit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageBlit mallocStack(MemoryStack stack) {
        return wrap(VkImageBlit.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageBlit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageBlit callocStack(MemoryStack stack) {
        return wrap(VkImageBlit.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageBlit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageBlit.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcSubresource}. */
    public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageBlit.SRCSUBRESOURCE); }
    /** Unsafe version of {@link #srcOffsets}. */
    public static VkOffset3D.Buffer nsrcOffsets(long struct) { return VkOffset3D.create(struct + VkImageBlit.SRCOFFSETS, 2); }
    /** Unsafe version of {@link #srcOffsets(int) srcOffsets}. */
    public static VkOffset3D nsrcOffsets(long struct, int index) {
        return VkOffset3D.create(struct + VkImageBlit.SRCOFFSETS + check(index, 2) * VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #dstSubresource}. */
    public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageBlit.DSTSUBRESOURCE); }
    /** Unsafe version of {@link #dstOffsets}. */
    public static VkOffset3D.Buffer ndstOffsets(long struct) { return VkOffset3D.create(struct + VkImageBlit.DSTOFFSETS, 2); }
    /** Unsafe version of {@link #dstOffsets(int) dstOffsets}. */
    public static VkOffset3D ndstOffsets(long struct, int index) {
        return VkOffset3D.create(struct + VkImageBlit.DSTOFFSETS + check(index, 2) * VkOffset3D.SIZEOF);
    }

    /** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageBlit.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #srcOffsets(VkOffset3D.Buffer) srcOffsets}. */
    public static void nsrcOffsets(long struct, VkOffset3D.Buffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(value.address(), struct + VkImageBlit.SRCOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #srcOffsets(int, VkOffset3D) srcOffsets}. */
    public static void nsrcOffsets(long struct, int index, VkOffset3D value) {
        memCopy(value.address(), struct + VkImageBlit.SRCOFFSETS + check(index, 2) * VkOffset3D.SIZEOF, VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageBlit.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #dstOffsets(VkOffset3D.Buffer) dstOffsets}. */
    public static void ndstOffsets(long struct, VkOffset3D.Buffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(value.address(), struct + VkImageBlit.DSTOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #dstOffsets(int, VkOffset3D) dstOffsets}. */
    public static void ndstOffsets(long struct, int index, VkOffset3D value) {
        memCopy(value.address(), struct + VkImageBlit.DSTOFFSETS + check(index, 2) * VkOffset3D.SIZEOF, VkOffset3D.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link VkImageBlit} structs. */
    public static class Buffer extends StructBuffer<VkImageBlit, Buffer> implements NativeResource {

        private static final VkImageBlit ELEMENT_FACTORY = VkImageBlit.create(-1L);

        /**
         * Creates a new {@code VkImageBlit.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageBlit#SIZEOF}, and its mark will be undefined.
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
        protected VkImageBlit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
        public VkImageSubresourceLayers srcSubresource() { return VkImageBlit.nsrcSubresource(address()); }
        /** Returns a {@link VkOffset3D}.Buffer view of the {@code srcOffsets} field. */
        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer srcOffsets() { return VkImageBlit.nsrcOffsets(address()); }
        /** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code srcOffsets} field. */
        public VkOffset3D srcOffsets(int index) { return VkImageBlit.nsrcOffsets(address(), index); }
        /** Returns a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
        public VkImageSubresourceLayers dstSubresource() { return VkImageBlit.ndstSubresource(address()); }
        /** Returns a {@link VkOffset3D}.Buffer view of the {@code dstOffsets} field. */
        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer dstOffsets() { return VkImageBlit.ndstOffsets(address()); }
        /** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code dstOffsets} field. */
        public VkOffset3D dstOffsets(int index) { return VkImageBlit.ndstOffsets(address(), index); }

        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
        public VkImageBlit.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageBlit.nsrcSubresource(address(), value); return this; }
        /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D.Buffer} to the {@code srcOffsets} field. */
        public VkImageBlit.Buffer srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { VkImageBlit.nsrcOffsets(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} at the specified index of the {@code srcOffsets} field. */
        public VkImageBlit.Buffer srcOffsets(int index, VkOffset3D value) { VkImageBlit.nsrcOffsets(address(), index, value); return this; }
        /** Passes the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit.Buffer srcOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(srcOffsets()); return this; }
        /** Passes the element at {@code index} of the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit.Buffer srcOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffsets(index)); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
        public VkImageBlit.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageBlit.ndstSubresource(address(), value); return this; }
        /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D.Buffer} to the {@code dstOffsets} field. */
        public VkImageBlit.Buffer dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { VkImageBlit.ndstOffsets(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} at the specified index of the {@code dstOffsets} field. */
        public VkImageBlit.Buffer dstOffsets(int index, VkOffset3D value) { VkImageBlit.ndstOffsets(address(), index, value); return this; }
        /** Passes the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit.Buffer dstOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(dstOffsets()); return this; }
        /** Passes the element at {@code index} of the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit.Buffer dstOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffsets(index)); return this; }

    }

}