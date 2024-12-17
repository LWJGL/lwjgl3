/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrEye_Count;

/**
 * <pre>{@code
 * struct ovrHmdDesc {
 *     ovrHmdType Type;
 *     char[4];
 *     char ProductName[64];
 *     char Manufacturer[64];
 *     short VendorId;
 *     short ProductId;
 *     char SerialNumber[24];
 *     short FirmwareMajor;
 *     short FirmwareMinor;
 *     unsigned int AvailableHmdCaps;
 *     unsigned int DefaultHmdCaps;
 *     unsigned int AvailableTrackingCaps;
 *     unsigned int DefaultTrackingCaps;
 *     {@link OVRFovPort ovrFovPort} DefaultEyeFov[ovrEye_Count];
 *     {@link OVRFovPort ovrFovPort} MaxEyeFov[ovrEye_Count];
 *     {@link OVRSizei ovrSizei} Resolution;
 *     float DisplayRefreshRate;
 * }}</pre>
 */
@NativeType("struct ovrHmdDesc")
public class OVRHmdDesc extends Struct<OVRHmdDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        PRODUCTNAME,
        MANUFACTURER,
        VENDORID,
        PRODUCTID,
        SERIALNUMBER,
        FIRMWAREMAJOR,
        FIRMWAREMINOR,
        AVAILABLEHMDCAPS,
        DEFAULTHMDCAPS,
        AVAILABLETRACKINGCAPS,
        DEFAULTTRACKINGCAPS,
        DEFAULTEYEFOV,
        MAXEYEFOV,
        RESOLUTION,
        DISPLAYREFRESHRATE;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __padding(4, Pointer.BITS64),
            __array(1, 64),
            __array(1, 64),
            __member(2),
            __member(2),
            __array(1, 24),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __array(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF, ovrEye_Count),
            __member(OVRSizei.SIZEOF, OVRSizei.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        PRODUCTNAME = layout.offsetof(2);
        MANUFACTURER = layout.offsetof(3);
        VENDORID = layout.offsetof(4);
        PRODUCTID = layout.offsetof(5);
        SERIALNUMBER = layout.offsetof(6);
        FIRMWAREMAJOR = layout.offsetof(7);
        FIRMWAREMINOR = layout.offsetof(8);
        AVAILABLEHMDCAPS = layout.offsetof(9);
        DEFAULTHMDCAPS = layout.offsetof(10);
        AVAILABLETRACKINGCAPS = layout.offsetof(11);
        DEFAULTTRACKINGCAPS = layout.offsetof(12);
        DEFAULTEYEFOV = layout.offsetof(13);
        MAXEYEFOV = layout.offsetof(14);
        RESOLUTION = layout.offsetof(15);
        DISPLAYREFRESHRATE = layout.offsetof(16);
    }

    protected OVRHmdDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRHmdDesc create(long address, @Nullable ByteBuffer container) {
        return new OVRHmdDesc(address, container);
    }

    /**
     * Creates a {@code OVRHmdDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRHmdDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Type} field. */
    @NativeType("ovrHmdType")
    public int Type() { return nType(address()); }
    /** @return a {@link ByteBuffer} view of the {@code ProductName} field. */
    @NativeType("char[64]")
    public ByteBuffer ProductName() { return nProductName(address()); }
    /** @return the null-terminated string stored in the {@code ProductName} field. */
    @NativeType("char[64]")
    public String ProductNameString() { return nProductNameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code Manufacturer} field. */
    @NativeType("char[64]")
    public ByteBuffer Manufacturer() { return nManufacturer(address()); }
    /** @return the null-terminated string stored in the {@code Manufacturer} field. */
    @NativeType("char[64]")
    public String ManufacturerString() { return nManufacturerString(address()); }
    /** @return the value of the {@code VendorId} field. */
    public short VendorId() { return nVendorId(address()); }
    /** @return the value of the {@code ProductId} field. */
    public short ProductId() { return nProductId(address()); }
    /** @return a {@link ByteBuffer} view of the {@code SerialNumber} field. */
    @NativeType("char[24]")
    public ByteBuffer SerialNumber() { return nSerialNumber(address()); }
    /** @return the null-terminated string stored in the {@code SerialNumber} field. */
    @NativeType("char[24]")
    public String SerialNumberString() { return nSerialNumberString(address()); }
    /** @return the value of the {@code FirmwareMajor} field. */
    public short FirmwareMajor() { return nFirmwareMajor(address()); }
    /** @return the value of the {@code FirmwareMinor} field. */
    public short FirmwareMinor() { return nFirmwareMinor(address()); }
    /** @return the value of the {@code AvailableHmdCaps} field. */
    @NativeType("unsigned int")
    public int AvailableHmdCaps() { return nAvailableHmdCaps(address()); }
    /** @return the value of the {@code DefaultHmdCaps} field. */
    @NativeType("unsigned int")
    public int DefaultHmdCaps() { return nDefaultHmdCaps(address()); }
    /** @return the value of the {@code AvailableTrackingCaps} field. */
    @NativeType("unsigned int")
    public int AvailableTrackingCaps() { return nAvailableTrackingCaps(address()); }
    /** @return the value of the {@code DefaultTrackingCaps} field. */
    @NativeType("unsigned int")
    public int DefaultTrackingCaps() { return nDefaultTrackingCaps(address()); }
    /** @return a {@link OVRFovPort}.Buffer view of the {@code DefaultEyeFov} field. */
    @NativeType("ovrFovPort[ovrEye_Count]")
    public OVRFovPort.Buffer DefaultEyeFov() { return nDefaultEyeFov(address()); }
    /** @return a {@link OVRFovPort} view of the struct at the specified index of the {@code DefaultEyeFov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort DefaultEyeFov(int index) { return nDefaultEyeFov(address(), index); }
    /** @return a {@link OVRFovPort}.Buffer view of the {@code MaxEyeFov} field. */
    @NativeType("ovrFovPort[ovrEye_Count]")
    public OVRFovPort.Buffer MaxEyeFov() { return nMaxEyeFov(address()); }
    /** @return a {@link OVRFovPort} view of the struct at the specified index of the {@code MaxEyeFov} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort MaxEyeFov(int index) { return nMaxEyeFov(address(), index); }
    /** @return a {@link OVRSizei} view of the {@code Resolution} field. */
    @NativeType("ovrSizei")
    public OVRSizei Resolution() { return nResolution(address()); }
    /** @return the value of the {@code DisplayRefreshRate} field. */
    public float DisplayRefreshRate() { return nDisplayRefreshRate(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRHmdDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRHmdDesc malloc() {
        return new OVRHmdDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRHmdDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRHmdDesc calloc() {
        return new OVRHmdDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRHmdDesc} instance allocated with {@link BufferUtils}. */
    public static OVRHmdDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRHmdDesc(memAddress(container), container);
    }

    /** Returns a new {@code OVRHmdDesc} instance for the specified memory address. */
    public static OVRHmdDesc create(long address) {
        return new OVRHmdDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRHmdDesc createSafe(long address) {
        return address == NULL ? null : new OVRHmdDesc(address, null);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRHmdDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRHmdDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRHmdDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRHmdDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code OVRHmdDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHmdDesc malloc(MemoryStack stack) {
        return new OVRHmdDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRHmdDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHmdDesc calloc(MemoryStack stack) {
        return new OVRHmdDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Type}. */
    public static int nType(long struct) { return memGetInt(struct + OVRHmdDesc.TYPE); }
    /** Unsafe version of {@link #ProductName}. */
    public static ByteBuffer nProductName(long struct) { return memByteBuffer(struct + OVRHmdDesc.PRODUCTNAME, 64); }
    /** Unsafe version of {@link #ProductNameString}. */
    public static String nProductNameString(long struct) { return memUTF8(struct + OVRHmdDesc.PRODUCTNAME); }
    /** Unsafe version of {@link #Manufacturer}. */
    public static ByteBuffer nManufacturer(long struct) { return memByteBuffer(struct + OVRHmdDesc.MANUFACTURER, 64); }
    /** Unsafe version of {@link #ManufacturerString}. */
    public static String nManufacturerString(long struct) { return memUTF8(struct + OVRHmdDesc.MANUFACTURER); }
    /** Unsafe version of {@link #VendorId}. */
    public static short nVendorId(long struct) { return memGetShort(struct + OVRHmdDesc.VENDORID); }
    /** Unsafe version of {@link #ProductId}. */
    public static short nProductId(long struct) { return memGetShort(struct + OVRHmdDesc.PRODUCTID); }
    /** Unsafe version of {@link #SerialNumber}. */
    public static ByteBuffer nSerialNumber(long struct) { return memByteBuffer(struct + OVRHmdDesc.SERIALNUMBER, 24); }
    /** Unsafe version of {@link #SerialNumberString}. */
    public static String nSerialNumberString(long struct) { return memASCII(struct + OVRHmdDesc.SERIALNUMBER); }
    /** Unsafe version of {@link #FirmwareMajor}. */
    public static short nFirmwareMajor(long struct) { return memGetShort(struct + OVRHmdDesc.FIRMWAREMAJOR); }
    /** Unsafe version of {@link #FirmwareMinor}. */
    public static short nFirmwareMinor(long struct) { return memGetShort(struct + OVRHmdDesc.FIRMWAREMINOR); }
    /** Unsafe version of {@link #AvailableHmdCaps}. */
    public static int nAvailableHmdCaps(long struct) { return memGetInt(struct + OVRHmdDesc.AVAILABLEHMDCAPS); }
    /** Unsafe version of {@link #DefaultHmdCaps}. */
    public static int nDefaultHmdCaps(long struct) { return memGetInt(struct + OVRHmdDesc.DEFAULTHMDCAPS); }
    /** Unsafe version of {@link #AvailableTrackingCaps}. */
    public static int nAvailableTrackingCaps(long struct) { return memGetInt(struct + OVRHmdDesc.AVAILABLETRACKINGCAPS); }
    /** Unsafe version of {@link #DefaultTrackingCaps}. */
    public static int nDefaultTrackingCaps(long struct) { return memGetInt(struct + OVRHmdDesc.DEFAULTTRACKINGCAPS); }
    /** Unsafe version of {@link #DefaultEyeFov}. */
    public static OVRFovPort.Buffer nDefaultEyeFov(long struct) { return OVRFovPort.create(struct + OVRHmdDesc.DEFAULTEYEFOV, ovrEye_Count); }
    /** Unsafe version of {@link #DefaultEyeFov(int) DefaultEyeFov}. */
    public static OVRFovPort nDefaultEyeFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRHmdDesc.DEFAULTEYEFOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #MaxEyeFov}. */
    public static OVRFovPort.Buffer nMaxEyeFov(long struct) { return OVRFovPort.create(struct + OVRHmdDesc.MAXEYEFOV, ovrEye_Count); }
    /** Unsafe version of {@link #MaxEyeFov(int) MaxEyeFov}. */
    public static OVRFovPort nMaxEyeFov(long struct, int index) {
        return OVRFovPort.create(struct + OVRHmdDesc.MAXEYEFOV + check(index, ovrEye_Count) * OVRFovPort.SIZEOF);
    }
    /** Unsafe version of {@link #Resolution}. */
    public static OVRSizei nResolution(long struct) { return OVRSizei.create(struct + OVRHmdDesc.RESOLUTION); }
    /** Unsafe version of {@link #DisplayRefreshRate}. */
    public static float nDisplayRefreshRate(long struct) { return memGetFloat(struct + OVRHmdDesc.DISPLAYREFRESHRATE); }

}