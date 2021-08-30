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
 * Structure specifying H.264 encode capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeH264CapabilityFlagBitsEXT} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code inputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH264InputModeFlagBitsEXT} values</li>
 * <li>{@code inputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code outputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH264OutputModeFlagBitsEXT} values</li>
 * <li>{@code outputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code stdExtensionVersion} <b>must</b> be a valid {@link VkExtensionProperties} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}, {@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH264CapabilityFlagsEXT {@link #flags};
 *     VkVideoEncodeH264InputModeFlagsEXT {@link #inputModeFlags};
 *     VkVideoEncodeH264OutputModeFlagsEXT {@link #outputModeFlags};
 *     {@link VkExtent2D VkExtent2D} {@link #minPictureSizeInMbs};
 *     {@link VkExtent2D VkExtent2D} {@link #maxPictureSizeInMbs};
 *     {@link VkExtent2D VkExtent2D} {@link #inputImageDataAlignment};
 *     uint8_t {@link #maxNumL0ReferenceForP};
 *     uint8_t {@link #maxNumL0ReferenceForB};
 *     uint8_t {@link #maxNumL1Reference};
 *     uint8_t {@link #qualityLevelCount};
 *     {@link VkExtensionProperties VkExtensionProperties} {@link #stdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoEncodeH264CapabilitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INPUTMODEFLAGS,
        OUTPUTMODEFLAGS,
        MINPICTURESIZEINMBS,
        MAXPICTURESIZEINMBS,
        INPUTIMAGEDATAALIGNMENT,
        MAXNUML0REFERENCEFORP,
        MAXNUML0REFERENCEFORB,
        MAXNUML1REFERENCE,
        QUALITYLEVELCOUNT,
        STDEXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INPUTMODEFLAGS = layout.offsetof(3);
        OUTPUTMODEFLAGS = layout.offsetof(4);
        MINPICTURESIZEINMBS = layout.offsetof(5);
        MAXPICTURESIZEINMBS = layout.offsetof(6);
        INPUTIMAGEDATAALIGNMENT = layout.offsetof(7);
        MAXNUML0REFERENCEFORP = layout.offsetof(8);
        MAXNUML0REFERENCEFORB = layout.offsetof(9);
        MAXNUML1REFERENCE = layout.offsetof(10);
        QUALITYLEVELCOUNT = layout.offsetof(11);
        STDEXTENSIONVERSION = layout.offsetof(12);
    }

    /**
     * Creates a {@code VkVideoEncodeH264CapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264CapabilitiesEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoEncodeH264CapabilityFlagBitsEXT} describing supported encoding tools. */
    @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeH264InputModeFlagBitsEXT} describing supported command buffer input granularities/modes. */
    @NativeType("VkVideoEncodeH264InputModeFlagsEXT")
    public int inputModeFlags() { return ninputModeFlags(address()); }
    /** a bitmask of {@code VkVideoEncodeH264OutputModeFlagBitsEXT} describing supported output (bitstream size reporting) granularities/modes. */
    @NativeType("VkVideoEncodeH264OutputModeFlagsEXT")
    public int outputModeFlags() { return noutputModeFlags(address()); }
    /** reports the minimum encoded picture width and height in Macroblocks. */
    public VkExtent2D minPictureSizeInMbs() { return nminPictureSizeInMbs(address()); }
    /** reports the maximum encoded picture width and height in Macroblocks. */
    public VkExtent2D maxPictureSizeInMbs() { return nmaxPictureSizeInMbs(address()); }
    /** reports alignment of data that <b>must</b> be filled in the input image horizontally and vertically in pixels. Max is 16: Data <b>must</b> be filled up to Macroblock boundary (no extrapolation/filling is supported by implementation). Min is 1: The implementation will take care of all needed extrapolation/filling up to the next Macroblock boundary. */
    public VkExtent2D inputImageDataAlignment() { return ninputImageDataAlignment(address()); }
    /** reports the maximum number of reference pictures the encoder supports as list0 references for P pictures. */
    @NativeType("uint8_t")
    public byte maxNumL0ReferenceForP() { return nmaxNumL0ReferenceForP(address()); }
    /** reports the maximum number of reference pictures the encoder supports as list0 references for B pictures. Reports 0 if B pictures are not supported. */
    @NativeType("uint8_t")
    public byte maxNumL0ReferenceForB() { return nmaxNumL0ReferenceForB(address()); }
    /** reports the maximum number of reference pictures the encoder supports as list1 references if B pictures are supported. Reports 0 if B pictures are not supported. */
    @NativeType("uint8_t")
    public byte maxNumL1Reference() { return nmaxNumL1Reference(address()); }
    /** the number of discrete quality levels supported. */
    @NativeType("uint8_t")
    public byte qualityLevelCount() { return nqualityLevelCount(address()); }
    /** the specific H.264 extension name and version supported by this implementation. */
    public VkExtensionProperties stdExtensionVersion() { return nstdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264CapabilitiesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH264CapabilitiesEXT flags(@NativeType("VkVideoEncodeH264CapabilityFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #inputModeFlags} field. */
    public VkVideoEncodeH264CapabilitiesEXT inputModeFlags(@NativeType("VkVideoEncodeH264InputModeFlagsEXT") int value) { ninputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #outputModeFlags} field. */
    public VkVideoEncodeH264CapabilitiesEXT outputModeFlags(@NativeType("VkVideoEncodeH264OutputModeFlagsEXT") int value) { noutputModeFlags(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #minPictureSizeInMbs} field. */
    public VkVideoEncodeH264CapabilitiesEXT minPictureSizeInMbs(VkExtent2D value) { nminPictureSizeInMbs(address(), value); return this; }
    /** Passes the {@link #minPictureSizeInMbs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264CapabilitiesEXT minPictureSizeInMbs(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minPictureSizeInMbs()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #maxPictureSizeInMbs} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxPictureSizeInMbs(VkExtent2D value) { nmaxPictureSizeInMbs(address(), value); return this; }
    /** Passes the {@link #maxPictureSizeInMbs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264CapabilitiesEXT maxPictureSizeInMbs(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxPictureSizeInMbs()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #inputImageDataAlignment} field. */
    public VkVideoEncodeH264CapabilitiesEXT inputImageDataAlignment(VkExtent2D value) { ninputImageDataAlignment(address(), value); return this; }
    /** Passes the {@link #inputImageDataAlignment} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeH264CapabilitiesEXT inputImageDataAlignment(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(inputImageDataAlignment()); return this; }
    /** Sets the specified value to the {@link #maxNumL0ReferenceForP} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxNumL0ReferenceForP(@NativeType("uint8_t") byte value) { nmaxNumL0ReferenceForP(address(), value); return this; }
    /** Sets the specified value to the {@link #maxNumL0ReferenceForB} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxNumL0ReferenceForB(@NativeType("uint8_t") byte value) { nmaxNumL0ReferenceForB(address(), value); return this; }
    /** Sets the specified value to the {@link #maxNumL1Reference} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxNumL1Reference(@NativeType("uint8_t") byte value) { nmaxNumL1Reference(address(), value); return this; }
    /** Sets the specified value to the {@link #qualityLevelCount} field. */
    public VkVideoEncodeH264CapabilitiesEXT qualityLevelCount(@NativeType("uint8_t") byte value) { nqualityLevelCount(address(), value); return this; }
    /** Copies the specified {@link VkExtensionProperties} to the {@link #stdExtensionVersion} field. */
    public VkVideoEncodeH264CapabilitiesEXT stdExtensionVersion(VkExtensionProperties value) { nstdExtensionVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264CapabilitiesEXT set(
        int sType,
        long pNext,
        int flags,
        int inputModeFlags,
        int outputModeFlags,
        VkExtent2D minPictureSizeInMbs,
        VkExtent2D maxPictureSizeInMbs,
        VkExtent2D inputImageDataAlignment,
        byte maxNumL0ReferenceForP,
        byte maxNumL0ReferenceForB,
        byte maxNumL1Reference,
        byte qualityLevelCount,
        VkExtensionProperties stdExtensionVersion
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        inputModeFlags(inputModeFlags);
        outputModeFlags(outputModeFlags);
        minPictureSizeInMbs(minPictureSizeInMbs);
        maxPictureSizeInMbs(maxPictureSizeInMbs);
        inputImageDataAlignment(inputImageDataAlignment);
        maxNumL0ReferenceForP(maxNumL0ReferenceForP);
        maxNumL0ReferenceForB(maxNumL0ReferenceForB);
        maxNumL1Reference(maxNumL1Reference);
        qualityLevelCount(qualityLevelCount);
        stdExtensionVersion(stdExtensionVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264CapabilitiesEXT set(VkVideoEncodeH264CapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesEXT malloc() {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesEXT calloc() {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264CapabilitiesEXT create(long address) {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264CapabilitiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkVideoEncodeH264CapabilitiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkVideoEncodeH264CapabilitiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesEXT callocStack(MemoryStack stack) {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #inputModeFlags}. */
    public static int ninputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.INPUTMODEFLAGS); }
    /** Unsafe version of {@link #outputModeFlags}. */
    public static int noutputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.OUTPUTMODEFLAGS); }
    /** Unsafe version of {@link #minPictureSizeInMbs}. */
    public static VkExtent2D nminPictureSizeInMbs(long struct) { return VkExtent2D.create(struct + VkVideoEncodeH264CapabilitiesEXT.MINPICTURESIZEINMBS); }
    /** Unsafe version of {@link #maxPictureSizeInMbs}. */
    public static VkExtent2D nmaxPictureSizeInMbs(long struct) { return VkExtent2D.create(struct + VkVideoEncodeH264CapabilitiesEXT.MAXPICTURESIZEINMBS); }
    /** Unsafe version of {@link #inputImageDataAlignment}. */
    public static VkExtent2D ninputImageDataAlignment(long struct) { return VkExtent2D.create(struct + VkVideoEncodeH264CapabilitiesEXT.INPUTIMAGEDATAALIGNMENT); }
    /** Unsafe version of {@link #maxNumL0ReferenceForP}. */
    public static byte nmaxNumL0ReferenceForP(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXNUML0REFERENCEFORP); }
    /** Unsafe version of {@link #maxNumL0ReferenceForB}. */
    public static byte nmaxNumL0ReferenceForB(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXNUML0REFERENCEFORB); }
    /** Unsafe version of {@link #maxNumL1Reference}. */
    public static byte nmaxNumL1Reference(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXNUML1REFERENCE); }
    /** Unsafe version of {@link #qualityLevelCount}. */
    public static byte nqualityLevelCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.QUALITYLEVELCOUNT); }
    /** Unsafe version of {@link #stdExtensionVersion}. */
    public static VkExtensionProperties nstdExtensionVersion(long struct) { return VkExtensionProperties.create(struct + VkVideoEncodeH264CapabilitiesEXT.STDEXTENSIONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264CapabilitiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.FLAGS, value); }
    /** Unsafe version of {@link #inputModeFlags(int) inputModeFlags}. */
    public static void ninputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.INPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #outputModeFlags(int) outputModeFlags}. */
    public static void noutputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.OUTPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #minPictureSizeInMbs(VkExtent2D) minPictureSizeInMbs}. */
    public static void nminPictureSizeInMbs(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeH264CapabilitiesEXT.MINPICTURESIZEINMBS, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #maxPictureSizeInMbs(VkExtent2D) maxPictureSizeInMbs}. */
    public static void nmaxPictureSizeInMbs(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeH264CapabilitiesEXT.MAXPICTURESIZEINMBS, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #inputImageDataAlignment(VkExtent2D) inputImageDataAlignment}. */
    public static void ninputImageDataAlignment(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeH264CapabilitiesEXT.INPUTIMAGEDATAALIGNMENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #maxNumL0ReferenceForP(byte) maxNumL0ReferenceForP}. */
    public static void nmaxNumL0ReferenceForP(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXNUML0REFERENCEFORP, value); }
    /** Unsafe version of {@link #maxNumL0ReferenceForB(byte) maxNumL0ReferenceForB}. */
    public static void nmaxNumL0ReferenceForB(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXNUML0REFERENCEFORB, value); }
    /** Unsafe version of {@link #maxNumL1Reference(byte) maxNumL1Reference}. */
    public static void nmaxNumL1Reference(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXNUML1REFERENCE, value); }
    /** Unsafe version of {@link #qualityLevelCount(byte) qualityLevelCount}. */
    public static void nqualityLevelCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.QUALITYLEVELCOUNT, value); }
    /** Unsafe version of {@link #stdExtensionVersion(VkExtensionProperties) stdExtensionVersion}. */
    public static void nstdExtensionVersion(long struct, VkExtensionProperties value) { memCopy(value.address(), struct + VkVideoEncodeH264CapabilitiesEXT.STDEXTENSIONVERSION, VkExtensionProperties.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH264CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264CapabilitiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264CapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH264CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#inputModeFlags} field. */
        @NativeType("VkVideoEncodeH264InputModeFlagsEXT")
        public int inputModeFlags() { return VkVideoEncodeH264CapabilitiesEXT.ninputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#outputModeFlags} field. */
        @NativeType("VkVideoEncodeH264OutputModeFlagsEXT")
        public int outputModeFlags() { return VkVideoEncodeH264CapabilitiesEXT.noutputModeFlags(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeH264CapabilitiesEXT#minPictureSizeInMbs} field. */
        public VkExtent2D minPictureSizeInMbs() { return VkVideoEncodeH264CapabilitiesEXT.nminPictureSizeInMbs(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeH264CapabilitiesEXT#maxPictureSizeInMbs} field. */
        public VkExtent2D maxPictureSizeInMbs() { return VkVideoEncodeH264CapabilitiesEXT.nmaxPictureSizeInMbs(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeH264CapabilitiesEXT#inputImageDataAlignment} field. */
        public VkExtent2D inputImageDataAlignment() { return VkVideoEncodeH264CapabilitiesEXT.ninputImageDataAlignment(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxNumL0ReferenceForP} field. */
        @NativeType("uint8_t")
        public byte maxNumL0ReferenceForP() { return VkVideoEncodeH264CapabilitiesEXT.nmaxNumL0ReferenceForP(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxNumL0ReferenceForB} field. */
        @NativeType("uint8_t")
        public byte maxNumL0ReferenceForB() { return VkVideoEncodeH264CapabilitiesEXT.nmaxNumL0ReferenceForB(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxNumL1Reference} field. */
        @NativeType("uint8_t")
        public byte maxNumL1Reference() { return VkVideoEncodeH264CapabilitiesEXT.nmaxNumL1Reference(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#qualityLevelCount} field. */
        @NativeType("uint8_t")
        public byte qualityLevelCount() { return VkVideoEncodeH264CapabilitiesEXT.nqualityLevelCount(address()); }
        /** @return a {@link VkExtensionProperties} view of the {@link VkVideoEncodeH264CapabilitiesEXT#stdExtensionVersion} field. */
        public VkExtensionProperties stdExtensionVersion() { return VkVideoEncodeH264CapabilitiesEXT.nstdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264CapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#flags} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer flags(@NativeType("VkVideoEncodeH264CapabilityFlagsEXT") int value) { VkVideoEncodeH264CapabilitiesEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#inputModeFlags} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer inputModeFlags(@NativeType("VkVideoEncodeH264InputModeFlagsEXT") int value) { VkVideoEncodeH264CapabilitiesEXT.ninputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#outputModeFlags} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer outputModeFlags(@NativeType("VkVideoEncodeH264OutputModeFlagsEXT") int value) { VkVideoEncodeH264CapabilitiesEXT.noutputModeFlags(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoEncodeH264CapabilitiesEXT#minPictureSizeInMbs} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer minPictureSizeInMbs(VkExtent2D value) { VkVideoEncodeH264CapabilitiesEXT.nminPictureSizeInMbs(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264CapabilitiesEXT#minPictureSizeInMbs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer minPictureSizeInMbs(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(minPictureSizeInMbs()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoEncodeH264CapabilitiesEXT#maxPictureSizeInMbs} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxPictureSizeInMbs(VkExtent2D value) { VkVideoEncodeH264CapabilitiesEXT.nmaxPictureSizeInMbs(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264CapabilitiesEXT#maxPictureSizeInMbs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxPictureSizeInMbs(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(maxPictureSizeInMbs()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoEncodeH264CapabilitiesEXT#inputImageDataAlignment} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer inputImageDataAlignment(VkExtent2D value) { VkVideoEncodeH264CapabilitiesEXT.ninputImageDataAlignment(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeH264CapabilitiesEXT#inputImageDataAlignment} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer inputImageDataAlignment(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(inputImageDataAlignment()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxNumL0ReferenceForP} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxNumL0ReferenceForP(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nmaxNumL0ReferenceForP(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxNumL0ReferenceForB} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxNumL0ReferenceForB(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nmaxNumL0ReferenceForB(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxNumL1Reference} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxNumL1Reference(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nmaxNumL1Reference(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#qualityLevelCount} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer qualityLevelCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nqualityLevelCount(address(), value); return this; }
        /** Copies the specified {@link VkExtensionProperties} to the {@link VkVideoEncodeH264CapabilitiesEXT#stdExtensionVersion} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer stdExtensionVersion(VkExtensionProperties value) { VkVideoEncodeH264CapabilitiesEXT.nstdExtensionVersion(address(), value); return this; }

    }

}