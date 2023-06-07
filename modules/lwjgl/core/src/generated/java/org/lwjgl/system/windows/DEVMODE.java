/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains information about the initialization and environment of a printer or a display device.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct DEVMODE {
 *     TCHAR {@link #dmDeviceName}[32];
 *     WORD {@link #dmSpecVersion};
 *     WORD {@link #dmDriverVersion};
 *     WORD {@link #dmSize};
 *     WORD {@link #dmDriverExtra};
 *     DWORD {@link #dmFields};
 *     union {
 *         struct {
 *             short {@link #dmOrientation};
 *             short {@link #dmPaperSize};
 *             short {@link #dmPaperLength};
 *             short {@link #dmPaperWidth};
 *             short {@link #dmScale};
 *             short {@link #dmCopies};
 *             short {@link #dmDefaultSource};
 *             short {@link #dmPrintQuality};
 *         };
 *         struct {
 *             {@link POINTL POINTL} {@link #dmPosition};
 *             DWORD {@link #dmDisplayOrientation};
 *             DWORD {@link #dmDisplayFixedOutput};
 *         };
 *     };
 *     short {@link #dmColor};
 *     short {@link #dmDuplex};
 *     short {@link #dmYResolution};
 *     short {@link #dmTTOption};
 *     short {@link #dmCollate};
 *     TCHAR {@link #dmFormName}[32];
 *     WORD {@link #dmLogPixels};
 *     DWORD {@link #dmBitsPerPel};
 *     DWORD {@link #dmPelsWidth};
 *     DWORD {@link #dmPelsHeight};
 *     union {
 *         DWORD {@link #dmDisplayFlags};
 *         DWORD {@link #dmNup};
 *     };
 *     DWORD {@link #dmDisplayFrequency};
 *     DWORD {@link #dmICMMethod};
 *     DWORD {@link #dmICMIntent};
 *     DWORD {@link #dmMediaType};
 *     DWORD {@link #dmDitherType};
 *     DWORD {@link #dmReserved1};
 *     DWORD {@link #dmReserved2};
 *     DWORD {@link #dmPanningWidth};
 *     DWORD {@link #dmPanningHeight};
 * }</code></pre>
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

    /**
     * A zero-terminated character array that specifies the "friendly" name of the printer or display; for example, "PCL/HP LaserJet" in the case of PCL/HP
     * LaserJet. This string is unique among device drivers. Note that this name may be truncated to fit in the {@code dmDeviceName} array.
     */
    @NativeType("TCHAR[32]")
    public ByteBuffer dmDeviceName() { return ndmDeviceName(address()); }
    /**
     * A zero-terminated character array that specifies the "friendly" name of the printer or display; for example, "PCL/HP LaserJet" in the case of PCL/HP
     * LaserJet. This string is unique among device drivers. Note that this name may be truncated to fit in the {@code dmDeviceName} array.
     */
    @NativeType("TCHAR[32]")
    public String dmDeviceNameString() { return ndmDeviceNameString(address()); }
    /**
     * the version number of the initialization data specification on which the structure is based. To ensure the correct version is used for any operating
     * system, use {@link GDI32#DM_SPECVERSION}.
     */
    @NativeType("WORD")
    public short dmSpecVersion() { return ndmSpecVersion(address()); }
    /** the driver version number assigned by the driver developer */
    @NativeType("WORD")
    public short dmDriverVersion() { return ndmDriverVersion(address()); }
    /**
     * specifies the size, in bytes, of the {@code DEVMODE} structure, not including any private driver-specific data that might follow the structure's
     * public members. Set this member to {@link #SIZEOF} to indicate the version of the {@code DEVMODE} structure being used.
     */
    @NativeType("WORD")
    public short dmSize() { return ndmSize(address()); }
    /**
     * contains the number of bytes of private driver-data that follow this structure. If a device driver does not use device-specific information, set this
     * member to zero.
     */
    @NativeType("WORD")
    public short dmDriverExtra() { return ndmDriverExtra(address()); }
    /**
     * specifies whether certain members of the {@code DEVMODE} structure have been initialized. If a member is initialized, its corresponding bit is set
     * otherwise the bit is clear. A driver supports only those {@code DEVMODE} members that are appropriate for the printer or display technology.
     */
    @NativeType("DWORD")
    public int dmFields() { return ndmFields(address()); }
    /** for printer devices only */
    public short dmOrientation() { return ndmOrientation(address()); }
    /** for printer devices only */
    public short dmPaperSize() { return ndmPaperSize(address()); }
    /** for printer devices only */
    public short dmPaperLength() { return ndmPaperLength(address()); }
    /** for printer devices only */
    public short dmPaperWidth() { return ndmPaperWidth(address()); }
    /** for printer devices only */
    public short dmScale() { return ndmScale(address()); }
    /** for printer devices only */
    public short dmCopies() { return ndmCopies(address()); }
    /** for printer devices only */
    public short dmDefaultSource() { return ndmDefaultSource(address()); }
    /** for printer devices only */
    public short dmPrintQuality() { return ndmPrintQuality(address()); }
    /**
     * for display devices only, a {@link POINTL} structure that indicates the positional coordinates of the display device in reference to the desktop
     * area. The primary display device is always located at coordinates (0,0).
     */
    public POINTL dmPosition() { return ndmPosition(address()); }
    /**
     * for display devices only, the orientation at which images should be presented. If {@link GDI32#DM_DISPLAYORIENTATION} is not set, this member must be
     * zero. If {@link GDI32#DM_DISPLAYORIENTATION} is set, this member must be one of the following values:<br>{@link GDI32#DMDO_DEFAULT}, {@link GDI32#DMDO_90}, {@link GDI32#DMDO_180}, {@link GDI32#DMDO_270}
     * 
     * <p>To determine whether the display orientation is portrait or landscape orientation, check the ratio of {@code dmPelsWidth} to
     * {@code dmPelsHeight}.</p>
     */
    @NativeType("DWORD")
    public int dmDisplayOrientation() { return ndmDisplayOrientation(address()); }
    /**
     * for fixed-resolution display devices only, how the display presents a low-resolution mode on a higher-resolution display. For example, if a
     * display device's resolution is fixed at 1024 x 768 pixels but its mode is set to 640 x 480 pixels, the device can either display a 640 x 480
     * image somewhere in the interior of the 1024 x 768 screen space or stretch the 640 x 480 image to fill the larger screen space. If
     * {@link GDI32#DM_DISPLAYFIXEDOUTPUT} is not set, this member must be zero. If {@link GDI32#DM_DISPLAYFIXEDOUTPUT} is set, this member must be one of the
     * following values:<br>{@link GDI32#DMDFO_DEFAULT}, {@link GDI32#DMDFO_CENTER}, {@link GDI32#DMDFO_STRETCH}
     */
    @NativeType("DWORD")
    public int dmDisplayFixedOutput() { return ndmDisplayFixedOutput(address()); }
    /** for printer devices only */
    public short dmColor() { return ndmColor(address()); }
    /** for printer devices only */
    public short dmDuplex() { return ndmDuplex(address()); }
    /** for printer devices only */
    public short dmYResolution() { return ndmYResolution(address()); }
    /** for printer devices only */
    public short dmTTOption() { return ndmTTOption(address()); }
    /** for printer devices only */
    public short dmCollate() { return ndmCollate(address()); }
    /** for printer devices only */
    @NativeType("TCHAR[32]")
    public ByteBuffer dmFormName() { return ndmFormName(address()); }
    /** for printer devices only */
    @NativeType("TCHAR[32]")
    public String dmFormNameString() { return ndmFormNameString(address()); }
    /** the number of pixels per logical inch */
    @NativeType("WORD")
    public short dmLogPixels() { return ndmLogPixels(address()); }
    /**
     * specifies the color resolution, in bits per pixel, of the display device (for example: 4 bits for 16 colors, 8 bits for 256 colors, or 16 bits for
     * 65,536 colors)
     */
    @NativeType("DWORD")
    public int dmBitsPerPel() { return ndmBitsPerPel(address()); }
    /** specifies the width, in pixels, of the visible device surface */
    @NativeType("DWORD")
    public int dmPelsWidth() { return ndmPelsWidth(address()); }
    /** specifies the height, in pixels, of the visible device surface */
    @NativeType("DWORD")
    public int dmPelsHeight() { return ndmPelsHeight(address()); }
    /** specifies the device's display mode, one or more of:<br>{@link GDI32#DM_INTERLACED}, {@link GDI32#DMDISPLAYFLAGS_TEXTMODE} */
    @NativeType("DWORD")
    public int dmDisplayFlags() { return ndmDisplayFlags(address()); }
    /** for printer devices only */
    @NativeType("DWORD")
    public int dmNup() { return ndmNup(address()); }
    /**
     * specifies the frequency, in hertz (cycles per second), of the display device in a particular mode. This value is also known as the display device's
     * vertical refresh rate.
     * 
     * <p>When you call the {@link User32#EnumDisplaySettingsEx} function, the {@code dmDisplayFrequency} member may return with the value 0 or 1. These values
     * represent the display hardware's default refresh rate. This default rate is typically set by switches on a display card or computer motherboard, or by
     * a configuration program that does not use display functions such as {@code ChangeDisplaySettingsEx}.</p>
     */
    @NativeType("DWORD")
    public int dmDisplayFrequency() { return ndmDisplayFrequency(address()); }
    /** for printer devices only */
    @NativeType("DWORD")
    public int dmICMMethod() { return ndmICMMethod(address()); }
    /** for printer devices only */
    @NativeType("DWORD")
    public int dmICMIntent() { return ndmICMIntent(address()); }
    /** for printer devices only */
    @NativeType("DWORD")
    public int dmMediaType() { return ndmMediaType(address()); }
    /** for printer devices only */
    @NativeType("DWORD")
    public int dmDitherType() { return ndmDitherType(address()); }
    /** not used; must be zero */
    @NativeType("DWORD")
    public int dmReserved1() { return ndmReserved1(address()); }
    /** not used; must be zero */
    @NativeType("DWORD")
    public int dmReserved2() { return ndmReserved2(address()); }
    /** this member must be zero */
    @NativeType("DWORD")
    public int dmPanningWidth() { return ndmPanningWidth(address()); }
    /** this member must be zero */
    @NativeType("DWORD")
    public int dmPanningHeight() { return ndmPanningHeight(address()); }

    /** Sets the specified value to the {@link #dmSpecVersion} field. */
    public DEVMODE dmSpecVersion(@NativeType("WORD") short value) { ndmSpecVersion(address(), value); return this; }
    /** Sets the specified value to the {@link #dmSize} field. */
    public DEVMODE dmSize(@NativeType("WORD") short value) { ndmSize(address(), value); return this; }
    /** Sets the specified value to the {@link #dmDriverExtra} field. */
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
    @Nullable
    public static DEVMODE createSafe(long address) {
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
    @Nullable
    public static DEVMODE.Buffer createSafe(long address, int capacity) {
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
    public static short ndmSpecVersion(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMSPECVERSION); }
    /** Unsafe version of {@link #dmDriverVersion}. */
    public static short ndmDriverVersion(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMDRIVERVERSION); }
    /** Unsafe version of {@link #dmSize}. */
    public static short ndmSize(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMSIZE); }
    /** Unsafe version of {@link #dmDriverExtra}. */
    public static short ndmDriverExtra(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMDRIVEREXTRA); }
    /** Unsafe version of {@link #dmFields}. */
    public static int ndmFields(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMFIELDS); }
    /** Unsafe version of {@link #dmOrientation}. */
    public static short ndmOrientation(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMORIENTATION); }
    /** Unsafe version of {@link #dmPaperSize}. */
    public static short ndmPaperSize(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMPAPERSIZE); }
    /** Unsafe version of {@link #dmPaperLength}. */
    public static short ndmPaperLength(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMPAPERLENGTH); }
    /** Unsafe version of {@link #dmPaperWidth}. */
    public static short ndmPaperWidth(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMPAPERWIDTH); }
    /** Unsafe version of {@link #dmScale}. */
    public static short ndmScale(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMSCALE); }
    /** Unsafe version of {@link #dmCopies}. */
    public static short ndmCopies(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMCOPIES); }
    /** Unsafe version of {@link #dmDefaultSource}. */
    public static short ndmDefaultSource(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMDEFAULTSOURCE); }
    /** Unsafe version of {@link #dmPrintQuality}. */
    public static short ndmPrintQuality(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMPRINTQUALITY); }
    /** Unsafe version of {@link #dmPosition}. */
    public static POINTL ndmPosition(long struct) { return POINTL.create(struct + DEVMODE.DMPOSITION); }
    /** Unsafe version of {@link #dmDisplayOrientation}. */
    public static int ndmDisplayOrientation(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMDISPLAYORIENTATION); }
    /** Unsafe version of {@link #dmDisplayFixedOutput}. */
    public static int ndmDisplayFixedOutput(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMDISPLAYFIXEDOUTPUT); }
    /** Unsafe version of {@link #dmColor}. */
    public static short ndmColor(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMCOLOR); }
    /** Unsafe version of {@link #dmDuplex}. */
    public static short ndmDuplex(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMDUPLEX); }
    /** Unsafe version of {@link #dmYResolution}. */
    public static short ndmYResolution(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMYRESOLUTION); }
    /** Unsafe version of {@link #dmTTOption}. */
    public static short ndmTTOption(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMTTOPTION); }
    /** Unsafe version of {@link #dmCollate}. */
    public static short ndmCollate(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMCOLLATE); }
    /** Unsafe version of {@link #dmFormName}. */
    public static ByteBuffer ndmFormName(long struct) { return memByteBuffer(struct + DEVMODE.DMFORMNAME, 32 * 2); }
    /** Unsafe version of {@link #dmFormNameString}. */
    public static String ndmFormNameString(long struct) { return memUTF16(struct + DEVMODE.DMFORMNAME); }
    /** Unsafe version of {@link #dmLogPixels}. */
    public static short ndmLogPixels(long struct) { return UNSAFE.getShort(null, struct + DEVMODE.DMLOGPIXELS); }
    /** Unsafe version of {@link #dmBitsPerPel}. */
    public static int ndmBitsPerPel(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMBITSPERPEL); }
    /** Unsafe version of {@link #dmPelsWidth}. */
    public static int ndmPelsWidth(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMPELSWIDTH); }
    /** Unsafe version of {@link #dmPelsHeight}. */
    public static int ndmPelsHeight(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMPELSHEIGHT); }
    /** Unsafe version of {@link #dmDisplayFlags}. */
    public static int ndmDisplayFlags(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMDISPLAYFLAGS); }
    /** Unsafe version of {@link #dmNup}. */
    public static int ndmNup(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMNUP); }
    /** Unsafe version of {@link #dmDisplayFrequency}. */
    public static int ndmDisplayFrequency(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMDISPLAYFREQUENCY); }
    /** Unsafe version of {@link #dmICMMethod}. */
    public static int ndmICMMethod(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMICMMETHOD); }
    /** Unsafe version of {@link #dmICMIntent}. */
    public static int ndmICMIntent(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMICMINTENT); }
    /** Unsafe version of {@link #dmMediaType}. */
    public static int ndmMediaType(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMMEDIATYPE); }
    /** Unsafe version of {@link #dmDitherType}. */
    public static int ndmDitherType(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMDITHERTYPE); }
    /** Unsafe version of {@link #dmReserved1}. */
    public static int ndmReserved1(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMRESERVED1); }
    /** Unsafe version of {@link #dmReserved2}. */
    public static int ndmReserved2(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMRESERVED2); }
    /** Unsafe version of {@link #dmPanningWidth}. */
    public static int ndmPanningWidth(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMPANNINGWIDTH); }
    /** Unsafe version of {@link #dmPanningHeight}. */
    public static int ndmPanningHeight(long struct) { return UNSAFE.getInt(null, struct + DEVMODE.DMPANNINGHEIGHT); }

    /** Unsafe version of {@link #dmSpecVersion(short) dmSpecVersion}. */
    public static void ndmSpecVersion(long struct, short value) { UNSAFE.putShort(null, struct + DEVMODE.DMSPECVERSION, value); }
    /** Unsafe version of {@link #dmSize(short) dmSize}. */
    public static void ndmSize(long struct, short value) { UNSAFE.putShort(null, struct + DEVMODE.DMSIZE, value); }
    /** Unsafe version of {@link #dmDriverExtra(short) dmDriverExtra}. */
    public static void ndmDriverExtra(long struct, short value) { UNSAFE.putShort(null, struct + DEVMODE.DMDRIVEREXTRA, value); }

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
        protected DEVMODE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link DEVMODE#dmDeviceName} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer dmDeviceName() { return DEVMODE.ndmDeviceName(address()); }
        /** @return the null-terminated string stored in the {@link DEVMODE#dmDeviceName} field. */
        @NativeType("TCHAR[32]")
        public String dmDeviceNameString() { return DEVMODE.ndmDeviceNameString(address()); }
        /** @return the value of the {@link DEVMODE#dmSpecVersion} field. */
        @NativeType("WORD")
        public short dmSpecVersion() { return DEVMODE.ndmSpecVersion(address()); }
        /** @return the value of the {@link DEVMODE#dmDriverVersion} field. */
        @NativeType("WORD")
        public short dmDriverVersion() { return DEVMODE.ndmDriverVersion(address()); }
        /** @return the value of the {@link DEVMODE#dmSize} field. */
        @NativeType("WORD")
        public short dmSize() { return DEVMODE.ndmSize(address()); }
        /** @return the value of the {@link DEVMODE#dmDriverExtra} field. */
        @NativeType("WORD")
        public short dmDriverExtra() { return DEVMODE.ndmDriverExtra(address()); }
        /** @return the value of the {@link DEVMODE#dmFields} field. */
        @NativeType("DWORD")
        public int dmFields() { return DEVMODE.ndmFields(address()); }
        /** @return the value of the {@link DEVMODE#dmOrientation} field. */
        public short dmOrientation() { return DEVMODE.ndmOrientation(address()); }
        /** @return the value of the {@link DEVMODE#dmPaperSize} field. */
        public short dmPaperSize() { return DEVMODE.ndmPaperSize(address()); }
        /** @return the value of the {@link DEVMODE#dmPaperLength} field. */
        public short dmPaperLength() { return DEVMODE.ndmPaperLength(address()); }
        /** @return the value of the {@link DEVMODE#dmPaperWidth} field. */
        public short dmPaperWidth() { return DEVMODE.ndmPaperWidth(address()); }
        /** @return the value of the {@link DEVMODE#dmScale} field. */
        public short dmScale() { return DEVMODE.ndmScale(address()); }
        /** @return the value of the {@link DEVMODE#dmCopies} field. */
        public short dmCopies() { return DEVMODE.ndmCopies(address()); }
        /** @return the value of the {@link DEVMODE#dmDefaultSource} field. */
        public short dmDefaultSource() { return DEVMODE.ndmDefaultSource(address()); }
        /** @return the value of the {@link DEVMODE#dmPrintQuality} field. */
        public short dmPrintQuality() { return DEVMODE.ndmPrintQuality(address()); }
        /** @return a {@link POINTL} view of the {@link DEVMODE#dmPosition} field. */
        public POINTL dmPosition() { return DEVMODE.ndmPosition(address()); }
        /** @return the value of the {@link DEVMODE#dmDisplayOrientation} field. */
        @NativeType("DWORD")
        public int dmDisplayOrientation() { return DEVMODE.ndmDisplayOrientation(address()); }
        /** @return the value of the {@link DEVMODE#dmDisplayFixedOutput} field. */
        @NativeType("DWORD")
        public int dmDisplayFixedOutput() { return DEVMODE.ndmDisplayFixedOutput(address()); }
        /** @return the value of the {@link DEVMODE#dmColor} field. */
        public short dmColor() { return DEVMODE.ndmColor(address()); }
        /** @return the value of the {@link DEVMODE#dmDuplex} field. */
        public short dmDuplex() { return DEVMODE.ndmDuplex(address()); }
        /** @return the value of the {@link DEVMODE#dmYResolution} field. */
        public short dmYResolution() { return DEVMODE.ndmYResolution(address()); }
        /** @return the value of the {@link DEVMODE#dmTTOption} field. */
        public short dmTTOption() { return DEVMODE.ndmTTOption(address()); }
        /** @return the value of the {@link DEVMODE#dmCollate} field. */
        public short dmCollate() { return DEVMODE.ndmCollate(address()); }
        /** @return a {@link ByteBuffer} view of the {@link DEVMODE#dmFormName} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer dmFormName() { return DEVMODE.ndmFormName(address()); }
        /** @return the null-terminated string stored in the {@link DEVMODE#dmFormName} field. */
        @NativeType("TCHAR[32]")
        public String dmFormNameString() { return DEVMODE.ndmFormNameString(address()); }
        /** @return the value of the {@link DEVMODE#dmLogPixels} field. */
        @NativeType("WORD")
        public short dmLogPixels() { return DEVMODE.ndmLogPixels(address()); }
        /** @return the value of the {@link DEVMODE#dmBitsPerPel} field. */
        @NativeType("DWORD")
        public int dmBitsPerPel() { return DEVMODE.ndmBitsPerPel(address()); }
        /** @return the value of the {@link DEVMODE#dmPelsWidth} field. */
        @NativeType("DWORD")
        public int dmPelsWidth() { return DEVMODE.ndmPelsWidth(address()); }
        /** @return the value of the {@link DEVMODE#dmPelsHeight} field. */
        @NativeType("DWORD")
        public int dmPelsHeight() { return DEVMODE.ndmPelsHeight(address()); }
        /** @return the value of the {@link DEVMODE#dmDisplayFlags} field. */
        @NativeType("DWORD")
        public int dmDisplayFlags() { return DEVMODE.ndmDisplayFlags(address()); }
        /** @return the value of the {@link DEVMODE#dmNup} field. */
        @NativeType("DWORD")
        public int dmNup() { return DEVMODE.ndmNup(address()); }
        /** @return the value of the {@link DEVMODE#dmDisplayFrequency} field. */
        @NativeType("DWORD")
        public int dmDisplayFrequency() { return DEVMODE.ndmDisplayFrequency(address()); }
        /** @return the value of the {@link DEVMODE#dmICMMethod} field. */
        @NativeType("DWORD")
        public int dmICMMethod() { return DEVMODE.ndmICMMethod(address()); }
        /** @return the value of the {@link DEVMODE#dmICMIntent} field. */
        @NativeType("DWORD")
        public int dmICMIntent() { return DEVMODE.ndmICMIntent(address()); }
        /** @return the value of the {@link DEVMODE#dmMediaType} field. */
        @NativeType("DWORD")
        public int dmMediaType() { return DEVMODE.ndmMediaType(address()); }
        /** @return the value of the {@link DEVMODE#dmDitherType} field. */
        @NativeType("DWORD")
        public int dmDitherType() { return DEVMODE.ndmDitherType(address()); }
        /** @return the value of the {@link DEVMODE#dmReserved1} field. */
        @NativeType("DWORD")
        public int dmReserved1() { return DEVMODE.ndmReserved1(address()); }
        /** @return the value of the {@link DEVMODE#dmReserved2} field. */
        @NativeType("DWORD")
        public int dmReserved2() { return DEVMODE.ndmReserved2(address()); }
        /** @return the value of the {@link DEVMODE#dmPanningWidth} field. */
        @NativeType("DWORD")
        public int dmPanningWidth() { return DEVMODE.ndmPanningWidth(address()); }
        /** @return the value of the {@link DEVMODE#dmPanningHeight} field. */
        @NativeType("DWORD")
        public int dmPanningHeight() { return DEVMODE.ndmPanningHeight(address()); }

        /** Sets the specified value to the {@link DEVMODE#dmSpecVersion} field. */
        public DEVMODE.Buffer dmSpecVersion(@NativeType("WORD") short value) { DEVMODE.ndmSpecVersion(address(), value); return this; }
        /** Sets the specified value to the {@link DEVMODE#dmSize} field. */
        public DEVMODE.Buffer dmSize(@NativeType("WORD") short value) { DEVMODE.ndmSize(address(), value); return this; }
        /** Sets the specified value to the {@link DEVMODE#dmDriverExtra} field. */
        public DEVMODE.Buffer dmDriverExtra(@NativeType("WORD") short value) { DEVMODE.ndmDriverExtra(address(), value); return this; }

    }

}