package COM.rl;

import COM.rl.obf.Cl;
import COM.rl.obf.Fd;
import COM.rl.obf.Md;
import COM.rl.obf.Pk;
import COM.rl.obf.TreeItem;

public class NameProvider {
   public static final int CLASSIC_MODE = 0;
   public static final int CHANGE_NOTHING_MODE = 1;
   public static final int NAMESHEET_MODE = 2;
   public static int classicModeUniqueStart = 6000;
   public static int currentMode = 0;

   public static String GetNewTreeItemName(TreeItem ti) {
      System.out.println("TI: " + ti.getFullInName());
      if (currentMode == 0) {
         return null;
      } else if (ti instanceof Pk) {
         return GetNewPackageName((Pk)ti);
      } else if (ti instanceof Cl) {
         return GetNewClassName((Cl)ti);
      } else if (ti instanceof Md) {
         return GetNewMethodName((Md)ti);
      } else if (ti instanceof Fd) {
         return GetNewFieldName((Fd)ti);
      } else {
         System.out.println("Warning: trying to rename unknown type " + ti.getFullInName());
         return null;
      }
   }

   public static String GetNewPackageName(Pk pk) {
      System.out.println("PK: " + pk.getFullInName());
      return currentMode != 0 && currentMode != 1 ? null : null;
   }

   public static String GetNewClassName(Cl cl) {
      System.out.println("CL: " + cl.getFullInName());
      return currentMode != 0 && currentMode != 1 ? null : null;
   }

   public static String GetNewMethodName(Md md) {
      System.out.println("MD: " + md.getFullInName());
      return currentMode != 0 && currentMode != 1 ? null : null;
   }

   public static String GetNewFieldName(Fd fd) {
      System.out.println("FD: " + fd.getFullInName());
      return currentMode != 0 && currentMode != 1 ? null : null;
   }
}
