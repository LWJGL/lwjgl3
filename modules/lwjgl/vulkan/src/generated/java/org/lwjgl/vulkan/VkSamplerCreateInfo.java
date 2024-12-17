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
 * <pre>{@code
 * struct VkSamplerCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSamplerCreateFlags flags;
 *     VkFilter magFilter;
 *     VkFilter minFilter;
 *     VkSamplerMipmapMode mipmapMode;
 *     VkSamplerAddressMode addressModeU;
 *     VkSamplerAddressMode addressModeV;
 *     VkSamplerAddressMode addressModeW;
 *     float mipLodBias;
 *     VkBool32 anisotropyEnable;
 *     float maxAnisotropy;
 *     VkBool32 compareEnable;
 *     VkCompareOp compareOp;
 *     float minLod;
 *     float maxLod;
 *     VkBorderColor borderColor;
 *     VkBool32 unnormalizedCoordinates;
 * }}</pre>
 */
public class VkSamplerCreateInfo extends Struct<VkSamplerCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAGFILTER,
        MINFILTER,
        MIPMAPMODE,
        ADDRESSMODEU,
        ADDRESSMODEV,
        ADDRESSMODEW,
        MIPLODBIAS,
        ANISOTROPYENABLE,
        MAXANISOTROPY,
        COMPAREENABLE,
        COMPAREOP,
        MINLOD,
        MAXLOD,
        BORDERCOLOR,
        UNNORMALIZEDCOORDINATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAGFILTER = layout.offsetof(3);
        MINFILTER = layout.offsetof(4);
        MIPMAPMODE = layout.offsetof(5);
        ADDRESSMODEU = layout.offsetof(6);
        ADDRESSMODEV = layout.offsetof(7);
        ADDRESSMODEW = layout.offsetof(8);
        MIPLODBIAS = layout.offsetof(9);
        ANISOTROPYENABLE = layout.offsetof(10);
        MAXANISOTROPY = layout.offsetof(11);
        COMPAREENABLE = layout.offsetof(12);
        COMPAREOP = layout.offsetof(13);
        MINLOD = layout.offsetof(14);
        MAXLOD = layout.offsetof(15);
        BORDERCOLOR = layout.offsetof(16);
        UNNORMALIZEDCOORDINATES = layout.offsetof(17);
    }

    protected VkSamplerCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkSamplerCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkSamplerCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code magFilter} field. */
    @NativeType("VkFilter")
    public int magFilter() { return nmagFilter(address()); }
    /** @return the value of the {@code minFilter} field. */
    @NativeType("VkFilter")
    public int minFilter() { return nminFilter(address()); }
    /** @return the value of the {@code mipmapMode} field. */
    @NativeType("VkSamplerMipmapMode")
    public int mipmapMode() { return nmipmapMode(address()); }
    /** @return the value of the {@code addressModeU} field. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeU() { return naddressModeU(address()); }
    /** @return the value of the {@code addressModeV} field. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeV() { return naddressModeV(address()); }
    /** @return the value of the {@code addressModeW} field. */
    @NativeType("VkSamplerAddressMode")
    public int addressModeW() { return naddressModeW(address()); }
    /** @return the value of the {@code mipLodBias} field. */
    public float mipLodBias() { return nmipLodBias(address()); }
    /** @return the value of the {@code anisotropyEnable} field. */
    @NativeType("VkBool32")
    public boolean anisotropyEnable() { return nanisotropyEnable(address()) != 0; }
    /** @return the value of the {@code maxAnisotropy} field. */
    public float maxAnisotropy() { return nmaxAnisotropy(address()); }
    /** @return the value of the {@code compareEnable} field. */
    @NativeType("VkBool32")
    public boolean compareEnable() { return ncompareEnable(address()) != 0; }
    /** @return the value of the {@code compareOp} field. */
    @NativeType("VkCompareOp")
    public int compareOp() { return ncompareOp(address()); }
    /** @return the value of the {@code minLod} field. */
    public float minLod() { return nminLod(address()); }
    /** @return the value of the {@code maxLod} field. */
    public float maxLod() { return nmaxLod(address()); }
    /** @return the value of the {@code borderColor} field. */
    @NativeType("VkBorderColor")
    public int borderColor() { return nborderColor(address()); }
    /** @return the value of the {@code unnormalizedCoordinates} field. */
    @NativeType("VkBool32")
    public boolean unnormalizedCoordinates() { return nunnormalizedCoordinates(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO} value to the {@code sType} field. */
    public VkSamplerCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerBlockMatchWindowCreateInfoQCOM} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerBlockMatchWindowCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerBorderColorComponentMappingCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerCubicWeightsCreateInfoQCOM} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerCubicWeightsCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerCustomBorderColorCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerCustomBorderColorCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerReductionModeCreateInfo} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerReductionModeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerReductionModeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerReductionModeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
    public VkSamplerCreateInfo pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkSamplerCreateInfo flags(@NativeType("VkSamplerCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code magFilter} field. */
    public VkSamplerCreateInfo magFilter(@NativeType("VkFilter") int value) { nmagFilter(address(), value); return this; }
    /** Sets the specified value to the {@code minFilter} field. */
    public VkSamplerCreateInfo minFilter(@NativeType("VkFilter") int value) { nminFilter(address(), value); return this; }
    /** Sets the specified value to the {@code mipmapMode} field. */
    public VkSamplerCreateInfo mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { nmipmapMode(address(), value); return this; }
    /** Sets the specified value to the {@code addressModeU} field. */
    public VkSamplerCreateInfo addressModeU(@NativeType("VkSamplerAddressMode") int value) { naddressModeU(address(), value); return this; }
    /** Sets the specified value to the {@code addressModeV} field. */
    public VkSamplerCreateInfo addressModeV(@NativeType("VkSamplerAddressMode") int value) { naddressModeV(address(), value); return this; }
    /** Sets the specified value to the {@code addressModeW} field. */
    public VkSamplerCreateInfo addressModeW(@NativeType("VkSamplerAddressMode") int value) { naddressModeW(address(), value); return this; }
    /** Sets the specified value to the {@code mipLodBias} field. */
    public VkSamplerCreateInfo mipLodBias(float value) { nmipLodBias(address(), value); return this; }
    /** Sets the specified value to the {@code anisotropyEnable} field. */
    public VkSamplerCreateInfo anisotropyEnable(@NativeType("VkBool32") boolean value) { nanisotropyEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maxAnisotropy} field. */
    public VkSamplerCreateInfo maxAnisotropy(float value) { nmaxAnisotropy(address(), value); return this; }
    /** Sets the specified value to the {@code compareEnable} field. */
    public VkSamplerCreateInfo compareEnable(@NativeType("VkBool32") boolean value) { ncompareEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code compareOp} field. */
    public VkSamplerCreateInfo compareOp(@NativeType("VkCompareOp") int value) { ncompareOp(address(), value); return this; }
    /** Sets the specified value to the {@code minLod} field. */
    public VkSamplerCreateInfo minLod(float value) { nminLod(address(), value); return this; }
    /** Sets the specified value to the {@code maxLod} field. */
    public VkSamplerCreateInfo maxLod(float value) { nmaxLod(address(), value); return this; }
    /** Sets the specified value to the {@code borderColor} field. */
    public VkSamplerCreateInfo borderColor(@NativeType("VkBorderColor") int value) { nborderColor(address(), value); return this; }
    /** Sets the specified value to the {@code unnormalizedCoordinates} field. */
    public VkSamplerCreateInfo unnormalizedCoordinates(@NativeType("VkBool32") boolean value) { nunnormalizedCoordinates(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int magFilter,
        int minFilter,
        int mipmapMode,
        int addressModeU,
        int addressModeV,
        int addressModeW,
        float mipLodBias,
        boolean anisotropyEnable,
        float maxAnisotropy,
        boolean compareEnable,
        int compareOp,
        float minLod,
        float maxLod,
        int borderColor,
        boolean unnormalizedCoordinates
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        magFilter(magFilter);
        minFilter(minFilter);
        mipmapMode(mipmapMode);
        addressModeU(addressModeU);
        addressModeV(addressModeV);
        addressModeW(addressModeW);
        mipLodBias(mipLodBias);
        anisotropyEnable(anisotropyEnable);
        maxAnisotropy(maxAnisotropy);
        compareEnable(compareEnable);
        compareOp(compareOp);
        minLod(minLod);
        maxLod(maxLod);
        borderColor(borderColor);
        unnormalizedCoordinates(unnormalizedCoordinates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerCreateInfo set(VkSamplerCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerCreateInfo malloc() {
        return new VkSamplerCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerCreateInfo calloc() {
        return new VkSamplerCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSamplerCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerCreateInfo} instance for the specified memory address. */
    public static VkSamplerCreateInfo create(long address) {
        return new VkSamplerCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSamplerCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkSamplerCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSamplerCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCreateInfo malloc(MemoryStack stack) {
        return new VkSamplerCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerCreateInfo calloc(MemoryStack stack) {
        return new VkSamplerCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSamplerCreateInfo.FLAGS); }
    /** Unsafe version of {@link #magFilter}. */
    public static int nmagFilter(long struct) { return memGetInt(struct + VkSamplerCreateInfo.MAGFILTER); }
    /** Unsafe version of {@link #minFilter}. */
    public static int nminFilter(long struct) { return memGetInt(struct + VkSamplerCreateInfo.MINFILTER); }
    /** Unsafe version of {@link #mipmapMode}. */
    public static int nmipmapMode(long struct) { return memGetInt(struct + VkSamplerCreateInfo.MIPMAPMODE); }
    /** Unsafe version of {@link #addressModeU}. */
    public static int naddressModeU(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ADDRESSMODEU); }
    /** Unsafe version of {@link #addressModeV}. */
    public static int naddressModeV(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ADDRESSMODEV); }
    /** Unsafe version of {@link #addressModeW}. */
    public static int naddressModeW(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ADDRESSMODEW); }
    /** Unsafe version of {@link #mipLodBias}. */
    public static float nmipLodBias(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MIPLODBIAS); }
    /** Unsafe version of {@link #anisotropyEnable}. */
    public static int nanisotropyEnable(long struct) { return memGetInt(struct + VkSamplerCreateInfo.ANISOTROPYENABLE); }
    /** Unsafe version of {@link #maxAnisotropy}. */
    public static float nmaxAnisotropy(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MAXANISOTROPY); }
    /** Unsafe version of {@link #compareEnable}. */
    public static int ncompareEnable(long struct) { return memGetInt(struct + VkSamplerCreateInfo.COMPAREENABLE); }
    /** Unsafe version of {@link #compareOp}. */
    public static int ncompareOp(long struct) { return memGetInt(struct + VkSamplerCreateInfo.COMPAREOP); }
    /** Unsafe version of {@link #minLod}. */
    public static float nminLod(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MINLOD); }
    /** Unsafe version of {@link #maxLod}. */
    public static float nmaxLod(long struct) { return memGetFloat(struct + VkSamplerCreateInfo.MAXLOD); }
    /** Unsafe version of {@link #borderColor}. */
    public static int nborderColor(long struct) { return memGetInt(struct + VkSamplerCreateInfo.BORDERCOLOR); }
    /** Unsafe version of {@link #unnormalizedCoordinates}. */
    public static int nunnormalizedCoordinates(long struct) { return memGetInt(struct + VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #magFilter(int) magFilter}. */
    public static void nmagFilter(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.MAGFILTER, value); }
    /** Unsafe version of {@link #minFilter(int) minFilter}. */
    public static void nminFilter(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.MINFILTER, value); }
    /** Unsafe version of {@link #mipmapMode(int) mipmapMode}. */
    public static void nmipmapMode(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.MIPMAPMODE, value); }
    /** Unsafe version of {@link #addressModeU(int) addressModeU}. */
    public static void naddressModeU(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ADDRESSMODEU, value); }
    /** Unsafe version of {@link #addressModeV(int) addressModeV}. */
    public static void naddressModeV(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ADDRESSMODEV, value); }
    /** Unsafe version of {@link #addressModeW(int) addressModeW}. */
    public static void naddressModeW(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ADDRESSMODEW, value); }
    /** Unsafe version of {@link #mipLodBias(float) mipLodBias}. */
    public static void nmipLodBias(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MIPLODBIAS, value); }
    /** Unsafe version of {@link #anisotropyEnable(boolean) anisotropyEnable}. */
    public static void nanisotropyEnable(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.ANISOTROPYENABLE, value); }
    /** Unsafe version of {@link #maxAnisotropy(float) maxAnisotropy}. */
    public static void nmaxAnisotropy(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MAXANISOTROPY, value); }
    /** Unsafe version of {@link #compareEnable(boolean) compareEnable}. */
    public static void ncompareEnable(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.COMPAREENABLE, value); }
    /** Unsafe version of {@link #compareOp(int) compareOp}. */
    public static void ncompareOp(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.COMPAREOP, value); }
    /** Unsafe version of {@link #minLod(float) minLod}. */
    public static void nminLod(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MINLOD, value); }
    /** Unsafe version of {@link #maxLod(float) maxLod}. */
    public static void nmaxLod(long struct, float value) { memPutFloat(struct + VkSamplerCreateInfo.MAXLOD, value); }
    /** Unsafe version of {@link #borderColor(int) borderColor}. */
    public static void nborderColor(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.BORDERCOLOR, value); }
    /** Unsafe version of {@link #unnormalizedCoordinates(boolean) unnormalizedCoordinates}. */
    public static void nunnormalizedCoordinates(long struct, int value) { memPutInt(struct + VkSamplerCreateInfo.UNNORMALIZEDCOORDINATES, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSamplerCreateInfo, Buffer> implements NativeResource {

        private static final VkSamplerCreateInfo ELEMENT_FACTORY = VkSamplerCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSamplerCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSamplerCreateFlags")
        public int flags() { return VkSamplerCreateInfo.nflags(address()); }
        /** @return the value of the {@code magFilter} field. */
        @NativeType("VkFilter")
        public int magFilter() { return VkSamplerCreateInfo.nmagFilter(address()); }
        /** @return the value of the {@code minFilter} field. */
        @NativeType("VkFilter")
        public int minFilter() { return VkSamplerCreateInfo.nminFilter(address()); }
        /** @return the value of the {@code mipmapMode} field. */
        @NativeType("VkSamplerMipmapMode")
        public int mipmapMode() { return VkSamplerCreateInfo.nmipmapMode(address()); }
        /** @return the value of the {@code addressModeU} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeU() { return VkSamplerCreateInfo.naddressModeU(address()); }
        /** @return the value of the {@code addressModeV} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeV() { return VkSamplerCreateInfo.naddressModeV(address()); }
        /** @return the value of the {@code addressModeW} field. */
        @NativeType("VkSamplerAddressMode")
        public int addressModeW() { return VkSamplerCreateInfo.naddressModeW(address()); }
        /** @return the value of the {@code mipLodBias} field. */
        public float mipLodBias() { return VkSamplerCreateInfo.nmipLodBias(address()); }
        /** @return the value of the {@code anisotropyEnable} field. */
        @NativeType("VkBool32")
        public boolean anisotropyEnable() { return VkSamplerCreateInfo.nanisotropyEnable(address()) != 0; }
        /** @return the value of the {@code maxAnisotropy} field. */
        public float maxAnisotropy() { return VkSamplerCreateInfo.nmaxAnisotropy(address()); }
        /** @return the value of the {@code compareEnable} field. */
        @NativeType("VkBool32")
        public boolean compareEnable() { return VkSamplerCreateInfo.ncompareEnable(address()) != 0; }
        /** @return the value of the {@code compareOp} field. */
        @NativeType("VkCompareOp")
        public int compareOp() { return VkSamplerCreateInfo.ncompareOp(address()); }
        /** @return the value of the {@code minLod} field. */
        public float minLod() { return VkSamplerCreateInfo.nminLod(address()); }
        /** @return the value of the {@code maxLod} field. */
        public float maxLod() { return VkSamplerCreateInfo.nmaxLod(address()); }
        /** @return the value of the {@code borderColor} field. */
        @NativeType("VkBorderColor")
        public int borderColor() { return VkSamplerCreateInfo.nborderColor(address()); }
        /** @return the value of the {@code unnormalizedCoordinates} field. */
        @NativeType("VkBool32")
        public boolean unnormalizedCoordinates() { return VkSamplerCreateInfo.nunnormalizedCoordinates(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO STRUCTURE_TYPE_SAMPLER_CREATE_INFO} value to the {@code sType} field. */
        public VkSamplerCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerBlockMatchWindowCreateInfoQCOM} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerBlockMatchWindowCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerBorderColorComponentMappingCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerBorderColorComponentMappingCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerCubicWeightsCreateInfoQCOM} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerCubicWeightsCreateInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerCustomBorderColorCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerCustomBorderColorCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerReductionModeCreateInfo} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerReductionModeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerReductionModeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerReductionModeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfo} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionInfoKHR} value to the {@code pNext} chain. */
        public VkSamplerCreateInfo.Buffer pNext(VkSamplerYcbcrConversionInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkSamplerCreateInfo.Buffer flags(@NativeType("VkSamplerCreateFlags") int value) { VkSamplerCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code magFilter} field. */
        public VkSamplerCreateInfo.Buffer magFilter(@NativeType("VkFilter") int value) { VkSamplerCreateInfo.nmagFilter(address(), value); return this; }
        /** Sets the specified value to the {@code minFilter} field. */
        public VkSamplerCreateInfo.Buffer minFilter(@NativeType("VkFilter") int value) { VkSamplerCreateInfo.nminFilter(address(), value); return this; }
        /** Sets the specified value to the {@code mipmapMode} field. */
        public VkSamplerCreateInfo.Buffer mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { VkSamplerCreateInfo.nmipmapMode(address(), value); return this; }
        /** Sets the specified value to the {@code addressModeU} field. */
        public VkSamplerCreateInfo.Buffer addressModeU(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeU(address(), value); return this; }
        /** Sets the specified value to the {@code addressModeV} field. */
        public VkSamplerCreateInfo.Buffer addressModeV(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeV(address(), value); return this; }
        /** Sets the specified value to the {@code addressModeW} field. */
        public VkSamplerCreateInfo.Buffer addressModeW(@NativeType("VkSamplerAddressMode") int value) { VkSamplerCreateInfo.naddressModeW(address(), value); return this; }
        /** Sets the specified value to the {@code mipLodBias} field. */
        public VkSamplerCreateInfo.Buffer mipLodBias(float value) { VkSamplerCreateInfo.nmipLodBias(address(), value); return this; }
        /** Sets the specified value to the {@code anisotropyEnable} field. */
        public VkSamplerCreateInfo.Buffer anisotropyEnable(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.nanisotropyEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maxAnisotropy} field. */
        public VkSamplerCreateInfo.Buffer maxAnisotropy(float value) { VkSamplerCreateInfo.nmaxAnisotropy(address(), value); return this; }
        /** Sets the specified value to the {@code compareEnable} field. */
        public VkSamplerCreateInfo.Buffer compareEnable(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.ncompareEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code compareOp} field. */
        public VkSamplerCreateInfo.Buffer compareOp(@NativeType("VkCompareOp") int value) { VkSamplerCreateInfo.ncompareOp(address(), value); return this; }
        /** Sets the specified value to the {@code minLod} field. */
        public VkSamplerCreateInfo.Buffer minLod(float value) { VkSamplerCreateInfo.nminLod(address(), value); return this; }
        /** Sets the specified value to the {@code maxLod} field. */
        public VkSamplerCreateInfo.Buffer maxLod(float value) { VkSamplerCreateInfo.nmaxLod(address(), value); return this; }
        /** Sets the specified value to the {@code borderColor} field. */
        public VkSamplerCreateInfo.Buffer borderColor(@NativeType("VkBorderColor") int value) { VkSamplerCreateInfo.nborderColor(address(), value); return this; }
        /** Sets the specified value to the {@code unnormalizedCoordinates} field. */
        public VkSamplerCreateInfo.Buffer unnormalizedCoordinates(@NativeType("VkBool32") boolean value) { VkSamplerCreateInfo.nunnormalizedCoordinates(address(), value ? 1 : 0); return this; }

    }

}