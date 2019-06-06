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
 * See {@link VkSamplerYcbcrConversionCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerYcbcrConversionCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat format;
 *     VkSamplerYcbcrModelConversion ycbcrModel;
 *     VkSamplerYcbcrRange ycbcrRange;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     VkChromaLocation xChromaOffset;
 *     VkChromaLocation yChromaOffset;
 *     VkFilter chromaFilter;
 *     VkBool32 forceExplicitReconstruction;
 * }</code></pre>
 */
public class VkSamplerYcbcrConversionCreateInfoKHR extends VkSamplerYcbcrConversionCreateInfo {

    /**
     * Creates a {@code VkSamplerYcbcrConversionCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrModel} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { nycbcrModel(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrRange} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { nycbcrRange(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerYcbcrConversionCreateInfoKHR components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Sets the specified value to the {@code xChromaOffset} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR xChromaOffset(@NativeType("VkChromaLocation") int value) { nxChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code yChromaOffset} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR yChromaOffset(@NativeType("VkChromaLocation") int value) { nyChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code chromaFilter} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR chromaFilter(@NativeType("VkFilter") int value) { nchromaFilter(address(), value); return this; }
    /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSamplerYcbcrConversionCreateInfoKHR set(
        int sType,
        long pNext,
        int format,
        int ycbcrModel,
        int ycbcrRange,
        VkComponentMapping components,
        int xChromaOffset,
        int yChromaOffset,
        int chromaFilter,
        boolean forceExplicitReconstruction
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        ycbcrModel(ycbcrModel);
        ycbcrRange(ycbcrRange);
        components(components);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);
        chromaFilter(chromaFilter);
        forceExplicitReconstruction(forceExplicitReconstruction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionCreateInfoKHR set(VkSamplerYcbcrConversionCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfoKHR malloc() {
        return wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfoKHR calloc() {
        return wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionCreateInfoKHR create(long address) {
        return wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSamplerYcbcrConversionCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSamplerYcbcrConversionCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionCreateInfoKHR} structs. */
    public static class Buffer extends VkSamplerYcbcrConversionCreateInfo.Buffer {

        private static final VkSamplerYcbcrConversionCreateInfoKHR ELEMENT_FACTORY = VkSamplerYcbcrConversionCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerYcbcrConversionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSamplerYcbcrConversionCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer format(@NativeType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrModel} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nycbcrModel(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrRange} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nycbcrRange(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer components(VkComponentMapping value) { VkSamplerYcbcrConversionCreateInfoKHR.ncomponents(address(), value); return this; }
        /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Sets the specified value to the {@code xChromaOffset} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer xChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nxChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code yChromaOffset} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer yChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nyChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code chromaFilter} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer chromaFilter(@NativeType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nchromaFilter(address(), value); return this; }
        /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
        @Override
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionCreateInfoKHR.nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    }

}