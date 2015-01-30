/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Ada2Java                                               *
 * Generation timestamp: 201501031502                                        *
 *****************************************************************************/

package jprinter.Ada2Java;

/**
 */
@SuppressWarnings("all")
public final class Library {
   public static final com.adacore.ajis.ILock lock = new com.adacore.ajis.DefaultLock ();
   private static boolean fLoaded = false;

   private static native void startLibrary ();

   public static void load () {
      if (!fLoaded) {
         fLoaded = true;
         com.adacore.ajis.AJISLibrary.load ();
         System.loadLibrary ("jprinter");
         startLibrary ();
      }
   }

   static {
      jprinter.Ada2Java.Library Id_JNI_349;
      jprinter.Ada.Exceptions.Exception_Occurrence Id_JNI_350;
      jprinter.JPrinter.Id_JNI_42 Id_JNI_351;
      jprinter.JPrinter.JPrinter_Package Id_JNI_352;
      jprinter.JPrinter.Print_CB Id_JNI_353;
      jprinter.Standard.AdaString Id_JNI_354;
      jprinter.Standard.Constraint_Error Id_JNI_355;
      jprinter.Standard.Program_Error Id_JNI_356;
      jprinter.Standard.Storage_Error Id_JNI_357;
   }

   static {
      jprinter.Ada2Java.Library.load ();
   }

} // Library