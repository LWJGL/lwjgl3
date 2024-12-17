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
 * struct VkPhysicalDeviceVulkan13Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 robustImageAccess;
 *     VkBool32 inlineUniformBlock;
 *     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
 *     VkBool32 pipelineCreationCacheControl;
 *     VkBool32 privateData;
 *     VkBool32 shaderDemoteToHelperInvocation;
 *     VkBool32 shaderTerminateInvocation;
 *     VkBool32 subgroupSizeControl;
 *     VkBool32 computeFullSubgroups;
 *     VkBool32 synchronization2;
 *     VkBool32 textureCompressionASTC_HDR;
 *     VkBool32 shaderZeroInitializeWorkgroupMemory;
 *     VkBool32 dynamicRendering;
 *     VkBool32 shaderIntegerDotProduct;
 *     VkBool32 maintenance4;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan13Features extends Struct<VkPhysicalDeviceVulkan13Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTIMAGEACCESS,
        INLINEUNIFORMBLOCK,
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND,
        PIPELINECREATIONCACHECONTROL,
        PRIVATEDATA,
        SHADERDEMOTETOHELPERINVOCATION,
        SHADERTERMINATEINVOCATION,
        SUBGROUPSIZECONTROL,
        COMPUTEFULLSUBGROUPS,
        SYNCHRONIZATION2,
        TEXTURECOMPRESSIONASTC_HDR,
        SHADERZEROINITIALIZEWORKGROUPMEMORY,
        DYNAMICRENDERING,
        SHADERINTEGERDOTPRODUCT,
        MAINTENANCE4;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTIMAGEACCESS = layout.offsetof(2);
        INLINEUNIFORMBLOCK = layout.offsetof(3);
        DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND = layout.offsetof(4);
        PIPELINECREATIONCACHECONTROL = layout.offsetof(5);
        PRIVATEDATA = layout.offsetof(6);
        SHADERDEMOTETOHELPERINVOCATION = layout.offsetof(7);
        SHADERTERMINATEINVOCATION = layout.offsetof(8);
        SUBGROUPSIZECONTROL = layout.offsetof(9);
        COMPUTEFULLSUBGROUPS = layout.offsetof(10);
        SYNCHRONIZATION2 = layout.offsetof(11);
        TEXTURECOMPRESSIONASTC_HDR = layout.offsetof(12);
        SHADERZEROINITIALIZEWORKGROUPMEMORY = layout.offsetof(13);
        DYNAMICRENDERING = layout.offsetof(14);
        SHADERINTEGERDOTPRODUCT = layout.offsetof(15);
        MAINTENANCE4 = layout.offsetof(16);
    }

    protected VkPhysicalDeviceVulkan13Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan13Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan13Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan13Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan13Features(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code robustImageAccess} field. */
    @NativeType("VkBool32")
    public boolean robustImageAccess() { return nrobustImageAccess(address()) != 0; }
    /** @return the value of the {@code inlineUniformBlock} field. */
    @NativeType("VkBool32")
    public boolean inlineUniformBlock() { return ninlineUniformBlock(address()) != 0; }
    /** @return the value of the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code pipelineCreationCacheControl} field. */
    @NativeType("VkBool32")
    public boolean pipelineCreationCacheControl() { return npipelineCreationCacheControl(address()) != 0; }
    /** @return the value of the {@code privateData} field. */
    @NativeType("VkBool32")
    public boolean privateData() { return nprivateData(address()) != 0; }
    /** @return the value of the {@code shaderDemoteToHelperInvocation} field. */
    @NativeType("VkBool32")
    public boolean shaderDemoteToHelperInvocation() { return nshaderDemoteToHelperInvocation(address()) != 0; }
    /** @return the value of the {@code shaderTerminateInvocation} field. */
    @NativeType("VkBool32")
    public boolean shaderTerminateInvocation() { return nshaderTerminateInvocation(address()) != 0; }
    /** @return the value of the {@code subgroupSizeControl} field. */
    @NativeType("VkBool32")
    public boolean subgroupSizeControl() { return nsubgroupSizeControl(address()) != 0; }
    /** @return the value of the {@code computeFullSubgroups} field. */
    @NativeType("VkBool32")
    public boolean computeFullSubgroups() { return ncomputeFullSubgroups(address()) != 0; }
    /** @return the value of the {@code synchronization2} field. */
    @NativeType("VkBool32")
    public boolean synchronization2() { return nsynchronization2(address()) != 0; }
    /** @return the value of the {@code textureCompressionASTC_HDR} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_HDR() { return ntextureCompressionASTC_HDR(address()) != 0; }
    /** @return the value of the {@code shaderZeroInitializeWorkgroupMemory} field. */
    @NativeType("VkBool32")
    public boolean shaderZeroInitializeWorkgroupMemory() { return nshaderZeroInitializeWorkgroupMemory(address()) != 0; }
    /** @return the value of the {@code dynamicRendering} field. */
    @NativeType("VkBool32")
    public boolean dynamicRendering() { return ndynamicRendering(address()) != 0; }
    /** @return the value of the {@code shaderIntegerDotProduct} field. */
    @NativeType("VkBool32")
    public boolean shaderIntegerDotProduct() { return nshaderIntegerDotProduct(address()) != 0; }
    /** @return the value of the {@code maintenance4} field. */
    @NativeType("VkBool32")
    public boolean maintenance4() { return nmaintenance4(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan13Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan13Features sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan13Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code robustImageAccess} field. */
    public VkPhysicalDeviceVulkan13Features robustImageAccess(@NativeType("VkBool32") boolean value) { nrobustImageAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code inlineUniformBlock} field. */
    public VkPhysicalDeviceVulkan13Features inlineUniformBlock(@NativeType("VkBool32") boolean value) { ninlineUniformBlock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan13Features descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pipelineCreationCacheControl} field. */
    public VkPhysicalDeviceVulkan13Features pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code privateData} field. */
    public VkPhysicalDeviceVulkan13Features privateData(@NativeType("VkBool32") boolean value) { nprivateData(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDemoteToHelperInvocation} field. */
    public VkPhysicalDeviceVulkan13Features shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderTerminateInvocation} field. */
    public VkPhysicalDeviceVulkan13Features shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code subgroupSizeControl} field. */
    public VkPhysicalDeviceVulkan13Features subgroupSizeControl(@NativeType("VkBool32") boolean value) { nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code computeFullSubgroups} field. */
    public VkPhysicalDeviceVulkan13Features computeFullSubgroups(@NativeType("VkBool32") boolean value) { ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code synchronization2} field. */
    public VkPhysicalDeviceVulkan13Features synchronization2(@NativeType("VkBool32") boolean value) { nsynchronization2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code textureCompressionASTC_HDR} field. */
    public VkPhysicalDeviceVulkan13Features textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderZeroInitializeWorkgroupMemory} field. */
    public VkPhysicalDeviceVulkan13Features shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dynamicRendering} field. */
    public VkPhysicalDeviceVulkan13Features dynamicRendering(@NativeType("VkBool32") boolean value) { ndynamicRendering(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderIntegerDotProduct} field. */
    public VkPhysicalDeviceVulkan13Features shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) { nshaderIntegerDotProduct(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maintenance4} field. */
    public VkPhysicalDeviceVulkan13Features maintenance4(@NativeType("VkBool32") boolean value) { nmaintenance4(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan13Features set(
        int sType,
        long pNext,
        boolean robustImageAccess,
        boolean inlineUniformBlock,
        boolean descriptorBindingInlineUniformBlockUpdateAfterBind,
        boolean pipelineCreationCacheControl,
        boolean privateData,
        boolean shaderDemoteToHelperInvocation,
        boolean shaderTerminateInvocation,
        boolean subgroupSizeControl,
        boolean computeFullSubgroups,
        boolean synchronization2,
        boolean textureCompressionASTC_HDR,
        boolean shaderZeroInitializeWorkgroupMemory,
        boolean dynamicRendering,
        boolean shaderIntegerDotProduct,
        boolean maintenance4
    ) {
        sType(sType);
        pNext(pNext);
        robustImageAccess(robustImageAccess);
        inlineUniformBlock(inlineUniformBlock);
        descriptorBindingInlineUniformBlockUpdateAfterBind(descriptorBindingInlineUniformBlockUpdateAfterBind);
        pipelineCreationCacheControl(pipelineCreationCacheControl);
        privateData(privateData);
        shaderDemoteToHelperInvocation(shaderDemoteToHelperInvocation);
        shaderTerminateInvocation(shaderTerminateInvocation);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);
        synchronization2(synchronization2);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);
        dynamicRendering(dynamicRendering);
        shaderIntegerDotProduct(shaderIntegerDotProduct);
        maintenance4(maintenance4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan13Features set(VkPhysicalDeviceVulkan13Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Features malloc() {
        return new VkPhysicalDeviceVulkan13Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan13Features calloc() {
        return new VkPhysicalDeviceVulkan13Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan13Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan13Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan13Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan13Features create(long address) {
        return new VkPhysicalDeviceVulkan13Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan13Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan13Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan13Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan13Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan13Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan13Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan13Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan13Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan13Features.PNEXT); }
    /** Unsafe version of {@link #robustImageAccess}. */
    public static int nrobustImageAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.ROBUSTIMAGEACCESS); }
    /** Unsafe version of {@link #inlineUniformBlock}. */
    public static int ninlineUniformBlock(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.INLINEUNIFORMBLOCK); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static int ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND); }
    /** Unsafe version of {@link #pipelineCreationCacheControl}. */
    public static int npipelineCreationCacheControl(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.PIPELINECREATIONCACHECONTROL); }
    /** Unsafe version of {@link #privateData}. */
    public static int nprivateData(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.PRIVATEDATA); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation}. */
    public static int nshaderDemoteToHelperInvocation(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.SHADERDEMOTETOHELPERINVOCATION); }
    /** Unsafe version of {@link #shaderTerminateInvocation}. */
    public static int nshaderTerminateInvocation(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.SHADERTERMINATEINVOCATION); }
    /** Unsafe version of {@link #subgroupSizeControl}. */
    public static int nsubgroupSizeControl(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.SUBGROUPSIZECONTROL); }
    /** Unsafe version of {@link #computeFullSubgroups}. */
    public static int ncomputeFullSubgroups(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.COMPUTEFULLSUBGROUPS); }
    /** Unsafe version of {@link #synchronization2}. */
    public static int nsynchronization2(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.SYNCHRONIZATION2); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR}. */
    public static int ntextureCompressionASTC_HDR(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.TEXTURECOMPRESSIONASTC_HDR); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory}. */
    public static int nshaderZeroInitializeWorkgroupMemory(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.SHADERZEROINITIALIZEWORKGROUPMEMORY); }
    /** Unsafe version of {@link #dynamicRendering}. */
    public static int ndynamicRendering(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.DYNAMICRENDERING); }
    /** Unsafe version of {@link #shaderIntegerDotProduct}. */
    public static int nshaderIntegerDotProduct(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.SHADERINTEGERDOTPRODUCT); }
    /** Unsafe version of {@link #maintenance4}. */
    public static int nmaintenance4(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan13Features.MAINTENANCE4); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan13Features.PNEXT, value); }
    /** Unsafe version of {@link #robustImageAccess(boolean) robustImageAccess}. */
    public static void nrobustImageAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.ROBUSTIMAGEACCESS, value); }
    /** Unsafe version of {@link #inlineUniformBlock(boolean) inlineUniformBlock}. */
    public static void ninlineUniformBlock(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.INLINEUNIFORMBLOCK, value); }
    /** Unsafe version of {@link #descriptorBindingInlineUniformBlockUpdateAfterBind(boolean) descriptorBindingInlineUniformBlockUpdateAfterBind}. */
    public static void ndescriptorBindingInlineUniformBlockUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.DESCRIPTORBINDINGINLINEUNIFORMBLOCKUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #pipelineCreationCacheControl(boolean) pipelineCreationCacheControl}. */
    public static void npipelineCreationCacheControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.PIPELINECREATIONCACHECONTROL, value); }
    /** Unsafe version of {@link #privateData(boolean) privateData}. */
    public static void nprivateData(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.PRIVATEDATA, value); }
    /** Unsafe version of {@link #shaderDemoteToHelperInvocation(boolean) shaderDemoteToHelperInvocation}. */
    public static void nshaderDemoteToHelperInvocation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.SHADERDEMOTETOHELPERINVOCATION, value); }
    /** Unsafe version of {@link #shaderTerminateInvocation(boolean) shaderTerminateInvocation}. */
    public static void nshaderTerminateInvocation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.SHADERTERMINATEINVOCATION, value); }
    /** Unsafe version of {@link #subgroupSizeControl(boolean) subgroupSizeControl}. */
    public static void nsubgroupSizeControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.SUBGROUPSIZECONTROL, value); }
    /** Unsafe version of {@link #computeFullSubgroups(boolean) computeFullSubgroups}. */
    public static void ncomputeFullSubgroups(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.COMPUTEFULLSUBGROUPS, value); }
    /** Unsafe version of {@link #synchronization2(boolean) synchronization2}. */
    public static void nsynchronization2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.SYNCHRONIZATION2, value); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR(boolean) textureCompressionASTC_HDR}. */
    public static void ntextureCompressionASTC_HDR(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.TEXTURECOMPRESSIONASTC_HDR, value); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory(boolean) shaderZeroInitializeWorkgroupMemory}. */
    public static void nshaderZeroInitializeWorkgroupMemory(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.SHADERZEROINITIALIZEWORKGROUPMEMORY, value); }
    /** Unsafe version of {@link #dynamicRendering(boolean) dynamicRendering}. */
    public static void ndynamicRendering(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.DYNAMICRENDERING, value); }
    /** Unsafe version of {@link #shaderIntegerDotProduct(boolean) shaderIntegerDotProduct}. */
    public static void nshaderIntegerDotProduct(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.SHADERINTEGERDOTPRODUCT, value); }
    /** Unsafe version of {@link #maintenance4(boolean) maintenance4}. */
    public static void nmaintenance4(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan13Features.MAINTENANCE4, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan13Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan13Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan13Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan13Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan13Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan13Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan13Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan13Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan13Features.npNext(address()); }
        /** @return the value of the {@code robustImageAccess} field. */
        @NativeType("VkBool32")
        public boolean robustImageAccess() { return VkPhysicalDeviceVulkan13Features.nrobustImageAccess(address()) != 0; }
        /** @return the value of the {@code inlineUniformBlock} field. */
        @NativeType("VkBool32")
        public boolean inlineUniformBlock() { return VkPhysicalDeviceVulkan13Features.ninlineUniformBlock(address()) != 0; }
        /** @return the value of the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingInlineUniformBlockUpdateAfterBind() { return VkPhysicalDeviceVulkan13Features.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code pipelineCreationCacheControl} field. */
        @NativeType("VkBool32")
        public boolean pipelineCreationCacheControl() { return VkPhysicalDeviceVulkan13Features.npipelineCreationCacheControl(address()) != 0; }
        /** @return the value of the {@code privateData} field. */
        @NativeType("VkBool32")
        public boolean privateData() { return VkPhysicalDeviceVulkan13Features.nprivateData(address()) != 0; }
        /** @return the value of the {@code shaderDemoteToHelperInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderDemoteToHelperInvocation() { return VkPhysicalDeviceVulkan13Features.nshaderDemoteToHelperInvocation(address()) != 0; }
        /** @return the value of the {@code shaderTerminateInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderTerminateInvocation() { return VkPhysicalDeviceVulkan13Features.nshaderTerminateInvocation(address()) != 0; }
        /** @return the value of the {@code subgroupSizeControl} field. */
        @NativeType("VkBool32")
        public boolean subgroupSizeControl() { return VkPhysicalDeviceVulkan13Features.nsubgroupSizeControl(address()) != 0; }
        /** @return the value of the {@code computeFullSubgroups} field. */
        @NativeType("VkBool32")
        public boolean computeFullSubgroups() { return VkPhysicalDeviceVulkan13Features.ncomputeFullSubgroups(address()) != 0; }
        /** @return the value of the {@code synchronization2} field. */
        @NativeType("VkBool32")
        public boolean synchronization2() { return VkPhysicalDeviceVulkan13Features.nsynchronization2(address()) != 0; }
        /** @return the value of the {@code textureCompressionASTC_HDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_HDR() { return VkPhysicalDeviceVulkan13Features.ntextureCompressionASTC_HDR(address()) != 0; }
        /** @return the value of the {@code shaderZeroInitializeWorkgroupMemory} field. */
        @NativeType("VkBool32")
        public boolean shaderZeroInitializeWorkgroupMemory() { return VkPhysicalDeviceVulkan13Features.nshaderZeroInitializeWorkgroupMemory(address()) != 0; }
        /** @return the value of the {@code dynamicRendering} field. */
        @NativeType("VkBool32")
        public boolean dynamicRendering() { return VkPhysicalDeviceVulkan13Features.ndynamicRendering(address()) != 0; }
        /** @return the value of the {@code shaderIntegerDotProduct} field. */
        @NativeType("VkBool32")
        public boolean shaderIntegerDotProduct() { return VkPhysicalDeviceVulkan13Features.nshaderIntegerDotProduct(address()) != 0; }
        /** @return the value of the {@code maintenance4} field. */
        @NativeType("VkBool32")
        public boolean maintenance4() { return VkPhysicalDeviceVulkan13Features.nmaintenance4(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Features.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan13Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code robustImageAccess} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer robustImageAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nrobustImageAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code inlineUniformBlock} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer inlineUniformBlock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ninlineUniformBlock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingInlineUniformBlockUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer descriptorBindingInlineUniformBlockUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ndescriptorBindingInlineUniformBlockUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pipelineCreationCacheControl} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code privateData} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer privateData(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nprivateData(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDemoteToHelperInvocation} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderDemoteToHelperInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderDemoteToHelperInvocation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderTerminateInvocation} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderTerminateInvocation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderTerminateInvocation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code subgroupSizeControl} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code computeFullSubgroups} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code synchronization2} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer synchronization2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nsynchronization2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code textureCompressionASTC_HDR} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderZeroInitializeWorkgroupMemory} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dynamicRendering} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer dynamicRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.ndynamicRendering(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderIntegerDotProduct} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nshaderIntegerDotProduct(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maintenance4} field. */
        public VkPhysicalDeviceVulkan13Features.Buffer maintenance4(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan13Features.nmaintenance4(address(), value ? 1 : 0); return this; }

    }

}