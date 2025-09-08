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
 * <pre><code>
 * struct VkSamplerYcbcrConversionCreateInfo {
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
public class VkSamplerYcbcrConversionCreateInfo extends Struct<VkSamplerYcbcrConversionCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        YCBCRMODEL,
        YCBCRRANGE,
        COMPONENTS,
        XCHROMAOFFSET,
        YCHROMAOFFSET,
        CHROMAFILTER,
        FORCEEXPLICITRECONSTRUCTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        YCBCRMODEL = layout.offsetof(3);
        YCBCRRANGE = layout.offsetof(4);
        COMPONENTS = layout.offsetof(5);
        XCHROMAOFFSET = layout.offsetof(6);
        YCHROMAOFFSET = layout.offsetof(7);
        CHROMAFILTER = layout.offsetof(8);
        FORCEEXPLICITRECONSTRUCTION = layout.offsetof(9);
    }

    protected VkSamplerYcbcrConversionCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerYcbcrConversionCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerYcbcrConversionCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkSamplerYcbcrConversionCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code ycbcrModel} field. */
    @NativeType("VkSamplerYcbcrModelConversion")
    public int ycbcrModel() { return nycbcrModel(address()); }
    /** @return the value of the {@code ycbcrRange} field. */
    @NativeType("VkSamplerYcbcrRange")
    public int ycbcrRange() { return nycbcrRange(address()); }
    /** @return a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** @return the value of the {@code xChromaOffset} field. */
    @NativeType("VkChromaLocation")
    public int xChromaOffset() { return nxChromaOffset(address()); }
    /** @return the value of the {@code yChromaOffset} field. */
    @NativeType("VkChromaLocation")
    public int yChromaOffset() { return nyChromaOffset(address()); }
    /** @return the value of the {@code chromaFilter} field. */
    @NativeType("VkFilter")
    public int chromaFilter() { return nchromaFilter(address()); }
    /** @return the value of the {@code forceExplicitReconstruction} field. */
    @NativeType("VkBool32")
    public boolean forceExplicitReconstruction() { return nforceExplicitReconstruction(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerYcbcrConversionCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO} value to the {@code sType} field. */
    public VkSamplerYcbcrConversionCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerYcbcrConversionCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
    public VkSamplerYcbcrConversionCreateInfo pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} value to the {@code pNext} chain. */
    public VkSamplerYcbcrConversionCreateInfo pNext(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code format} field. */
    public VkSamplerYcbcrConversionCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrModel} field. */
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { nycbcrModel(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrRange} field. */
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { nycbcrRange(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkSamplerYcbcrConversionCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerYcbcrConversionCreateInfo components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
    /** Sets the specified value to the {@code xChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(@NativeType("VkChromaLocation") int value) { nxChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code yChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(@NativeType("VkChromaLocation") int value) { nyChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code chromaFilter} field. */
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(@NativeType("VkFilter") int value) { nchromaFilter(address(), value); return this; }
    /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionCreateInfo set(
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
    public VkSamplerYcbcrConversionCreateInfo set(VkSamplerYcbcrConversionCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfo malloc() {
        return new VkSamplerYcbcrConversionCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfo calloc() {
        return new VkSamplerYcbcrConversionCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionCreateInfo create(long address) {
        return new VkSamplerYcbcrConversionCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSamplerYcbcrConversionCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkSamplerYcbcrConversionCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSamplerYcbcrConversionCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfo malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfo calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionCreateInfo.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.FORMAT); }
    /** Unsafe version of {@link #ycbcrModel}. */
    public static int nycbcrModel(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL); }
    /** Unsafe version of {@link #ycbcrRange}. */
    public static int nycbcrRange(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkSamplerYcbcrConversionCreateInfo.COMPONENTS); }
    /** Unsafe version of {@link #xChromaOffset}. */
    public static int nxChromaOffset(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET); }
    /** Unsafe version of {@link #yChromaOffset}. */
    public static int nyChromaOffset(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET); }
    /** Unsafe version of {@link #chromaFilter}. */
    public static int nchromaFilter(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER); }
    /** Unsafe version of {@link #forceExplicitReconstruction}. */
    public static int nforceExplicitReconstruction(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #ycbcrModel(int) ycbcrModel}. */
    public static void nycbcrModel(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.YCBCRMODEL, value); }
    /** Unsafe version of {@link #ycbcrRange(int) ycbcrRange}. */
    public static void nycbcrRange(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.YCBCRRANGE, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkSamplerYcbcrConversionCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #xChromaOffset(int) xChromaOffset}. */
    public static void nxChromaOffset(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.XCHROMAOFFSET, value); }
    /** Unsafe version of {@link #yChromaOffset(int) yChromaOffset}. */
    public static void nyChromaOffset(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.YCHROMAOFFSET, value); }
    /** Unsafe version of {@link #chromaFilter(int) chromaFilter}. */
    public static void nchromaFilter(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.CHROMAFILTER, value); }
    /** Unsafe version of {@link #forceExplicitReconstruction(boolean) forceExplicitReconstruction}. */
    public static void nforceExplicitReconstruction(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfo.FORCEEXPLICITRECONSTRUCTION, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionCreateInfo, Buffer> implements NativeResource {

        private static final VkSamplerYcbcrConversionCreateInfo ELEMENT_FACTORY = VkSamplerYcbcrConversionCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSamplerYcbcrConversionCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerYcbcrConversionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerYcbcrConversionCreateInfo.npNext(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkSamplerYcbcrConversionCreateInfo.nformat(address()); }
        /** @return the value of the {@code ycbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversion")
        public int ycbcrModel() { return VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address()); }
        /** @return the value of the {@code ycbcrRange} field. */
        @NativeType("VkSamplerYcbcrRange")
        public int ycbcrRange() { return VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address()); }
        /** @return a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkSamplerYcbcrConversionCreateInfo.ncomponents(address()); }
        /** @return the value of the {@code xChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int xChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address()); }
        /** @return the value of the {@code yChromaOffset} field. */
        @NativeType("VkChromaLocation")
        public int yChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address()); }
        /** @return the value of the {@code chromaFilter} field. */
        @NativeType("VkFilter")
        public int chromaFilter() { return VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address()); }
        /** @return the value of the {@code forceExplicitReconstruction} field. */
        @NativeType("VkBool32")
        public boolean forceExplicitReconstruction() { return VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO} value to the {@code sType} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerYcbcrConversionCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} value to the {@code pNext} chain. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer pNext(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code format} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrModel} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrRange} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer components(VkComponentMapping value) { VkSamplerYcbcrConversionCreateInfo.ncomponents(address(), value); return this; }
        /** Passes the {@code components} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer components(java.util.function.Consumer<VkComponentMapping> consumer) { consumer.accept(components()); return this; }
        /** Sets the specified value to the {@code xChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer xChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code yChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer yChromaOffset(@NativeType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code chromaFilter} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer chromaFilter(@NativeType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address(), value); return this; }
        /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
        public VkSamplerYcbcrConversionCreateInfo.Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    }

}