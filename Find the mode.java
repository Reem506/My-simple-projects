public class Main {
  public static void main(String[] args) {
    int arr[] = {1, 7, 4, 2, 2, 1, 5, 2, 7};
    // المتغيرات التي نحتاجها لإيجاد المنوال، المنوال لتخزين العنصر، عداد للتكرار، وتخزين مرات التكرار للمقارنة
    int mode = 0, count = 0, timesOfRepetition = 0;

    // إنشاء حلقتين للتكرار، لتسمح بمقارنة كل عنصر مع جميع عناصر المصفوفة
    for (int i = 0; i < arr.length; i++){
      for (int h = 0; h < arr.length; h++){
        // إذاكان العنصران متساويان زد العداد
        if (arr[i] == arr[h]){
          count++;
        }
      }
      // إذا كان العداد أكبر من متغير مرات التكرار قم بإضافة عنصر المصفوفة إلى متغير اللمنوال
      if (count > timesOfRepetition){
        timesOfRepetition = count;
        mode = arr[i];
        count = 0;
      } 
    }
    // طباعة النتيجة
    System.out.printf("The mode is %d", mode);

  }
}
