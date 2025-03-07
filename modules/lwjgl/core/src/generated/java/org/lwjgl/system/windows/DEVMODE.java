/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct DEVMODE {
 *     TCHAR dmDeviceName[32];
 *     WORD dmSpecVersion;
 *     WORD dmDriverVersion;
 *     WORD dmSize;
 *     WORD dmDriverExtra;
 *     DWORD dmFields;
 *     union {
 *         struct {
 *             short dmOrientation;
 *             short dmPaperSize;
 *             short dmPaperLength;
 *             short dmPaperWidth;
 *             short dmScale;
 *             short dmCopies;
 *             short dmDefaultSource;
 *             short dmPrintQuality;
 *         };
 *         struct {
 *             {@link POINTL POINTL} dmPosition;
 *             DWORD dmDisplayOrientation;
 *             DWORD dmDisplayFixedOutput;
 *         };
 *     };
 *     short dmColor;
 *     short dmDuplex;
 *     short dmYResolution;
 *     short dmTTOption;
 *     short dmCollate;
 *     TCHAR dmFormName[32];
 *     WORD dmLogPixels;
 *     DWORD dmBitsPerPel;
 *     DWORD dmPelsWidth;
 *     DWORD dmPelsHeight;
 *     union {
 *         DWORD dmDisplayFlags;
 *         DWORD dmNup;
 *     };
 *     DWORD dmDisplayFrequency;
 *     DWORD dmICMMethod;
 *     DWORD dmICMIntent;
 *     DWORD dmMediaType;
 *     DWORD dmDitherType;
 *     DWORD dmReserved1;
 *     DWORD dmReserved2;
 *     DWORD dmPanningWidth;
 *     DWORD dmPanningHeight;
 * }}</pre>
 */
