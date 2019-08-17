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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code dmDeviceName[32]} &ndash; 
 * A zero-terminated character array that specifies the "friendly" name of the printer or display; for example, "PCL/HP LaserJet" in the case of PCL/HP
 * LaserJet. This string is unique among device drivers. Note that this name may be truncated to fit in the {@code dmDeviceName} array.</li>
 * <li>{@code dmSpecVersion} &ndash; 
 * the version number of the initialization data specification on which the structure is based. To ensure the correct version is used for any operating
 * system, use {@link GDI32#DM_SPECVERSION}.</li>
 * <li>{@code dmDriverVersion} &ndash; the driver version number assigned by the driver developer</li>
 * <li>{@code dmSize} &ndash; 
 * specifies the size, in bytes, of the {@code DEVMODE} structure, not including any private driver-specific data that might follow the structure's
 * public members. Set this member to {@link #SIZEOF} to indicate the version of the {@code DEVMODE} structure being used.</li>
 * <li>{@code dmDriverExtra} &ndash; 
 * contains the number of bytes of private driver-data that follow this structure. If a device driver does not use device-specific information, set this
 * member to zero.</li>
 * <li>{@code dmFields} &ndash; 
 * specifies whether certain members of the {@code DEVMODE} structure have been initialized. If a member is initialized, its corresponding bit is set
 * otherwise the bit is clear. A driver supports only those {@code DEVMODE} members that are appropriate for the printer or display technology.</li>
 * <li><em>&lt;union&gt;</em>
 * 
 * <ul>
 * <li><em>&lt;struct&gt;</em>
 * 
 * <ul>
 * <li>{@code dmOrientation} &ndash; for printer devices only</li>
 * <li>{@code dmPaperSize} &ndash; for printer devices only</li>
 * <li>{@code dmPaperLength} &ndash; for printer devices only</li>
 * <li>{@code dmPaperWidth} &ndash; for printer devices only</li>
 * <li>{@code dmScale} &ndash; for printer devices only</li>
 * <li>{@code dmCopies} &ndash; for printer devices only</li>
 * <li>{@code dmDefaultSource} &ndash; for printer devices only</li>
 * <li>{@code dmPrintQuality} &ndash; for printer devices only</li>
 * </ul></li>
 * <li><em>&lt;struct&gt;</em>
 * 
 * <ul>
 * <li>{@code dmPosition} &ndash; 
 * for display devices only, a {@link POINTL} structure that indicates the positional coordinates of the display device in reference to the desktop
 * area. The primary display device is always located at coordinates (0,0).</li>
 * <li>{@code dmDisplayOrientation} &ndash; 
 * for display devices only, the orientation at which images should be presented. If {@link GDI32#DM_DISPLAYORIENTATION} is not set, this member must be
 * zero. If {@link GDI32#DM_DISPLAYORIENTATION} is set, this member must be one of the following values:<br>{@link GDI32#DMDO_DEFAULT}, {@link GDI32#DMDO_90}, {@link GDI32#DMDO_180}, {@link GDI32#DMDO_270}
 * 
 * <p>To determine whether the display orientation is portrait or landscape orientation, check the ratio of {@code dmPelsWidth} to
 * {@code dmPelsHeight}.</p></li>
 * <li>{@code dmDisplayFixedOutput} &ndash; 
 * for fixed-resolution display devices only, how the display presents a low-resolution mode on a higher-resolution display. For example, if a
 * display device's resolution is fixed at 1024 x 768 pixels but its mode is set to 640 x 480 pixels, the device can either display a 640 x 480
 * image somewhere in the interior of the 1024 x 768 screen space or stretch the 640 x 480 image to fill the larger screen space. If
 * {@link GDI32#DM_DISPLAYFIXEDOUTPUT} is not set, this member must be zero. If {@link GDI32#DM_DISPLAYFIXEDOUTPUT} is set, this member must be one of the
 * following values:<br>{@link GDI32#DMDFO_DEFAULT}, {@link GDI32#DMDFO_CENTER}, {@link GDI32#DMDFO_STRETCH}</li>
 * </ul></li>
 * </ul></li>
 * <li>{@code dmColor} &ndash; for printer devices only</li>
 * <li>{@code dmDuplex} &ndash; for printer devices only</li>
 * <li>{@code dmYResolution} &ndash; for printer devices only</li>
 * <li>{@code dmTTOption} &ndash; for printer devices only</li>
 * <li>{@code dmCollate} &ndash; for printer devices only</li>
 * <li>{@code dmFormName[32]} &ndash; for printer devices only</li>
 * <li>{@code dmLogPixels} &ndash; the number of pixels per logical inch</li>
 * <li>{@code dmBitsPerPel} &ndash; 
 * specifies the color resolution, in bits per pixel, of the display device (for example: 4 bits for 16 colors, 8 bits for 256 colors, or 16 bits for
 * 65,536 colors)</li>
 * <li>{@code dmPelsWidth} &ndash; specifies the width, in pixels, of the visible device surface</li>
 * <li>{@code dmPelsHeight} &ndash; specifies the height, in pixels, of the visible device surface</li>
 * <li><em>&lt;union&gt;</em>
 * 
 * <ul>
 * <li>{@code dmDisplayFlags} &ndash; specifies the device's display mode, one or more of:<br>{@link GDI32#DM_INTERLACED}, {@link GDI32#DMDISPLAYFLAGS_TEXTMODE}</li>
 * <li>{@code dmNup} &ndash; for printer devices only</li>
 * </ul></li>
 * <li>{@code dmDisplayFrequency} &ndash; 
 * specifies the frequency, in hertz (cycles per second), of the display device in a particular mode. This value is also known as the display device's
 * vertical refresh rate.
 * 
 * <p>When you call the {@link User32#EnumDisplaySettingsEx} function, the {@code dmDisplayFrequency} member may return with the value 0 or 1. These values
 * represent the display hardware's default refresh rate. This default rate is typically set by switches on a display card or computer motherboard, or by
 * a configuration program that does not use display functions such as {@code ChangeDisplaySettingsEx}.</p></li>
 * <li>{@code dmICMMethod} &ndash; for printer devices only</li>
 * <li>{@code dmICMIntent} &ndash; for printer devices only</li>
 * <li>{@code dmMediaType} &ndash; for printer devices only</li>
 * <li>{@code dmDitherType} &ndash; for printer devices only</li>
 * <li>{@code dmReserved1} &ndash; not used; must be zero</li>
 * <li>{@code dmReserved2} &ndash; not used; must be zero</li>
 * <li>{@code dmPanningWidth} &ndash; this member must be zero</li>
 * <li>{@code dmPanningHeight} &ndash; this member must be zero</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
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
 * }</code></pre>
 */
public class DEVMODE extends Struct implements NativeResource {

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

    /** Returns a {@link ByteBuffer} view of the {@code dmDeviceName} field. */
    @NativeType("TCHAR[32]")
    public ByteBuffer dmDeviceName() { return ndmDeviceName(address()); }
    /** Decodes the null-terminated string stored in the {@code dmDeviceName} field. */
    @NativeType("TCHAR[32]")
    public String dmDeviceNameString() { return ndmDeviceNameString(address()); }
    /** Returns the value of the {@code dmSpecVersion} field. */
    @NativeType("WORD")
    public short dmSpecVersion() { return ndmSpecVersion(address()); }
    /** Returns the value of the {@code dmDriverVersion} field. */
    @NativeType("WORD")
    public short dmDriverVersion() { return ndmDriverVersion(address()); }
    /** Returns the value of the {@code dmSize} field. */
    @NativeType("WORD")
    public short dmSize() { return ndmSize(address()); }
    /** Returns the value of the {@code dmDriverExtra} field. */
    @NativeType("WORD")
    public short dmDriverExtra() { return ndmDriverExtra(address()); }
    /** Returns the value of the {@code dmFields} field. */
    @NativeType("DWORD")
    public int dmFields() { return ndmFields(address()); }
    /** Returns the value of the {@code dmOrientation} field. */
    public short dmOrientation() { return ndmOrientation(address()); }
    /** Returns the value of the {@code dmPaperSize} field. */
    public short dmPaperSize() { return ndmPaperSize(address()); }
    /** Returns the value of the {@code dmPaperLength} field. */
    public short dmPaperLength() { return ndmPaperLength(address()); }
    /** Returns the value of the {@code dmPaperWidth} field. */
    public short dmPaperWidth() { return ndmPaperWidth(address()); }
    /** Returns the value of the {@code dmScale} field. */
    public short dmScale() { return ndmScale(address()); }
    /** Returns the value of the {@code dmCopies} field. */
    public short dmCopies() { return ndmCopies(address()); }
    /** Returns the value of the {@code dmDefaultSource} field. */
    public short dmDefaultSource() { return ndmDefaultSource(address()); }
    /** Returns the value of the {@code dmPrintQuality} field. */
    public short dmPrintQuality() { return ndmPrintQuality(address()); }
    /** Returns a {@link POINTL} view of the {@code dmPosition} field. */
    public POINTL dmPosition() { return ndmPosition(address()); }
    /** Returns the value of the {@code dmDisplayOrientation} field. */
    @NativeType("DWORD")
    public int dmDisplayOrientation() { return ndmDisplayOrientation(address()); }
    /** Returns the value of the {@code dmDisplayFixedOutput} field. */
    @NativeType("DWORD")
    public int dmDisplayFixedOutput() { return ndmDisplayFixedOutput(address()); }
    /** Returns the value of the {@code dmColor} field. */
    public short dmColor() { return ndmColor(address()); }
    /** Returns the value of the {@code dmDuplex} field. */
    public short dmDuplex() { return ndmDuplex(address()); }
    /** Returns the value of the {@code dmYResolution} field. */
    public short dmYResolution() { return ndmYResolution(address()); }
    /** Returns the value of the {@code dmTTOption} field. */
    public short dmTTOption() { return ndmTTOption(address()); }
    /** Returns the value of the {@code dmCollate} field. */
    public short dmCollate() { return ndmCollate(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code dmFormName} field. */
    @NativeType("TCHAR[32]")
    public ByteBuffer dmFormName() { return ndmFormName(address()); }
    /** Decodes the null-terminated string stored in the {@code dmFormName} field. */
    @NativeType("TCHAR[32]")
    public String dmFormNameString() { return ndmFormNameString(address()); }
    /** Returns the value of the {@code dmLogPixels} field. */
    @NativeType("WORD")
    public short dmLogPixels() { return ndmLogPixels(address()); }
    /** Returns the value of the {@code dmBitsPerPel} field. */
    @NativeType("DWORD")
    public int dmBitsPerPel() { return ndmBitsPerPel(address()); }
    /** Returns the value of the {@code dmPelsWidth} field. */
    @NativeType("DWORD")
    public int dmPelsWidth() { return ndmPelsWidth(address()); }
    /** Returns the value of the {@code dmPelsHeight} field. */
    @NativeType("DWORD")
    public int dmPelsHeight() { return ndmPelsHeight(address()); }
    /** Returns the value of the {@code dmDisplayFlags} field. */
    @NativeType("DWORD")
    public int dmDisplayFlags() { return ndmDisplayFlags(address()); }
    /** Returns the value of the {@code dmNup} field. */
    @NativeType("DWORD")
    public int dmNup() { return ndmNup(address()); }
    /** Returns the value of the {@code dmDisplayFrequency} field. */
    @NativeType("DWORD")
    public int dmDisplayFrequency() { return ndmDisplayFrequency(address()); }
    /** Returns the value of the {@code dmICMMethod} field. */
    @NativeType("DWORD")
    public int dmICMMethod() { return ndmICMMethod(address()); }
    /** Returns the value of the {@code dmICMIntent} field. */
    @NativeType("DWORD")
    public int dmICMIntent() { return ndmICMIntent(address()); }
    /** Returns the value of the {@code dmMediaType} field. */
    @NativeType("DWORD")
    public int dmMediaType() { return ndmMediaType(address()); }
    /** Returns the value of the {@code dmDitherType} field. */
    @NativeType("DWORD")
    public int dmDitherType() { return ndmDitherType(address()); }
    /** Returns the value of the {@code dmReserved1} field. */
    @NativeType("DWORD")
    public int dmReserved1() { return ndmReserved1(address()); }
    /** Returns the value of the {@code dmReserved2} field. */
    @NativeType("DWORD")
    public int dmReserved2() { return ndmReserved2(address()); }
    /** Returns the value of the {@code dmPanningWidth} field. */
    @NativeType("DWORD")
    public int dmPanningWidth() { return ndmPanningWidth(address()); }
    /** Returns the value of the {@code dmPanningHeight} field. */
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
        return wrap(DEVMODE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DEVMODE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DEVMODE calloc() {
        return wrap(DEVMODE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DEVMODE} instance allocated with {@link BufferUtils}. */
    public static DEVMODE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DEVMODE.class, memAddress(container), container);
    }

    /** Returns a new {@code DEVMODE} instance for the specified memory address. */
    public static DEVMODE create(long address) {
        return wrap(DEVMODE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DEVMODE createSafe(long address) {
        return address == NULL ? null : wrap(DEVMODE.class, address);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DEVMODE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DEVMODE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code DEVMODE} instance allocated on the thread-local {@link MemoryStack}. */
    public static DEVMODE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code DEVMODE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DEVMODE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code DEVMODE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DEVMODE mallocStack(MemoryStack stack) {
        return wrap(DEVMODE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DEVMODE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DEVMODE callocStack(MemoryStack stack) {
        return wrap(DEVMODE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DEVMODE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DEVMODE.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DEVMODE#SIZEOF}, and its mark will be undefined.
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

        /** Returns a {@link ByteBuffer} view of the {@code dmDeviceName} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer dmDeviceName() { return DEVMODE.ndmDeviceName(address()); }
        /** Decodes the null-terminated string stored in the {@code dmDeviceName} field. */
        @NativeType("TCHAR[32]")
        public String dmDeviceNameString() { return DEVMODE.ndmDeviceNameString(address()); }
        /** Returns the value of the {@code dmSpecVersion} field. */
        @NativeType("WORD")
        public short dmSpecVersion() { return DEVMODE.ndmSpecVersion(address()); }
        /** Returns the value of the {@code dmDriverVersion} field. */
        @NativeType("WORD")
        public short dmDriverVersion() { return DEVMODE.ndmDriverVersion(address()); }
        /** Returns the value of the {@code dmSize} field. */
        @NativeType("WORD")
        public short dmSize() { return DEVMODE.ndmSize(address()); }
        /** Returns the value of the {@code dmDriverExtra} field. */
        @NativeType("WORD")
        public short dmDriverExtra() { return DEVMODE.ndmDriverExtra(address()); }
        /** Returns the value of the {@code dmFields} field. */
        @NativeType("DWORD")
        public int dmFields() { return DEVMODE.ndmFields(address()); }
        /** Returns the value of the {@code dmOrientation} field. */
        public short dmOrientation() { return DEVMODE.ndmOrientation(address()); }
        /** Returns the value of the {@code dmPaperSize} field. */
        public short dmPaperSize() { return DEVMODE.ndmPaperSize(address()); }
        /** Returns the value of the {@code dmPaperLength} field. */
        public short dmPaperLength() { return DEVMODE.ndmPaperLength(address()); }
        /** Returns the value of the {@code dmPaperWidth} field. */
        public short dmPaperWidth() { return DEVMODE.ndmPaperWidth(address()); }
        /** Returns the value of the {@code dmScale} field. */
        public short dmScale() { return DEVMODE.ndmScale(address()); }
        /** Returns the value of the {@code dmCopies} field. */
        public short dmCopies() { return DEVMODE.ndmCopies(address()); }
        /** Returns the value of the {@code dmDefaultSource} field. */
        public short dmDefaultSource() { return DEVMODE.ndmDefaultSource(address()); }
        /** Returns the value of the {@code dmPrintQuality} field. */
        public short dmPrintQuality() { return DEVMODE.ndmPrintQuality(address()); }
        /** Returns a {@link POINTL} view of the {@code dmPosition} field. */
        public POINTL dmPosition() { return DEVMODE.ndmPosition(address()); }
        /** Returns the value of the {@code dmDisplayOrientation} field. */
        @NativeType("DWORD")
        public int dmDisplayOrientation() { return DEVMODE.ndmDisplayOrientation(address()); }
        /** Returns the value of the {@code dmDisplayFixedOutput} field. */
        @NativeType("DWORD")
        public int dmDisplayFixedOutput() { return DEVMODE.ndmDisplayFixedOutput(address()); }
        /** Returns the value of the {@code dmColor} field. */
        public short dmColor() { return DEVMODE.ndmColor(address()); }
        /** Returns the value of the {@code dmDuplex} field. */
        public short dmDuplex() { return DEVMODE.ndmDuplex(address()); }
        /** Returns the value of the {@code dmYResolution} field. */
        public short dmYResolution() { return DEVMODE.ndmYResolution(address()); }
        /** Returns the value of the {@code dmTTOption} field. */
        public short dmTTOption() { return DEVMODE.ndmTTOption(address()); }
        /** Returns the value of the {@code dmCollate} field. */
        public short dmCollate() { return DEVMODE.ndmCollate(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code dmFormName} field. */
        @NativeType("TCHAR[32]")
        public ByteBuffer dmFormName() { return DEVMODE.ndmFormName(address()); }
        /** Decodes the null-terminated string stored in the {@code dmFormName} field. */
        @NativeType("TCHAR[32]")
        public String dmFormNameString() { return DEVMODE.ndmFormNameString(address()); }
        /** Returns the value of the {@code dmLogPixels} field. */
        @NativeType("WORD")
        public short dmLogPixels() { return DEVMODE.ndmLogPixels(address()); }
        /** Returns the value of the {@code dmBitsPerPel} field. */
        @NativeType("DWORD")
        public int dmBitsPerPel() { return DEVMODE.ndmBitsPerPel(address()); }
        /** Returns the value of the {@code dmPelsWidth} field. */
        @NativeType("DWORD")
        public int dmPelsWidth() { return DEVMODE.ndmPelsWidth(address()); }
        /** Returns the value of the {@code dmPelsHeight} field. */
        @NativeType("DWORD")
        public int dmPelsHeight() { return DEVMODE.ndmPelsHeight(address()); }
        /** Returns the value of the {@code dmDisplayFlags} field. */
        @NativeType("DWORD")
        public int dmDisplayFlags() { return DEVMODE.ndmDisplayFlags(address()); }
        /** Returns the value of the {@code dmNup} field. */
        @NativeType("DWORD")
        public int dmNup() { return DEVMODE.ndmNup(address()); }
        /** Returns the value of the {@code dmDisplayFrequency} field. */
        @NativeType("DWORD")
        public int dmDisplayFrequency() { return DEVMODE.ndmDisplayFrequency(address()); }
        /** Returns the value of the {@code dmICMMethod} field. */
        @NativeType("DWORD")
        public int dmICMMethod() { return DEVMODE.ndmICMMethod(address()); }
        /** Returns the value of the {@code dmICMIntent} field. */
        @NativeType("DWORD")
        public int dmICMIntent() { return DEVMODE.ndmICMIntent(address()); }
        /** Returns the value of the {@code dmMediaType} field. */
        @NativeType("DWORD")
        public int dmMediaType() { return DEVMODE.ndmMediaType(address()); }
        /** Returns the value of the {@code dmDitherType} field. */
        @NativeType("DWORD")
        public int dmDitherType() { return DEVMODE.ndmDitherType(address()); }
        /** Returns the value of the {@code dmReserved1} field. */
        @NativeType("DWORD")
        public int dmReserved1() { return DEVMODE.ndmReserved1(address()); }
        /** Returns the value of the {@code dmReserved2} field. */
        @NativeType("DWORD")
        public int dmReserved2() { return DEVMODE.ndmReserved2(address()); }
        /** Returns the value of the {@code dmPanningWidth} field. */
        @NativeType("DWORD")
        public int dmPanningWidth() { return DEVMODE.ndmPanningWidth(address()); }
        /** Returns the value of the {@code dmPanningHeight} field. */
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