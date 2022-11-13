package Spiski_1;

public class Group {
    private Student head; //голова
    public static Group insert(Group list) //добавить элемен в конец
    {

        Student new_node = new Student(); //экзэмпляр студент
        new_node.readStudent(); //ввод данных студента
        if (list.head == null) { //если список пуст (head указывает на null)
            list.head = new_node; //голова = введенный первый студент
        }
        else {
            Student last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void printList(Group list)
    {
        Student currNode = list.head;
        System.out.print("Group: \n");
        while (currNode != null) {
            System.out.print(currNode.toString()+'\n');
            currNode = currNode.next;
        }
    }
}