public class DEVMODE extends Struct<DEVMODE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DMDEVICENAME,
        DMSPECVERSION,
        DMDRIVERVERSION,
        DMSIZE,
        DMDRIVEREXTRA,
        DMFIELDS,
        DMORIENTATION,
        DMPAPERSIZE,
        DMPAPERLENGTH,
        DMPAPERWIDTH,
        DMSCALE,
        DMCOPIES,
        DMDEFAULTSOURCE,
        DMPRINTQUALITY,
        DMPOSITION,
        DMDISPLAYORIENTATION,
        DMDISPLAYFIXEDOUTPUT,
        DMCOLOR,
        DMDUPLEX,
        DMYRESOLUTION,
        DMTTOPTION,
        DMCOLLATE,
        DMFORMNAME,
        DMLOGPIXELS,
        DMBITSPERPEL,
        DMPELSWIDTH,
        DMPELSHEIGHT,
        DMDISPLAYFLAGS,
        DMNUP,
        DMDISPLAYFREQUENCY,
        DMICMMETHOD,
        DMICMINTENT,
        DMMEDIATYPE,
        DMDITHERTYPE,
        DMRESERVED1,
        DMRESERVED2,
        DMPANNINGWIDTH,
        DMPANNINGHEIGHT;

    static {
        Layout layout = __struct(
            __array(2, 32),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4),
            __union(
                __struct(
                    __member(2),
                    __member(2),
                    __member(2),
                    __member(2),
                    __member(2),
                    __member(2),
                    __member(2),
                    __member(2)
                ),
                __struct(
                    __member(POINTL.SIZEOF, POINTL.ALIGNOF),
                    __member(4),
                    __member(4)
                )
            ),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __array(2, 32),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __union(
                __member(4),
                __member(4)
            ),
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

        DMDEVICENAME = layout.offsetof(0);
        DMSPECVERSION = layout.offsetof(1);
        DMDRIVERVERSION = layout.offsetof(2);
        DMSIZE = layout.offsetof(3);
        DMDRIVEREXTRA = layout.offsetof(4);
        DMFIELDS = layout.offsetof(5);
        DMORIENTATION = layout.offsetof(8);
        DMPAPERSIZE = layout.offsetof(9);
        DMPAPERLENGTH = layout.offsetof(10);
        DMPAPERWIDTH = layout.offsetof(11);
        DMSCALE = layout.offsetof(12);
        DMCOPIES = layout.offsetof(13);
        DMDEFAULTSOURCE = layout.offsetof(14);
        DMPRINTQUALITY = layout.offsetof(15);
        DMPOSITION = layout.offsetof(17);
        DMDISPLAYORIENTATION = layout.offsetof(18);
        DMDISPLAYFIXEDOUTPUT = layout.offsetof(19);
        DMCOLOR = layout.offsetof(20);
        DMDUPLEX = layout.offsetof(21);
        DMYRESOLUTION = layout.offsetof(22);
        DMTTOPTION = layout.offsetof(23);
        DMCOLLATE = layout.offsetof(24);
        DMFORMNAME = layout.offsetof(25);
        DMLOGPIXELS = layout.offsetof(26);
        DMBITSPERPEL = layout.offsetof(27);
        DMPELSWIDTH = layout.offsetof(28);
        DMPELSHEIGHT = layout.offsetof(29);
        DMDISPLAYFLAGS = layout.offsetof(31);
        DMNUP = layout.offsetof(32);
        DMDISPLAYFREQUENCY = layout.offsetof(33);
        DMICMMETHOD = layout.offsetof(34);
        DMICMINTENT = layout.offsetof(35);
        DMMEDIATYPE = layout.offsetof(36);
        DMDITHERTYPE = layout.offsetof(37);
        DMRESERVED1 = layout.offsetof(38);
        DMRESERVED2 = layout.offsetof(39);
        DMPANNINGWIDTH = layout.offsetof(40);
        DMPANNINGHEIGHT = layout.offsetof(41);
    }

    protected DEVMODE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected DEVMODE create(long address, @Nullable ByteBuffer container) {
        return new DEVMODE(address, container);
    }

    /**
     * Creates a {@code DEVMODE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DEVMODE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code dmDeviceName} field. */
    @NativeType("TCHAR[32]")
    public ByteBuffer dmDeviceName() { return ndmDeviceName(address()); }
    /** @return the null-terminated string stored in the {@code dmDeviceName} field. */
    @NativeType("TCHAR[32]")
    public String dmDeviceNameString() { return ndmDeviceNameString(address()); }
    /** @return the value of the {@code dmSpecVersion} field. */
    @NativeType("WORD")
    public short dmSpecVersion() { return ndmSpecVersion(address()); }
    /** @return the value of the {@code dmDriverVersion} field. */
    @NativeType("WORD")
    public short dmDriverVersion() { return ndmDriverVersion(address()); }
    /** @return the value of the {@code dmSize} field. */
    @NativeType("WORD")
    public short dmSize() { return ndmSize(address()); }
    /** @return the value of the {@code dmDriverExtra} field. */
    @NativeType("WORD")
    public short dmDriverExtra() { return ndmDriverExtra(address()); }
    /** @return the value of the {@code dmFields} field. */
    @NativeType("DWORD")
    public int dmFields() { return ndmFields(address()); }
    /** @return the value of the {@code dmOrientation} field. */
    public short dmOrientation() { return ndmOrientation(address()); }
    /** @return the value of the {@code dmPaperSize} field. */
    public short dmPaperSize() { return ndmPaperSize(address()); }
    /** @return the value of the {@code dmPaperLength} field. */
    public short dmPaperLength() { return ndmPaperLength(address()); }
    /** @return the value of the {@code dmPaperWidth} field. */
    public short dmPaperWidth() { return ndmPaperWidth(address()); }
    /** @return the value of the {@code dmScale} field. */
    public short dmScale() { return ndmScale(address()); }
    /** @return the value of the {@code dmCopies} field. */
    public short dmCopies() { return ndmCopies(address()); }
    /** @return the value of the {@code dmDefaultSource} field. */
    public short dmDefaultSource() { return ndmDefaultSource(address()); }
    /** @return the value of the {@code dmPrintQuality} field. */
    public short dmPrintQuality() { return ndmPrintQuality(address()); }
    /** @return a {@link POINTL} view of the {@code dmPosition} field. */
    public POINTL dmPosition() { return ndmPosition(address()); }
    /** @return the value of the {@code dmDisplayOrientation} field. */
    @NativeType("DWORD")
    public int dmDisplayOrientation() { return ndmDisplayOrientation(address()); }
    /** @return the value of the {@code dmDisplayFixedOutput} field. */
    @NativeType("DWORD")
    public int dmDisplayFixedOutput() { return ndmDisplayFixedOutput(address()); }
    /** @return the value of the {@code dmColor} field. */
    public short dmColor() { return ndmColor(address()); }
    /** @return the value of the {@code dmDuplex} field. */
    public short dmDuplex() { return ndmDuplex(address()); }
    /** @return the value of the {@code dmYResolution} field. */
    public short dmYResolution() { return ndmYResolution(address()); }
    /** @return the value of the {@code dmTTOption} field. */
    public short dmTTOption() { return ndmTTOption(address()); }
    /** @return the value of the {@code dmCollate} field. */
    public short dmCollate() { return ndmCollate(address()); }
    /** @return a {@link ByteBuffer} view of the {@code dmFormName} field. */
    @NativeType("TCHAR[32]")
    public ByteBuffer dmFormName() { return ndmFormName(address()); }
    /** @return the null-terminated string stored in the {@code dmFormName} field. */
    @NativeType("TCHAR[32]")
    public String dmFormNameString() { return ndmFormNameString(address()); }
    /** @return the value of the {@code dmLogPixels} field. */
    @NativeType("WORD")
    public short dmLogPixels() { return ndmLogPixels(address()); }
    /** @return the value of the {@code dmBitsPerPel} field. */
    @NativeType("DWORD")
    public int dmBitsPerPel() { return ndmBitsPerPel(address()); }
    /** @return the value of the {@code dmPelsWidth} field. */
    @NativeType("DWORD")
    public int dmPelsWidth() { return ndmPelsWidth(address()); }
    /** @return the value of the {@code dmPelsHeight} field. */
    @NativeType("DWORD")
    public int dmPelsHeight() { return ndmPelsHeight(address()); }
    /** @return the value of the {@code dmDisplayFlags} field. */
    @NativeType("DWORD")
    public int dmDisplayFlags() { return ndmDisplayFlags(address()); }
    /** @return the value of the {@code dmNup} field. */
    @NativeType("DWORD")
    public int dmNup() { return ndmNup(address()); }
    /** @return the value of the {@code dmDisplayFrequency} field. */
    @NativeType("DWORD")
    public int dmDisplayFrequency() { return ndmDisplayFrequency(address()); }
    /** @return the value of the {@code dmICMMethod} field. */
    @NativeType("DWORD")
    public int dmICMMethod() { return ndmICMMethod(address()); }
    /** @return the value of the {@code dmICMIntent} field. */
    @NativeType("DWORD")
    public int dmICMIntent() { return ndmICMIntent(address()); }
    /** @return the value of the {@code dmMediaType} field. */
    @NativeType("DWORD")
    public int dmMediaType() { return ndmMediaType(address()); }
    /** @return the value of the {@code dmDitherType} field. */
    @NativeType("DWORD")
    public int dmDitherType() { return ndmDitherType(address()); }
    /** @return the value of the {@code dmReserved1} field. */
    @NativeType("DWORD")
    public int dmReserved1() { return ndmReserved1(address()); }
    /** @return the value of the {@code dmReserved2} field. */
    @NativeType("DWORD")
    public int dmReserved2() { return ndmReserved2(address()); }
    /** @return the value of the {@code dmPanningWidth} field. */
    @NativeType("DWORD")
    public int dmPanningWidth() { return ndmPanningWidth(address()); }
    /** @return the value of the {@code dmPanningHeight} field. */
    @NativeType("DWORD")
    public int dmPanningHeight() { return ndmPanningHeight(address()); }

    /** Sets the specified value to the {@code dmSpecVersion} field. */
    public DEVMODE dmSpecVersion(@NativeType("WORD") short value) { ndmSpecVersion(address(), value); return this; }
    /** Sets the specified value to the {@code dmSize} field. */
    public DEVMODE dmSize(@NativeType("WORD") short value) { ndmSize(address(), value); return this; }
    /** Sets the specified value to the {@code dmDriverExtra} field. */
    public DEVMODE dmDriverExtra(@NativeType("WORD") short value) { ndmDriverExtra(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DEVMODE set(DEVMODE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code DEVMODE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DEVMODE malloc() {
        return new DEVMODE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code DEVMODE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DEVMODE calloc() {
        return new DEVMODE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code DEVMODE} instance allocated with {@link BufferUtils}. */
    public static DEVMODE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new DEVMODE(memAddress(container), container);
    }

    /** Returns a new {@code DEVMODE} instance for the specified memory address. */
    public static DEVMODE create(long address) {
        return new DEVMODE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable DEVMODE createSafe(long address) {
        return address == NULL ? null : new DEVMODE(address, null);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link DEVMODE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static DEVMODE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DEVMODE mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DEVMODE callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DEVMODE mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DEVMODE callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DEVMODE.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DEVMODE.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DEVMODE.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DEVMODE.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code DEVMODE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DEVMODE malloc(MemoryStack stack) {
        return new DEVMODE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code DEVMODE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DEVMODE calloc(MemoryStack stack) {
        return new DEVMODE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dmDeviceName}. */
    public static ByteBuffer ndmDeviceName(long struct) { return memByteBuffer(struct + DEVMODE.DMDEVICENAME, 32 * 2); }
    /** Unsafe version of {@link #dmDeviceNameString}. */
    public static String ndmDeviceNameString(long struct) { return memUTF16(struct + DEVMODE.DMDEVICENAME); }
    /** Unsafe version of {@link #dmSpecVersion}. */
    public static short ndmSpecVersion(long struct) { return memGetShort(struct + DEVMODE.DMSPECVERSION); }
    /** Unsafe version of {@link #dmDriverVersion}. */
    public static short ndmDriverVersion(long struct) { return memGetShort(struct + DEVMODE.DMDRIVERVERSION); }
    /** Unsafe version of {@link #dmSize}. */
    public static short ndmSize(long struct) { return memGetShort(struct + DEVMODE.DMSIZE); }
    /** Unsafe version of {@link #dmDriverExtra}. */
    public static short ndmDriverExtra(long struct) { return memGetShort(struct + DEVMODE.DMDRIVEREXTRA); }
    /** Unsafe version of {@link #dmFields}. */
    public static int ndmFields(long struct) { return memGetInt(struct + DEVMODE.DMFIELDS); }
    /** Unsafe version of {@link #dmOrientation}. */
    public static short ndmOrientation(long struct) { return memGetShort(struct + DEVMODE.DMORIENTATION); }
    /** Unsafe version of {@link #dmPaperSize}. */
    public static short ndmPaperSize(long struct) { return memGetShort(struct + DEVMODE.DMPAPERSIZE); }
    /** Unsafe version of {@link #dmPaperLength}. */
    public static short ndmPaperLength(long struct) { return memGetShort(struct + DEVMODE.DMPAPERLENGTH); }
    /** Unsafe version of {@link #dmPaperWidth}. */
    public static short ndmPaperWidth(long struct) { return memGetShort(struct + DEVMODE.DMPAPERWIDTH); }
    /** Unsafe version of {@link #dmScale}. */
    public static short ndmScale(long struct) { return memGetShort(struct + DEVMODE.DMSCALE); }
    /** Unsafe version of {@link #dmCopies}. */
    public static short ndmCopies(long struct) { return memGetShort(struct + DEVMODE.DMCOPIES); }
    /** Unsafe version of {@link #dmDefaultSource}. */
    public static short ndmDefaultSource(long struct) { return memGetShort(struct + DEVMODE.DMDEFAULTSOURCE); }
    /** Unsafe version of {@link #dmPrintQuality}. */
    public static short ndmPrintQuality(long struct) { return memGetShort(struct + DEVMODE.DMPRINTQUALITY); }
    /** Unsafe version of {@link #dmPosition}. */
    public static POINTL ndmPosition(long struct) { return POINTL.create(struct + DEVMODE.DMPOSITION); }
    /** Unsafe version of {@link #dmDisplayOrientation}. */
    public static int ndmDisplayOrientation(long struct) { return memGetInt(struct + DEVMODE.DMDISPLAYORIENTATION); }
    /** Unsafe version of {@link #dmDisplayFixedOutput}. */
    public static int ndmDisplayFixedOutput(long struct) { return memGetInt(struct + DEVMODE.DMDISPLAYFIXEDOUTPUT); }
    /** Unsafe version of {@link #dmColor}. */
    public static short ndmColor(long struct) { return memGetShort(struct + DEVMODE.DMCOLOR); }
    /** Unsafe version of {@link #dmDuplex}. */
    public static short ndmDuplex(long struct) { return memGetShort(struct + DEVMODE.DMDUPLEX); }
    /** Unsafe version of {@link #dmYResolution}. */
    public static short ndmYResolution(long struct) { return memGetShort(struct + DEVMODE.DMYRESOLUTION); }
    /** Unsafe version of {@link #dmTTOption}. */
    public static short ndmTTOption(long struct) { return memGetShort(struct + DEVMODE.DMTTOPTION); }
    /** Unsafe version of {@link #dmCollate}. */
    public static short ndmCollate(long struct) { return memGetShort(struct + DEVMODE.DMCOLLATE); }
    /** Unsafe version of {@link #dmFormName}. */
    public static ByteBuffer ndmFormName(long struct) { return memByteBuffer(struct + DEVMODE.DMFORMNAME, 32 * 2); }
    /** Unsafe version of {@link #dmFormNameString}. */
    public static String ndmFormNameString(long struct) { return memUTF16(struct + DEVMODE.DMFORMNAME); }
    /** Unsafe version of {@link #dmLogPixels}. */
    public static short ndmLogPixels(long struct) { return memGetShort(struct + DEVMODE.DMLOGPIXELS); }
    /** Unsafe version of {@link #dmBitsPerPel}. */
    public static int ndmBitsPerPel(long struct) { return memGetInt(struct + DEVMODE.DMBITSPERPEL); }
    /** Unsafe version of {@link #dmPelsWidth}. */
    public static int ndmPelsWidth(long struct) { return memGetInt(struct + DEVMODE.DMPELSWIDTH); }
    /** Unsafe version of {@link #dmPelsHeight}. */
    public static int ndmPelsHeight(long struct) { return memGetInt(struct + DEVMODE.DMPELSHEIGHT); }
    /** Unsafe version of {@link #dmDisplayFlags}. */
    public static int ndmDisplayFlags(long struct) { return memGetInt(struct + DEVMODE.DMDISPLAYFLAGS); }
    /** Unsafe version of {@link #dmNup}. */
    public static int ndmNup(long struct) { return memGetInt(struct + DEVMODE.DMNUP); }
    /** Unsafe version of {@link #dmDisplayFrequency}. */
    public static int ndmDisplayFrequency(long struct) { return memGetInt(struct + DEVMODE.DMDISPLAYFREQUENCY); }
    /** Unsafe version of {@link #dmICMMethod}. */
    public static int ndmICMMethod(long struct) { return memGetInt(struct + DEVMODE.DMICMMETHOD); }
    /** Unsafe version of {@link #dmICMIntent}. */
    public static int ndmICMIntent(long struct) { return memGetInt(struct + DEVMODE.DMICMINTENT); }
    /** Unsafe version of {@link #dmMediaType}. */
    public static int ndmMediaType(long struct) { return memGetInt(struct + DEVMODE.DMMEDIATYPE); }
    /** Unsafe version of {@link #dmDitherType}. */
    public static int ndmDitherType(long struct) { return memGetInt(struct + DEVMODE.DMDITHERTYPE); }
    /** Unsafe version of {@link #dmReserved1}. */
    public static int ndmReserved1(long struct) { return memGetInt(struct + DEVMODE.DMRESERVED1); }
    /** Unsafe version of {@link #dmReserved2}. */
    public static int ndmReserved2(long struct) { return memGetInt(struct + DEVMODE.DMRESERVED2); }
    /** Unsafe version of {@link #dmPanningWidth}. */
    public static int ndmPanningWidth(long struct) { return memGetInt(struct + DEVMODE.DMPANNINGWIDTH); }
    /** Unsafe version of {@link #dmPanningHeight}. */
    public static int ndmPanningHeight(long struct) { return memGetInt(struct + DEVMODE.DMPANNINGHEIGHT); }

    /** Unsafe version of {@link #dmSpecVersion(short) dmSpecVersion}. */
    public static void ndmSpecVersion(long struct, short value) { memPutShort(struct + DEVMODE.DMSPECVERSION, value); }
    /** Unsafe version of {@link #dmSize(short) dmSize}. */
    public static void ndmSize(long struct, short value) { memPutShort(struct + DEVMODE.DMSIZE, value); }
    /** Unsafe version of {@link #dmDriverExtra(short) dmDriverExtra}. */
    public static void ndmDriverExtra(long struct, short value) { memPutShort(struct + DEVMODE.DMDRIVEREXTRA, value); }

    // -----------------------------------

    /** An array of {@link DEVMODE} structs. */
    public static class Buffer extends StructBuffer<DEVMODE, Buffer> implements NativeResource {

        private static final DEVMODE ELEMENT_FACTORY = DEVMODE.create(-1L);

        /**
         * Creates a new {@code DEVMODE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DEVMODE#SIZEOF}, and its mark will be undefined.</p>
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
        protected DEVMODE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code dmDeviceName} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer dmDeviceName() { return DEVMODE.ndmDeviceName(address()); }
        /** @return the null-terminated string stored in the {@code dmDeviceName} field. */
        @NativeType("TCHAR[32]")
        public String dmDeviceNameString() { return DEVMODE.ndmDeviceNameString(address()); }
        /** @return the value of the {@code dmSpecVersion} field. */
        @NativeType("WORD")
        public short dmSpecVersion() { return DEVMODE.ndmSpecVersion(address()); }
        /** @return the value of the {@code dmDriverVersion} field. */
        @NativeType("WORD")
        public short dmDriverVersion() { return DEVMODE.ndmDriverVersion(address()); }
        /** @return the value of the {@code dmSize} field. */
        @NativeType("WORD")
        public short dmSize() { return DEVMODE.ndmSize(address()); }
        /** @return the value of the {@code dmDriverExtra} field. */
        @NativeType("WORD")
        public short dmDriverExtra() { return DEVMODE.ndmDriverExtra(address()); }
        /** @return the value of the {@code dmFields} field. */
        @NativeType("DWORD")
        public int dmFields() { return DEVMODE.ndmFields(address()); }
        /** @return the value of the {@code dmOrientation} field. */
        public short dmOrientation() { return DEVMODE.ndmOrientation(address()); }
        /** @return the value of the {@code dmPaperSize} field. */
        public short dmPaperSize() { return DEVMODE.ndmPaperSize(address()); }
        /** @return the value of the {@code dmPaperLength} field. */
        public short dmPaperLength() { return DEVMODE.ndmPaperLength(address()); }
        /** @return the value of the {@code dmPaperWidth} field. */
        public short dmPaperWidth() { return DEVMODE.ndmPaperWidth(address()); }
        /** @return the value of the {@code dmScale} field. */
        public short dmScale() { return DEVMODE.ndmScale(address()); }
        /** @return the value of the {@code dmCopies} field. */
        public short dmCopies() { return DEVMODE.ndmCopies(address()); }
        /** @return the value of the {@code dmDefaultSource} field. */
        public short dmDefaultSource() { return DEVMODE.ndmDefaultSource(address()); }
        /** @return the value of the {@code dmPrintQuality} field. */
        public short dmPrintQuality() { return DEVMODE.ndmPrintQuality(address()); }
        /** @return a {@link POINTL} view of the {@code dmPosition} field. */
        public POINTL dmPosition() { return DEVMODE.ndmPosition(address()); }
        /** @return the value of the {@code dmDisplayOrientation} field. */
        @NativeType("DWORD")
        public int dmDisplayOrientation() { return DEVMODE.ndmDisplayOrientation(address()); }
        /** @return the value of the {@code dmDisplayFixedOutput} field. */
        @NativeType("DWORD")
        public int dmDisplayFixedOutput() { return DEVMODE.ndmDisplayFixedOutput(address()); }
        /** @return the value of the {@code dmColor} field. */
        public short dmColor() { return DEVMODE.ndmColor(address()); }
        /** @return the value of the {@code dmDuplex} field. */
        public short dmDuplex() { return DEVMODE.ndmDuplex(address()); }
        /** @return the value of the {@code dmYResolution} field. */
        public short dmYResolution() { return DEVMODE.ndmYResolution(address()); }
        /** @return the value of the {@code dmTTOption} field. */
        public short dmTTOption() { return DEVMODE.ndmTTOption(address()); }
        /** @return the value of the {@code dmCollate} field. */
        public short dmCollate() { return DEVMODE.ndmCollate(address()); }
        /** @return a {@link ByteBuffer} view of the {@code dmFormName} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer dmFormName() { return DEVMODE.ndmFormName(address()); }
        /** @return the null-terminated string stored in the {@code dmFormName} field. */
        @NativeType("TCHAR[32]")
        public String dmFormNameString() { return DEVMODE.ndmFormNameString(address()); }
        /** @return the value of the {@code dmLogPixels} field. */
        @NativeType("WORD")
        public short dmLogPixels() { return DEVMODE.ndmLogPixels(address()); }
        /** @return the value of the {@code dmBitsPerPel} field. */
        @NativeType("DWORD")
        public int dmBitsPerPel() { return DEVMODE.ndmBitsPerPel(address()); }
        /** @return the value of the {@code dmPelsWidth} field. */
        @NativeType("DWORD")
        public int dmPelsWidth() { return DEVMODE.ndmPelsWidth(address()); }
        /** @return the value of the {@code dmPelsHeight} field. */
        @NativeType("DWORD")
        public int dmPelsHeight() { return DEVMODE.ndmPelsHeight(address()); }
        /** @return the value of the {@code dmDisplayFlags} field. */
        @NativeType("DWORD")
        public int dmDisplayFlags() { return DEVMODE.ndmDisplayFlags(address()); }
        /** @return the value of the {@code dmNup} field. */
        @NativeType("DWORD")
        public int dmNup() { return DEVMODE.ndmNup(address()); }
        /** @return the value of the {@code dmDisplayFrequency} field. */
        @NativeType("DWORD")
        public int dmDisplayFrequency() { return DEVMODE.ndmDisplayFrequency(address()); }
        /** @return the value of the {@code dmICMMethod} field. */
        @NativeType("DWORD")
        public int dmICMMethod() { return DEVMODE.ndmICMMethod(address()); }
        /** @return the value of the {@code dmICMIntent} field. */
        @NativeType("DWORD")
        public int dmICMIntent() { return DEVMODE.ndmICMIntent(address()); }
        /** @return the value of the {@code dmMediaType} field. */
        @NativeType("DWORD")
        public int dmMediaType() { return DEVMODE.ndmMediaType(address()); }
        /** @return the value of the {@code dmDitherType} field. */
        @NativeType("DWORD")
        public int dmDitherType() { return DEVMODE.ndmDitherType(address()); }
        /** @return the value of the {@code dmReserved1} field. */
        @NativeType("DWORD")
        public int dmReserved1() { return DEVMODE.ndmReserved1(address()); }
        /** @return the value of the {@code dmReserved2} field. */
        @NativeType("DWORD")
        public int dmReserved2() { return DEVMODE.ndmReserved2(address()); }
        /** @return the value of the {@code dmPanningWidth} field. */
        @NativeType("DWORD")
        public int dmPanningWidth() { return DEVMODE.ndmPanningWidth(address()); }
        /** @return the value of the {@code dmPanningHeight} field. */
        @NativeType("DWORD")
        public int dmPanningHeight() { return DEVMODE.ndmPanningHeight(address()); }

        /** Sets the specified value to the {@code dmSpecVersion} field. */
        public DEVMODE.Buffer dmSpecVersion(@NativeType("WORD") short value) { DEVMODE.ndmSpecVersion(address(), value); return this; }
        /** Sets the specified value to the {@code dmSize} field. */
        public DEVMODE.Buffer dmSize(@NativeType("WORD") short value) { DEVMODE.ndmSize(address(), value); return this; }
        /** Sets the specified value to the {@code dmDriverExtra} field. */
        public DEVMODE.Buffer dmDriverExtra(@NativeType("WORD") short value) { DEVMODE.ndmDriverExtra(address(), value); return this; }

    }

}