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
 * struct VkPhysicalDeviceVulkan14Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 globalPriorityQuery;
 *     VkBool32 shaderSubgroupRotate;
 *     VkBool32 shaderSubgroupRotateClustered;
 *     VkBool32 shaderFloatControls2;
 *     VkBool32 shaderExpectAssume;
 *     VkBool32 rectangularLines;
 *     VkBool32 bresenhamLines;
 *     VkBool32 smoothLines;
 *     VkBool32 stippledRectangularLines;
 *     VkBool32 stippledBresenhamLines;
 *     VkBool32 stippledSmoothLines;
 *     VkBool32 vertexAttributeInstanceRateDivisor;
 *     VkBool32 vertexAttributeInstanceRateZeroDivisor;
 *     VkBool32 indexTypeUint8;
 *     VkBool32 dynamicRenderingLocalRead;
 *     VkBool32 maintenance5;
 *     VkBool32 maintenance6;
 *     VkBool32 pipelineProtectedAccess;
 *     VkBool32 pipelineRobustness;
 *     VkBool32 hostImageCopy;
 *     VkBool32 pushDescriptor;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan14Features extends Struct<VkPhysicalDeviceVulkan14Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GLOBALPRIORITYQUERY,
        SHADERSUBGROUPROTATE,
        SHADERSUBGROUPROTATECLUSTERED,
        SHADERFLOATCONTROLS2,
        SHADEREXPECTASSUME,
        RECTANGULARLINES,
        BRESENHAMLINES,
        SMOOTHLINES,
        STIPPLEDRECTANGULARLINES,
        STIPPLEDBRESENHAMLINES,
        STIPPLEDSMOOTHLINES,
        VERTEXATTRIBUTEINSTANCERATEDIVISOR,
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR,
        INDEXTYPEUINT8,
        DYNAMICRENDERINGLOCALREAD,
        MAINTENANCE5,
        MAINTENANCE6,
        PIPELINEPROTECTEDACCESS,
        PIPELINEROBUSTNESS,
        HOSTIMAGECOPY,
        PUSHDESCRIPTOR;

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
        GLOBALPRIORITYQUERY = layout.offsetof(2);
        SHADERSUBGROUPROTATE = layout.offsetof(3);
        SHADERSUBGROUPROTATECLUSTERED = layout.offsetof(4);
        SHADERFLOATCONTROLS2 = layout.offsetof(5);
        SHADEREXPECTASSUME = layout.offsetof(6);
        RECTANGULARLINES = layout.offsetof(7);
        BRESENHAMLINES = layout.offsetof(8);
        SMOOTHLINES = layout.offsetof(9);
        STIPPLEDRECTANGULARLINES = layout.offsetof(10);
        STIPPLEDBRESENHAMLINES = layout.offsetof(11);
        STIPPLEDSMOOTHLINES = layout.offsetof(12);
        VERTEXATTRIBUTEINSTANCERATEDIVISOR = layout.offsetof(13);
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = layout.offsetof(14);
        INDEXTYPEUINT8 = layout.offsetof(15);
        DYNAMICRENDERINGLOCALREAD = layout.offsetof(16);
        MAINTENANCE5 = layout.offsetof(17);
        MAINTENANCE6 = layout.offsetof(18);
        PIPELINEPROTECTEDACCESS = layout.offsetof(19);
        PIPELINEROBUSTNESS = layout.offsetof(20);
        HOSTIMAGECOPY = layout.offsetof(21);
        PUSHDESCRIPTOR = layout.offsetof(22);
    }

    protected VkPhysicalDeviceVulkan14Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan14Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan14Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan14Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan14Features(ByteBuffer container) {
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
    /** @return the value of the {@code globalPriorityQuery} field. */
    @NativeType("VkBool32")
    public boolean globalPriorityQuery() { return nglobalPriorityQuery(address()) != 0; }
    /** @return the value of the {@code shaderSubgroupRotate} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotate() { return nshaderSubgroupRotate(address()) != 0; }
    /** @return the value of the {@code shaderSubgroupRotateClustered} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() { return nshaderSubgroupRotateClustered(address()) != 0; }
    /** @return the value of the {@code shaderFloatControls2} field. */
    @NativeType("VkBool32")
    public boolean shaderFloatControls2() { return nshaderFloatControls2(address()) != 0; }
    /** @return the value of the {@code shaderExpectAssume} field. */
    @NativeType("VkBool32")
    public boolean shaderExpectAssume() { return nshaderExpectAssume(address()) != 0; }
    /** @return the value of the {@code rectangularLines} field. */
    @NativeType("VkBool32")
    public boolean rectangularLines() { return nrectangularLines(address()) != 0; }
    /** @return the value of the {@code bresenhamLines} field. */
    @NativeType("VkBool32")
    public boolean bresenhamLines() { return nbresenhamLines(address()) != 0; }
    /** @return the value of the {@code smoothLines} field. */
    @NativeType("VkBool32")
    public boolean smoothLines() { return nsmoothLines(address()) != 0; }
    /** @return the value of the {@code stippledRectangularLines} field. */
    @NativeType("VkBool32")
    public boolean stippledRectangularLines() { return nstippledRectangularLines(address()) != 0; }
    /** @return the value of the {@code stippledBresenhamLines} field. */
    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() { return nstippledBresenhamLines(address()) != 0; }
    /** @return the value of the {@code stippledSmoothLines} field. */
    @NativeType("VkBool32")
    public boolean stippledSmoothLines() { return nstippledSmoothLines(address()) != 0; }
    /** @return the value of the {@code vertexAttributeInstanceRateDivisor} field. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateDivisor() { return nvertexAttributeInstanceRateDivisor(address()) != 0; }
    /** @return the value of the {@code vertexAttributeInstanceRateZeroDivisor} field. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() { return nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }
    /** @return the value of the {@code indexTypeUint8} field. */
    @NativeType("VkBool32")
    public boolean indexTypeUint8() { return nindexTypeUint8(address()) != 0; }
    /** @return the value of the {@code dynamicRenderingLocalRead} field. */
    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalRead() { return ndynamicRenderingLocalRead(address()) != 0; }
    /** @return the value of the {@code maintenance5} field. */
    @NativeType("VkBool32")
    public boolean maintenance5() { return nmaintenance5(address()) != 0; }
    /** @return the value of the {@code maintenance6} field. */
    @NativeType("VkBool32")
    public boolean maintenance6() { return nmaintenance6(address()) != 0; }
    /** @return the value of the {@code pipelineProtectedAccess} field. */
    @NativeType("VkBool32")
    public boolean pipelineProtectedAccess() { return npipelineProtectedAccess(address()) != 0; }
    /** @return the value of the {@code pipelineRobustness} field. */
    @NativeType("VkBool32")
    public boolean pipelineRobustness() { return npipelineRobustness(address()) != 0; }
    /** @return the value of the {@code hostImageCopy} field. */
    @NativeType("VkBool32")
    public boolean hostImageCopy() { return nhostImageCopy(address()) != 0; }
    /** @return the value of the {@code pushDescriptor} field. */
    @NativeType("VkBool32")
    public boolean pushDescriptor() { return npushDescriptor(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan14Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan14Features sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan14Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code globalPriorityQuery} field. */
    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(@NativeType("VkBool32") boolean value) { nglobalPriorityQuery(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSubgroupRotate} field. */
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSubgroupRotateClustered} field. */
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloatControls2} field. */
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(@NativeType("VkBool32") boolean value) { nshaderFloatControls2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderExpectAssume} field. */
    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(@NativeType("VkBool32") boolean value) { nshaderExpectAssume(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rectangularLines} field. */
    public VkPhysicalDeviceVulkan14Features rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bresenhamLines} field. */
    public VkPhysicalDeviceVulkan14Features bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code smoothLines} field. */
    public VkPhysicalDeviceVulkan14Features smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledRectangularLines} field. */
    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledBresenhamLines} field. */
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledSmoothLines} field. */
    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexAttributeInstanceRateDivisor} field. */
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexAttributeInstanceRateZeroDivisor} field. */
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code indexTypeUint8} field. */
    public VkPhysicalDeviceVulkan14Features indexTypeUint8(@NativeType("VkBool32") boolean value) { nindexTypeUint8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dynamicRenderingLocalRead} field. */
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maintenance5} field. */
    public VkPhysicalDeviceVulkan14Features maintenance5(@NativeType("VkBool32") boolean value) { nmaintenance5(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maintenance6} field. */
    public VkPhysicalDeviceVulkan14Features maintenance6(@NativeType("VkBool32") boolean value) { nmaintenance6(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pipelineProtectedAccess} field. */
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { npipelineProtectedAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pipelineRobustness} field. */
    public VkPhysicalDeviceVulkan14Features pipelineRobustness(@NativeType("VkBool32") boolean value) { npipelineRobustness(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code hostImageCopy} field. */
    public VkPhysicalDeviceVulkan14Features hostImageCopy(@NativeType("VkBool32") boolean value) { nhostImageCopy(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pushDescriptor} field. */
    public VkPhysicalDeviceVulkan14Features pushDescriptor(@NativeType("VkBool32") boolean value) { npushDescriptor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan14Features set(
        int sType,
        long pNext,
        boolean globalPriorityQuery,
        boolean shaderSubgroupRotate,
        boolean shaderSubgroupRotateClustered,
        boolean shaderFloatControls2,
        boolean shaderExpectAssume,
        boolean rectangularLines,
        boolean bresenhamLines,
        boolean smoothLines,
        boolean stippledRectangularLines,
        boolean stippledBresenhamLines,
        boolean stippledSmoothLines,
        boolean vertexAttributeInstanceRateDivisor,
        boolean vertexAttributeInstanceRateZeroDivisor,
        boolean indexTypeUint8,
        boolean dynamicRenderingLocalRead,
        boolean maintenance5,
        boolean maintenance6,
        boolean pipelineProtectedAccess,
        boolean pipelineRobustness,
        boolean hostImageCopy,
        boolean pushDescriptor
    ) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);
        shaderFloatControls2(shaderFloatControls2);
        shaderExpectAssume(shaderExpectAssume);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
        indexTypeUint8(indexTypeUint8);
        dynamicRenderingLocalRead(dynamicRenderingLocalRead);
        maintenance5(maintenance5);
        maintenance6(maintenance6);
        pipelineProtectedAccess(pipelineProtectedAccess);
        pipelineRobustness(pipelineRobustness);
        hostImageCopy(hostImageCopy);
        pushDescriptor(pushDescriptor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan14Features set(VkPhysicalDeviceVulkan14Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan14Features malloc() {
        return new VkPhysicalDeviceVulkan14Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan14Features calloc() {
        return new VkPhysicalDeviceVulkan14Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan14Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan14Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan14Features create(long address) {
        return new VkPhysicalDeviceVulkan14Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan14Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan14Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan14Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan14Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan14Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan14Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan14Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan14Features.PNEXT); }
    /** Unsafe version of {@link #globalPriorityQuery}. */
    public static int nglobalPriorityQuery(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY); }
    /** Unsafe version of {@link #shaderSubgroupRotate}. */
    public static int nshaderSubgroupRotate(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered}. */
    public static int nshaderSubgroupRotateClustered(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED); }
    /** Unsafe version of {@link #shaderFloatControls2}. */
    public static int nshaderFloatControls2(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2); }
    /** Unsafe version of {@link #shaderExpectAssume}. */
    public static int nshaderExpectAssume(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME); }
    /** Unsafe version of {@link #rectangularLines}. */
    public static int nrectangularLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.RECTANGULARLINES); }
    /** Unsafe version of {@link #bresenhamLines}. */
    public static int nbresenhamLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.BRESENHAMLINES); }
    /** Unsafe version of {@link #smoothLines}. */
    public static int nsmoothLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.SMOOTHLINES); }
    /** Unsafe version of {@link #stippledRectangularLines}. */
    public static int nstippledRectangularLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES); }
    /** Unsafe version of {@link #stippledBresenhamLines}. */
    public static int nstippledBresenhamLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES); }
    /** Unsafe version of {@link #stippledSmoothLines}. */
    public static int nstippledSmoothLines(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor}. */
    public static int nvertexAttributeInstanceRateDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor}. */
    public static int nvertexAttributeInstanceRateZeroDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR); }
    /** Unsafe version of {@link #indexTypeUint8}. */
    public static int nindexTypeUint8(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8); }
    /** Unsafe version of {@link #dynamicRenderingLocalRead}. */
    public static int ndynamicRenderingLocalRead(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD); }
    /** Unsafe version of {@link #maintenance5}. */
    public static int nmaintenance5(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE5); }
    /** Unsafe version of {@link #maintenance6}. */
    public static int nmaintenance6(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE6); }
    /** Unsafe version of {@link #pipelineProtectedAccess}. */
    public static int npipelineProtectedAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS); }
    /** Unsafe version of {@link #pipelineRobustness}. */
    public static int npipelineRobustness(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS); }
    /** Unsafe version of {@link #hostImageCopy}. */
    public static int nhostImageCopy(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY); }
    /** Unsafe version of {@link #pushDescriptor}. */
    public static int npushDescriptor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan14Features.PNEXT, value); }
    /** Unsafe version of {@link #globalPriorityQuery(boolean) globalPriorityQuery}. */
    public static void nglobalPriorityQuery(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.GLOBALPRIORITYQUERY, value); }
    /** Unsafe version of {@link #shaderSubgroupRotate(boolean) shaderSubgroupRotate}. */
    public static void nshaderSubgroupRotate(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATE, value); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered(boolean) shaderSubgroupRotateClustered}. */
    public static void nshaderSubgroupRotateClustered(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADERSUBGROUPROTATECLUSTERED, value); }
    /** Unsafe version of {@link #shaderFloatControls2(boolean) shaderFloatControls2}. */
    public static void nshaderFloatControls2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADERFLOATCONTROLS2, value); }
    /** Unsafe version of {@link #shaderExpectAssume(boolean) shaderExpectAssume}. */
    public static void nshaderExpectAssume(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SHADEREXPECTASSUME, value); }
    /** Unsafe version of {@link #rectangularLines(boolean) rectangularLines}. */
    public static void nrectangularLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.RECTANGULARLINES, value); }
    /** Unsafe version of {@link #bresenhamLines(boolean) bresenhamLines}. */
    public static void nbresenhamLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.BRESENHAMLINES, value); }
    /** Unsafe version of {@link #smoothLines(boolean) smoothLines}. */
    public static void nsmoothLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.SMOOTHLINES, value); }
    /** Unsafe version of {@link #stippledRectangularLines(boolean) stippledRectangularLines}. */
    public static void nstippledRectangularLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDRECTANGULARLINES, value); }
    /** Unsafe version of {@link #stippledBresenhamLines(boolean) stippledBresenhamLines}. */
    public static void nstippledBresenhamLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDBRESENHAMLINES, value); }
    /** Unsafe version of {@link #stippledSmoothLines(boolean) stippledSmoothLines}. */
    public static void nstippledSmoothLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.STIPPLEDSMOOTHLINES, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor(boolean) vertexAttributeInstanceRateDivisor}. */
    public static void nvertexAttributeInstanceRateDivisor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEDIVISOR, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor(boolean) vertexAttributeInstanceRateZeroDivisor}. */
    public static void nvertexAttributeInstanceRateZeroDivisor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, value); }
    /** Unsafe version of {@link #indexTypeUint8(boolean) indexTypeUint8}. */
    public static void nindexTypeUint8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.INDEXTYPEUINT8, value); }
    /** Unsafe version of {@link #dynamicRenderingLocalRead(boolean) dynamicRenderingLocalRead}. */
    public static void ndynamicRenderingLocalRead(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.DYNAMICRENDERINGLOCALREAD, value); }
    /** Unsafe version of {@link #maintenance5(boolean) maintenance5}. */
    public static void nmaintenance5(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE5, value); }
    /** Unsafe version of {@link #maintenance6(boolean) maintenance6}. */
    public static void nmaintenance6(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.MAINTENANCE6, value); }
    /** Unsafe version of {@link #pipelineProtectedAccess(boolean) pipelineProtectedAccess}. */
    public static void npipelineProtectedAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEPROTECTEDACCESS, value); }
    /** Unsafe version of {@link #pipelineRobustness(boolean) pipelineRobustness}. */
    public static void npipelineRobustness(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.PIPELINEROBUSTNESS, value); }
    /** Unsafe version of {@link #hostImageCopy(boolean) hostImageCopy}. */
    public static void nhostImageCopy(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.HOSTIMAGECOPY, value); }
    /** Unsafe version of {@link #pushDescriptor(boolean) pushDescriptor}. */
    public static void npushDescriptor(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Features.PUSHDESCRIPTOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan14Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan14Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan14Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan14Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan14Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan14Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan14Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan14Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan14Features.npNext(address()); }
        /** @return the value of the {@code globalPriorityQuery} field. */
        @NativeType("VkBool32")
        public boolean globalPriorityQuery() { return VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(address()) != 0; }
        /** @return the value of the {@code shaderSubgroupRotate} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotate() { return VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(address()) != 0; }
        /** @return the value of the {@code shaderSubgroupRotateClustered} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() { return VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(address()) != 0; }
        /** @return the value of the {@code shaderFloatControls2} field. */
        @NativeType("VkBool32")
        public boolean shaderFloatControls2() { return VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(address()) != 0; }
        /** @return the value of the {@code shaderExpectAssume} field. */
        @NativeType("VkBool32")
        public boolean shaderExpectAssume() { return VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(address()) != 0; }
        /** @return the value of the {@code rectangularLines} field. */
        @NativeType("VkBool32")
        public boolean rectangularLines() { return VkPhysicalDeviceVulkan14Features.nrectangularLines(address()) != 0; }
        /** @return the value of the {@code bresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean bresenhamLines() { return VkPhysicalDeviceVulkan14Features.nbresenhamLines(address()) != 0; }
        /** @return the value of the {@code smoothLines} field. */
        @NativeType("VkBool32")
        public boolean smoothLines() { return VkPhysicalDeviceVulkan14Features.nsmoothLines(address()) != 0; }
        /** @return the value of the {@code stippledRectangularLines} field. */
        @NativeType("VkBool32")
        public boolean stippledRectangularLines() { return VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(address()) != 0; }
        /** @return the value of the {@code stippledBresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() { return VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(address()) != 0; }
        /** @return the value of the {@code stippledSmoothLines} field. */
        @NativeType("VkBool32")
        public boolean stippledSmoothLines() { return VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(address()) != 0; }
        /** @return the value of the {@code vertexAttributeInstanceRateDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() { return VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(address()) != 0; }
        /** @return the value of the {@code vertexAttributeInstanceRateZeroDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() { return VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }
        /** @return the value of the {@code indexTypeUint8} field. */
        @NativeType("VkBool32")
        public boolean indexTypeUint8() { return VkPhysicalDeviceVulkan14Features.nindexTypeUint8(address()) != 0; }
        /** @return the value of the {@code dynamicRenderingLocalRead} field. */
        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalRead() { return VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(address()) != 0; }
        /** @return the value of the {@code maintenance5} field. */
        @NativeType("VkBool32")
        public boolean maintenance5() { return VkPhysicalDeviceVulkan14Features.nmaintenance5(address()) != 0; }
        /** @return the value of the {@code maintenance6} field. */
        @NativeType("VkBool32")
        public boolean maintenance6() { return VkPhysicalDeviceVulkan14Features.nmaintenance6(address()) != 0; }
        /** @return the value of the {@code pipelineProtectedAccess} field. */
        @NativeType("VkBool32")
        public boolean pipelineProtectedAccess() { return VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(address()) != 0; }
        /** @return the value of the {@code pipelineRobustness} field. */
        @NativeType("VkBool32")
        public boolean pipelineRobustness() { return VkPhysicalDeviceVulkan14Features.npipelineRobustness(address()) != 0; }
        /** @return the value of the {@code hostImageCopy} field. */
        @NativeType("VkBool32")
        public boolean hostImageCopy() { return VkPhysicalDeviceVulkan14Features.nhostImageCopy(address()) != 0; }
        /** @return the value of the {@code pushDescriptor} field. */
        @NativeType("VkBool32")
        public boolean pushDescriptor() { return VkPhysicalDeviceVulkan14Features.npushDescriptor(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Features.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan14Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code globalPriorityQuery} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSubgroupRotate} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSubgroupRotateClustered} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloatControls2} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderFloatControls2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderExpectAssume} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rectangularLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bresenhamLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code smoothLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledRectangularLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledBresenhamLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledSmoothLines} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexAttributeInstanceRateDivisor} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexAttributeInstanceRateZeroDivisor} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code indexTypeUint8} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nindexTypeUint8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dynamicRenderingLocalRead} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maintenance5} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer maintenance5(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nmaintenance5(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maintenance6} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer maintenance6(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nmaintenance6(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pipelineProtectedAccess} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pipelineRobustness} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.npipelineRobustness(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code hostImageCopy} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer hostImageCopy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.nhostImageCopy(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pushDescriptor} field. */
        public VkPhysicalDeviceVulkan14Features.Buffer pushDescriptor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan14Features.npushDescriptor(address(), value ? 1 : 0); return this; }

    }

}