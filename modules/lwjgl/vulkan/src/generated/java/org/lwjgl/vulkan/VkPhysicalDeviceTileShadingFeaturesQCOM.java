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
 * struct VkPhysicalDeviceTileShadingFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 tileShading;
 *     VkBool32 tileShadingFragmentStage;
 *     VkBool32 tileShadingColorAttachments;
 *     VkBool32 tileShadingDepthAttachments;
 *     VkBool32 tileShadingStencilAttachments;
 *     VkBool32 tileShadingInputAttachments;
 *     VkBool32 tileShadingSampledAttachments;
 *     VkBool32 tileShadingPerTileDraw;
 *     VkBool32 tileShadingPerTileDispatch;
 *     VkBool32 tileShadingDispatchTile;
 *     VkBool32 tileShadingApron;
 *     VkBool32 tileShadingAnisotropicApron;
 *     VkBool32 tileShadingAtomicOps;
 *     VkBool32 tileShadingImageProcessing;
 * }}</pre>
 */
public class VkPhysicalDeviceTileShadingFeaturesQCOM extends Struct<VkPhysicalDeviceTileShadingFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TILESHADING,
        TILESHADINGFRAGMENTSTAGE,
        TILESHADINGCOLORATTACHMENTS,
        TILESHADINGDEPTHATTACHMENTS,
        TILESHADINGSTENCILATTACHMENTS,
        TILESHADINGINPUTATTACHMENTS,
        TILESHADINGSAMPLEDATTACHMENTS,
        TILESHADINGPERTILEDRAW,
        TILESHADINGPERTILEDISPATCH,
        TILESHADINGDISPATCHTILE,
        TILESHADINGAPRON,
        TILESHADINGANISOTROPICAPRON,
        TILESHADINGATOMICOPS,
        TILESHADINGIMAGEPROCESSING;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILESHADING = layout.offsetof(2);
        TILESHADINGFRAGMENTSTAGE = layout.offsetof(3);
        TILESHADINGCOLORATTACHMENTS = layout.offsetof(4);
        TILESHADINGDEPTHATTACHMENTS = layout.offsetof(5);
        TILESHADINGSTENCILATTACHMENTS = layout.offsetof(6);
        TILESHADINGINPUTATTACHMENTS = layout.offsetof(7);
        TILESHADINGSAMPLEDATTACHMENTS = layout.offsetof(8);
        TILESHADINGPERTILEDRAW = layout.offsetof(9);
        TILESHADINGPERTILEDISPATCH = layout.offsetof(10);
        TILESHADINGDISPATCHTILE = layout.offsetof(11);
        TILESHADINGAPRON = layout.offsetof(12);
        TILESHADINGANISOTROPICAPRON = layout.offsetof(13);
        TILESHADINGATOMICOPS = layout.offsetof(14);
        TILESHADINGIMAGEPROCESSING = layout.offsetof(15);
    }

    protected VkPhysicalDeviceTileShadingFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTileShadingFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTileShadingFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code tileShading} field. */
    @NativeType("VkBool32")
    public boolean tileShading() { return ntileShading(address()) != 0; }
    /** @return the value of the {@code tileShadingFragmentStage} field. */
    @NativeType("VkBool32")
    public boolean tileShadingFragmentStage() { return ntileShadingFragmentStage(address()) != 0; }
    /** @return the value of the {@code tileShadingColorAttachments} field. */
    @NativeType("VkBool32")
    public boolean tileShadingColorAttachments() { return ntileShadingColorAttachments(address()) != 0; }
    /** @return the value of the {@code tileShadingDepthAttachments} field. */
    @NativeType("VkBool32")
    public boolean tileShadingDepthAttachments() { return ntileShadingDepthAttachments(address()) != 0; }
    /** @return the value of the {@code tileShadingStencilAttachments} field. */
    @NativeType("VkBool32")
    public boolean tileShadingStencilAttachments() { return ntileShadingStencilAttachments(address()) != 0; }
    /** @return the value of the {@code tileShadingInputAttachments} field. */
    @NativeType("VkBool32")
    public boolean tileShadingInputAttachments() { return ntileShadingInputAttachments(address()) != 0; }
    /** @return the value of the {@code tileShadingSampledAttachments} field. */
    @NativeType("VkBool32")
    public boolean tileShadingSampledAttachments() { return ntileShadingSampledAttachments(address()) != 0; }
    /** @return the value of the {@code tileShadingPerTileDraw} field. */
    @NativeType("VkBool32")
    public boolean tileShadingPerTileDraw() { return ntileShadingPerTileDraw(address()) != 0; }
    /** @return the value of the {@code tileShadingPerTileDispatch} field. */
    @NativeType("VkBool32")
    public boolean tileShadingPerTileDispatch() { return ntileShadingPerTileDispatch(address()) != 0; }
    /** @return the value of the {@code tileShadingDispatchTile} field. */
    @NativeType("VkBool32")
    public boolean tileShadingDispatchTile() { return ntileShadingDispatchTile(address()) != 0; }
    /** @return the value of the {@code tileShadingApron} field. */
    @NativeType("VkBool32")
    public boolean tileShadingApron() { return ntileShadingApron(address()) != 0; }
    /** @return the value of the {@code tileShadingAnisotropicApron} field. */
    @NativeType("VkBool32")
    public boolean tileShadingAnisotropicApron() { return ntileShadingAnisotropicApron(address()) != 0; }
    /** @return the value of the {@code tileShadingAtomicOps} field. */
    @NativeType("VkBool32")
    public boolean tileShadingAtomicOps() { return ntileShadingAtomicOps(address()) != 0; }
    /** @return the value of the {@code tileShadingImageProcessing} field. */
    @NativeType("VkBool32")
    public boolean tileShadingImageProcessing() { return ntileShadingImageProcessing(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tileShading} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShading(@NativeType("VkBool32") boolean value) { ntileShading(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingFragmentStage} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStage(@NativeType("VkBool32") boolean value) { ntileShadingFragmentStage(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingColorAttachments} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachments(@NativeType("VkBool32") boolean value) { ntileShadingColorAttachments(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingDepthAttachments} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachments(@NativeType("VkBool32") boolean value) { ntileShadingDepthAttachments(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingStencilAttachments} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachments(@NativeType("VkBool32") boolean value) { ntileShadingStencilAttachments(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingInputAttachments} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachments(@NativeType("VkBool32") boolean value) { ntileShadingInputAttachments(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingSampledAttachments} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachments(@NativeType("VkBool32") boolean value) { ntileShadingSampledAttachments(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingPerTileDraw} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDraw(@NativeType("VkBool32") boolean value) { ntileShadingPerTileDraw(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingPerTileDispatch} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatch(@NativeType("VkBool32") boolean value) { ntileShadingPerTileDispatch(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingDispatchTile} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTile(@NativeType("VkBool32") boolean value) { ntileShadingDispatchTile(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingApron} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApron(@NativeType("VkBool32") boolean value) { ntileShadingApron(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingAnisotropicApron} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApron(@NativeType("VkBool32") boolean value) { ntileShadingAnisotropicApron(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingAtomicOps} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOps(@NativeType("VkBool32") boolean value) { ntileShadingAtomicOps(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileShadingImageProcessing} field. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessing(@NativeType("VkBool32") boolean value) { ntileShadingImageProcessing(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTileShadingFeaturesQCOM set(
        int sType,
        long pNext,
        boolean tileShading,
        boolean tileShadingFragmentStage,
        boolean tileShadingColorAttachments,
        boolean tileShadingDepthAttachments,
        boolean tileShadingStencilAttachments,
        boolean tileShadingInputAttachments,
        boolean tileShadingSampledAttachments,
        boolean tileShadingPerTileDraw,
        boolean tileShadingPerTileDispatch,
        boolean tileShadingDispatchTile,
        boolean tileShadingApron,
        boolean tileShadingAnisotropicApron,
        boolean tileShadingAtomicOps,
        boolean tileShadingImageProcessing
    ) {
        sType(sType);
        pNext(pNext);
        tileShading(tileShading);
        tileShadingFragmentStage(tileShadingFragmentStage);
        tileShadingColorAttachments(tileShadingColorAttachments);
        tileShadingDepthAttachments(tileShadingDepthAttachments);
        tileShadingStencilAttachments(tileShadingStencilAttachments);
        tileShadingInputAttachments(tileShadingInputAttachments);
        tileShadingSampledAttachments(tileShadingSampledAttachments);
        tileShadingPerTileDraw(tileShadingPerTileDraw);
        tileShadingPerTileDispatch(tileShadingPerTileDispatch);
        tileShadingDispatchTile(tileShadingDispatchTile);
        tileShadingApron(tileShadingApron);
        tileShadingAnisotropicApron(tileShadingAnisotropicApron);
        tileShadingAtomicOps(tileShadingAtomicOps);
        tileShadingImageProcessing(tileShadingImageProcessing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTileShadingFeaturesQCOM set(VkPhysicalDeviceTileShadingFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM malloc() {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM calloc() {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTileShadingFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #tileShading}. */
    public static int ntileShading(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADING); }
    /** Unsafe version of {@link #tileShadingFragmentStage}. */
    public static int ntileShadingFragmentStage(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGFRAGMENTSTAGE); }
    /** Unsafe version of {@link #tileShadingColorAttachments}. */
    public static int ntileShadingColorAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGCOLORATTACHMENTS); }
    /** Unsafe version of {@link #tileShadingDepthAttachments}. */
    public static int ntileShadingDepthAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGDEPTHATTACHMENTS); }
    /** Unsafe version of {@link #tileShadingStencilAttachments}. */
    public static int ntileShadingStencilAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGSTENCILATTACHMENTS); }
    /** Unsafe version of {@link #tileShadingInputAttachments}. */
    public static int ntileShadingInputAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGINPUTATTACHMENTS); }
    /** Unsafe version of {@link #tileShadingSampledAttachments}. */
    public static int ntileShadingSampledAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGSAMPLEDATTACHMENTS); }
    /** Unsafe version of {@link #tileShadingPerTileDraw}. */
    public static int ntileShadingPerTileDraw(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGPERTILEDRAW); }
    /** Unsafe version of {@link #tileShadingPerTileDispatch}. */
    public static int ntileShadingPerTileDispatch(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGPERTILEDISPATCH); }
    /** Unsafe version of {@link #tileShadingDispatchTile}. */
    public static int ntileShadingDispatchTile(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGDISPATCHTILE); }
    /** Unsafe version of {@link #tileShadingApron}. */
    public static int ntileShadingApron(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGAPRON); }
    /** Unsafe version of {@link #tileShadingAnisotropicApron}. */
    public static int ntileShadingAnisotropicApron(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGANISOTROPICAPRON); }
    /** Unsafe version of {@link #tileShadingAtomicOps}. */
    public static int ntileShadingAtomicOps(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGATOMICOPS); }
    /** Unsafe version of {@link #tileShadingImageProcessing}. */
    public static int ntileShadingImageProcessing(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGIMAGEPROCESSING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #tileShading(boolean) tileShading}. */
    public static void ntileShading(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADING, value); }
    /** Unsafe version of {@link #tileShadingFragmentStage(boolean) tileShadingFragmentStage}. */
    public static void ntileShadingFragmentStage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGFRAGMENTSTAGE, value); }
    /** Unsafe version of {@link #tileShadingColorAttachments(boolean) tileShadingColorAttachments}. */
    public static void ntileShadingColorAttachments(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGCOLORATTACHMENTS, value); }
    /** Unsafe version of {@link #tileShadingDepthAttachments(boolean) tileShadingDepthAttachments}. */
    public static void ntileShadingDepthAttachments(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGDEPTHATTACHMENTS, value); }
    /** Unsafe version of {@link #tileShadingStencilAttachments(boolean) tileShadingStencilAttachments}. */
    public static void ntileShadingStencilAttachments(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGSTENCILATTACHMENTS, value); }
    /** Unsafe version of {@link #tileShadingInputAttachments(boolean) tileShadingInputAttachments}. */
    public static void ntileShadingInputAttachments(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGINPUTATTACHMENTS, value); }
    /** Unsafe version of {@link #tileShadingSampledAttachments(boolean) tileShadingSampledAttachments}. */
    public static void ntileShadingSampledAttachments(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGSAMPLEDATTACHMENTS, value); }
    /** Unsafe version of {@link #tileShadingPerTileDraw(boolean) tileShadingPerTileDraw}. */
    public static void ntileShadingPerTileDraw(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGPERTILEDRAW, value); }
    /** Unsafe version of {@link #tileShadingPerTileDispatch(boolean) tileShadingPerTileDispatch}. */
    public static void ntileShadingPerTileDispatch(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGPERTILEDISPATCH, value); }
    /** Unsafe version of {@link #tileShadingDispatchTile(boolean) tileShadingDispatchTile}. */
    public static void ntileShadingDispatchTile(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGDISPATCHTILE, value); }
    /** Unsafe version of {@link #tileShadingApron(boolean) tileShadingApron}. */
    public static void ntileShadingApron(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGAPRON, value); }
    /** Unsafe version of {@link #tileShadingAnisotropicApron(boolean) tileShadingAnisotropicApron}. */
    public static void ntileShadingAnisotropicApron(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGANISOTROPICAPRON, value); }
    /** Unsafe version of {@link #tileShadingAtomicOps(boolean) tileShadingAtomicOps}. */
    public static void ntileShadingAtomicOps(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGATOMICOPS, value); }
    /** Unsafe version of {@link #tileShadingImageProcessing(boolean) tileShadingImageProcessing}. */
    public static void ntileShadingImageProcessing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingFeaturesQCOM.TILESHADINGIMAGEPROCESSING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTileShadingFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileShadingFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTileShadingFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileShadingFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTileShadingFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTileShadingFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTileShadingFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTileShadingFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code tileShading} field. */
        @NativeType("VkBool32")
        public boolean tileShading() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShading(address()) != 0; }
        /** @return the value of the {@code tileShadingFragmentStage} field. */
        @NativeType("VkBool32")
        public boolean tileShadingFragmentStage() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingFragmentStage(address()) != 0; }
        /** @return the value of the {@code tileShadingColorAttachments} field. */
        @NativeType("VkBool32")
        public boolean tileShadingColorAttachments() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingColorAttachments(address()) != 0; }
        /** @return the value of the {@code tileShadingDepthAttachments} field. */
        @NativeType("VkBool32")
        public boolean tileShadingDepthAttachments() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDepthAttachments(address()) != 0; }
        /** @return the value of the {@code tileShadingStencilAttachments} field. */
        @NativeType("VkBool32")
        public boolean tileShadingStencilAttachments() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingStencilAttachments(address()) != 0; }
        /** @return the value of the {@code tileShadingInputAttachments} field. */
        @NativeType("VkBool32")
        public boolean tileShadingInputAttachments() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingInputAttachments(address()) != 0; }
        /** @return the value of the {@code tileShadingSampledAttachments} field. */
        @NativeType("VkBool32")
        public boolean tileShadingSampledAttachments() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingSampledAttachments(address()) != 0; }
        /** @return the value of the {@code tileShadingPerTileDraw} field. */
        @NativeType("VkBool32")
        public boolean tileShadingPerTileDraw() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDraw(address()) != 0; }
        /** @return the value of the {@code tileShadingPerTileDispatch} field. */
        @NativeType("VkBool32")
        public boolean tileShadingPerTileDispatch() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDispatch(address()) != 0; }
        /** @return the value of the {@code tileShadingDispatchTile} field. */
        @NativeType("VkBool32")
        public boolean tileShadingDispatchTile() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDispatchTile(address()) != 0; }
        /** @return the value of the {@code tileShadingApron} field. */
        @NativeType("VkBool32")
        public boolean tileShadingApron() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingApron(address()) != 0; }
        /** @return the value of the {@code tileShadingAnisotropicApron} field. */
        @NativeType("VkBool32")
        public boolean tileShadingAnisotropicApron() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAnisotropicApron(address()) != 0; }
        /** @return the value of the {@code tileShadingAtomicOps} field. */
        @NativeType("VkBool32")
        public boolean tileShadingAtomicOps() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAtomicOps(address()) != 0; }
        /** @return the value of the {@code tileShadingImageProcessing} field. */
        @NativeType("VkBool32")
        public boolean tileShadingImageProcessing() { return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingImageProcessing(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTileShadingFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTileShadingFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tileShading} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShading(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShading(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingFragmentStage} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingFragmentStage(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingFragmentStage(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingColorAttachments} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingColorAttachments(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingColorAttachments(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingDepthAttachments} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingDepthAttachments(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDepthAttachments(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingStencilAttachments} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingStencilAttachments(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingStencilAttachments(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingInputAttachments} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingInputAttachments(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingInputAttachments(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingSampledAttachments} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingSampledAttachments(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingSampledAttachments(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingPerTileDraw} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingPerTileDraw(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDraw(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingPerTileDispatch} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingPerTileDispatch(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDispatch(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingDispatchTile} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingDispatchTile(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDispatchTile(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingApron} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingApron(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingApron(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingAnisotropicApron} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingAnisotropicApron(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAnisotropicApron(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingAtomicOps} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingAtomicOps(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAtomicOps(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileShadingImageProcessing} field. */
        public VkPhysicalDeviceTileShadingFeaturesQCOM.Buffer tileShadingImageProcessing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingImageProcessing(address(), value ? 1 : 0); return this; }

    }

}