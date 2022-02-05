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
 * See {@link VkImageBlit2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageBlit2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
 *     {@link VkOffset3D VkOffset3D} srcOffsets[2];
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
 *     {@link VkOffset3D VkOffset3D} dstOffsets[2];
 * }</code></pre>
 */
public class VkImageBlit2KHR extends VkImageBlit2 {

    /**
     * Creates a {@code VkImageBlit2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageBlit2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageBlit2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_BLIT_2 STRUCTURE_TYPE_IMAGE_BLIT_2} value to the {@code sType} field. */
    @Override
    public VkImageBlit2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_BLIT_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageBlit2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
    @Override
    public VkImageBlit2KHR srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageBlit2KHR srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D.Buffer} to the {@code srcOffsets} field. */
    @Override
    public VkImageBlit2KHR srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { nsrcOffsets(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} at the specified index of the {@code srcOffsets} field. */
    @Override
    public VkImageBlit2KHR srcOffsets(int index, VkOffset3D value) { nsrcOffsets(address(), index, value); return this; }
    /** Passes the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageBlit2KHR srcOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(srcOffsets()); return this; }
    /** Passes the element at {@code index} of the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageBlit2KHR srcOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffsets(index)); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
    @Override
    public VkImageBlit2KHR dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageBlit2KHR dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D.Buffer} to the {@code dstOffsets} field. */
    @Override
    public VkImageBlit2KHR dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { ndstOffsets(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} at the specified index of the {@code dstOffsets} field. */
    @Override
    public VkImageBlit2KHR dstOffsets(int index, VkOffset3D value) { ndstOffsets(address(), index, value); return this; }
    /** Passes the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageBlit2KHR dstOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(dstOffsets()); return this; }
    /** Passes the element at {@code index} of the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageBlit2KHR dstOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffsets(index)); return this; }

    /** Initializes this struct with the specified values. */
    @Override
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

    /** An array of {@link VkImageBlit2KHR} structs. */
    public static class Buffer extends VkImageBlit2.Buffer {

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
            super(container);
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

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageBlit2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageBlit2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_BLIT_2 STRUCTURE_TYPE_IMAGE_BLIT_2} value to the {@code sType} field. */
        @Override
        public VkImageBlit2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_BLIT_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageBlit2KHR.Buffer pNext(@NativeType("void const *") long value) { VkImageBlit2KHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
        @Override
        public VkImageBlit2KHR.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageBlit2KHR.nsrcSubresource(address(), value); return this; }
        /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageBlit2KHR.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D.Buffer} to the {@code srcOffsets} field. */
        @Override
        public VkImageBlit2KHR.Buffer srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { VkImageBlit2KHR.nsrcOffsets(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} at the specified index of the {@code srcOffsets} field. */
        @Override
        public VkImageBlit2KHR.Buffer srcOffsets(int index, VkOffset3D value) { VkImageBlit2KHR.nsrcOffsets(address(), index, value); return this; }
        /** Passes the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageBlit2KHR.Buffer srcOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(srcOffsets()); return this; }
        /** Passes the element at {@code index} of the {@code srcOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageBlit2KHR.Buffer srcOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffsets(index)); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
        @Override
        public VkImageBlit2KHR.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageBlit2KHR.ndstSubresource(address(), value); return this; }
        /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageBlit2KHR.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D.Buffer} to the {@code dstOffsets} field. */
        @Override
        public VkImageBlit2KHR.Buffer dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) { VkImageBlit2KHR.ndstOffsets(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} at the specified index of the {@code dstOffsets} field. */
        @Override
        public VkImageBlit2KHR.Buffer dstOffsets(int index, VkOffset3D value) { VkImageBlit2KHR.ndstOffsets(address(), index, value); return this; }
        /** Passes the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageBlit2KHR.Buffer dstOffsets(java.util.function.Consumer<VkOffset3D.Buffer> consumer) { consumer.accept(dstOffsets()); return this; }
        /** Passes the element at {@code index} of the {@code dstOffsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageBlit2KHR.Buffer dstOffsets(int index, java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffsets(index)); return this; }

    }

}