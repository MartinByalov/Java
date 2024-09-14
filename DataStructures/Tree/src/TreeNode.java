class TreeNode {
    int value; // стойност на възел (да не се бърка с тегло)
    TreeNode left; // ляво дете
    TreeNode right; // дясно дете

    // конструктор на възел
    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// Двоично дърво - възлите му имат най-много две деца
// Двоично дърво за търсене - стойността на лявото дете е по-малка от на родителя, а на дясното по-голяма
// Външен възел (Листо) - възел, който няма деца
// Балансирано дърво - разликата във височината (пътя от корена до листо) между лявото поддърво и дясното
// е най-много 1

class BinarySearchTree {
    TreeNode root; // корен на дървото

    public BinarySearchTree() {
        root = null;
    }

    // Добавяне на възел
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode current, int value) {

        // Ако сме намерили мястото на което трябва да добавим възела
        if (current == null) {
            return new TreeNode(value);
        }

        // Ако стойността която искаме да добавим е по-малка от на дадения възел, влизаме в лявото поддърво,
        // ако ли не в дясното поддърво
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
            return current;
    }

    // Премахване на възел
    public void remove(int value) {
        root = removeRecursive(root, value);
    }

    private TreeNode removeRecursive(TreeNode current, int value) {
        // Ако няма такъв възел, няма какво да премахваме
        if (current == null) {
            return null;
        }

        /* Нека си представим, че искаме да премахнем възел 15
               10
              /  \
             5    15
            /
           2

        Стартира се метода и current сочи към корена 10, current.right сочи 15
        Тъй като 15 е дясно дете, влизаме в дясното поддърво
        removeRecursive(current.right, value); - тук current - текущия възел за който се изпълнява е 15

        Достигнали сме възела, който искаме да премахнем и който няма деца:
        if (current.left == null && current.right == null) {
                return null;
            }
        Тоест на последната стъпка от рекурсията при влизане в дясното поддърво
        current.right (което е дясно дете на 10) = removeRecursive(current.right, value); което връща null
        */
        if (value < current.value) {
            current.left = removeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = removeRecursive(current.right, value);
        } else {

            // Намерили сме възела, който трябва да премахнем
            // Ако възелът няма деца, можем директно да го премахнем
            if (current.left == null && current.right == null) {
                return null;
            }
            // Ако има само дясно дете
            if (current.left == null) {
                return current.right;
            }
            // Ако има само ляво дете
            if (current.right == null) {
                return current.left;
            }
            /* Ако възелът има две деца. На мястото на възела
            / слагаме най-малката стойност от дясното поддърво, за да запазим структурата на балансирано дърво

            Нека си представим, че искаме да премахнем възел 10, който има две деца (5, 15), тогава от дясното поддърво
            на 10 взимаме най-малката стойност, която е 3 и заменяме 10 с нея.
                    10
                   /  \
                  5    15
                 /    /  \
                2    3    18

             */

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
        }
        return current;
    }

    private int findSmallestValue(TreeNode root) {
        // Проверка дали коренът (root) е null
        if (root == null) {
            throw new IllegalArgumentException("Tree cannot be null");
        }

        // Ако няма ляво дете, текущият възел е най-малкият
        if (root.left == null) {
            return root.value;
        } else {
            // Ако има ляво дете, продължаваме да търсим в лявото поддърво
            return findSmallestValue(root.left);
        }
    }

    // Търсене на възел
    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(TreeNode current, int value) {
        // Проверка дали текущият възел е null
        if (current == null) {
            // Ако текущият възел е null, стойността не е намерена в дървото
            return false;
        }

        // Проверка дали стойността е равна на стойността на текущия възел
        if (value == current.value) {
            // Ако стойността е равна, значи стойността е намерена в дървото
            return true;
        }

        // Проверка дали стойността е по-малка от стойността на текущия възел
        if (value < current.value) {
            // Ако стойността е по-малка, търсим стойността в лявото поддърво
            return containsRecursive(current.left, value);
        } else {
            // Ако стойността е по-голяма, търсим стойността в дясното поддърво
            return containsRecursive(current.right, value);
        }
    }

    /* Обхождане:
       Preorder: корен --> ляво поддърво --> дясно поддърво
       Inorder: ляво --> корен --> дясно
       Postorder: ляво --> дясно --> корен
     */

    // Preorder
    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(TreeNode current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preOrderRecursive(current.left);
            preOrderRecursive(current.right);
        }
    }

    // Inorder
    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(TreeNode current) {
        if (current != null) {
            inOrderRecursive(current.left);
            System.out.print(current.value + " ");
            inOrderRecursive(current.right);
        }
    }

    // Postorder
    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(TreeNode node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.value + " ");
        }
    }
}