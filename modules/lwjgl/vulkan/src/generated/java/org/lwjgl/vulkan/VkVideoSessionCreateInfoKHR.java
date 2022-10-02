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
 * <li>{@code pVideoProfile} <b>must</b> be a pointer to a valid {@link VkVideoProfileInfoKHR} structure whose {@code pNext} chain <b>must</b> include a valid codec-specific profile structure</li>
 * <li>If <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> are required for use with the created video session, the {@code maxDpbSlots} <b>must</b> be set to a value bigger than 0</li>
 * <li>{@code maxDpbSlots} <b>cannot</b> exceed the implementation reported {@link VkVideoCapabilitiesKHR}{@code ::maxDpbSlots}</li>
 * <li>If <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> are required for use with the created video session, the {@code maxActiveReferencePictures} <b>must</b> be set to a value bigger than 0</li>
 * <li>{@code maxActiveReferencePictures} <b>cannot</b> exceed the implementation reported {@link VkVideoCapabilitiesKHR}{@code ::maxActiveReferencePictures}</li>
 * <li>{@code maxActiveReferencePictures} <b>cannot</b> exceed the {@code maxDpbSlots}</li>
 * <li>{@code maxCodedExtent} <b>cannot</b> be smaller than {@link VkVideoCapabilitiesKHR}{@code ::minExtent} and bigger than {@link VkVideoCapabilitiesKHR}{@code ::maxExtent}</li>
 * <li>If the {@code videoCodecOperation} member of {@code pVideoProfile} specifies a decode operation then {@code referencePicturesFormat} <b>must</b> be one of the supported decode DPB formats as reported by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} in the {@code format} member of {@link VkVideoFormatPropertiesKHR} when called with the {@code imageUsage} member of its {@code pVideoFormatInfo} parameter containing {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}, and with a {@link VkVideoProfileListInfoKHR} structure chained to its {@code pVideoFormatInfo} parameter whose {@code pProfiles} member contains an entry matching {@code pVideoProfile}</li>
 * <li>If the {@code videoCodecOperation} member of {@code pVideoProfile} specifies an encode operation then {@code referencePicturesFormat} <b>must</b> be one of the supported encode DPB formats as reported by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} in the {@code format} member of {@link VkVideoFormatPropertiesKHR} when called with the {@code imageUsage} member of its {@code pVideoFormatInfo} parameter containing {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}, and with a {@link VkVideoProfileListInfoKHR} structure chained to its {@code pVideoFormatInfo} parameter whose {@code pProfiles} member contains an entry matching {@code pVideoProfile}</li>
 * <li>If the {@code videoCodecOperation} member of {@code pVideoProfile} specifies a decode operation then {@code pictureFormat} <b>must</b> be one of the supported decode output formats as reported by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} in the {@code format} member of {@link VkVideoFormatPropertiesKHR} when called with the {@code imageUsage} member of its {@code pVideoFormatInfo} parameter containing {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR}, and with a {@link VkVideoProfileListInfoKHR} structure chained to its {@code pVideoFormatInfo} parameter whose {@code pProfiles} member contains an entry matching {@code pVideoProfile}</li>
 * <li>If the {@code videoCodecOperation} member of {@code pVideoProfile} specifies an encode operation then {@code pictureFormat} <b>must</b> be one of the supported encode input formats as reported by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} in the {@code format} member of {@link VkVideoFormatPropertiesKHR} when called with the {@code imageUsage} member of its {@code pVideoFormatInfo} parameter containing {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR}, and with a {@link VkVideoProfileListInfoKHR} structure chained to its {@code pVideoFormatInfo} parameter whose {@code pProfiles} member contains an entry matching {@code pVideoProfile}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoSessionCreateFlagBitsKHR} values</li>
 * <li>{@code pVideoProfile} <b>must</b> be a valid pointer to a valid {@link VkVideoProfileInfoKHR} structure</li>
 * <li>{@code pictureFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code referencePictureFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code pStdHeaderVersion} <b>must</b> be a valid pointer to a valid {@link VkExtensionProperties} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}, {@link VkExtent2D}, {@link VkVideoProfileInfoKHR}, {@link KHRVideoQueue#vkCreateVideoSessionKHR CreateVideoSessionKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoSessionCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #queueFamilyIndex};
 *     VkVideoSessionCreateFlagsKHR {@link #flags};
 *     {@link VkVideoProfileInfoKHR VkVideoProfileInfoKHR} const * {@link #pVideoProfile};
 *     VkFormat {@link #pictureFormat};
 *     {@link VkExtent2D VkExtent2D} {@link #maxCodedExtent};
 *     VkFormat referencePictureFormat;
 *     uint32_t {@link #maxDpbSlots};
 *     uint32_t {@link #maxActiveReferencePictures};
 *     {@link VkExtensionProperties VkExtensionProperties} const * {@link #pStdHeaderVersion};
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
        REFERENCEPICTUREFORMAT,
        MAXDPBSLOTS,
        MAXACTIVEREFERENCEPICTURES,
        PSTDHEADERVERSION;

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
            __member(4),
            __member(POINTER_SIZE)
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
        REFERENCEPICTUREFORMAT = layout.offsetof(7);
        MAXDPBSLOTS = layout.offsetof(8);
        MAXACTIVEREFERENCEPICTURES = layout.offsetof(9);
        PSTDHEADERVERSION = layout.offsetof(10);
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
    /** a pointer to a {@link VkVideoProfileInfoKHR} structure. */
    @NativeType("VkVideoProfileInfoKHR const *")
    public VkVideoProfileInfoKHR pVideoProfile() { return npVideoProfile(address()); }
    /** the format of the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">image views</a> representing decoded <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decoded-output-picture">Output</a> or encoded <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-input-picture">Input</a> pictures. */
    @NativeType("VkFormat")
    public int pictureFormat() { return npictureFormat(address()); }
    /** the maximum width and height of the coded pictures that this instance will be able to support. */
    public VkExtent2D maxCodedExtent() { return nmaxCodedExtent(address()); }
    /** @return the value of the {@code referencePictureFormat} field. */
    @NativeType("VkFormat")
    public int referencePictureFormat() { return nreferencePictureFormat(address()); }
    /** the maximum number of <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB Slots</a> that can be activated with associated <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resources">Video Picture Resources</a> for the created video session. */
    @NativeType("uint32_t")
    public int maxDpbSlots() { return nmaxDpbSlots(address()); }
    /** the maximum number of active <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB Slots</a> that can be used as Dpb or Reconstructed <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">Reference Pictures</a> within a single decode or encode operation for the created video session. */
    @NativeType("uint32_t")
    public int maxActiveReferencePictures() { return nmaxActiveReferencePictures(address()); }
    /** a pointer to a {@link VkExtensionProperties} structure requesting the Video Std header version to use for {@code codecOperation} in {@code pVideoProfile}. */
    @NativeType("VkExtensionProperties const *")
    public VkExtensionProperties pStdHeaderVersion() { return npStdHeaderVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoSessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoSessionCreateInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoSessionCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndex} field. */
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoSessionCreateInfoKHR flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoProfileInfoKHR} to the {@link #pVideoProfile} field. */
    public VkVideoSessionCreateInfoKHR pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) { npVideoProfile(address(), value); return this; }
    /** Sets the specified value to the {@link #pictureFormat} field. */
    public VkVideoSessionCreateInfoKHR pictureFormat(@NativeType("VkFormat") int value) { npictureFormat(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #maxCodedExtent} field. */
    public VkVideoSessionCreateInfoKHR maxCodedExtent(VkExtent2D value) { nmaxCodedExtent(address(), value); return this; }
    /** Passes the {@link #maxCodedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoSessionCreateInfoKHR maxCodedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxCodedExtent()); return this; }
    /** Sets the specified value to the {@code referencePictureFormat} field. */
    public VkVideoSessionCreateInfoKHR referencePictureFormat(@NativeType("VkFormat") int value) { nreferencePictureFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #maxDpbSlots} field. */
    public VkVideoSessionCreateInfoKHR maxDpbSlots(@NativeType("uint32_t") int value) { nmaxDpbSlots(address(), value); return this; }
    /** Sets the specified value to the {@link #maxActiveReferencePictures} field. */
    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(@NativeType("uint32_t") int value) { nmaxActiveReferencePictures(address(), value); return this; }
    /** Sets the address of the specified {@link VkExtensionProperties} to the {@link #pStdHeaderVersion} field. */
    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { npStdHeaderVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoSessionCreateInfoKHR set(
        int sType,
        long pNext,
        int queueFamilyIndex,
        int flags,
        VkVideoProfileInfoKHR pVideoProfile,
        int pictureFormat,
        VkExtent2D maxCodedExtent,
        int referencePictureFormat,
        int maxDpbSlots,
        int maxActiveReferencePictures,
        VkExtensionProperties pStdHeaderVersion
    ) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        flags(flags);
        pVideoProfile(pVideoProfile);
        pictureFormat(pictureFormat);
        maxCodedExtent(maxCodedExtent);
        referencePictureFormat(referencePictureFormat);
        maxDpbSlots(maxDpbSlots);
        maxActiveReferencePictures(maxActiveReferencePictures);
        pStdHeaderVersion(pStdHeaderVersion);

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
    public static VkVideoProfileInfoKHR npVideoProfile(long struct) { return VkVideoProfileInfoKHR.create(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE)); }
    /** Unsafe version of {@link #pictureFormat}. */
    public static int npictureFormat(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.PICTUREFORMAT); }
    /** Unsafe version of {@link #maxCodedExtent}. */
    public static VkExtent2D nmaxCodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT); }
    /** Unsafe version of {@link #referencePictureFormat}. */
    public static int nreferencePictureFormat(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT); }
    /** Unsafe version of {@link #maxDpbSlots}. */
    public static int nmaxDpbSlots(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.MAXDPBSLOTS); }
    /** Unsafe version of {@link #maxActiveReferencePictures}. */
    public static int nmaxActiveReferencePictures(long struct) { return UNSAFE.getInt(null, struct + VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES); }
    /** Unsafe version of {@link #pStdHeaderVersion}. */
    public static VkExtensionProperties npStdHeaderVersion(long struct) { return VkExtensionProperties.create(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.QUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #pVideoProfile(VkVideoProfileInfoKHR) pVideoProfile}. */
    public static void npVideoProfile(long struct, VkVideoProfileInfoKHR value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE, value.address()); }
    /** Unsafe version of {@link #pictureFormat(int) pictureFormat}. */
    public static void npictureFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.PICTUREFORMAT, value); }
    /** Unsafe version of {@link #maxCodedExtent(VkExtent2D) maxCodedExtent}. */
    public static void nmaxCodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoSessionCreateInfoKHR.MAXCODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #referencePictureFormat(int) referencePictureFormat}. */
    public static void nreferencePictureFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.REFERENCEPICTUREFORMAT, value); }
    /** Unsafe version of {@link #maxDpbSlots(int) maxDpbSlots}. */
    public static void nmaxDpbSlots(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.MAXDPBSLOTS, value); }
    /** Unsafe version of {@link #maxActiveReferencePictures(int) maxActiveReferencePictures}. */
    public static void nmaxActiveReferencePictures(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoSessionCreateInfoKHR.MAXACTIVEREFERENCEPICTURES, value); }
    /** Unsafe version of {@link #pStdHeaderVersion(VkExtensionProperties) pStdHeaderVersion}. */
    public static void npStdHeaderVersion(long struct, VkExtensionProperties value) { memPutAddress(struct + VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PVIDEOPROFILE));
        check(memGetAddress(struct + VkVideoSessionCreateInfoKHR.PSTDHEADERVERSION));
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
        /** @return a {@link VkVideoProfileInfoKHR} view of the struct pointed to by the {@link VkVideoSessionCreateInfoKHR#pVideoProfile} field. */
        @NativeType("VkVideoProfileInfoKHR const *")
        public VkVideoProfileInfoKHR pVideoProfile() { return VkVideoSessionCreateInfoKHR.npVideoProfile(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#pictureFormat} field. */
        @NativeType("VkFormat")
        public int pictureFormat() { return VkVideoSessionCreateInfoKHR.npictureFormat(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoSessionCreateInfoKHR#maxCodedExtent} field. */
        public VkExtent2D maxCodedExtent() { return VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address()); }
        /** @return the value of the {@code referencePictureFormat} field. */
        @NativeType("VkFormat")
        public int referencePictureFormat() { return VkVideoSessionCreateInfoKHR.nreferencePictureFormat(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#maxDpbSlots} field. */
        @NativeType("uint32_t")
        public int maxDpbSlots() { return VkVideoSessionCreateInfoKHR.nmaxDpbSlots(address()); }
        /** @return the value of the {@link VkVideoSessionCreateInfoKHR#maxActiveReferencePictures} field. */
        @NativeType("uint32_t")
        public int maxActiveReferencePictures() { return VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(address()); }
        /** @return a {@link VkExtensionProperties} view of the struct pointed to by the {@link VkVideoSessionCreateInfoKHR#pStdHeaderVersion} field. */
        @NativeType("VkExtensionProperties const *")
        public VkExtensionProperties pStdHeaderVersion() { return VkVideoSessionCreateInfoKHR.npStdHeaderVersion(address()); }

        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#sType} field. */
        public VkVideoSessionCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoSessionCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR} value to the {@link VkVideoSessionCreateInfoKHR#sType} field. */
        public VkVideoSessionCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#pNext} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoSessionCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#queueFamilyIndex} field. */
        public VkVideoSessionCreateInfoKHR.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#flags} field. */
        public VkVideoSessionCreateInfoKHR.Buffer flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) { VkVideoSessionCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoProfileInfoKHR} to the {@link VkVideoSessionCreateInfoKHR#pVideoProfile} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) { VkVideoSessionCreateInfoKHR.npVideoProfile(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#pictureFormat} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pictureFormat(@NativeType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.npictureFormat(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoSessionCreateInfoKHR#maxCodedExtent} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(VkExtent2D value) { VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address(), value); return this; }
        /** Passes the {@link VkVideoSessionCreateInfoKHR#maxCodedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoSessionCreateInfoKHR.Buffer maxCodedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxCodedExtent()); return this; }
        /** Sets the specified value to the {@code referencePictureFormat} field. */
        public VkVideoSessionCreateInfoKHR.Buffer referencePictureFormat(@NativeType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.nreferencePictureFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#maxDpbSlots} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxDpbSlots(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nmaxDpbSlots(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoSessionCreateInfoKHR#maxActiveReferencePictures} field. */
        public VkVideoSessionCreateInfoKHR.Buffer maxActiveReferencePictures(@NativeType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(address(), value); return this; }
        /** Sets the address of the specified {@link VkExtensionProperties} to the {@link VkVideoSessionCreateInfoKHR#pStdHeaderVersion} field. */
        public VkVideoSessionCreateInfoKHR.Buffer pStdHeaderVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) { VkVideoSessionCreateInfoKHR.npStdHeaderVersion(address(), value); return this; }

    }

}