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
 * <p>For each element of the {@code pRegions} array, a blit operation is performed for the specified source and destination regions.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code aspectMask} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * <li>The {@code layerCount} member of {@code srcSubresource} and {@code dstSubresource} <b>must</b> match</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR STRUCTURE_TYPE_IMAGE_BLIT_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkCopyCommandTransformInfoQCOM}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code srcSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * <li>{@code dstSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBlitImageInfo2KHR}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageBlit2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #srcSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #srcOffsets}[2];
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #dstSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #dstOffsets}[2];
 * }</code></pre>
 */
public class VkImageBlit2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBRESOURCE,
        SRCOFFSETS,
        DSTSUBRESOURCE,
        DSTOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBRESOURCE = layout.offsetof(2);
        SRCOFFSETS = layout.offsetof(3);
        DSTSUBRESOURCE = layout.offsetof(4);
        DSTOFFSETS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkImageBlit2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageBlit2KHR(ByteBuffer container) {
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
    /** the subresource to blit from. */
    public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
    /** a pointer to an array of two {@link VkOffset3D} structures specifying the bounds of the source region within {@code srcSubresource}. */
    @NativeType("VkOffset3D[2]")
    public VkOffset3D.Buffer srcOffsets() { return nsrcOffsets(address()); }
    /** a pointer to an array of two {@link VkOffset3D} structures specifying the bounds of the source region within {@code srcSubresource}. */
    public VkOffset3D srcOffsets(int index) { return nsrcOffsets(address(), index); }
    /** the subresource to blit into. */
    public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
    /** a pointer to an array of two {@link VkOffset3D} structures specifying the bounds of the destination region within {@code dstSubresource}. */
    @NativeType("VkOffset3D[2]")
    public VkOffset3D.Buffer dstOffsets() { return ndstOffsets(address()); }
    /** a pointer to an array of two {@link VkOffset3D} structures specifying the bounds of the destination region within {@code dstSubresource}. */
    public VkOffset3D dstOffsets(int index) { return ndstOffsets(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageBlit2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR STRUCTURE_TYPE_IMAGE_BLIT_2_KHR} value to the {@link #sType} field. */
    public VkImageBlit2KHR sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageBlit2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #srcSubresource} field. */
    public VkImageBlit2KHR srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@link #srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit2KHR srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D.Buffer} to the {@link #srcOffsets} field. */
    public VkImageBlit2KHR srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { nsrcOffsets(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} at the specified index of the {@link #srcOffsets} field. */
    public VkImageBlit2KHR srcOffsets(int index, VkOffset3D value) { nsrcOffsets(address(), index, value); return this; }
    /** Passes the {@link #srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit2KHR srcOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(srcOffsets()); return this; }
    /** Passes the element at {@code index} of the {@link #srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit2KHR srcOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffsets(index)); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #dstSubresource} field. */
    public VkImageBlit2KHR dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@link #dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit2KHR dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D.Buffer} to the {@link #dstOffsets} field. */
    public VkImageBlit2KHR dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { ndstOffsets(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} at the specified index of the {@link #dstOffsets} field. */
    public VkImageBlit2KHR dstOffsets(int index, VkOffset3D value) { ndstOffsets(address(), index, value); return this; }
    /** Passes the {@link #dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit2KHR dstOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(dstOffsets()); return this; }
    /** Passes the element at {@code index} of the {@link #dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageBlit2KHR dstOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffsets(index)); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageBlit2KHR set(
        int sType,
        long pNext,
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D.Buffer srcOffsets,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D.Buffer dstOffsets
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkImageBlit2KHR set(VkImageBlit2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageBlit2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageBlit2KHR malloc() {
        return wrap(VkImageBlit2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageBlit2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageBlit2KHR calloc() {
        return wrap(VkImageBlit2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageBlit2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageBlit2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageBlit2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageBlit2KHR} instance for the specified memory address. */
    public static VkImageBlit2KHR create(long address) {
        return wrap(VkImageBlit2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageBlit2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImageBlit2KHR.class, address);
    }

    /**
     * Returns a new {@link VkImageBlit2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageBlit2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageBlit2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageBlit2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageBlit2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageBlit2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageBlit2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkImageBlit2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageBlit2KHR malloc(MemoryStack stack) {
        return wrap(VkImageBlit2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageBlit2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageBlit2KHR calloc(MemoryStack stack) {
        return wrap(VkImageBlit2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageBlit2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageBlit2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageBlit2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageBlit2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageBlit2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageBlit2KHR.PNEXT); }
    /** Unsafe version of {@link #srcSubresource}. */
    public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageBlit2KHR.SRCSUBRESOURCE); }
    /** Unsafe version of {@link #srcOffsets}. */
    public static VkOffset3D.Buffer nsrcOffsets(long struct) { return VkOffset3D.create(struct + VkImageBlit2KHR.SRCOFFSETS, 2); }
    /** Unsafe version of {@link #srcOffsets(int) srcOffsets}. */
    public static VkOffset3D nsrcOffsets(long struct, int index) {
        return VkOffset3D.create(struct + VkImageBlit2KHR.SRCOFFSETS + check(index, 2) * VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #dstSubresource}. */
    public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageBlit2KHR.DSTSUBRESOURCE); }
    /** Unsafe version of {@link #dstOffsets}. */
    public static VkOffset3D.Buffer ndstOffsets(long struct) { return VkOffset3D.create(struct + VkImageBlit2KHR.DSTOFFSETS, 2); }
    /** Unsafe version of {@link #dstOffsets(int) dstOffsets}. */
    public static VkOffset3D ndstOffsets(long struct, int index) {
        return VkOffset3D.create(struct + VkImageBlit2KHR.DSTOFFSETS + check(index, 2) * VkOffset3D.SIZEOF);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageBlit2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageBlit2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageBlit2KHR.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #srcOffsets(VkOffset3D.Buffer) srcOffsets}. */
    public static void nsrcOffsets(long struct, VkOffset3D.Buffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(value.address(), struct + VkImageBlit2KHR.SRCOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #srcOffsets(int, VkOffset3D) srcOffsets}. */
    public static void nsrcOffsets(long struct, int index, VkOffset3D value) {
        memCopy(value.address(), struct + VkImageBlit2KHR.SRCOFFSETS + check(index, 2) * VkOffset3D.SIZEOF, VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageBlit2KHR.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #dstOffsets(VkOffset3D.Buffer) dstOffsets}. */
    public static void ndstOffsets(long struct, VkOffset3D.Buffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(value.address(), struct + VkImageBlit2KHR.DSTOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
    }
    /** Unsafe version of {@link #dstOffsets(int, VkOffset3D) dstOffsets}. */
    public static void ndstOffsets(long struct, int index, VkOffset3D value) {
        memCopy(value.address(), struct + VkImageBlit2KHR.DSTOFFSETS + check(index, 2) * VkOffset3D.SIZEOF, VkOffset3D.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link VkImageBlit2KHR} structs. */
    public static class Buffer extends StructBuffer<VkImageBlit2KHR, Buffer> implements NativeResource {

        private static final VkImageBlit2KHR ELEMENT_FACTORY = VkImageBlit2KHR.create(-1L);

        /**
         * Creates a new {@code VkImageBlit2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageBlit2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImageBlit2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageBlit2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageBlit2KHR.nsType(address()); }
        /** @return the value of the {@link VkImageBlit2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageBlit2KHR.npNext(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageBlit2KHR#srcSubresource} field. */
        public VkImageSubresourceLayers srcSubresource() { return VkImageBlit2KHR.nsrcSubresource(address()); }
        /** @return a {@link VkOffset3D}.Buffer view of the {@link VkImageBlit2KHR#srcOffsets} field. */
        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer srcOffsets() { return VkImageBlit2KHR.nsrcOffsets(address()); }
        /** @return a {@link VkOffset3D} view of the struct at the specified index of the {@link VkImageBlit2KHR#srcOffsets} field. */
        public VkOffset3D srcOffsets(int index) { return VkImageBlit2KHR.nsrcOffsets(address(), index); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkImageBlit2KHR#dstSubresource} field. */
        public VkImageSubresourceLayers dstSubresource() { return VkImageBlit2KHR.ndstSubresource(address()); }
        /** @return a {@link VkOffset3D}.Buffer view of the {@link VkImageBlit2KHR#dstOffsets} field. */
        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer dstOffsets() { return VkImageBlit2KHR.ndstOffsets(address()); }
        /** @return a {@link VkOffset3D} view of the struct at the specified index of the {@link VkImageBlit2KHR#dstOffsets} field. */
        public VkOffset3D dstOffsets(int index) { return VkImageBlit2KHR.ndstOffsets(address(), index); }

        /** Sets the specified value to the {@link VkImageBlit2KHR#sType} field. */
        public VkImageBlit2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageBlit2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR STRUCTURE_TYPE_IMAGE_BLIT_2_KHR} value to the {@link VkImageBlit2KHR#sType} field. */
        public VkImageBlit2KHR.Buffer sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_IMAGE_BLIT_2_KHR); }
        /** Sets the specified value to the {@link VkImageBlit2KHR#pNext} field. */
        public VkImageBlit2KHR.Buffer pNext(@NativeType("void const *") long value) { VkImageBlit2KHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageBlit2KHR#srcSubresource} field. */
        public VkImageBlit2KHR.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageBlit2KHR.nsrcSubresource(address(), value); return this; }
        /** Passes the {@link VkImageBlit2KHR#srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit2KHR.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D.Buffer} to the {@link VkImageBlit2KHR#srcOffsets} field. */
        public VkImageBlit2KHR.Buffer srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { VkImageBlit2KHR.nsrcOffsets(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} at the specified index of the {@link VkImageBlit2KHR#srcOffsets} field. */
        public VkImageBlit2KHR.Buffer srcOffsets(int index, VkOffset3D value) { VkImageBlit2KHR.nsrcOffsets(address(), index, value); return this; }
        /** Passes the {@link VkImageBlit2KHR#srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit2KHR.Buffer srcOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(srcOffsets()); return this; }
        /** Passes the element at {@code index} of the {@link VkImageBlit2KHR#srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit2KHR.Buffer srcOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffsets(index)); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkImageBlit2KHR#dstSubresource} field. */
        public VkImageBlit2KHR.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageBlit2KHR.ndstSubresource(address(), value); return this; }
        /** Passes the {@link VkImageBlit2KHR#dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit2KHR.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D.Buffer} to the {@link VkImageBlit2KHR#dstOffsets} field. */
        public VkImageBlit2KHR.Buffer dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { VkImageBlit2KHR.ndstOffsets(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} at the specified index of the {@link VkImageBlit2KHR#dstOffsets} field. */
        public VkImageBlit2KHR.Buffer dstOffsets(int index, VkOffset3D value) { VkImageBlit2KHR.ndstOffsets(address(), index, value); return this; }
        /** Passes the {@link VkImageBlit2KHR#dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit2KHR.Buffer dstOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(dstOffsets()); return this; }
        /** Passes the element at {@code index} of the {@link VkImageBlit2KHR#dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageBlit2KHR.Buffer dstOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffsets(index)); return this; }

    }

}