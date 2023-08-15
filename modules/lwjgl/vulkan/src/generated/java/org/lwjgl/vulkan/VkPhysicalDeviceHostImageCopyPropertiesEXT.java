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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure enumerating image layouts supported by an implementation for host memory copies.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>If {@code pCopyDstLayouts} is {@code NULL}, then the number of image layouts that are supported in {@link VkCopyMemoryToImageInfoEXT}{@code ::dstImageLayout} and {@link VkCopyImageToImageInfoEXT}{@code ::dstImageLayout} is returned in {@code copyDstLayoutCount}. Otherwise, {@code copyDstLayoutCount} <b>must</b> be set by the user to the number of elements in the {@code pCopyDstLayouts} array, and on return the variable is overwritten with the number of values actually written to {@code pCopyDstLayouts}. If the value of {@code copyDstLayoutCount} is less than the number of image layouts that are supported, at most {@code copyDstLayoutCount} values will be written to {@code pCopyDstLayouts}. The implementation <b>must</b> include the {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} image layout in {@code pCopyDstLayouts}.</p>
 * 
 * <p>If {@code pCopySrcLayouts} is {@code NULL}, then the number of image layouts that are supported in {@link VkCopyImageToMemoryInfoEXT}{@code ::srcImageLayout} and {@link VkCopyImageToImageInfoEXT}{@code ::srcImageLayout} is returned in {@code copySrcLayoutCount}. Otherwise, {@code copySrcLayoutCount} <b>must</b> be set by the user to the number of elements in the {@code pCopySrcLayouts} array, and on return the variable is overwritten with the number of values actually written to {@code pCopySrcLayouts}. If the value of {@code copySrcLayoutCount} is less than the number of image layouts that are supported, at most {@code copySrcLayoutCount} values will be written to {@code pCopySrcLayouts}. The implementation <b>must</b> include the {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} image layout in {@code pCopySrcLayouts}.</p>
 * 
 * <p>The {@code optimalTilingLayoutUUID} value can be used to ensure compatible data layouts when using the {@link EXTHostImageCopy#VK_HOST_IMAGE_COPY_MEMCPY_EXT HOST_IMAGE_COPY_MEMCPY_EXT} flag in {@link EXTHostImageCopy#vkCopyMemoryToImageEXT CopyMemoryToImageEXT} and {@link EXTHostImageCopy#vkCopyImageToMemoryEXT CopyImageToMemoryEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT}</li>
 * <li>If {@code copySrcLayoutCount} is not 0, and {@code pCopySrcLayouts} is not {@code NULL}, {@code pCopySrcLayouts} <b>must</b> be a valid pointer to an array of {@code copySrcLayoutCount} {@code VkImageLayout} values</li>
 * <li>If {@code copyDstLayoutCount} is not 0, and {@code pCopyDstLayouts} is not {@code NULL}, {@code pCopyDstLayouts} <b>must</b> be a valid pointer to an array of {@code copyDstLayoutCount} {@code VkImageLayout} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceHostImageCopyPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #copySrcLayoutCount};
 *     VkImageLayout * {@link #pCopySrcLayouts};
 *     uint32_t {@link #copyDstLayoutCount};
 *     VkImageLayout * {@link #pCopyDstLayouts};
 *     uint8_t {@link #optimalTilingLayoutUUID}[VK_UUID_SIZE];
 *     VkBool32 {@link #identicalMemoryTypeRequirements};
 * }</code></pre>
 */
public class VkPhysicalDeviceHostImageCopyPropertiesEXT extends Struct<VkPhysicalDeviceHostImageCopyPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COPYSRCLAYOUTCOUNT,
        PCOPYSRCLAYOUTS,
        COPYDSTLAYOUTCOUNT,
        PCOPYDSTLAYOUTS,
        OPTIMALTILINGLAYOUTUUID,
        IDENTICALMEMORYTYPEREQUIREMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COPYSRCLAYOUTCOUNT = layout.offsetof(2);
        PCOPYSRCLAYOUTS = layout.offsetof(3);
        COPYDSTLAYOUTCOUNT = layout.offsetof(4);
        PCOPYDSTLAYOUTS = layout.offsetof(5);
        OPTIMALTILINGLAYOUTUUID = layout.offsetof(6);
        IDENTICALMEMORYTYPEREQUIREMENTS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceHostImageCopyPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceHostImageCopyPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an integer related to the number of image layouts for host copies from images available or queried, as described below. */
    @NativeType("uint32_t")
    public int copySrcLayoutCount() { return ncopySrcLayoutCount(address()); }
    /** a pointer to an array of {@code VkImageLayout} in which supported image layouts for use with host copy operations from images are returned. */
    @Nullable
    @NativeType("VkImageLayout *")
    public IntBuffer pCopySrcLayouts() { return npCopySrcLayouts(address()); }
    /** an integer related to the number of image layouts for host copies to images available or queried, as described below. */
    @NativeType("uint32_t")
    public int copyDstLayoutCount() { return ncopyDstLayoutCount(address()); }
    /** a pointer to an array of {@code VkImageLayout} in which supported image layouts for use with host copy operations to images are returned. */
    @Nullable
    @NativeType("VkImageLayout *")
    public IntBuffer pCopyDstLayouts() { return npCopyDstLayouts(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the implementation’s swizzling layout of images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer optimalTilingLayoutUUID() { return noptimalTilingLayoutUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the implementation’s swizzling layout of images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}. */
    @NativeType("uint8_t")
    public byte optimalTilingLayoutUUID(int index) { return noptimalTilingLayoutUUID(address(), index); }
    /** indicates that specifying the {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT} flag in {@link VkImageCreateInfo}{@code ::usage} does not affect the memory type requirements of the image. */
    @NativeType("VkBool32")
    public boolean identicalMemoryTypeRequirements() { return nidenticalMemoryTypeRequirements(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #copySrcLayoutCount} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copySrcLayoutCount(@NativeType("uint32_t") int value) { ncopySrcLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCopySrcLayouts} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopySrcLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { npCopySrcLayouts(address(), value); return this; }
    /** Sets the specified value to the {@link #copyDstLayoutCount} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copyDstLayoutCount(@NativeType("uint32_t") int value) { ncopyDstLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCopyDstLayouts} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopyDstLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { npCopyDstLayouts(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #optimalTilingLayoutUUID} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { noptimalTilingLayoutUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #optimalTilingLayoutUUID} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) { noptimalTilingLayoutUUID(address(), index, value); return this; }
    /** Sets the specified value to the {@link #identicalMemoryTypeRequirements} field. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) { nidenticalMemoryTypeRequirements(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT set(
        int sType,
        long pNext,
        int copySrcLayoutCount,
        @Nullable IntBuffer pCopySrcLayouts,
        int copyDstLayoutCount,
        @Nullable IntBuffer pCopyDstLayouts,
        ByteBuffer optimalTilingLayoutUUID,
        boolean identicalMemoryTypeRequirements
    ) {
        sType(sType);
        pNext(pNext);
        copySrcLayoutCount(copySrcLayoutCount);
        pCopySrcLayouts(pCopySrcLayouts);
        copyDstLayoutCount(copyDstLayoutCount);
        pCopyDstLayouts(pCopyDstLayouts);
        optimalTilingLayoutUUID(optimalTilingLayoutUUID);
        identicalMemoryTypeRequirements(identicalMemoryTypeRequirements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT set(VkPhysicalDeviceHostImageCopyPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT malloc() {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT calloc() {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT create(long address) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #copySrcLayoutCount}. */
    public static int ncopySrcLayoutCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.COPYSRCLAYOUTCOUNT); }
    /** Unsafe version of {@link #pCopySrcLayouts() pCopySrcLayouts}. */
    @Nullable public static IntBuffer npCopySrcLayouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.PCOPYSRCLAYOUTS), ncopySrcLayoutCount(struct)); }
    /** Unsafe version of {@link #copyDstLayoutCount}. */
    public static int ncopyDstLayoutCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.COPYDSTLAYOUTCOUNT); }
    /** Unsafe version of {@link #pCopyDstLayouts() pCopyDstLayouts}. */
    @Nullable public static IntBuffer npCopyDstLayouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.PCOPYDSTLAYOUTS), ncopyDstLayoutCount(struct)); }
    /** Unsafe version of {@link #optimalTilingLayoutUUID}. */
    public static ByteBuffer noptimalTilingLayoutUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.OPTIMALTILINGLAYOUTUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(int) optimalTilingLayoutUUID}. */
    public static byte noptimalTilingLayoutUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.OPTIMALTILINGLAYOUTUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #identicalMemoryTypeRequirements}. */
    public static int nidenticalMemoryTypeRequirements(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.IDENTICALMEMORYTYPEREQUIREMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.PNEXT, value); }
    /** Sets the specified value to the {@code copySrcLayoutCount} field of the specified {@code struct}. */
    public static void ncopySrcLayoutCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.COPYSRCLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pCopySrcLayouts(IntBuffer) pCopySrcLayouts}. */
    public static void npCopySrcLayouts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.PCOPYSRCLAYOUTS, memAddressSafe(value)); if (value != null) { ncopySrcLayoutCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code copyDstLayoutCount} field of the specified {@code struct}. */
    public static void ncopyDstLayoutCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.COPYDSTLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pCopyDstLayouts(IntBuffer) pCopyDstLayouts}. */
    public static void npCopyDstLayouts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.PCOPYDSTLAYOUTS, memAddressSafe(value)); if (value != null) { ncopyDstLayoutCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(ByteBuffer) optimalTilingLayoutUUID}. */
    public static void noptimalTilingLayoutUUID(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_UUID_SIZE); }
        memCopy(memAddress(value), struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.OPTIMALTILINGLAYOUTUUID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(int, byte) optimalTilingLayoutUUID}. */
    public static void noptimalTilingLayoutUUID(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.OPTIMALTILINGLAYOUTUUID + check(index, VK_UUID_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #identicalMemoryTypeRequirements(boolean) identicalMemoryTypeRequirements}. */
    public static void nidenticalMemoryTypeRequirements(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostImageCopyPropertiesEXT.IDENTICALMEMORYTYPEREQUIREMENTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHostImageCopyPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostImageCopyPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceHostImageCopyPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceHostImageCopyPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#copySrcLayoutCount} field. */
        @NativeType("uint32_t")
        public int copySrcLayoutCount() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopySrcLayoutCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#pCopySrcLayouts} field. */
        @Nullable
        @NativeType("VkImageLayout *")
        public IntBuffer pCopySrcLayouts() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopySrcLayouts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#copyDstLayoutCount} field. */
        @NativeType("uint32_t")
        public int copyDstLayoutCount() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopyDstLayoutCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#pCopyDstLayouts} field. */
        @Nullable
        @NativeType("VkImageLayout *")
        public IntBuffer pCopyDstLayouts() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopyDstLayouts(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#optimalTilingLayoutUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer optimalTilingLayoutUUID() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#optimalTilingLayoutUUID} field. */
        @NativeType("uint8_t")
        public byte optimalTilingLayoutUUID(int index) { return VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#identicalMemoryTypeRequirements} field. */
        @NativeType("VkBool32")
        public boolean identicalMemoryTypeRequirements() { return VkPhysicalDeviceHostImageCopyPropertiesEXT.nidenticalMemoryTypeRequirements(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#sType} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#sType} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#copySrcLayoutCount} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer copySrcLayoutCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopySrcLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#pCopySrcLayouts} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer pCopySrcLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopySrcLayouts(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#copyDstLayoutCount} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer copyDstLayoutCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopyDstLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#pCopyDstLayouts} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer pCopyDstLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopyDstLayouts(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#optimalTilingLayoutUUID} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#optimalTilingLayoutUUID} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), index, value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#identicalMemoryTypeRequirements} field. */
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.nidenticalMemoryTypeRequirements(address(), value ? 1 : 0); return this; }

    }

}