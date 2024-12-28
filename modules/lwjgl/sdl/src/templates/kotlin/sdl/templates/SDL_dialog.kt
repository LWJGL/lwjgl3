/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_dialog = "SDLDialog".nativeClassSDL("SDL_dialog") {
    StringConstant(
        "PROP_FILE_DIALOG_FILTERS_POINTER".."SDL.filedialog.filters",
        "PROP_FILE_DIALOG_NFILTERS_NUMBER".."SDL.filedialog.nfilters",
        "PROP_FILE_DIALOG_WINDOW_POINTER".."SDL.filedialog.window",
        "PROP_FILE_DIALOG_LOCATION_STRING".."SDL.filedialog.location",
        "PROP_FILE_DIALOG_MANY_BOOLEAN".."SDL.filedialog.many",
        "PROP_FILE_DIALOG_TITLE_STRING".."SDL.filedialog.title",
        "PROP_FILE_DIALOG_ACCEPT_STRING".."SDL.filedialog.accept",
        "PROP_FILE_DIALOG_CANCEL_STRING".."SDL.filedialog.cancel"
    )

    EnumConstant(
        "FILEDIALOG_OPENFILE".enum("0"),
        "FILEDIALOG_SAVEFILE".enum,
        "FILEDIALOG_OPENFOLDER".enum
    )

    void(
        "ShowOpenFileDialog",

        SDL_DialogFileCallback("callback"),
        nullable..opaque_p("userdata"),
        nullable..SDL_Window.p("window"),
        nullable..SDL_DialogFileFilter.const.p("filters"),
        AutoSize("filters")..int("nfilters"),
        nullable..charUTF8.const.p("default_location"),
        bool("allow_many")
    )

    void(
        "ShowSaveFileDialog",

        SDL_DialogFileCallback("callback"),
        nullable..opaque_p("userdata"),
        nullable..SDL_Window.p("window"),
        nullable..SDL_DialogFileFilter.const.p("filters"),
        AutoSize("filters")..int("nfilters"),
        nullable..charUTF8.const.p("default_location")
    )

    void(
        "ShowOpenFolderDialog",

        SDL_DialogFileCallback("callback"),
        nullable..opaque_p("userdata"),
        nullable..SDL_Window.p("window"),
        nullable..charUTF8.const.p("default_location"),
        bool("allow_many")
    )

    void(
        "ShowFileDialogWithProperties",

        SDL_FileDialogType("type"),
        SDL_DialogFileCallback("callback"),
        nullable..opaque_p("userdata"),
        SDL_PropertiesID("props")
    )
}