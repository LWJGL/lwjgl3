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
 * Structure specifying parameters of a newly created video decode session.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pVideoProfile} <b>must</b> be a pointer to a valid {@link VkVideoProfileKHR} structure whose {@code pNext} chain <b>must</b> include a valid codec-specific profile structure</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> are required for use with the created video session, the {@code maxReferencePicturesSlotsCount} <b>must</b> be set to a value bigger than 0</li>
 * <li>{@code maxReferencePicturesSlotsCount} <b>cannot</b> exceed the implementation reported {@link VkVideoCapabilitiesKHR}{@code ::maxReferencePicturesSlotsCount}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> are required for use with the created video session, the {@code maxReferencePicturesActiveCount} <b>must</b> be set to a value bigger than 0</li>
 * <li>{@code maxReferencePicturesActiveCount} <b>cannot</b> exceed the implementation reported {@link VkVideoCapabilitiesKHR}{@code ::maxReferencePicturesActiveCount}</li>
 * <li>{@code maxReferencePicturesActiveCount} <b>cannot</b> exceed the {@code maxReferencePicturesSlotsCount}</li>
 * <li>{@code maxCodedExtent} <b>cannot</b> be smaller than {@link VkVideoCapabilitiesKHR}{@code ::minExtent} and bigger than {@link VkVideoCapabilitiesKHR}{@code ::maxExtent}</li>
 * <li>{@code referencePicturesFormat} <b>must</b> be one of the supported formats in {@link VkVideoFormatPropertiesKHR} {@code format} returned by the {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} when the {@link VkPhysicalDeviceVideoFormatInfoKHR} {@code imageUsage} contains {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR} or {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR} depending on the session codec operation</li>
 * <li>{@code pictureFormat} for decode output <b>must</b> be one of the supported formats in {@link VkVideoFormatPropertiesKHR} {@code format} returned by the {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} when the {@link VkPhysicalDeviceVideoFormatInfoKHR} {@code imageUsage} contains {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}</li>
 * <li>{@code pictureFormat} targeting encode operations <b>must</b> be one of the supported formats in {@link VkVideoFormatPropertiesKHR} {@code format} returned by the {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} when the {@link VkPhysicalDeviceVideoFormatInfoKHR} {@code imageUsage} contains {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264SessionCreateInfoEXT}, {@link VkVideoDecodeH265SessionCreateInfoEXT}, {@link VkVideoEncodeH264SessionCreateInfoEXT}, or {@link VkVideoEncodeH265SessionCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoSessionCreateFlagBitsKHR} values</li>
 * <li>{@code pVideoProfile} <b>must</b> be a valid pointer to a valid {@link VkVideoProfileKHR} structure</li>
 * <li>{@code pictureFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code referencePicturesFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkVideoProfileKHR}, {@link KHRVideoQueue#vkCreateVideoSessionKHR CreateVideoSessionKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoSessionCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #queueFamilyIndex};
 *     VkVideoSessionCreateFlagsKHR {@link #flags};
 *     {@link VkVideoProfileKHR VkVideoProfileKHR} const * {@link #pVideoProfile};
 *     VkFormat {@link #pictureFormat};
 *     {@link VkExtent2D VkExtent2D} {@link #maxCodedExtent};
 *     VkFormat {@link #referencePicturesFormat};
 *     uint32_t {@link #maxReferencePicturesSlotsCount};
 *     uint32_t {@link #maxReferencePicturesActiveCount};
 * }</code></pre>
 */
public class VkVideoSessionCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUEFAMILYINDEX,
        FLAGS,
        PVIDEOPROFILE,
        PICTUREFORMAT,
        MAXCODEDEXTENT,
        REFERENCEPICTURESFORMAT,
        MAXREFERENCEPICTURESSLOTSCOUNT,
        MAXREFERENCEPICTURESACTIVECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        PVIDEOPROFILE = layout.offsetof(4);
        PICTUREFORMAT = layout.offsetof(5);
        MAXCODEDEXTENT = layout.offsetof(6);
        REFERENCEPICTURESFORMAT = layout.offsetof(7);
        MAXREFERENCEPICTURESSLOTSCOUNT = layout.offsetof(8);
        MAXREFERENCEPICTURESACTIVECOUNT = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkVideoSessionCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoSessionCreateInfoKHR(ByteBuffer container) {
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
    /** the queue family of the created video session. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** a bitmask of {@code VkVideoSessionCreateFlagBitsKHR} specifying creation flags. */
    @NativeType("VkVideoSessionCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a pointer to a {@link VkVideoProfileKHR} structure. */
    @NativeType("VkVideoProfileKHR const *")
    public VkVideoProfileKHR pVideoProfile() { return npVideoProfile(address()); }
    /** the format of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">image views</a> representing decoded <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#decoded-output-picture">Output</a> or encoded <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#input-encode-picture">Input</a> pictures. */
    @NativeType("VkFormat")
    public int pictureFormat() { return npictureFormat(address()); }
    /** the maximum width and height of the coded pictures that this instance will be able to support. */
    public VkExtent2D maxCodedExtent() { return nmaxCodedExtent(address()); }
    /** the format of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#dpb">DPB</a> image views representing the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a>. */
    @NativeType("VkFormat")
    public int referencePicturesFormat() { return nreferencePicturesFormat(address()); }
    /** the maximum number of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB Slots</a> that can be activated with associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">Video Picture Resources</a> for the created video session. */
    @NativeType("uint32_t")
    public int maxReferencePicturesSlotsCount() { return nmaxReferencePicturesSlotsCount(address()); }
    /** the maximum number of active <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB Slots</a> that can be used as Dpb or Reconstructed <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> within a single decode or encode operation for the created video session. */
    @NativeType("uint32_t")
    public int maxReferencePicturesActiveCount() { return nmaxReferencePicturesActiveCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoSessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoSessionCreateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoSessionCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264SessionCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoDecodeH264SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265SessionCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoDecodeH265SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264SessionCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeH264SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265SessionCreateInfoEXT} value to the {@code pNext} chain. */
    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeH265SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #queueFamilyIndex} field. */
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoSessionCreateInfoKHR flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoProfileKHR} to the {@link #pVideoProfile} field. */
    public VkVideoSessionCreateInfoKHR pVideoProfile(@NativeType("VkVideoProfileKHR const *") VkVideoProfileKHR value) { npVideoProfile(address(), value); return this; }
    /** Sets the specified value to the {@link #pictureFormat} field. */
    public VkVideoSessionCreateInfoKHR pictureFormat(@NativeType("VkFormat") int value) { npictureFormat(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #maxCodedExtent} field. */
    public VkVideoSessionCreateInfoKHR maxCodedExtent(VkExtent2D value) { nmaxCodedExtent(address(), value); return this; }
    /** Passes the {@link #maxCodedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoSessionCreateInfoKHR maxCodedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxCodedExtent()); return this; }
    /** Sets the specified value to the {@link #referencePicturesFormat} field. */
    public VkVideoSessionCreateInfoKHR referencePicturesFormat(@NativeType("VkFormat") int value) { nreferencePicturesFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #maxReferencePicturesSlotsCount} field. */
    public VkVideoSessionCreateInfoKHR maxReferencePicturesSlotsCount(@NativeType("uint32_t") int value) { nmaxReferencePicturesSlotsCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxReferencePicturesActiveCount} field. */
    public VkVideoSessionCreateInfoKHR maxReferencePicturesActiveCount(@NativeType("uint32_t") int value) { nmaxReferencePicturesActiveCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionCreateInfoKHR set(
        int sType,
        long pNext,
        int queueFamilyIndex,
        int flags,
        VkVideoProfileKHR pVideoProfile,
        int pictureFormat,
        VkExtent2D maxCodedExtent,
        int referencePicturesFormat,
        int maxReferencePicturesSlotsCount,
        int maxReferencePicturesActiveCount
    ) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        flags(flags);
        pVideoProfile(pVideoProfile);
        pictureFormat(pictureFormat);
        maxCodedExtent(maxCodedExtent);
        referencePicturesFormat(referencePicturesFormat);
        maxReferencePicturesSlotsCount(maxReferencePicturesSlotsCount);
        maxReferencePicturesActiveCount(maxReferencePicturesActiveCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoSessionCreateInfoKHR set(VkVideoSessionCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoSessionCreateInfoKHR malloc() {
        return wrap(VkVideoSessionCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoSessionCreateInfoKHR calloc() {
        return wrap(VkVideoSessionCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoSessionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoSessionCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoSessionCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoSessionCreateInfoKHR create(long address) {
        return wrap(VkVideoSessionCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoSessionCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoSessionCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoSessionCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoSessionCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoSessionCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoSessionCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoSessionCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoSessionCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoSessionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoSessionCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoSessionCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #pVideoProfile}. */
    public static VkVideoProfileKHR npVideoProfile(long struct) { return VkVideoProfileKHR.create(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE)); }
    /** Unsafe version of {@link #pictureFormat}. */
    public static int npictureFormat(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.PICTUREFORMAT); }
    /** Unsafe version of {@link #maxCodedExtent}. */
    public static VkExtent2D nmaxCodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT); }
    /** Unsafe version of {@link #referencePicturesFormat}. */
    public static int nreferencePicturesFormat(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.REFERENCEPICTURESFORMAT); }
    /** Unsafe version of {@link #maxReferencePicturesSlotsCount}. */
    public static int nmaxReferencePicturesSlotsCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.MAXREFERENCEPICTURESSLOTSCOUNT); }
    /** Unsafe version of {@link #maxReferencePicturesActiveCount}. */
    public static int nmaxReferencePicturesActiveCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.MAXREFERENCEPICTURESACTIVECOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #pVideoProfile(VkVideoProfileKHR) pVideoProfile}. */
    public static void npVideoProfile(long struct, VkVideoProfileKHR value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE, value.address()); }
    /** Unsafe version of {@link #pictureFormat(int) pictureFormat}. */
    public static void npictureFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.PICTUREFORMAT, value); }
    /** Unsafe version of {@link #maxCodedExtent(VkExtent2D) maxCodedExtent}. */
    public static void nmaxCodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #referencePicturesFormat(int) referencePicturesFormat}. */
    public static void nreferencePicturesFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.REFERENCEPICTURESFORMAT, value); }
    /** Unsafe version of {@link #maxReferencePicturesSlotsCount(int) maxReferencePicturesSlotsCount}. */
    public static void nmaxReferencePicturesSlotsCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.MAXREFERENCEPICTURESSLOTSCOUNT, value); }
    /** Unsafe version of {@link #maxReferencePicturesActiveCount(int) maxReferencePicturesActiveCount}. */
    public static void nmaxReferencePicturesActiveCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.MAXREFERENCEPICTURESACTIVECOUNT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE));
    }

    // -----------------------------------

    /** An array of {@link VkVideoSessionCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoSessionCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoSessionCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoSessionCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoSessionCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoSessionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoSessionCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoSessionCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#flags} field. */
        @NativeType("VkVideoSessionCreateFlagsKHR")
        public int flags() { return VkVideoSessionCreateInfoKHR.nflags(address()); }
        /** @return a {@link VkVideoProfileKHR} view of the struct pointed to by the {@link VkVideoSessionCreateInfoKHR#pVideoProfile} field. */
        @NativeType("VkVideoProfileKHR const *")
        public VkVideoProfileKHR pVideoProfile() { return VkVideoSessionCreateInfoKHR.npVideoProfile(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#pictureFormat} field. */
        @NativeType("VkFormat")
        public int pictureFormat() { return VkVideoSessionCreateInfoKHR.npictureFormat(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoSessionCreateInfoKHR#maxCodedExtent} field. */
        public VkExtent2D maxCodedExtent() { return VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#referencePicturesFormat} field. */
        @NativeType("VkFormat")
        public int referencePicturesFormat() { return VkVideoSessionCreateInfoKHR.nreferencePicturesFormat(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#maxReferencePicturesSlotsCount} field. */
        @NativeType("uint32_t")
        public int maxReferencePicturesSlotsCount() { return VkVideoSessionCreateInfoKHR.nmaxReferencePicturesSlotsCount(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#maxReferencePicturesActiveCount} field. */
        @NativeType("uint32_t")
        public int maxReferencePicturesActiveCount() { return VkVideoSessionCreateInfoKHR.nmaxReferencePicturesActiveCount(address()); }

        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#sType} field. */
        public VkVideoSessionCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR} value to the {@link VkVideoSessionCreateInfoKHR#sType} field. */
        public VkVideoSessionCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#pNext} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264SessionCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoDecodeH264SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265SessionCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoDecodeH265SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264SessionCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeH264SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265SessionCreateInfoEXT} value to the {@code pNext} chain. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(VkVideoEncodeH265SessionCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#queueFamilyIndex} field. */
        public VkVideoSessionCreateInfoKHR.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#flags} field. */
        public VkVideoSessionCreateInfoKHR.Buffer flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) { VkVideoSessionCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoProfileKHR} to the {@link VkVideoSessionCreateInfoKHR#pVideoProfile} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pVideoProfile(@NativeType("VkVideoProfileKHR const *") VkVideoProfileKHR value) { VkVideoSessionCreateInfoKHR.npVideoProfile(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#pictureFormat} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pictureFormat(@NativeType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.npictureFormat(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoSessionCreateInfoKHR#maxCodedExtent} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(VkExtent2D value) { VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address(), value); return this; }
        /** Passes the {@link VkVideoSessionCreateInfoKHR#maxCodedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxCodedExtent()); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#referencePicturesFormat} field. */
        public VkVideoSessionCreateInfoKHR.Buffer referencePicturesFormat(@NativeType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.nreferencePicturesFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#maxReferencePicturesSlotsCount} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxReferencePicturesSlotsCount(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nmaxReferencePicturesSlotsCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#maxReferencePicturesActiveCount} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxReferencePicturesActiveCount(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nmaxReferencePicturesActiveCount(address(), value); return this; }

    }

}